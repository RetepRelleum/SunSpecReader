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
package ch.retep.relleum.sunspec.read.table;

import ch.retep.relleum.modbus.datatype.RegisterBitfield32;
import ch.retep.relleum.modbus.datatype.RegisterDouble;
import ch.retep.relleum.modbus.datatype.RegisterDoubleACC32;
import ch.retep.relleum.modbus.datatype.RegisterEnum16;
import ch.retep.relleum.modbus.datatype.RegisterSunssf;
import ch.retep.relleum.modbus.datatype.RegisterUDouble;
import ch.retep.relleum.modbus.datatype.RegisterUint16;
import ch.retep.relleum.modbus.datatype.Table;
import ch.retep.relleum.sunspec.TcpModbusHandler;
import ch.retep.relleum.sunspec.datatype.RetepBitMask;
import ch.retep.relleum.sunspec.datatype.RetepDouble;
import ch.retep.relleum.sunspec.datatype.RetepEnum;
import ch.retep.relleum.sunspec.datatype.RetepLong;

/**
 * @author Peter
 */
public class Table0103InverterThreePhase extends Table {

    private ID inverterThreePhase00ID;
    private L inverterThreePhase01L;
    private A_SF inverterThreePhase06A_SF;
    private A inverterThreePhase02A;
    private AphA inverterThreePhase03AphA;
    private AphB inverterThreePhase04AphB;
    private AphC inverterThreePhase05AphC;
    private V_SF inverterThreePhase13V_SF;
    private PPVphAB inverterThreePhase07PPVphAB;
    private PPVphBC inverterThreePhase08PPVphBC;
    private PPVphCA inverterThreePhase09PPVphCA;
    private PhVphA inverterThreePhase10PhVphA;
    private PhVphB inverterThreePhase11PhVphB;
    private PhVphC inverterThreePhase12PhVphC;
    private W_SF inverterThreePhase15W_SF;
    private W inverterThreePhase14W;
    private Hz_SF inverterThreePhase17Hz_SF;
    private Hz inverterThreePhase16Hz;
    private VA_SF inverterThreePhase19VA_SF;
    private VA inverterThreePhase18VA;
    private VAr_SF inverterThreePhase21VAr_SF;
    private VAr inverterThreePhase20VAr;
    private PF_SF inverterThreePhase23PF_SF;
    private PF inverterThreePhase22PF;
    private WH_SF inverterThreePhase26WH_SF;
    private WH inverterThreePhase24WH;
    private DCA_SF inverterThreePhase28DCA_SF;
    private DCA inverterThreePhase27DCA;
    private DCV_SF inverterThreePhase30DCV_SF;
    private DCV inverterThreePhase29DCV;
    private DCW_SF inverterThreePhase32DCW_SF;
    private DCW inverterThreePhase31DCW;
    private Tmp_SF inverterThreePhase37Tmp_SF;
    private TmpCab inverterThreePhase33TmpCab;
    private TmpSnk inverterThreePhase34TmpSnk;
    private TmpTrns inverterThreePhase35TmpTrns;
    private TmpOt inverterThreePhase36TmpOt;
    private St inverterThreePhase38St;
    private StVnd inverterThreePhase39StVnd;
    private Evt1 inverterThreePhase40Evt1;
    private Evt2 inverterThreePhase42Evt2;
    private EvtVnd1 inverterThreePhase44EvtVnd1;
    private EvtVnd2 inverterThreePhase46EvtVnd2;
    private EvtVnd3 inverterThreePhase48EvtVnd3;
    private EvtVnd4 inverterThreePhase50EvtVnd4;

