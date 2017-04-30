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

import java.util.Hashtable;

import ch.retep.relleum.modbus.Read0X03;
import ch.retep.relleum.sunspec.datatype.RetepBitMask;

/**
 * @author Peter
 */
public class RegisterBitfield16 extends Read0X03 implements RetepBitMask {

    /**
     *
     */
    protected final Hashtable<Long, String> hashtable = new Hashtable<>();

    {
        setNanValue(new byte[]{(byte) 0XFF, (byte) 0XFF});
        setUnsigned(true);
    }

    /**
     * @return
     */
    @Override
    public String getStatusBitMask() {
        StringBuffer ret = new StringBuffer();

        long l = toLong();
        String r;
        for (long i = 0; i < (long) getQuantityOfRegisters() * 16; i++) {

            if (((l >> i) & 1) == 1) {
                r = hashtable.get(i);
                ret = (r != null) ? ret.append(r).append(":") : ret.append("Bit ").append(i).append("=1 :");
            }
        }
        if (ret.length() == 0) {
            ret.append("DeActivated/No");
        }
        return isNaN() ? "NaN" : ret.toString();
    }

    @Override
    public String toString() {
        return getStatusBitMask();
    }

    /**
     * @return
     */
    @Override
    public RetepBitMask toRetepBitMask() {
        return this;
    }
    @Override
    public byte[] getRandData() {
        return new byte[]{(byte)(((int)(Math.random()*128))&0xFF),(byte)(((int)(Math.random()*256))&0xFF)};
    }
}
