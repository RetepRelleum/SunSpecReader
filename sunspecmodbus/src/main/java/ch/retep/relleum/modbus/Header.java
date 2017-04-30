/*
 * Copyright © 2016 , Peter Müller. All rights reserved.
 *
 *
 * THE SOFTWARE IS PROVIDED 'AS IS', WITHOUT WARRANTY OF ANY
 * KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT.  IN NO EVENT SHALL THE CONTRIBUTORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR
 * IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS WITH THE
 * SOFTWARE.
 */

package ch.retep.relleum.modbus;

import java.util.Hashtable;

/**
 * @author Peter
 */
public abstract class Header {

    private static final Hashtable<Integer, Header> hashTable = new Hashtable<>();
    private static int transaktionsnummer = 1;
    private  byte[] bs = new byte[12];
    /**
     *
     */
    public int label;
    /**
     *
     */
    protected final int offsetRegister = 9;
    /**
     *
     */
    protected int startingAddress;
    protected int quantityOfRegisters;
    /**
     *
     */
    protected byte functionCode;
    protected byte unitIdentifier;
    /**
     *
     */
    protected int offset;
    private byte[] nanValue = null;
    private boolean unsigned = true;
    /**
     *
     */
    private byte[] b = null;

    /**
     * @return
     */
    public byte[] getData() {
        // Transaction Identifier Hi 
        bs[0] = (byte) (0xff & (transaktionsnummer >> 8));
        //Transaction Identifier Lo
        bs[1] = (byte) (0xff & transaktionsnummer);
        transaktionsnummer = transaktionsnummer > 127 ? 1 : transaktionsnummer + 1;
        transaktionsnummer++;

        //Protocol Identifier 
        bs[2] = 0;
        bs[3] = 0;
        // Length 
        short l = (short) (bs.length - 7);
        bs[4] = (byte) (0xff & (l >> 8));
        bs[5] = (byte) (0xff & l);
        // Unit Identifier 
        bs[6] = unitIdentifier;
        // Function Code
        bs[7] = functionCode;
        //Starting Address 
        hashTable.put(transaktionsnummer, this);
        return bs;
    }

    /**
     * @return
     */
    protected int getTransaktionsnummer() {
        return transaktionsnummer;
    }

    /**
     * @return
     */
    protected int getTransactionIdentifier() {
        return ((getB(0) & 0xff) << 8 | (getB(1) & 0xff));
    }

    /**
     * @return
     */
    protected int getProtocolIdentifier() {
        return ((getB(2) & 0xff) << 8 | (getB(3) & 0xff));
    }

    /**
     * @return
     */
    protected int getLength() {
        return ((getB(4) & 0xff) << 8 | (getB(5) & 0xff));
    }

    /**
     * @return
     */
    protected int getUnitIdentifier() {
        return getB(6) & 0xFF;
    }

    /**
     * @return
     */
    public int getFunctionCode() {
        return getB(7) & 0xFF;
    }

    /**
     * @return
     */
    protected int getByteCount() {
        return getB(8) & 0xFF;
    }

    /**
     * @return
     */
    public int getStartingAddress() {
        return startingAddress;
    }

    /**
     * @param startingAddress
     */
    protected void setStartingAddress(int startingAddress) {
        this.startingAddress = startingAddress;
    }

    /**
     * @param b
     */
    public void setResponse(byte[] b) {
        setB(b);
        Header message = hashTable.remove(getTransaktionsnummer());
        message.setB(b);
        if (message.getFunctionCode() < 50) {
            message.setResponseInit(b);
            message.doOnResponse();
        }
    }


    /**
     *
     */
    public abstract void doOnResponse();

    /**
     * @param b
     */
    protected abstract void setResponseInit(byte[] b);


    /**
     * @return
     */
    protected String toHex() {
        return "OX " + toHex(offsetRegister, getBlength());
    }

    /**
     * @param off
     * @param length
     * @return
     */
    protected String toHex(int off, int length) {
        //double size, two bytes (hex range) for one byte
        StringBuilder buf = new StringBuilder(getBlength() * 2);
        for (int i = off; i < length; i++) {
            //don't forget the second hex digit
            if (((int) getB(i) & 0xff) < 0x10) {
                buf.append("0");
            }
            buf.append(Long.toString((int) getB(i) & 0xff, 16));
            if (i < getBlength() - 1) {
                buf.append(" ");
            }
        }
        return buf.toString();
    }

    @Override
    public String toString() {
        return isNaN() ? "NaN" : "" + toLong();
    }

    /**
     * @return
     */
    public long toLong() {
        long s = unsigned ? getB(offsetRegister) & 0xff : getB(offsetRegister);
        for (int i = offsetRegister + 1; i < getBlength(); i++) {
            s = s << 8 | getB(i) & 0xff;
        }
        return s;
    }

    /**
     * @return
     */
    public boolean isNaN() {
        for (int i = offsetRegister; i < nanValue.length + offsetRegister; i++) {
            if (((getB(i)) & 0xFF) != (nanValue[i - offsetRegister] & 0xFF)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param unsigned the unsigned to set
     */
    protected void setUnsigned(boolean unsigned) {
        this.unsigned = unsigned;
    }

    /**
     * @param nanValue the nanValue to set
     */
    protected void setNanValue(byte[] nanValue) {
        this.nanValue = nanValue;
    }

    /**
     * @param i
     * @return the b
     */
    protected byte getB(int i) {
        if (b==null) return 0;
        return b[i];
    }

    /**
     * @param b the b to set
     */
    protected void setB(byte[] b) {
        this.b = b;
    }

    /**
     * @return
     */
    protected int getBlength() {
        if(b==null)return 0;
        return b.length;
    }

    /**
     * @return
     */
    protected byte[] getBB() {
        return b;
    }

    /**
     *
     */
    public int getQuantityOfRegisters() {
        return quantityOfRegisters;
    }

    public void setQuantityOfRegisters(int quantityOfRegisters) {
        this.quantityOfRegisters = quantityOfRegisters;
    }
}
