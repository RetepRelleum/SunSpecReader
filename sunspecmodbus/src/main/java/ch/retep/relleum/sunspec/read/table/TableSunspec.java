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

import ch.retep.relleum.modbus.datatype.RegisterUint32;
import ch.retep.relleum.modbus.datatype.Table;
import ch.retep.relleum.sunspec.TcpModbusHandler;
import ch.retep.relleum.sunspec.datatype.RetepLong;

/**
 * Created by Peter on 17.01.2017.
 */

public  class TableSunspec extends Table {
    private SunspecID sunspecID;

    public TableSunspec(TcpModbusHandler tcpModbusHandler) {
        sunspecID= new SunspecID(tcpModbusHandler);
        init(tcpModbusHandler.getModbusRegisterNumber(), 0, 2, "Table SunSunspec", "", "Check is Sunspec Modell", Rw.R, Mandatory.M);
        vector.add(sunspecID);
    }

    public RetepLong getSunSpecID() {
        return sunspecID;
    }

    public  class SunspecID extends RegisterUint32 {
        public SunspecID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getModbusRegisterNumber(), 0, 2, "SunSpec ID", "", "get SunSpec ID", Rw.R, Mandatory.M);
        }
    }
}
