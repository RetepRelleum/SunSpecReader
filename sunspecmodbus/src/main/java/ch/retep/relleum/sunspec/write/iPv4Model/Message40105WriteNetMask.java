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

package ch.retep.relleum.sunspec.write.iPv4Model;

import ch.retep.relleum.modbus.MessageWrite;

import static java.lang.System.arraycopy;

/**
 * @author Peter
 */
public class Message40105WriteNetMask extends MessageWrite {

    private final String data;

    /**
     * @param data
     */
    public Message40105WriteNetMask(String data) {
        //   setStartingAddress(40105-1);
        //   setQuantityOfRegisters(8);
        this.data = data;
    }

    /**
     * @return
     */
    @Override
    public byte[] getData() {
        byte[] b = super.getData();
        byte[] bs = new byte[b.length + 16 + 1];
        arraycopy(b, 0, bs, 0, b.length);
        bs[12] = 16;
        for (int i = 0; i < data.length(); i++) {
            bs[13 + 1] = (byte) data.charAt(i);
        }
        return bs;
    }

    /**
     *
     */
    @Override
    public void doOnResponse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @param b
     */
    @Override
    protected void setResponseInit(byte[] b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
