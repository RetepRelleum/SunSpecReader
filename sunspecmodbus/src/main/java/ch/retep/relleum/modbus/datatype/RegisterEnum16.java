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

import java.util.Enumeration;
import java.util.Hashtable;

import ch.retep.relleum.modbus.Read0X03;
import ch.retep.relleum.sunspec.datatype.RetepEnum;

/**
 * @author Peter
 */
public class RegisterEnum16 extends Read0X03 implements RetepEnum {

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
    public String getStatus() {
        String ret = hashtable.get(toLong());
        if (ret == null) {
            ret = "" + toLong();
        }
        return isNaN() ? "NaN" : ret;
    }

    @Override
    public String toString() {
        return getStatus();
    }

    /**
     * @return
     */
    @Override
    public RetepEnum toRetepEnum() {
        return this;
    }
    public byte[] getRandData() {
        int size=hashtable.size();
        Enumeration<Long>  enumeration=hashtable.keys();
        Long aLong=null;
        for (int i=0;i<(Math.random()*size);i++){
            aLong=enumeration.nextElement();

        }
        return new byte[]{(byte)(0),(byte)(((aLong != null ? aLong.intValue() : 0))&0xFF)};
    }}
