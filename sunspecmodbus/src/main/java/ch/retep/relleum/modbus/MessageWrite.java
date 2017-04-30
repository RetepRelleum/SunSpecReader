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

/**
 * @author Peter
 */
public abstract class MessageWrite extends Header {


    {
        functionCode = 0x10;
    }

    /**
     * @param astartingAddress
     */
    @Override
    protected void setStartingAddress(int astartingAddress) {
        this.startingAddress = astartingAddress;
    }

    /**
     * @return
     */
    @Override
    public byte[] getData() {
        byte[] bs = super.getData();
        bs[8] = (byte) (0xff & (startingAddress >> 8));
        bs[9] = (byte) (0xff & startingAddress);
        //Quantity of Registers
        bs[10] = (byte) (0xff & (getQuantityOfRegisters() >> 8));
        bs[11] = (byte) (0xff & getQuantityOfRegisters());
        return bs;

    }
}
