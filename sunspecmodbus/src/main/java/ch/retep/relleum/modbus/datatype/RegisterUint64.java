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

package ch.retep.relleum.modbus.datatype;

import ch.retep.relleum.modbus.Read0X03;
import ch.retep.relleum.sunspec.datatype.RetepLong;

/**
 * @author Peter
 */
public class RegisterUint64 extends Read0X03 implements RetepLong {

    {
        setNanValue(new byte[]{(byte) 0XFF, (byte) 0XFF, (byte) 0XFF, (byte) 0XFF, (byte) 0XFF, (byte) 0XFF, (byte) 0XFF, (byte) 0XFF});
        setUnsigned(true);
    }

    @Override
    public String toString() {

        return isNaN() ? "NaN" : toHex();
    }

    /**
     * @return
     */
    @Override
    public RetepLong toRetepLong() {
        return this;
    }

    public byte[] getRandData() {

        return new byte[]{(byte)(((int)(Math.random()*128))&0xFF),(byte)(((int)(Math.random()*256))&0xFF),(byte)(((int)(Math.random()*256))&0xFF),(byte)(((int)(Math.random()*256))&0xFF),(byte)(((int)(Math.random()*256))&0xFF),(byte)(((int)(Math.random()*256))&0xFF),(byte)(((int)(Math.random()*256))&0xFF),(byte)(((int)(Math.random()*256))&0xFF)};
    }
}