    public Table0103InverterThreePhase(TcpModbusHandler tcpModbusHandler) {
        init(tcpModbusHandler.getInverterThreePhase_103(), 0, 52, "Inverter Three Phase", "", "nverter Three Phase", Rw.nan, Mandatory.nan);

        inverterThreePhase00ID = new ID(tcpModbusHandler);
        inverterThreePhase01L = new L(tcpModbusHandler);
        inverterThreePhase06A_SF = new A_SF(tcpModbusHandler);
        inverterThreePhase02A = new A(inverterThreePhase06A_SF, tcpModbusHandler);
        inverterThreePhase03AphA = new AphA(inverterThreePhase06A_SF, tcpModbusHandler);
        inverterThreePhase04AphB = new AphB(inverterThreePhase06A_SF, tcpModbusHandler);
        inverterThreePhase05AphC = new AphC(inverterThreePhase06A_SF, tcpModbusHandler);
        inverterThreePhase13V_SF = new V_SF(tcpModbusHandler);
        inverterThreePhase07PPVphAB = new PPVphAB(inverterThreePhase13V_SF, tcpModbusHandler);
        inverterThreePhase08PPVphBC = new PPVphBC(inverterThreePhase13V_SF, tcpModbusHandler);
        inverterThreePhase09PPVphCA = new PPVphCA(inverterThreePhase13V_SF, tcpModbusHandler);
        inverterThreePhase10PhVphA = new PhVphA(inverterThreePhase13V_SF, tcpModbusHandler);
        inverterThreePhase11PhVphB = new PhVphB(inverterThreePhase13V_SF, tcpModbusHandler);
        inverterThreePhase12PhVphC = new PhVphC(inverterThreePhase13V_SF, tcpModbusHandler);
        inverterThreePhase15W_SF = new W_SF(tcpModbusHandler);
        inverterThreePhase14W = new W(inverterThreePhase15W_SF, tcpModbusHandler);
        inverterThreePhase17Hz_SF = new Hz_SF(tcpModbusHandler);
        inverterThreePhase16Hz = new Hz(inverterThreePhase17Hz_SF, tcpModbusHandler);
        inverterThreePhase19VA_SF = new VA_SF(tcpModbusHandler);
        inverterThreePhase18VA = new VA(inverterThreePhase19VA_SF, tcpModbusHandler);
        inverterThreePhase21VAr_SF = new VAr_SF(tcpModbusHandler);
        inverterThreePhase20VAr = new VAr(inverterThreePhase21VAr_SF, tcpModbusHandler);
        inverterThreePhase23PF_SF = new PF_SF(tcpModbusHandler);
        inverterThreePhase22PF = new PF(inverterThreePhase23PF_SF, tcpModbusHandler);
        inverterThreePhase26WH_SF = new WH_SF(tcpModbusHandler);
        inverterThreePhase24WH = new WH(inverterThreePhase26WH_SF, tcpModbusHandler);
        inverterThreePhase28DCA_SF = new DCA_SF(tcpModbusHandler);
        inverterThreePhase27DCA = new DCA(inverterThreePhase28DCA_SF, tcpModbusHandler);
        inverterThreePhase30DCV_SF = new DCV_SF(tcpModbusHandler);
        inverterThreePhase29DCV = new DCV(inverterThreePhase30DCV_SF, tcpModbusHandler);
        inverterThreePhase32DCW_SF = new DCW_SF(tcpModbusHandler);
        inverterThreePhase31DCW = new DCW(inverterThreePhase32DCW_SF, tcpModbusHandler);
        inverterThreePhase37Tmp_SF = new Tmp_SF(tcpModbusHandler);
        inverterThreePhase33TmpCab = new TmpCab(inverterThreePhase37Tmp_SF, tcpModbusHandler);
        inverterThreePhase34TmpSnk = new TmpSnk(inverterThreePhase37Tmp_SF, tcpModbusHandler);
        inverterThreePhase35TmpTrns = new TmpTrns(inverterThreePhase37Tmp_SF, tcpModbusHandler);
        inverterThreePhase36TmpOt = new TmpOt(inverterThreePhase37Tmp_SF, tcpModbusHandler);
        inverterThreePhase38St = new St(tcpModbusHandler);
        inverterThreePhase39StVnd = new StVnd(tcpModbusHandler);
        inverterThreePhase40Evt1 = new Evt1(tcpModbusHandler);
        inverterThreePhase42Evt2 = new Evt2(tcpModbusHandler);
        inverterThreePhase44EvtVnd1 = new EvtVnd1(tcpModbusHandler);
        inverterThreePhase46EvtVnd2 = new EvtVnd2(tcpModbusHandler);
        inverterThreePhase48EvtVnd3 = new EvtVnd3(tcpModbusHandler);
        inverterThreePhase50EvtVnd4 = new EvtVnd4(tcpModbusHandler);

        vector.add(inverterThreePhase00ID);
        vector.add(inverterThreePhase01L);
        vector.add(inverterThreePhase13V_SF);
        vector.add(inverterThreePhase06A_SF);
        vector.add(inverterThreePhase15W_SF);
        vector.add(inverterThreePhase17Hz_SF);
        vector.add(inverterThreePhase19VA_SF);
        vector.add(inverterThreePhase21VAr_SF);
        vector.add(inverterThreePhase23PF_SF);
        vector.add(inverterThreePhase26WH_SF);
        vector.add(inverterThreePhase28DCA_SF);
        vector.add(inverterThreePhase30DCV_SF);
        vector.add(inverterThreePhase32DCW_SF);
        vector.add(inverterThreePhase37Tmp_SF);
        vector.add(inverterThreePhase02A);
        vector.add(inverterThreePhase03AphA);
        vector.add(inverterThreePhase04AphB);
        vector.add(inverterThreePhase05AphC);
        vector.add(inverterThreePhase07PPVphAB);
        vector.add(inverterThreePhase08PPVphBC);
        vector.add(inverterThreePhase09PPVphCA);
        vector.add(inverterThreePhase10PhVphA);
        vector.add(inverterThreePhase11PhVphB);
        vector.add(inverterThreePhase12PhVphC);
        vector.add(inverterThreePhase14W);
        vector.add(inverterThreePhase16Hz);
        vector.add(inverterThreePhase18VA);
        vector.add(inverterThreePhase20VAr);
        vector.add(inverterThreePhase22PF);
        vector.add(inverterThreePhase24WH);
        vector.add(inverterThreePhase27DCA);
        vector.add(inverterThreePhase29DCV);
        vector.add(inverterThreePhase31DCW);
        vector.add(inverterThreePhase33TmpCab);
        vector.add(inverterThreePhase34TmpSnk);
        vector.add(inverterThreePhase35TmpTrns);
        vector.add(inverterThreePhase36TmpOt);
        vector.add(inverterThreePhase38St);
        vector.add(inverterThreePhase39StVnd);
        vector.add(inverterThreePhase40Evt1);
        vector.add(inverterThreePhase42Evt2);
        vector.add(inverterThreePhase44EvtVnd1);
        vector.add(inverterThreePhase46EvtVnd2);
        vector.add(inverterThreePhase48EvtVnd3);
        vector.add(inverterThreePhase50EvtVnd4);
    }

