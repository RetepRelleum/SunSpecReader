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

import static java.lang.System.out;

/**
 * @author Peter
 */
public class Read0X2B extends Header {

    {
        functionCode = 0x2B;
        unitIdentifier = (byte) 0xFF;
    }

    /**
     * @return
     */
    @Override
    public byte[] getData() {
        byte[] bs = super.getData();
        bs[8] = 0X0E;
        bs[9] = 0X01;
        bs[10] = 0x00;
        return bs;

    }

    @Override
    public void doOnResponse() {
        print();
    }

    @Override
    protected void setResponseInit(byte[] b) {
        //init the Response is use by the Table
    }

    protected void print() {
        out.println("");
        out.println("Transaction Identifier :" + getTransactionIdentifier());
        out.println("Protocol Identifier :" + getProtocolIdentifier());
        out.println("Length " + getLength());
        out.println("Unit Identifier :" + getUnitIdentifier());
        out.println("Function Code :" + getFunctionCode());
        out.println("ByteCount :" + getByteCount());

    }

}
