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

import ch.retep.relleum.sunspec.datatype.Retep;

import static java.lang.System.out;

/**
 * @author Peter
 */
public class Read0X03 extends Header implements Retep {

    private  static boolean noOutput=false;
    /**
     *
     */
    protected boolean outpuBig = true;
    /**
     *
     */
    private String unit = "";
    private String name = "";
    private Rw rw;
    private Mandatory mandatory;
    private String description;

    {
        functionCode = (byte) 0x03;
        unitIdentifier = (byte) 0x7E;
    }

    public static void setNoOutput(boolean aNoOutput){
        noOutput=aNoOutput;
    }

    /**
     * @param alabel
     * @param offset
     * @param quantityOfRegisters
     * @param name
     * @param unit
     * @param description
     * @param rw
     * @param mandatory
     */
    public void init(int alabel, int offset, int quantityOfRegisters, String name, String unit, String description, Rw rw, Mandatory mandatory) {

        this.setQuantityOfRegisters(quantityOfRegisters);
        init2(alabel,offset, name, unit, description, rw, mandatory);

    }
    protected void init2(int alabel, int offset, String name, String unit, String description, Rw rw, Mandatory mandatory) {
        this.label = alabel;
        this.offset = offset;
        this.setStartingAddress(label + offset - 1);

        this.name = name;
        this.unit = unit;
        this.rw = rw;
        this.mandatory = mandatory;
        this.description = description;
    }
    /**
     * @return
     */
    @Override
    public byte[] getData() {
        byte[] bs = super.getData();
        bs[8] = (byte) (0xff & (getStartingAddress() >> 8));
        bs[9] = (byte) (0xff & getStartingAddress());
        //Quantity of Registers
        bs[10] = (byte) (0xff & (getQuantityOfRegisters() >> 8));
        bs[11] = (byte) (0xff & getQuantityOfRegisters());
        return bs;

    }

    /**
     * @param bArry
     */
    public void setResponse2(byte[] bArry) {
        byte[] bb = new byte[getQuantityOfRegisters() * 2 + offsetRegister];
        System.arraycopy(bArry, offset * 2 + offsetRegister, bb, offsetRegister, bb.length - 9);
        this.setB(bb);
    }

    /**
     *
     */
    protected void print() {
        if (outpuBig) {
            out.println("");
            out.println("Transaction Identifier :" + getTransactionIdentifier());
            out.println("Protocol Identifier :" + getProtocolIdentifier());
            out.println("Length " + getLength());
            out.println("Unit Identifier :" + getUnitIdentifier());
            out.println("Function Code :" + getFunctionCode());
            out.println("ByteCount :" + getByteCount());
        }
        if (!noOutput) {

                String string = (getStartingAddress() + 1) + " " + getName() + " :";
                StringBuilder buf = new StringBuilder();
                for (int i = string.length(); i < 60; i++) {
                    buf.append(" ");
                }
                string = string + buf;
                out.println(string + toString() + " " + getUnit());

        }
    }

    /**
     *
     */
    @Override
    public void doOnResponse() {
        print();
    }

    /**
     * @param b
     */
    @Override
    protected void setResponseInit(byte[] b) {
        //init the Response is use by the Table
    }

    /**
     * @return
     */
    @Override
    public String getUnit() {
        return unit;
    }

    /**
     * @return
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @return
     */
    @Override
    public Rw getRw() {
        return rw;
    }

    /**
     * @return
     */
    @Override
    public Mandatory getMandatory() {
        return mandatory;
    }

    /**
     * @return
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     *
     */
    public enum Rw {

        /**
         *
         */
        nan,
        /**
         *
         */
        R,
        /**
         *
         */
        RW
    }

    /**
     *
     */
    public enum Mandatory {

        /**
         *
         */
        nan,
        /**
         *
         */
        M,
        /**
         *
         */
        O
    }




    @Override
    public byte[] getRandData() {
        return new byte[0];
    }
}