    /**
     * @return
     */
    public RetepEnum getID() {
        return inverterThreePhase00ID;
    }

    /**
     * @return
     */
    public RetepLong getL() {
        return inverterThreePhase01L;
    }

    /**
     * @return
     */
    public RetepDouble getA() {
        return inverterThreePhase02A;
    }

    /**
     * @return
     */
    public RetepDouble getAphA() {
        return inverterThreePhase03AphA;
    }

    /**
     * @return
     */
    public RetepDouble getAphB() {
        return inverterThreePhase04AphB;
    }

    /**
     * @return
     */
    public RetepDouble getAphC() {
        return inverterThreePhase05AphC;
    }

    /**
     * @return
     */
    public RetepLong getA_SF() {
        return inverterThreePhase06A_SF;
    }

    /**
     * @return
     */
    public RetepDouble getPPVphAB() {
        return inverterThreePhase07PPVphAB;
    }

    /**
     * @return
     */
    public RetepDouble getPPVphBC() {
        return inverterThreePhase08PPVphBC;
    }

    /**
     * @return
     */
    public RetepDouble getPPVphCA() {
        return inverterThreePhase09PPVphCA;
    }

    /**
     * @return
     */
    public RetepDouble getPhVphA() {
        return inverterThreePhase10PhVphA;
    }

    /**
     * @return
     */
    public RetepDouble getPhVphB() {
        return inverterThreePhase11PhVphB;
    }

    /**
     * @return
     */
    public RetepDouble getPhVphC() {
        return inverterThreePhase12PhVphC;
    }

    /**
     * @return
     */
    public RetepLong getV_SF() {
        return inverterThreePhase13V_SF;
    }

    /**
     * @return
     */
    public RetepDouble getW() {
        return inverterThreePhase14W;
    }

    /**
     * @return
     */
    public RetepLong getW_SF() {
        return inverterThreePhase15W_SF;
    }

    /**
     * @return
     */
    public RetepDouble getHz() {
        return inverterThreePhase16Hz;
    }

    /**
     * @return
     */
    public RetepLong getHz_SF() {
        return inverterThreePhase17Hz_SF;
    }

