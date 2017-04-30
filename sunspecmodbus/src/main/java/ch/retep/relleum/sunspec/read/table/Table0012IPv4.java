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
import ch.retep.relleum.modbus.datatype.RegisterPad;
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
public class Table0012IPv4 extends Table {

    private ID iPv400ID;
    private L iPv401L;
    private Nam iPv402Nam;
    private CfgSt iPv406CfgSt;
    private ChgSt iPv407ChgSt;
    private Cap iPv408Cap;
    private Cfg iPv409Cfg;
    private Ctl iPv410Ctl;
    private Addr iPv411Addr;
    private Msk iPv419Msk;
    private Gw iPv427Gw;
    private DNS1 iPv435DNS1;
    private DNS2 iPv443DNS2;
    private NTP1 iPv451NTP1;
    private NTP2 iPv463NTP2;
    private DomNam iPv475DomNam;
    private HostNam iPv487HostNam;
    private Pad iPv499Pad;

    public Table0012IPv4(TcpModbusHandler tcpModbusHandler) {
        init(tcpModbusHandler.getiPv4_12(), 0, 100, "IPv4", "", "IPv4", Rw.nan, Mandatory.nan);

        iPv400ID = new ID(tcpModbusHandler);
        iPv401L = new L(tcpModbusHandler);
        iPv402Nam = new Nam(tcpModbusHandler);
        iPv406CfgSt = new CfgSt(tcpModbusHandler);
        iPv407ChgSt = new ChgSt(tcpModbusHandler);
        iPv408Cap = new Cap(tcpModbusHandler);
        iPv409Cfg = new Cfg(tcpModbusHandler);
        iPv410Ctl = new Ctl(tcpModbusHandler);
        iPv411Addr = new Addr(tcpModbusHandler);
        iPv419Msk = new Msk(tcpModbusHandler);
        iPv427Gw = new Gw(tcpModbusHandler);
        iPv435DNS1 = new DNS1(tcpModbusHandler);
        iPv443DNS2 = new DNS2(tcpModbusHandler);
        iPv451NTP1 = new NTP1(tcpModbusHandler);
        iPv463NTP2 = new NTP2(tcpModbusHandler);
        iPv475DomNam = new DomNam(tcpModbusHandler);
        iPv487HostNam = new HostNam(tcpModbusHandler);
        iPv499Pad = new Pad(tcpModbusHandler);

        vector.add(iPv400ID);
        vector.add(iPv401L);
        vector.add(iPv402Nam);
        vector.add(iPv406CfgSt);
        vector.add(iPv407ChgSt);
        vector.add(iPv408Cap);
        vector.add(iPv409Cfg);
        vector.add(iPv410Ctl);
        vector.add(iPv411Addr);
        vector.add(iPv419Msk);
        vector.add(iPv427Gw);
        vector.add(iPv435DNS1);
        vector.add(iPv443DNS2);
        vector.add(iPv451NTP1);
        vector.add(iPv463NTP2);
        vector.add(iPv475DomNam);
        vector.add(iPv487HostNam);
        vector.add(iPv499Pad);
    }

    /**
     * @return
     */
    public RetepEnum getID() {
        return iPv400ID;
    }

    /**
     * @return
     */
    public RetepLong getL() {

        return iPv401L;
    }

    /**
     * @return
     */
    public RetepString getNameIpV4() {

        return iPv402Nam;
    }

    /**
     * @return
     */
    public RetepEnum getCfgSt() {

        return iPv406CfgSt;
    }

    /**
     * @return
     */
    public RetepBitMask getChgSt() {

        return iPv407ChgSt;
    }

    /**
     * @return
     */
    public RetepBitMask getCap() {

        return iPv408Cap;
    }

    /**
     * @return
     */
    public RetepEnum getSfg() {

        return iPv409Cfg;
    }

    /**
     * @return
     */
    public RetepEnum getCtrl() {

        return iPv410Ctl;
    }

    /**
     * @return
     */
    public RetepString getAddr() {

        return iPv411Addr;
    }

    /**
     * @return
     */
    public RetepString getMsk() {

        return iPv419Msk;
    }

    /**
     * @return
     */
    public RetepString getGw() {

        return iPv427Gw;
    }

    /**
     * @return
     */
    public RetepString getDNS1() {

        return iPv435DNS1;
    }

    /**
     * @return
     */
    public RetepString getDNS2() {

        return iPv443DNS2;
    }

    /**
     * @return
     */
    public RetepString getNTP1() {

        return iPv451NTP1;
    }

    /**
     * @return
     */
    public RetepString getNTP2() {

        return iPv463NTP2;
    }

    /**
     * @return
     */
    public RetepString getDomNam() {

        return iPv475DomNam;
    }

    /**
     * @return
     */
    public RetepString getHostNam() {

        return iPv487HostNam;
    }

