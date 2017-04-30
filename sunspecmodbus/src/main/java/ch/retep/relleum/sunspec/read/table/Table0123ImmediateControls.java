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

import ch.retep.relleum.modbus.datatype.RegisterDouble;
import ch.retep.relleum.modbus.datatype.RegisterEnum16;
import ch.retep.relleum.modbus.datatype.RegisterSunssf;
import ch.retep.relleum.modbus.datatype.RegisterUDouble;
import ch.retep.relleum.modbus.datatype.RegisterUint16;
import ch.retep.relleum.modbus.datatype.Table;
import ch.retep.relleum.sunspec.TcpModbusHandler;
import ch.retep.relleum.sunspec.datatype.RetepDouble;
import ch.retep.relleum.sunspec.datatype.RetepEnum;
import ch.retep.relleum.sunspec.datatype.RetepLong;

/**
 * @author Peter
 */
public class Table0123ImmediateControls extends Table {

    private ID immediateControlsID;
    private L immediateControlsL;
    private WMaxLimPct_SF immediateControls21WMaxLimPct_SF;
    private OutPFSet_SF immediateControls22OutPFSet_SF;
    private VArPct_SF immediateControls23VArPct_SF;

    private Conn_WinTms immediateControls0Conn_WinTms;
    private Conn_RvrtTms immediateControls1Conn_RvrtTms;
    private Conn immediateControls2Conn;
    private WMaxLimPct immediateControls3WMaxLimPct;
    private WMaxLimPct_WinTms immediateControls4WMaxLimPct_WinTms;
    private WMaxLimPct_RvrtTms immediateControls5WMaxLimPct_RvrtTms;
    private WMaxLimPct_RmpTms immediateControls6WMaxLimPct_RmpTms;
    private WMaxLim_Ena immediateControls7WMaxLim_Ena;
    private OutPFSet immediateControls8OutPFSet;
    private OutPFSet_WinTms immediateControls9OutPFSet_WinTms;
    private OutPFSet_RvrtTms immediateControls10OutPFSet_RvrtTms;
    private OutPFSet_RmpTms immediateControls11OutPFSet_RmpTms;
    private OutPFSet_Ena immediateControls12OutPFSet_Ena;
    private VArWMaxPct immediateControls13VArWMaxPct;
    private VArMaxPct immediateControls14VArMaxPct;
    private VArAvalPct immediateControls15VArAvalPct;
    private VArPct_WinTms immediateControls16VArPct_WinTms;
    private VArPct_RvrtTms immediateControls17VArPct_RvrtTms;
    private VArPct_RmpTms immediateControls18VArPct_RmpTms;
    private VArPct_Mod immediateControls19VArPct_Mod;
    private VArPct_Ena immediateControls20VArPct_Ena;