    /**
     * @return
     */
    public RetepDouble getVA() {
        return inverterThreePhase18VA;
    }

    /**
     * @return
     */
    public RetepLong getVA_SF() {
        return inverterThreePhase19VA_SF;
    }

    /**
     * @return
     */
    public RetepDouble getVAr() {
        return inverterThreePhase20VAr;
    }

    /**
     * @return
     */
    public RetepLong getVAr_SF() {
        return inverterThreePhase21VAr_SF;
    }

    /**
     * @return
     */
    public RetepDouble getPF() {
        return inverterThreePhase22PF;
    }

    /**
     * @return
     */
    public RetepLong getPF_SF() {
        return inverterThreePhase23PF_SF;
    }

    /**
     * @return
     */
    public RetepDouble getWH() {
        return inverterThreePhase24WH;
    }

    /**
     * @return
     */
    public RetepLong getWH_SF() {
        return inverterThreePhase26WH_SF;
    }

    /**
     * @return
     */
    public RetepDouble getDCA() {
        return inverterThreePhase27DCA;
    }

    /**
     * @return
     */
    public RetepLong getDCA_SF() {
        return inverterThreePhase28DCA_SF;
    }

    /**
     * @return
     */
    public RetepDouble getDCV() {
        return inverterThreePhase29DCV;
    }

    /**
     * @return
     */
    public RetepLong getDCV_SF() {
        return inverterThreePhase30DCV_SF;
    }

    /**
     * @return
     */
    public RetepDouble getDCW() {
        return inverterThreePhase31DCW;
    }

    /**
     * @return
     */
    public RetepLong getDCW_SF() {
        return inverterThreePhase32DCW_SF;
    }

    /**
     * @return
     */
    public RetepDouble getTmpCab() {
        return inverterThreePhase33TmpCab;
    }

    /**
     * @return
     */
    public RetepDouble getTmpSnk() {
        return inverterThreePhase34TmpSnk;
    }

    /**
     * @return
     */
    public RetepDouble getTmpTrns() {
        return inverterThreePhase35TmpTrns;
    }

    /**
     * @return
     */
    public RetepDouble getTmpOt() {
        return inverterThreePhase36TmpOt;
    }

    /**
     * @return
     */
    public RetepLong getTmp_SF() {
        return inverterThreePhase37Tmp_SF;
    }

    /**
     * @return
     */
    public RetepEnum getSt() {
        return inverterThreePhase38St;
    }

    /**
     * @return
     */
    public RetepEnum getStVnd() {
        return inverterThreePhase39StVnd;
    }

    /**
     * @return
     */
    public RetepBitMask getEvt1() {
        return inverterThreePhase40Evt1;
    }

    /**
     * @return
     */
    public RetepBitMask getEvt2() {
        return inverterThreePhase42Evt2;
    }

    /**
     * @return
     */
    public RetepBitMask getEvtVnd1() {
        return inverterThreePhase44EvtVnd1;
    }

    /**
     * @return
     */
    public RetepBitMask getEvtVnd2() {
        return inverterThreePhase46EvtVnd2;
    }

    /**
     * @return
     */
    public RetepBitMask getEvtVnd3() {
        return inverterThreePhase48EvtVnd3;
    }

    /**
     * @return
     */
    public RetepBitMask getEvtVnd4() {
        return inverterThreePhase50EvtVnd4;
    }

