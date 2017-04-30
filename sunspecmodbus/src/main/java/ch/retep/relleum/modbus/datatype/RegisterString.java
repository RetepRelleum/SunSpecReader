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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.retep.relleum.modbus.datatype;

import ch.retep.relleum.modbus.Read0X03;
import ch.retep.relleum.sunspec.datatype.RetepString;

/**
 * @author Peter
 */
public class RegisterString extends Read0X03 implements RetepString {
       /**
     * @param label
     * @param offset
     * @param aqQuantityOfRegisters
     * @param name
     * @param unit
     * @param description
     * @param rw
     * @param mandatory
     */
    @Override
    public void init(int label, int offset, int aqQuantityOfRegisters, String name, String unit, String description, Rw rw, Mandatory mandatory) {
        super.init(label, offset, aqQuantityOfRegisters, name, unit, description, rw, mandatory); //To change body of generated methods, choose Tools | Templates.
        setNanValue(new byte[aqQuantityOfRegisters * 2]);
    }

    /**
     * @return
     */
    @Override
    public long toLong() {
        return 0;
    }

    @Override
    public String toString() {

        StringBuilder ret = new StringBuilder();
        for (int i = offsetRegister; i < getBlength(); i++) {
            if (getB(i) != 0x00) {
                ret.append((char) getB(i));

            }
        }
        return isNaN() ? "NaN" : ret.toString();
    }

    /**
     * @return
     */
    @Override
    public RetepString toRetepString() {
        return this;
    }

    @Override
    public byte[] getRandData() {

        byte[] b = new byte[quantityOfRegisters * 2];
        for (int i = 0; i < b.length; i++) {
            b[i] = (byte) (Math.random() * (122 - 97) + 97);
        }
        return b;
    }

}
