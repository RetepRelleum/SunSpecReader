/*
 * Copyright © 2017 , Peter Müller. All rights reserved.
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

package ch.retep.relleum.sunspec.read.table;

import ch.retep.relleum.modbus.Read0X03;
import ch.retep.relleum.modbus.datatype.RegisterUint16;
import ch.retep.relleum.modbus.datatype.Table;
import ch.retep.relleum.sunspec.TcpModbusHandler;
import ch.retep.relleum.sunspec.datatype.RetepLong;

/**
 * Created by Peter on 17.01.2017.
 */

public class TableIdL extends Table {
    private ID id;
    private L l;

    public TableIdL(TcpModbusHandler tcpModbusHandler) {

        init(tcpModbusHandler.getModbusRegisterNumber(), 0, 2, "Common", "", "Common Model", Read0X03.Rw.R, Read0X03.Mandatory.M);
        id = new ID(tcpModbusHandler);
        l = new L(tcpModbusHandler);
        vector.add(id);
        vector.add(l);
    }

    /**
     * @return
     */
    public RetepLong getID() {
        return id;
    }

    /**
     * @return
     */
    public RetepLong getL() {

        return l;
    }

    /**
     *
     */
    public  class ID extends RegisterUint16 {
        public ID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getModbusRegisterNumber(), 0, 1, "get ID Init", "", "get ID init", Rw.R, Mandatory.M);

        }
    }

    /**
     *
     */
    public  class L extends RegisterUint16 {
        public L(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getModbusRegisterNumber(), 1, 1, "Model Length init", "", "Model Length init", Rw.R, Mandatory.M);
        }
    }

}
