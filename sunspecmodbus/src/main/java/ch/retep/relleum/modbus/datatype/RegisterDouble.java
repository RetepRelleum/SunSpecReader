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

import java.text.DecimalFormat;
import java.text.NumberFormat;

import ch.retep.relleum.modbus.Read0X03;
import ch.retep.relleum.sunspec.datatype.RetepDouble;

import static java.lang.Math.pow;

/**
 * @author Peter
 */
public class RegisterDouble extends Read0X03 implements RetepDouble {

    private RegisterSunssf scaleFactorMEssage = null;

    {
        setNanValue(new byte[]{(byte) 0X80, (byte) 0X00});
        setUnsigned(false);
    }

    /**
     * @param scaleFactorMEssage
     */
    protected void setScaleFactorMessage(RegisterSunssf scaleFactorMEssage) {
        this.scaleFactorMEssage = scaleFactorMEssage;
    }

    /**
     * @return
     */
    @Override
    public double toDouble() {

        return (pow(10, scaleFactorMEssage.toLong()) * toLong());

    }

    @Override
    public String toString() {
        if (scaleFactorMEssage.isNaN()) {
            return "NaN";
        }
        NumberFormat formatter = new DecimalFormat("#0.00");
        return isNaN() ? "NaN" : "" + formatter.format(toDouble());
    }

    /**
     * @return
     */
    @Override
    public RetepDouble toRetepDouble() {
        return this;
    }

    @Override
    public boolean isNaN() {
        return super.isNaN()||(scaleFactorMEssage.isNaN());
    }

    public byte[] getRandData() {

        return new byte[]{(byte)(((int)(Math.random()*128))&0xFF),(byte)(((int)(Math.random()*256))&0xFF),(byte)(((int)(Math.random()*256))&0xFF),(byte)(((int)(Math.random()*256))&0xFF)};
   }
}
