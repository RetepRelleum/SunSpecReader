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
public class Error extends Read0X03 {

    /**
     * @return
     */
    public int getErrorCode() {
        return getFunctionCode();
    }

    /**
     * @return
     */
    public String getExceptionCode() {
        return toHex();
    }

    /**
     * @return
     */
    @Override
    public long toLong() {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public boolean isNaN() {
        return false;
    }


}