    /**
     * @return
     */
    public RetepLong getPad() {

        return iPv499Pad;
    }

    /**
     *
     */
    public class ID extends RegisterEnum16 {


        public ID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getiPv4_12(), 0, 1, "Model", "", "Include to support an IPv4 protocol stack on this interface", Rw.R, Mandatory.M);
            hashtable.put((long) 12, "SunSpec IPv4");

        }
    }

    /**
     *
     */
    public class L extends RegisterUint16 {

        public L(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getiPv4_12(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class Nam extends RegisterString {

        public Nam(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getiPv4_12(), 2, 4, "Name", "", "Interface name", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class CfgSt extends RegisterEnum16 {

        public CfgSt(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getiPv4_12(), 6, 1, "Config Status", "", "Enumerated value.  Configuration status", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "NOT_CONFIGURED");
            hashtable.put((long) 1, "VALID_SETTING");
            hashtable.put((long) 2, "VALID_HW");
        }
    }

    /**
     *
     */
    public class ChgSt extends RegisterBitfield16 {

        public ChgSt(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getiPv4_12(), 7, 1, "Change Status", "", "Bitmask value.  A configuration change is pending", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "PENDING");
        }
    }

    /**
     *
     */
    public class Cap extends RegisterBitfield16 {

        public Cap(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getiPv4_12(), 8, 1, "Config Capability", "", "Bitmask value. Identify capable sources of configuration", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "DHCP");
            hashtable.put((long) 1, "BOOTP");
            hashtable.put((long) 2, "ZEROCONF");
            hashtable.put((long) 3, "DNS");
            hashtable.put((long) 4, "CFG_SETTABLE");
            hashtable.put((long) 5, "HW_CONFIG");
            hashtable.put((long) 6, "NTP_CLIENT");
            hashtable.put((long) 7, "RESET_REQUIRED");
        }
    }

    /**
     *
     */
    public class Cfg extends RegisterEnum16 {

        public Cfg(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getiPv4_12(), 9, 1, "IPv4 Config", "", "Enumerated value.  Configuration method used.", Rw.RW, Mandatory.M);
            hashtable.put((long) 0, "");
            hashtable.put((long) 1, "DHCP");
            hashtable.put((long) 2, "BOOTP");
            hashtable.put((long) 3, "ZEROCONF");
        }
    }

    /**
     *
     */
    public class Ctl extends RegisterEnum16 {

        public Ctl(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getiPv4_12(), 10, 1, "Control", "", "Configure use of services", Rw.RW, Mandatory.M);
            hashtable.put((long) 0, "ENABLE_DNS");
            hashtable.put((long) 1, "ENABLE_NTP");
        }
    }

    /**
     *
     */
    public class Addr extends RegisterString {

        public Addr(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getiPv4_12(), 11, 8, "IP", "", "IPv4 numeric address as a dotted String xxx.xxx.xxx.xxx", Rw.RW, Mandatory.M);
        }
    }

    /**
     *
     */
    public class Msk extends RegisterString {

        public Msk(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getiPv4_12(), 19, 8, "Netmask", "", "IPv4 numeric netmask as a dotted String xxx.xxx.xxx.xxx", Rw.RW, Mandatory.M);
        }
    }

    /**
     *
     */
    public class Gw extends RegisterString {

        public Gw(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getiPv4_12(), 27, 8, "Gateway", "", "IPv4 numeric gateway address as a dotted String xxx.xxx.xxx.xxx", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class DNS1 extends RegisterString {

        public DNS1(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getiPv4_12(), 35, 8, "DNS1", "", "IPv4 numeric DNS address as a dotted String xxx.xxx.xxx.xxx", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class DNS2 extends RegisterString {

        public DNS2(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getiPv4_12(), 43, 8, "DNS2", "", "IPv4 numeric DNS address as a dotted String xxx.xxx.xxx.xxx", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class NTP1 extends RegisterString {

        public NTP1(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getiPv4_12(), 51, 12, "NTP1", "", "IPv4 numeric NTP address as a dotted String xxx.xxx.xxx.xxx", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class NTP2 extends RegisterString {

        public NTP2(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getiPv4_12(), 63, 12, "NTP2", "", "IPv4 numeric NTP address as a dotted String xxx.xxx.xxx.xxx", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class DomNam extends RegisterString {

        public DomNam(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getiPv4_12(), 75, 12, "Domain", "", "Domain name (24 chars max)", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class HostNam extends RegisterString {

        public HostNam(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getiPv4_12(), 87, 12, "Host Name", "", "Host name (24 chars max)", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class Pad extends RegisterPad {

        public Pad(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getiPv4_12(), 99, 1, "Pad", "", "Pad", Rw.R, Mandatory.O);
        }
    }
}