    /**
     *
     */
    public class ID extends RegisterEnum16 {
        public ID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 0, 1, "Model", "", "Include this model for three phase inverter monitoring", Rw.R, Mandatory.M);
            hashtable.put((long) 103, "SunSpec Inverter (Three Phase)");
        }
    }

    /**
     *
     */
    public class L extends RegisterUint16 {

        public L(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class A extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public A(A_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 2, 1, "Amps", "A", "AC Current", Rw.R, Mandatory.M);

        }
    }

    /**
     *
     */
    public class AphA extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public AphA(A_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 3, 1, "Amps Phase A", "A", "Phase A Current", Rw.R, Mandatory.M);

        }
    }

    /**
     *
     */
    public class AphB extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public AphB(A_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 4, 1, "Amps Phase B", "A", "Phase B Current", Rw.R, Mandatory.M);

        }
    }

    /**
     *
     */
    public class AphC extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public AphC(A_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 5, 1, "Amps Phase C", "A", "Phase C Current", Rw.R, Mandatory.M);

        }
    }

    /**
     *
     */
    public class A_SF extends RegisterSunssf {

        public A_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 6, 1, "A_SF", "", "A_SF", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class PPVphAB extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public PPVphAB(V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 7, 1, "Phase Voltage AB", "V", "Phase Voltage AB", Rw.R, Mandatory.O);

        }
    }

    /**
     *
     */
    public class PPVphBC extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public PPVphBC(V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 8, 1, "Phase Voltage BC", "V", "Phase Voltage BC", Rw.R, Mandatory.O);

        }
    }

    /**
     *
     */
    public class PPVphCA extends RegisterUDouble {

        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public PPVphCA(V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 9, 1, "Phase Voltage CA", "V", "Phase Voltage CA", Rw.R, Mandatory.O);

        }
    }

    /**
     *
     */
    public class PhVphA extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public PhVphA(V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 10, 1, "Phase Voltage AN", "V", "Phase Voltage AN", Rw.R, Mandatory.M);

        }
    }

    /**
     *
     */
    public class PhVphB extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public PhVphB(V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 11, 1, "Phase Voltage BN", "V", "Phase Voltage BN", Rw.R, Mandatory.M);

        }
    }

    /**
     *
     */
    public class PhVphC extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public PhVphC(V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 12, 1, "Phase Voltage CN", "V", "Phase Voltage CN", Rw.R, Mandatory.M);

        }
    }

    /**
     *
     */
    public class V_SF extends RegisterSunssf {

        public V_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 13, 1, "V_SF", "", "V_SF", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class W extends RegisterDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public W(W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 14, 1, "Watts", "W", "AC Power", Rw.R, Mandatory.M);

        }
    }

    /**
     *
     */
    public class W_SF extends RegisterSunssf {

        public W_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 15, 1, "W_SF", "", "W_SF", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class Hz extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public Hz(Hz_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 16, 1, "Hz", "Hz", "Line Frequency", Rw.R, Mandatory.M);

        }
    }

    /**
     *
     */
    public class Hz_SF extends RegisterSunssf {

        public Hz_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 17, 1, "Hz_SF", "", "Hz_SF", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class VA extends RegisterDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public VA(VA_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 18, 1, "VA", "VA", "AC Apparent Power", Rw.R, Mandatory.O);

        }
    }

    /**
     *
     */
    public class VA_SF extends RegisterSunssf {

        public VA_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 19, 1, "VA_SF", "", "VA_SF", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class VAr extends RegisterDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public VAr(VAr_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 20, 1, "VAr", "var", "AC Reactive Power", Rw.R, Mandatory.O);

        }
    }

    /**
     *
     */
    public class VAr_SF extends RegisterSunssf {

        public VAr_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 21, 1, "VAr_SF", "", "VAr_SF", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class PF extends RegisterDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public PF(PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 22, 1, "PF", "Pct", "AC Power Factor", Rw.R, Mandatory.O);

        }
    }

    /**
     *
     */
    public class PF_SF extends RegisterSunssf {

        public PF_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 23, 1, "PF_SF", "", "PF_SF", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class WH extends RegisterDoubleACC32 {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public WH(WH_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 24, 2, "WattHours", "Wh", "AC Energy", Rw.R, Mandatory.M);

        }
    }

    /**
     *
     */
    public class WH_SF extends RegisterSunssf {

        public WH_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 26, 1, "WH_SF", "", "WH_SF", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class DCA extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public DCA(DCA_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 27, 1, "DC Amps", "A", "DC Current", Rw.R, Mandatory.O);

        }
    }

    /**
     *
     */
    public class DCA_SF extends RegisterSunssf {

        public DCA_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 28, 1, "DCA_SF", "", "DCA_SF", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class DCV extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public DCV(DCV_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 29, 1, "DC Voltage", "V", "DC Voltage", Rw.R, Mandatory.O);

        }
    }

    /**
     *
     */
    public class DCV_SF extends RegisterSunssf {

        public DCV_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 30, 1, "DCV_SF", "", "DCV_SF", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class DCW extends RegisterDouble {


        /**
         * @param aScalFactor
         */
        public DCW(DCW_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 31, 1, "DC Watts", "W", "DC Power", Rw.R, Mandatory.O);

        }
    }

    /**
     *
     */
    public class DCW_SF extends RegisterSunssf {
        public DCW_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 32, 1, "DCW_SF", "", "DCW_SF", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class TmpCab extends RegisterDouble {


        /**
         * @param aScalFactor
         */
        public TmpCab(Tmp_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 33, 1, "Cabinet Temperature", "C", "Cabinet Temperature", Rw.R, Mandatory.M);

        }
    }

    /**
     *
     */
    public class TmpSnk extends RegisterDouble {


        /**
         * @param aScalFactor
         */
        public TmpSnk(Tmp_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 34, 1, "Heat Sink Temperature", "C", "Heat Sink Temperature", Rw.R, Mandatory.O);

        }
    }

    /**
     *
     */
    public class TmpTrns extends RegisterDouble {


        /**
         * @param aScalFactor
         */
        public TmpTrns(Tmp_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 35, 1, "Transformer Temperature", "C", "Transformer Temperature", Rw.R, Mandatory.O);

        }
    }

    /**
     *
     */
    public class TmpOt extends RegisterDouble {


        /**
         * @param aScalFactor
         */
        public TmpOt(Tmp_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            setScaleFactorMessage(aScalFactor);
            init(tcpModbusHandler.getInverterThreePhase_103(), 36, 1, "Other Temperature", "C", "Other Temperature", Rw.R, Mandatory.O);

        }
    }

    /**
     *
     */
    public class Tmp_SF extends RegisterSunssf {

        public Tmp_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 37, 1, "Tmp_SF", "", "Tmp_SF", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class St extends RegisterEnum16 {

        public St(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 38, 1, "Operating State", "", "Enumerated value.  Operating state", Rw.R, Mandatory.M);
            hashtable.put((long) 1, "OFF");
            hashtable.put((long) 2, "SLEEPING");
            hashtable.put((long) 3, "STARTING");
            hashtable.put((long) 4, "MPPT");
            hashtable.put((long) 5, "THROTTLED");
            hashtable.put((long) 6, "SHUTTING_DOWN");
            hashtable.put((long) 7, "FAULT");
            hashtable.put((long) 8, "STANDBY");
        }
    }

    /**
     *
     */
    public class StVnd extends RegisterEnum16 {

        public StVnd(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 39, 1, "Vendor Operating State", "", "Vendor specific operating state code", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class Evt1 extends RegisterBitfield32 {

        public Evt1(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 40, 2, "Event1", "", "Bitmask value. Event fields", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "GROUND_FAULT");
            hashtable.put((long) 1, "DC_OVER_VOLT");
            hashtable.put((long) 2, "AC_DISCONNECT");
            hashtable.put((long) 3, "DC_DISCONNECT");
            hashtable.put((long) 4, "GRID_DISCONNECT");
            hashtable.put((long) 5, "CABINET_OPEN");
            hashtable.put((long) 6, "MANUAL_SHUTDOWN");
            hashtable.put((long) 7, "OVER_TEMP");
            hashtable.put((long) 8, "OVER_FREQUENCY");
            hashtable.put((long) 9, "UNDER_FREQUENCY");
            hashtable.put((long) 10, "AC_OVER_VOLT");
            hashtable.put((long) 11, "AC_UNDER_VOLT");
            hashtable.put((long) 12, "BLOWN_String_FUSE");
            hashtable.put((long) 13, "UNDER_TEMP");
            hashtable.put((long) 14, "MEMORY_LOSS");
            hashtable.put((long) 15, "HW_TEST_FAILURE");
        }
    }

    /**
     *
     */
    public class Evt2 extends RegisterBitfield32 {

        public Evt2(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 42, 2, "Event Bitfield 2", "", "Reserved for future use", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class EvtVnd1 extends RegisterBitfield32 {

        public EvtVnd1(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 44, 2, "Vendor Event Bitfield 1", "", "Vendor defined events", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class EvtVnd2 extends RegisterBitfield32 {

        public EvtVnd2(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 46, 2, "Vendor Event Bitfield 2", "", "Vendor defined events", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class EvtVnd3 extends RegisterBitfield32 {

        public EvtVnd3(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 48, 2, "Vendor Event Bitfield 3", "", "Vendor defined events", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class EvtVnd4 extends RegisterBitfield32 {

        public EvtVnd4(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getInverterThreePhase_103(), 50, 2, "Vendor Event Bitfield 4", "", "Vendor defined events", Rw.R, Mandatory.O);
        }
    }
}