    public Table0123ImmediateControls(TcpModbusHandler tcpModbusHandler) {
        init(tcpModbusHandler.getImmediateControls_123(), 0, 26, "Immediate Controls Model", "", "Immediate Controls Model", Rw.R, Mandatory.M);

        immediateControlsID = new ID(tcpModbusHandler);
        immediateControlsL = new L(tcpModbusHandler);
        immediateControls21WMaxLimPct_SF = new WMaxLimPct_SF(tcpModbusHandler);
        immediateControls22OutPFSet_SF = new OutPFSet_SF(tcpModbusHandler);
        immediateControls23VArPct_SF = new VArPct_SF(tcpModbusHandler);

        immediateControls0Conn_WinTms = new Conn_WinTms(tcpModbusHandler);
        immediateControls1Conn_RvrtTms = new Conn_RvrtTms(tcpModbusHandler);
        immediateControls2Conn = new Conn(tcpModbusHandler);
        immediateControls3WMaxLimPct = new WMaxLimPct(immediateControls21WMaxLimPct_SF, tcpModbusHandler);
        immediateControls4WMaxLimPct_WinTms = new WMaxLimPct_WinTms(tcpModbusHandler);
        immediateControls5WMaxLimPct_RvrtTms = new WMaxLimPct_RvrtTms(tcpModbusHandler);
        immediateControls6WMaxLimPct_RmpTms = new WMaxLimPct_RmpTms(tcpModbusHandler);
        immediateControls7WMaxLim_Ena = new WMaxLim_Ena(tcpModbusHandler);
        immediateControls8OutPFSet = new OutPFSet(immediateControls22OutPFSet_SF, tcpModbusHandler);
        immediateControls9OutPFSet_WinTms = new OutPFSet_WinTms(tcpModbusHandler);
        immediateControls10OutPFSet_RvrtTms = new OutPFSet_RvrtTms(tcpModbusHandler);
        immediateControls11OutPFSet_RmpTms = new OutPFSet_RmpTms(tcpModbusHandler);
        immediateControls12OutPFSet_Ena = new OutPFSet_Ena(tcpModbusHandler);
        immediateControls13VArWMaxPct = new VArWMaxPct(immediateControls23VArPct_SF, tcpModbusHandler);
        immediateControls14VArMaxPct = new VArMaxPct(immediateControls23VArPct_SF, tcpModbusHandler);
        immediateControls15VArAvalPct = new VArAvalPct(immediateControls23VArPct_SF, tcpModbusHandler);
        immediateControls16VArPct_WinTms = new VArPct_WinTms(tcpModbusHandler);
        immediateControls17VArPct_RvrtTms = new VArPct_RvrtTms(tcpModbusHandler);
        immediateControls18VArPct_RmpTms = new VArPct_RmpTms(tcpModbusHandler);
        immediateControls19VArPct_Mod = new VArPct_Mod(tcpModbusHandler);
        immediateControls20VArPct_Ena = new VArPct_Ena(tcpModbusHandler);


        vector.add(immediateControlsID);
        vector.add(immediateControlsL);
        vector.add(immediateControls21WMaxLimPct_SF);
        vector.add(immediateControls22OutPFSet_SF);
        vector.add(immediateControls23VArPct_SF);
        vector.add(immediateControls0Conn_WinTms);
        vector.add(immediateControls1Conn_RvrtTms);
        vector.add(immediateControls2Conn);
        vector.add(immediateControls3WMaxLimPct);
        vector.add(immediateControls4WMaxLimPct_WinTms);
        vector.add(immediateControls5WMaxLimPct_RvrtTms);
        vector.add(immediateControls6WMaxLimPct_RmpTms);
        vector.add(immediateControls7WMaxLim_Ena);
        vector.add(immediateControls8OutPFSet);
        vector.add(immediateControls9OutPFSet_WinTms);
        vector.add(immediateControls10OutPFSet_RvrtTms);
        vector.add(immediateControls11OutPFSet_RmpTms);
        vector.add(immediateControls12OutPFSet_Ena);
        vector.add(immediateControls13VArWMaxPct);
        vector.add(immediateControls14VArMaxPct);
        vector.add(immediateControls15VArAvalPct);
        vector.add(immediateControls16VArPct_WinTms);
        vector.add(immediateControls17VArPct_RvrtTms);
        vector.add(immediateControls18VArPct_RmpTms);
        vector.add(immediateControls19VArPct_Mod);
        vector.add(immediateControls20VArPct_Ena);

    }

    /**
     * @return
     */
    public RetepEnum ID() {
        return immediateControlsID;
    }

    /**
     * @return
     */
    public RetepLong getL() {
        return immediateControlsL;
    }

    /**
     * @return
     */
    public RetepLong getConn_WinTms() {
        return immediateControls0Conn_WinTms;
    }

    /**
     * @return
     */
    public RetepLong getConn_RvrtTms() {
        return immediateControls1Conn_RvrtTms;
    }

    /**
     * @return
     */
    public RetepEnum getConn() {
        return immediateControls2Conn;
    }

    /**
     * @return
     */
    public RetepDouble getWMaxLimPct() {
        return immediateControls3WMaxLimPct;
    }

