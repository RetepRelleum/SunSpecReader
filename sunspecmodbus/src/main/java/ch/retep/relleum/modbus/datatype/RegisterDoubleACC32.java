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

/**
 * @author Peter
 */
public class RegisterDoubleACC32 extends RegisterDouble {
    {
        setNanValue(new byte[]{(byte) 0X00, (byte) 0X00, (byte) 0X00, (byte) 0X00});
        setUnsigned(true);
    }
    public byte[] getRandData() {

        return new byte[]{(byte)(((int)(Math.random()*128))&0xFF),(byte)(((int)(Math.random()*256))&0xFF),(byte)(((int)(Math.random()*256))&0xFF),(byte)(((int)(Math.random()*256))&0xFF)};
    }
}
