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

import java.util.Iterator;
import java.util.Vector;

import ch.retep.relleum.modbus.Read0X03;
import ch.retep.relleum.util.Vec;

/**
 * @author Peter
 */

public class Table extends Read0X03 {



    /**
     *
     */
    protected final Vec vector = new Vec();

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

    /**
     * @param bArry
     */
    @Override
    public void setResponseInit(byte[] bArry) {

        for (Read0X03 read0X03 : vector.values()) {
            read0X03.setResponse2(bArry);
        }

    }

    /**
     *
     */
    @Override
    public void doOnResponse() {
        for (Read0X03 read0X03 : vector.values()) {
            read0X03.doOnResponse();
        }
        System.out.println("");
    }

    /**
     * @return
     */
    public Iterator<Read0X03> getMessages() {
        Vector<Read0X03> v = new Vector();
        Integer l = getStartingAddress();
        Read0X03 read0X03;
        while (vector.containsKey(l)) {
            read0X03 = vector.get(l);
            v.add(read0X03);
            l = read0X03.getStartingAddress() + read0X03.getQuantityOfRegisters();
        }
        return v.iterator();

    }

}