    /**
     * @return
     */
    public RetepLong getWMaxLimPct_WinTms() {
        return immediateControls4WMaxLimPct_WinTms;
    }

    /**
     * @return
     */
    public RetepLong getWMaxLimPct_RvrtTms() {
        return immediateControls5WMaxLimPct_RvrtTms;
    }

    /**
     * @return
     */
    public RetepLong getWMaxLimPct_RmpTms() {
        return immediateControls6WMaxLimPct_RmpTms;
    }

    /**
     * @return
     */
    public RetepEnum getWMaxLim_Ena() {
        return immediateControls7WMaxLim_Ena;
    }

    /**
     * @return
     */
    public RetepDouble getOutPFSet() {
        return immediateControls8OutPFSet;
    }

    /**
     * @return
     */
    public RetepLong getOutPFSet_WinTms() {
        return immediateControls9OutPFSet_WinTms;
    }

    /**
     * @return
     */
    public RetepLong getOutPFSet_RvrtTms() {
        return immediateControls10OutPFSet_RvrtTms;
    }

    /**
     * @return
     */
    public RetepLong getOutPFSet_RmpTms() {
        return immediateControls11OutPFSet_RmpTms;
    }

    /**
     * @return
     */
    public RetepEnum getOutPFSet_Ena() {
        return immediateControls12OutPFSet_Ena;
    }

    /**
     * @return
     */
    public RetepDouble getVArWMaxPct() {
        return immediateControls13VArWMaxPct;
    }

    /**
     * @return
     */
    public RetepDouble getVArMaxPct() {
        return immediateControls14VArMaxPct;
    }

    /**
     * @return
     */
    public RetepDouble getVArAvalPct() {
        return immediateControls15VArAvalPct;
    }

    /**
     * @return
     */
    public RetepLong getVArPct_WinTms() {
        return immediateControls16VArPct_WinTms;
    }

    /**
     * @return
     */
    public RetepLong getVArPct_RvrtTms() {
        return immediateControls17VArPct_RvrtTms;
    }

    /**
     * @return
     */
    public RetepLong getVArPct_RmpTms() {
        return immediateControls18VArPct_RmpTms;
    }

    /**
     * @return
     */
    public RetepEnum getVArPct_Mod() {
        return immediateControls19VArPct_Mod;
    }

    /**
     * @return
     */
    public RetepEnum getVArPct_Ena() {
        return immediateControls20VArPct_Ena;
    }

    /**
     * @return
     */
    public RetepLong getWMaxLimPct_SF() {
        return immediateControls21WMaxLimPct_SF;
    }

    /**
     * @return
     */
    public RetepLong getOutPFSet_SF() {
        return immediateControls22OutPFSet_SF;
    }

    /**
     * @return
     */
    public RetepLong getVArPct_SF() {
        return immediateControls23VArPct_SF;
    }

    /**
     *
     */
    public class ID extends RegisterEnum16 {


