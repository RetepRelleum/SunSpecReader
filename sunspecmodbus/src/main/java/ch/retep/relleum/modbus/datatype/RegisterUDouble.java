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

/**
 * @author Peter
 */
public class RegisterUDouble extends RegisterDouble {

    {
        setNanValue(new byte[]{(byte) 0XFF, (byte) 0XFF});
        setUnsigned(true);
    }
    public byte[] getRandData() {

        return new byte[]{(byte)(((int)(Math.random()*128))&0xFF),(byte)(((int)(Math.random()*256))&0xFF),(byte)(((int)(Math.random()*256))&0xFF),(byte)(((int)(Math.random()*256))&0xFF)};
    }
}
