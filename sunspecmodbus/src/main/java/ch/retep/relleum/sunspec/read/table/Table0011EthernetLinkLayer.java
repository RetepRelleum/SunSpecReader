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

import ch.retep.relleum.modbus.datatype.RegisterBitfield16;
import ch.retep.relleum.modbus.datatype.RegisterEnum16;
import ch.retep.relleum.modbus.datatype.RegisterEui48;
import ch.retep.relleum.modbus.datatype.RegisterString;
import ch.retep.relleum.modbus.datatype.RegisterUint16;
import ch.retep.relleum.modbus.datatype.Table;
import ch.retep.relleum.sunspec.TcpModbusHandler;
import ch.retep.relleum.sunspec.datatype.RetepBitMask;
import ch.retep.relleum.sunspec.datatype.RetepEnum;
import ch.retep.relleum.sunspec.datatype.RetepLong;
import ch.retep.relleum.sunspec.datatype.RetepString;

/**
 * @author Peter
 */
public class Table0011EthernetLinkLayer extends Table {

    private  ID ethernetLinkLayer00ID ;
    private  L ethernetLinkLayer01L ;
    private  Spd ethernetLinkLayer02Spd ;
    private  CfgSt ethernetLinkLayer03CfgSt;
    private  St ethernetLinkLayer04St ;
    private  MAC ethernetLinkLayer05MAC ;
    private  Nam ethernetLinkLayer09Nam ;
    private  Ctl ethernetLinkLayer13Ctl ;
    private  FrcSpd ethernetLinkLayer14FrcSpd ;

    public Table0011EthernetLinkLayer (TcpModbusHandler tcpModbusHandler){
        init(tcpModbusHandler.getEthernetLinkLayer_11(), 0, 15, "CommonModel", "", "CommonModel", Rw.nan, Mandatory.nan);

           ethernetLinkLayer00ID = new ID(tcpModbusHandler);
           ethernetLinkLayer01L = new L(tcpModbusHandler);
           ethernetLinkLayer02Spd = new Spd(tcpModbusHandler);
           ethernetLinkLayer03CfgSt = new CfgSt(tcpModbusHandler);
           ethernetLinkLayer04St = new St(tcpModbusHandler);
           ethernetLinkLayer05MAC = new MAC(tcpModbusHandler);
           ethernetLinkLayer09Nam = new Nam(tcpModbusHandler);
           ethernetLinkLayer13Ctl = new Ctl(tcpModbusHandler);
           ethernetLinkLayer14FrcSpd = new FrcSpd(tcpModbusHandler);
     
        vector.add(ethernetLinkLayer00ID);
        vector.add(ethernetLinkLayer01L);
        vector.add(ethernetLinkLayer02Spd);
        vector.add(ethernetLinkLayer03CfgSt);
        vector.add(ethernetLinkLayer04St);
        vector.add(ethernetLinkLayer05MAC);
        vector.add(ethernetLinkLayer09Nam);
        vector.add(ethernetLinkLayer13Ctl);
        vector.add(ethernetLinkLayer14FrcSpd);

    }

    /**
     * @return
     */
    public RetepEnum getID() {

        return ethernetLinkLayer00ID;
    }

    /**
     * @return
     */
    public RetepLong getL() {

        return ethernetLinkLayer01L;
    }

    /**
     * @return
     */
    public RetepLong getSpd() {

        return ethernetLinkLayer02Spd;
    }

    /**
     * @return
     */
    public RetepBitMask getCfgSt() {

        return ethernetLinkLayer03CfgSt;
    }

    /**
     * @return
     */
    public RetepEnum getSt() {

        return ethernetLinkLayer04St;
    }

    /**
     * @return
     */
    public RetepLong getMAC() {

        return ethernetLinkLayer05MAC;
    }

    /**
     * @return
     */
    public RetepString getNam() {

        return ethernetLinkLayer09Nam;
    }

    /**
     * @return
     */
    public RetepBitMask getCtrl() {

        return ethernetLinkLayer13Ctl;
    }

    /**
     * @return
     */
    public RetepLong getFrcSpd() {

        return ethernetLinkLayer14FrcSpd;
    }

    /**
     *
     */
    public  class ID extends RegisterEnum16 {



        public ID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getEthernetLinkLayer_11(), 0, 1, "Model", "", "Include to support a wired ethernet port", Rw.R, Mandatory.M);
            hashtable.put((long) 11, "SunSpec Ethernet Link Layer");

        }
    }

    /**
     *
     */
    public  class L extends RegisterUint16 {

        public L(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getEthernetLinkLayer_11(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public  class Spd extends RegisterUint16 {

        public Spd(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getEthernetLinkLayer_11(), 2, 1, "Ethernet Link Speed", "Mbps", "Interface speed in Mb/s", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public  class CfgSt extends RegisterBitfield16 {

        public CfgSt(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getEthernetLinkLayer_11(), 3, 1, "Interface Status Flags", "", "Bitmask values Interface flags.", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "LINK");
            hashtable.put((long) 1, "FULL_DUPLEX");
            hashtable.put((long) 2, "AUTO_NEG1");
            hashtable.put((long) 3, "AUTO_NEG2");
            hashtable.put((long) 4, "AUTO_NEG3");
            hashtable.put((long) 5, "RESET_REQUIRED");
            hashtable.put((long) 6, "HW_FAULT");
        }
    }

    /**
     *
     */
    public  class St extends RegisterEnum16 {

        public St(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getEthernetLinkLayer_11(), 4, 1, "Link State", "", "Enumerated value. State information for this interface", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "UNKNOWN");
            hashtable.put((long) 1, "ENABLED");
            hashtable.put((long) 2, "DISABLED");
            hashtable.put((long) 3, "TESTING");
        }
    }

    /**
     *
     */
    public  class MAC extends RegisterEui48 {

        public MAC(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getEthernetLinkLayer_11(), 5, 4, "MAC", "", "IEEE MAC address of this interface", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class Nam extends RegisterString {

        public Nam(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getEthernetLinkLayer_11(), 9, 4, "Name", "", "Interface name (8 chars)", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class Ctl extends RegisterBitfield16 {

        public Ctl(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getEthernetLinkLayer_11(), 13, 1, "Control", "", "Control flags", Rw.RW, Mandatory.O);
            hashtable.put((long) 0, "AUTO");
            hashtable.put((long) 1, "FULL_DUPLEX");
        }
    }

    /**
     *
     */
    public  class FrcSpd extends RegisterUint16 {

        public FrcSpd(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getEthernetLinkLayer_11(), 14, 1, "Forced Speed", "Mbps", "Forced interface speed in Mb/s when AUTO is disabled", Rw.RW, Mandatory.O);
        }
    }
}