        public ID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getImmediateControls_123(), 0, 1, "Model", "", "Immediate Inverter Controls ", Rw.R, Mandatory.M);
            hashtable.put((long) 123, "SunSpec Immediate Controls");
        }
    }

    /**
     *
     */
    public class L extends RegisterUint16 {

        public L(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getImmediateControls_123(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class Conn_WinTms extends RegisterUint16 {

        public Conn_WinTms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getImmediateControls_123(), 2, 1, "Conn_WinTms", "Secs", "Time window for connect/disconnect.", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class Conn_RvrtTms extends RegisterUint16 {

        public Conn_RvrtTms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getImmediateControls_123(), 3, 1, "Conn_RvrtTms", "Secs", "Timeout period for connect/disconnect.", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class Conn extends RegisterEnum16 {

        public Conn(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getImmediateControls_123(), 4, 1, "Conn", "", "Enumerated valued.  Connection control.", Rw.RW, Mandatory.M);
            hashtable.put((long) 0, "DISCONNECT");
            hashtable.put((long) 1, "CONNECT");
        }
    }

    /**
     *
     */
    public class WMaxLimPct extends RegisterUDouble {

        /**
         * @param aScalFactor
         */
        public WMaxLimPct(WMaxLimPct_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getImmediateControls_123(), 5, 1, "WMaxLimPct", "% WMax", "Set power output to specified level.", Rw.RW, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class WMaxLimPct_WinTms extends RegisterUint16 {

        public WMaxLimPct_WinTms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getImmediateControls_123(), 6, 1, "WMaxLimPct_WinTms", "Secs", "Time window for power limit change.", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class WMaxLimPct_RvrtTms extends RegisterUint16 {

        public WMaxLimPct_RvrtTms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getImmediateControls_123(), 7, 1, "WMaxLimPct_RvrtTms", "Secs", "Timeout period for power limit.", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class WMaxLimPct_RmpTms extends RegisterUint16 {

        public WMaxLimPct_RmpTms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getImmediateControls_123(), 8, 1, "WMaxLimPct_RmpTms", "Secs", "Ramp time for moving from current setpoint to new setpoint.", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class WMaxLim_Ena extends RegisterEnum16 {

        public WMaxLim_Ena(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getImmediateControls_123(), 9, 1, "WMaxLim_Ena", "", "Enumerated valued.  Throttle enable/disable control.", Rw.RW, Mandatory.M);
            hashtable.put((long) 0, "DISABLED");
            hashtable.put((long) 1, "ENABLED");
        }
    }

    /**
     *
     */
    public class OutPFSet extends RegisterDouble {


        /**
         * @param aScalFactor
         */
        public OutPFSet(OutPFSet_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getImmediateControls_123(), 10, 1, "OutPFSet", "cos()", "Set power factor to specific value - cosine of angle.", Rw.RW, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class OutPFSet_WinTms extends RegisterUint16 {

        public OutPFSet_WinTms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getImmediateControls_123(), 11, 1, "OutPFSet_WinTms", "Secs", "Time window for power factor change.", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class OutPFSet_RvrtTms extends RegisterUint16 {

        public OutPFSet_RvrtTms(TcpModbusHandler tcpModbusHandler)
            {
                init(tcpModbusHandler.getImmediateControls_123(), 12, 1, "OutPFSet_RvrtTms", "Secs", "Timeout period for power factor.", Rw.RW, Mandatory.O);
            }
        }

        /**
         *
         */
        public class OutPFSet_RmpTms extends RegisterUint16 {

            public OutPFSet_RmpTms(TcpModbusHandler tcpModbusHandler) {
                init(tcpModbusHandler.getImmediateControls_123(), 13, 1, "OutPFSet_RmpTms", "Secs", "Ramp time for moving from current setpoint to new setpoint.", Rw.RW, Mandatory.O);
            }
        }

        /**
         *
         */
        public class OutPFSet_Ena extends RegisterEnum16 {

            public OutPFSet_Ena(TcpModbusHandler tcpModbusHandler) {
                init(tcpModbusHandler.getImmediateControls_123(), 14, 1, "OutPFSet_Ena", "", "Enumerated valued.  Fixed power factor enable/disable control.", Rw.RW, Mandatory.M);
                hashtable.put((long) 0, "DISABLED");
                hashtable.put((long) 1, "ENABLED");
            }
        }

        /**
         *
         */
        public class VArWMaxPct extends RegisterDouble {


            /**
             * @param aScalFactor
             */
            public VArWMaxPct(VArPct_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
                init(tcpModbusHandler.getImmediateControls_123(), 15, 1, "VArWMaxPct", "% WMax", "Reactive power in percent of WMax.", Rw.RW, Mandatory.O);
                setScaleFactorMessage(aScalFactor);
            }
        }

        /**
         *
         */
        public class VArMaxPct extends RegisterDouble {


            /**
             * @param aScalFactor
             */
            public VArMaxPct(VArPct_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
                setScaleFactorMessage(aScalFactor);
                init(tcpModbusHandler.getImmediateControls_123(), 16, 1, "VArMaxPct", "% VArMax", "Reactive power in percent of VArMax.", Rw.RW, Mandatory.O);

            }
        }

        /**
         *
         */
        public class VArAvalPct extends RegisterDouble {


            /**
             * @param aScalFactor
             */
            public VArAvalPct(VArPct_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
                init(tcpModbusHandler.getImmediateControls_123(), 17, 1, "VArAvalPct", "% VArAval", "Reactive power in percent of VArAval.", Rw.RW, Mandatory.O);


                setScaleFactorMessage(aScalFactor);
            }
        }

        /**
         *
         */
        public class VArPct_WinTms extends RegisterUint16 {

            public VArPct_WinTms(TcpModbusHandler tcpModbusHandler) {
                init(tcpModbusHandler.getImmediateControls_123(), 18, 1, "VArPct_WinTms", "Secs", "Time window for VAR limit change.", Rw.RW, Mandatory.O);
            }
        }

        /**
         *
         */
        public class VArPct_RvrtTms extends RegisterUint16 {

            public VArPct_RvrtTms(TcpModbusHandler tcpModbusHandler) {
                init(tcpModbusHandler.getImmediateControls_123(), 19, 1, "VArPct_RvrtTms", "Secs", "Timeout period for VAR limit.", Rw.RW, Mandatory.O);
            }
        }

        /**
         *
         */
        public class VArPct_RmpTms extends RegisterUint16 {

            public VArPct_RmpTms(TcpModbusHandler tcpModbusHandler) {
                init(tcpModbusHandler.getImmediateControls_123(), 20, 1, "VArPct_RmpTms", "Secs", "Ramp time for moving from current setpoint to new setpoint.", Rw.RW, Mandatory.O);
            }
        }

        /**
         *
         */
        public class VArPct_Mod extends RegisterEnum16 {

            public VArPct_Mod(TcpModbusHandler tcpModbusHandler) {
                init(tcpModbusHandler.getImmediateControls_123(), 21, 1, "VArPct_Mod", "", "Enumerated value. VAR percent limit mode.", Rw.RW, Mandatory.O);
                hashtable.put((long) 0, "NONE");
                hashtable.put((long) 1, "WMax");
                hashtable.put((long) 2, "VArMax");
                hashtable.put((long) 3, "VArAval");
            }
        }

        /**
         *
         */
        public class VArPct_Ena extends RegisterEnum16 {

            public VArPct_Ena(TcpModbusHandler tcpModbusHandler) {
                init(tcpModbusHandler.getImmediateControls_123(), 22, 1, "VArPct_Ena", "", "Enumerated valued.  Percent limit VAr enable/disable control.", Rw.RW, Mandatory.M);
                hashtable.put((long) 0, "DISABLED");
                hashtable.put((long) 1, "ENABLED");
            }
        }

        /**
         *
         */
        public class WMaxLimPct_SF extends RegisterSunssf {

            public WMaxLimPct_SF(TcpModbusHandler tcpModbusHandler) {
                init(tcpModbusHandler.getImmediateControls_123(), 23, 1, "WMaxLimPct_SF", "", "Scale factor for power output percent.", Rw.R, Mandatory.M);
            }
        }

        /**
         *
         */
        public class OutPFSet_SF extends RegisterSunssf {

            public OutPFSet_SF(TcpModbusHandler tcpModbusHandler) {
                init(tcpModbusHandler.getImmediateControls_123(), 24, 1, "OutPFSet_SF", "", "Scale factor for power factor.", Rw.R, Mandatory.M);
            }
        }

        /**
         *
         */
        public class VArPct_SF extends RegisterSunssf {

            public VArPct_SF(TcpModbusHandler tcpModbusHandler) {
                init(tcpModbusHandler.getImmediateControls_123(), 25, 1, "VArPct_SF", "", "Scale factor for reactive power percent.", Rw.R, Mandatory.O);
            }
        }

    }
