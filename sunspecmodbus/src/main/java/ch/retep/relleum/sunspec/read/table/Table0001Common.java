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

package ch.retep.relleum.sunspec.read.table;

import ch.retep.relleum.modbus.datatype.RegisterEnum16;
import ch.retep.relleum.modbus.datatype.RegisterPad;
import ch.retep.relleum.modbus.datatype.RegisterString;
import ch.retep.relleum.modbus.datatype.RegisterUint16;
import ch.retep.relleum.modbus.datatype.Table;
import ch.retep.relleum.sunspec.TcpModbusHandler;
import ch.retep.relleum.sunspec.datatype.RetepEnum;
import ch.retep.relleum.sunspec.datatype.RetepLong;
import ch.retep.relleum.sunspec.datatype.RetepString;

/**
 * @author Peter
 */
public class Table0001Common extends Table {


    private ID common00ID;
    private L common01L;
    private Mn common02Mn;
    private Md common18Md;
    private Opt common34Opt;
    private Vr common42Vr;
    private SN common50SN;
    private DA common66DA;
    private Pad common67Pad;

    public Table0001Common(TcpModbusHandler tcpModbusHandler) {
        init(tcpModbusHandler.getCommon_1(), 0, 70, "Common", "", "Common Model", Rw.R, Mandatory.M);

        common00ID = new ID(tcpModbusHandler);
        common01L = new L(tcpModbusHandler);
        common02Mn = new Mn(tcpModbusHandler);
        common18Md = new Md(tcpModbusHandler);
        common34Opt = new Opt(tcpModbusHandler);
        common42Vr = new Vr(tcpModbusHandler);
        common50SN = new SN(tcpModbusHandler);
        common66DA = new DA(tcpModbusHandler);
        common67Pad = new Pad(tcpModbusHandler);

        vector.add(common00ID);
        vector.add(common01L);
        vector.add(common02Mn);
        vector.add(common18Md);
        vector.add(common34Opt);
        vector.add(common42Vr);
        vector.add(common50SN);
        vector.add(common66DA);
        vector.add(common67Pad);
    }

    /**
     * @return
     */
    public RetepEnum getID() {

        return common00ID;
    }

    /**
     * @return
     */
    public RetepLong getL() {

        return common01L;
    }

    /**
     * @return
     */
    public RetepString getMn() {

        return common02Mn;
    }

    /**
     * @return
     */
    public RetepString getMd() {

        return common18Md;
    }

    /**
     * @return
     */
    public RetepString getOp() {

        return common34Opt;
    }

    /**
     * @return
     */
    public RetepString getVr() {

        return common42Vr;
    }

    /**
     * @return
     */
    public RetepString getSN() {

        return common50SN;
    }

    /**
     * @return
     */
    public RetepLong getDA() {

        return common66DA;
    }

    /**
     * @return
     */
    public RetepLong getPad() {

        return common67Pad;
    }


    /**
     *
     */
    public class ID extends RegisterEnum16 {


        public ID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getCommon_1(), 0, 1, "Model", "", "All SunSpec compliant devices must include this as the first model", Rw.R, Mandatory.M);
            hashtable.put((long) 1, "SunSpec Common");
        }
    }

    /**
     *
     */
    public class L extends RegisterUint16 {

        public L(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getCommon_1(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class Mn extends RegisterString {

        public Mn(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getCommon_1(), 2, 16, "Manufacturer", "", "Well known value registered with SunSpec for compliance", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class Md extends RegisterString {

        public Md(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getCommon_1(), 18, 16, "Model", "", "Manufacturer specific value (32 chars)", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class Opt extends RegisterString {

        public Opt(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getCommon_1(), 34, 8, "Options", "", "Manufacturer specific value (16 chars)", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class Vr extends RegisterString {

        public Vr(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getCommon_1(), 42, 8, "Version", "", "Manufacturer specific value (16 chars)", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class SN extends RegisterString {

        public SN(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getCommon_1(), 50, 16, "Serial Number", "", "Manufacturer specific value (32 chars)", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class DA extends RegisterUint16 {

        public DA(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getCommon_1(), 66, 1, "Device Address", "", "Modbus device address", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class Pad extends RegisterPad {

        public Pad(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getCommon_1(), 67, 1, "Force even alignment", "", "Force even alignment", Rw.R, Mandatory.O);
        }
    }
}
