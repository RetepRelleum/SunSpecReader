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

package ch.retep.relleum.sunspec.datatype;

import ch.retep.relleum.modbus.Read0X03;

/**
 * @author Peter
 */
public interface Retep {

    /**
     * @return
     */
    String getName();

    /**
     * @return
     */
    String getDescription();

    /**
     * @return
     */
    Read0X03.Rw getRw();

    /**
     * @return
     */
    Read0X03.Mandatory getMandatory();

    /**
     * @return
     */
    String getUnit();

    /**
     * @return
     */
    boolean isNaN();

    /**
     * @return
     */



    byte[] getRandData();
}
