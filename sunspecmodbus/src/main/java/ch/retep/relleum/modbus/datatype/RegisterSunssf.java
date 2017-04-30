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
import ch.retep.relleum.sunspec.datatype.RetepLong;

/**
 * @author Peter
 */
public class RegisterSunssf extends Read0X03 implements RetepLong {

    {
        setNanValue(new byte[]{(byte) 0X80, (byte) 0X00});
        setUnsigned(false);
    }

    /**
     * @return
     */
    @Override
    public RetepLong toRetepLong() {
        return this;
    }

    public byte[] getRandData() {
        return new byte[]{0,0};
    }
}
