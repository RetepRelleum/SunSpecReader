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
import ch.retep.relleum.modbus.datatype.RegisterDouble;
import ch.retep.relleum.modbus.datatype.RegisterEnum16;
import ch.retep.relleum.modbus.datatype.RegisterString;
import ch.retep.relleum.modbus.datatype.RegisterSunssf;
import ch.retep.relleum.modbus.datatype.RegisterUDouble;
import ch.retep.relleum.modbus.datatype.RegisterUint16;
import ch.retep.relleum.modbus.datatype.Table;
import ch.retep.relleum.sunspec.TcpModbusHandler;
import ch.retep.relleum.sunspec.datatype.RetepBitMask;
import ch.retep.relleum.sunspec.datatype.RetepDouble;
import ch.retep.relleum.sunspec.datatype.RetepEnum;
import ch.retep.relleum.sunspec.datatype.RetepLong;
import ch.retep.relleum.sunspec.datatype.RetepString;

/**
 * @author Peter
 */
public class Table0132VoltWatt extends Table {

    private TcpModbusHandler tcpModbusHandler;
    private ID voltWatt00ID;
    private L voltWatt1L;

    private ActCrv voltWatt02ActCrv;
    private ModEna voltWatt03ModEna;
    private WinTms voltWatt04WinTms;
    private RvrtTms voltWatt05RvrtTms;
    private RmpTms voltWatt06RmpTms;
    private NCrv voltWatt07NCrv;
    private NPt voltWatt08NPt;
    private V_SF voltWatt09V_SF;
    private DeptRef_SF voltWatt10DeptRef_SF;
    private RmpIncDec_SF voltWatt11RmpIncDec_SF;

    private ActPt[] voltWatt12ActPts;
    private DeptRef[] voltWatt13DeptRefs;
    private V1[] voltWatt14V1s;
    private W1[] voltWatt15W1s;
    private V2[] voltWatt16V2s;
    private W2[] voltWatt17W2s;
    private V3[] voltWatt18V3s;
    private W3[] voltWatt19W3s;
    private V4[] voltWatt20V4s;
    private W4[] voltWatt21W4s;
    private V5[] voltWatt22V5s;
    private W5[] voltWatt23W5s;
    private V6[] voltWatt24V6s;
    private W6[] voltWatt25W6s;
    private V7[] voltWatt26V7s;
    private W7[] voltWatt27W7s;
    private V8[] voltWatt28V8s;
    private W8[] voltWatt29W8s;
    private V9[] voltWatt30V9s;
    private W9[] voltWatt31W9s;
    private V10[] voltWatt32V10s;
    private W10[] voltWatt33W10s;
    private V11[] voltWatt34V11s;
    private W11[] voltWatt35W11s;
    private V12[] voltWatt36V12s;
    private W12[] voltWatt37W12s;
    private V13[] voltWatt38V13s;
    private W13[] voltWatt39W13s;
    private V14[] voltWatt40V14s;
    private W14[] voltWatt41W14s;
    private V15[] voltWatt42V15s;
    private W15[] voltWatt43W15s;
    private V16[] voltWatt44V16s;
    private W16[] voltWatt45W16s;
    private V17[] voltWatt46V17s;
    private W17[] voltWatt47W17s;
    private V18[] voltWatt48V18s;
    private W18[] voltWatt49W18s;
    private V19[] voltWatt50V19s;
    private W19[] voltWatt51W19s;
    private V20[] voltWatt52V20s;
    private W20[] voltWatt53W20s;
    private CrvNam[] voltWatt54CrvNams;
    private RmpPt1Tms[] voltWatt62RmpPt1Tmss;
    private RmpDecTmm[] voltWatt63RmpDecTmms;
    private RmpIncTmm[] voltWatt64RmpIncTmms;
    private ReadOnly[] voltWatt65ReadOnlys;

    public Table0132VoltWatt(TcpModbusHandler tcpModbusHandler) {
        this.tcpModbusHandler = tcpModbusHandler;
        init(tcpModbusHandler.getVoltWatt_132(), 0, 66, "VoltWatt", "", "VoltWatt", Rw.R, Mandatory.M);

        voltWatt00ID = new ID(tcpModbusHandler);
        voltWatt1L = new L(tcpModbusHandler);
        voltWatt02ActCrv = new ActCrv(tcpModbusHandler);
        voltWatt03ModEna = new ModEna(tcpModbusHandler);
        voltWatt04WinTms = new WinTms(tcpModbusHandler);
        voltWatt05RvrtTms = new RvrtTms(tcpModbusHandler);
        voltWatt06RmpTms = new RmpTms(tcpModbusHandler);
        voltWatt07NCrv = new NCrv(tcpModbusHandler);
        voltWatt08NPt = new NPt(tcpModbusHandler);
        voltWatt09V_SF = new V_SF(tcpModbusHandler);
        voltWatt10DeptRef_SF = new DeptRef_SF(tcpModbusHandler);
        voltWatt11RmpIncDec_SF = new RmpIncDec_SF(tcpModbusHandler);


        vector.add(voltWatt00ID);
        vector.add(voltWatt1L);
        vector.add(voltWatt09V_SF);
        vector.add(voltWatt10DeptRef_SF);
        vector.add(voltWatt11RmpIncDec_SF);
        vector.add(voltWatt02ActCrv);
        vector.add(voltWatt03ModEna);
        vector.add(voltWatt04WinTms);
        vector.add(voltWatt05RvrtTms);
        vector.add(voltWatt06RmpTms);
        vector.add(voltWatt07NCrv);
        vector.add(voltWatt08NPt);



    }

    @Override
    public void setResponseInit(byte[] bArry) {
        super.setResponseInit(bArry);
        int size = (((int) getL().toLong() - 10) / 54);
        voltWatt12ActPts = new ActPt[size];
        voltWatt13DeptRefs = new DeptRef[size];
        voltWatt14V1s = new V1[size];
        voltWatt15W1s = new W1[size];
        voltWatt16V2s = new V2[size];
        voltWatt17W2s = new W2[size];
        voltWatt18V3s = new V3[size];
        voltWatt19W3s = new W3[size];
        voltWatt20V4s = new V4[size];
        voltWatt21W4s = new W4[size];
        voltWatt22V5s = new V5[size];
        voltWatt23W5s = new W5[size];
        voltWatt24V6s = new V6[size];
        voltWatt25W6s = new W6[size];
        voltWatt26V7s = new V7[size];
        voltWatt27W7s = new W7[size];
        voltWatt28V8s = new V8[size];
        voltWatt29W8s = new W8[size];
        voltWatt30V9s = new V9[size];
        voltWatt31W9s = new W9[size];
        voltWatt32V10s = new V10[size];
        voltWatt33W10s = new W10[size];
        voltWatt34V11s = new V11[size];
        voltWatt35W11s = new W11[size];
        voltWatt36V12s = new V12[size];
        voltWatt37W12s = new W12[size];
        voltWatt38V13s = new V13[size];
        voltWatt39W13s = new W13[size];
        voltWatt40V14s = new V14[size];
        voltWatt41W14s = new W14[size];
        voltWatt42V15s = new V15[size];
        voltWatt43W15s = new W15[size];
        voltWatt44V16s = new V16[size];
        voltWatt45W16s = new W16[size];
        voltWatt46V17s = new V17[size];
        voltWatt47W17s = new W17[size];
        voltWatt48V18s = new V18[size];
        voltWatt49W18s = new W18[size];
        voltWatt50V19s = new V19[size];
        voltWatt51W19s = new W19[size];
        voltWatt52V20s = new V20[size];
        voltWatt53W20s = new W20[size];
        voltWatt54CrvNams = new CrvNam[size];
        voltWatt62RmpPt1Tmss = new RmpPt1Tms[size];
        voltWatt63RmpDecTmms = new RmpDecTmm[size];
        voltWatt64RmpIncTmms = new RmpIncTmm[size];
        voltWatt65ReadOnlys = new ReadOnly[size];
        for (int i = 0; i < size; i++) {

            voltWatt12ActPts[i] = new ActPt(i, tcpModbusHandler);
            voltWatt13DeptRefs[i] = new DeptRef(i, tcpModbusHandler);
            voltWatt14V1s[i] = new V1(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt15W1s[i] = new W1(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt16V2s[i] = new V2(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt17W2s[i] = new W2(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt18V3s[i] = new V3(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt19W3s[i] = new W3(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt20V4s[i] = new V4(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt21W4s[i] = new W4(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt22V5s[i] = new V5(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt23W5s[i] = new W5(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt24V6s[i] = new V6(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt25W6s[i] = new W6(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt26V7s[i] = new V7(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt27W7s[i] = new W7(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt28V8s[i] = new V8(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt29W8s[i] = new W8(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt30V9s[i] = new V9(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt31W9s[i] = new W9(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt32V10s[i] = new V10(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt33W10s[i] = new W10(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt34V11s[i] = new V11(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt35W11s[i] = new W11(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt36V12s[i] = new V12(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt37W12s[i] = new W12(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt38V13s[i] = new V13(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt39W13s[i] = new W13(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt40V14s[i] = new V14(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt41W14s[i] = new W14(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt42V15s[i] = new V15(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt43W15s[i] = new W15(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt44V16s[i] = new V16(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt45W16s[i] = new W16(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt46V17s[i] = new V17(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt47W17s[i] = new W17(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt48V18s[i] = new V18(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt49W18s[i] = new W18(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt50V19s[i] = new V19(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt51W19s[i] = new W19(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt52V20s[i] = new V20(i, voltWatt09V_SF, tcpModbusHandler);
            voltWatt53W20s[i] = new W20(i, voltWatt10DeptRef_SF, tcpModbusHandler);
            voltWatt54CrvNams[i] = new CrvNam(i, tcpModbusHandler);
            voltWatt62RmpPt1Tmss[i] = new RmpPt1Tms(i, tcpModbusHandler);
            voltWatt63RmpDecTmms[i] = new RmpDecTmm(i, voltWatt11RmpIncDec_SF, tcpModbusHandler);
            voltWatt64RmpIncTmms[i] = new RmpIncTmm(i, voltWatt11RmpIncDec_SF, tcpModbusHandler);
            voltWatt65ReadOnlys[i] = new ReadOnly(i, tcpModbusHandler);
            vector.add(voltWatt12ActPts[i]);
            vector.add(voltWatt13DeptRefs[i]);
            vector.add(voltWatt14V1s[i]);
            vector.add(voltWatt15W1s[i]);
            vector.add(voltWatt16V2s[i]);
            vector.add(voltWatt17W2s[i]);
            vector.add(voltWatt18V3s[i]);
            vector.add(voltWatt19W3s[i]);
            vector.add(voltWatt20V4s[i]);
            vector.add(voltWatt21W4s[i]);
            vector.add(voltWatt22V5s[i]);
            vector.add(voltWatt23W5s[i]);
            vector.add(voltWatt24V6s[i]);
            vector.add(voltWatt25W6s[i]);
            vector.add(voltWatt26V7s[i]);
            vector.add(voltWatt27W7s[i]);
            vector.add(voltWatt28V8s[i]);
            vector.add(voltWatt29W8s[i]);
            vector.add(voltWatt30V9s[i]);
            vector.add(voltWatt31W9s[i]);
            vector.add(voltWatt32V10s[i]);
            vector.add(voltWatt33W10s[i]);
            vector.add(voltWatt34V11s[i]);
            vector.add(voltWatt35W11s[i]);
            vector.add(voltWatt36V12s[i]);
            vector.add(voltWatt37W12s[i]);
            vector.add(voltWatt38V13s[i]);
            vector.add(voltWatt39W13s[i]);
            vector.add(voltWatt40V14s[i]);
            vector.add(voltWatt41W14s[i]);
            vector.add(voltWatt42V15s[i]);
            vector.add(voltWatt43W15s[i]);
            vector.add(voltWatt44V16s[i]);
            vector.add(voltWatt45W16s[i]);
            vector.add(voltWatt46V17s[i]);
            vector.add(voltWatt47W17s[i]);
            vector.add(voltWatt48V18s[i]);
            vector.add(voltWatt49W18s[i]);
            vector.add(voltWatt50V19s[i]);
            vector.add(voltWatt51W19s[i]);
            vector.add(voltWatt52V20s[i]);
            vector.add(voltWatt53W20s[i]);
            vector.add(voltWatt54CrvNams[i]);
            vector.add(voltWatt62RmpPt1Tmss[i]);
            vector.add(voltWatt63RmpDecTmms[i]);
            vector.add(voltWatt64RmpIncTmms[i]);
            vector.add(voltWatt65ReadOnlys[i]);
        }
    }
        /**
         * @return
         */

    public RetepEnum getID() {
        return voltWatt00ID;
    }

    /**
     * @return
     */
    public RetepLong getL() {
        return voltWatt1L;
    }

    /**
     * @return
     */
    public RetepLong getActCrv() {
        return voltWatt02ActCrv;
    }

    /**
     * @return
     */
    public RetepBitMask getModEna() {
        return voltWatt03ModEna;
    }

    /**
     * @return
     */
    public RetepLong getWinTms() {
        return voltWatt04WinTms;
    }

    /**
     * @return
     */
    public RetepLong getRvrtTms() {
        return voltWatt05RvrtTms;
    }

    /**
     * @return
     */
    public RetepLong getRmpTms() {
        return voltWatt06RmpTms;
    }

    /**
     * @return
     */
    public RetepLong getNCrv() {
        return voltWatt07NCrv;
    }

    /**
     * @return
     */
    public RetepLong getNPt() {
        return voltWatt08NPt;
    }

    /**
     * @return
     */
    public RetepLong getV_SF() {
        return voltWatt09V_SF;
    }

    /**
     * @return
     */
    public RetepLong getDeptRef_SF() {
        return voltWatt10DeptRef_SF;
    }

    /**
     * @return
     */
    public RetepLong getRmpIncDec_SF() {
        return voltWatt11RmpIncDec_SF;
    }

    /**
     * @return
     */
    public RetepLong getActPt(int index) {
        return voltWatt12ActPts[index];
    }

    /**
     * @return
     */
    public RetepEnum getDeptRef(int index) {
        return voltWatt13DeptRefs[index];
    }

    /**
     * @return
     */
    public RetepDouble getV1(int index) {
        return voltWatt14V1s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW1(int index) {
        return voltWatt15W1s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV2(int index) {
        return voltWatt16V2s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW2(int index) {
        return voltWatt17W2s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV3(int index) {
        return voltWatt18V3s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW3(int index) {
        return voltWatt19W3s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV4(int index) {
        return voltWatt20V4s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW4(int index) {
        return voltWatt21W4s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV5(int index) {
        return voltWatt22V5s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW5(int index) {
        return voltWatt23W5s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV6(int index) {
        return voltWatt24V6s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW6(int index) {
        return voltWatt25W6s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV7(int index) {
        return voltWatt26V7s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW7(int index) {
        return voltWatt27W7s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV8(int index) {
        return voltWatt28V8s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW8(int index) {
        return voltWatt29W8s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV9(int index) {
        return voltWatt30V9s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW9(int index) {
        return voltWatt31W9s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV10(int index) {
        return voltWatt32V10s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW10(int index) {
        return voltWatt33W10s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV11(int index) {
        return voltWatt34V11s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW11(int index) {
        return voltWatt35W11s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV12(int index) {
        return voltWatt36V12s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW12(int index) {
        return voltWatt37W12s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV13(int index) {
        return voltWatt38V13s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW13(int index) {
        return voltWatt39W13s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV14(int index) {
        return voltWatt40V14s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW14(int index) {
        return voltWatt41W14s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW15(int index) {
        return voltWatt43W15s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV16(int index) {
        return voltWatt44V16s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW16(int index) {
        return voltWatt45W16s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV17(int index) {
        return voltWatt46V17s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW17(int index) {
        return voltWatt47W17s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV18(int index) {
        return voltWatt48V18s[index];

    }

    /**
     * @return
     */
    public RetepDouble getW18(int index) {
        return voltWatt49W18s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV19(int index) {
        return voltWatt50V19s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW19(int index) {
        return voltWatt51W19s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV20(int index) {
        return voltWatt52V20s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW20(int index) {
        return voltWatt53W20s[index];
    }

    /**
     * @return
     */
    public RetepString getCrvNam(int index) {
        return voltWatt54CrvNams[index];
    }

    /**
     * @return
     */
    public RetepLong getRmpPt1Tms(int index) {
        return voltWatt62RmpPt1Tmss[index];
    }

    /**
     * @return
     */
    public RetepDouble getRmpDecTmm(int index) {
        return voltWatt63RmpDecTmms[index];
    }

    /**
     * @return
     */
    public RetepDouble getRmpIncTmm(int index) {
        return voltWatt64RmpIncTmms[index];

    }

    /**
     * @return
     */
    public RetepEnum getReadOnly(int index) {
        return voltWatt65ReadOnlys[index];
    }

    /**
     *
     */
    public class ID extends RegisterEnum16 {
        ID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltWatt_132(), 0, 1, "Model", "", "Volt-Watt ", Rw.R, Mandatory.M);
            hashtable.put((long) 132, "SunSpec Volt-Watt");
        }
    }

    /**
     *
     */
    public class L extends RegisterUint16 {
        L(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltWatt_132(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class ActCrv extends RegisterUint16 {
        ActCrv(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltWatt_132(), 2, 1, "ActCrv", "", "Index of active curve. 0=no active curve.", Rw.RW, Mandatory.M);
        }
    }

    /**
     *
     */
    public class ModEna extends RegisterBitfield16 {
        ModEna(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltWatt_132(), 3, 1, "ModEna", "", "Is Volt-Watt control active.", Rw.RW, Mandatory.M);
            hashtable.put((long) 0, "ENABLED");

        }
    }

    /**
     *
     */
    public class WinTms extends RegisterUint16 {
        WinTms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltWatt_132(), 4, 1, "WinTms", "Secs", "Time window for volt-watt change.", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class RvrtTms extends RegisterUint16 {
        RvrtTms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltWatt_132(), 5, 1, "RvrtTms", "Secs", "Timeout period for volt-watt curve selection.", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class RmpTms extends RegisterUint16 {
        RmpTms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltWatt_132(), 6, 1, "RmpTms", "Secs", "Ramp time for moving from current mode to new mode.", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class NCrv extends RegisterUint16 {
        NCrv(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltWatt_132(), 7, 1, "NCrv", "", "Number of curves supported (recommend min. 4).", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class NPt extends RegisterUint16 {
        NPt(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltWatt_132(), 8, 1, "NPt", "", "Number of points in array (maximum 20).", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class V_SF extends RegisterSunssf {
        V_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltWatt_132(), 9, 1, "V_SF", "", "Scale factor for percent VRef.", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class DeptRef_SF extends RegisterSunssf {
        DeptRef_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltWatt_132(), 10, 1, "DeptRef_SF", "", "Scale Factor for % DeptRef", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class RmpIncDec_SF extends RegisterSunssf {
        RmpIncDec_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltWatt_132(), 11, 1, "RmpIncDec_SF", "", "Scale factor for increment and decrement ramps.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class ActPt extends RegisterUint16 {
        private final int index;

        ActPt(int aIndex, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 12 + (index * 54), 1, "[" + (index + 1) + "] ActPt", "", "Number of active points in array.", Rw.RW, Mandatory.M);
        }
    }

    /**
     *
     */
    public class DeptRef extends RegisterEnum16 {
        private final int index;

        DeptRef(int aIndex, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 13+ (index * 54), 1,  "[" + (index + 1) + "] DeptRef", "", "Defines the meaning of the Watts DeptRef.  1=% WMax 2=% WAvail", Rw.RW, Mandatory.M);
            hashtable.put((long) 1, "%WMax");
            hashtable.put((long) 2, "%WAval");

        }
    }

    /**
     *
     */
    public class V1 extends RegisterUDouble {
        private final int index;

        public V1(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 14+ (index * 54), 1,  "[" + (index + 1) + "] V1", "% VRef", "Point 1 Volts.", Rw.RW, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W1 extends RegisterDouble {
        private final int index;

        public W1(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 15+ (index * 54), 1,  "[" + (index + 1) + "] W1", "% VRef", "Point 1 Watts.", Rw.RW, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V2 extends RegisterUDouble {
        private final int index;

        public V2(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 16+ (index * 54), 1,  "[" + (index + 1) + "] V2", "% VRef", "Point 2 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W2 extends RegisterDouble {
        private final int index;

        public W2(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 17+ (index * 54), 1,  "[" + (index + 1) + "] W2", "% VRef", "Point 2 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V3 extends RegisterUDouble {
        private final int index;

        public V3(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 18+ (index * 54), 1,  "[" + (index + 1) + "] V3", "% VRef", "Point 3 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W3 extends RegisterDouble {
        private final int index;

        public W3(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 19+ (index * 54), 1,  "[" + (index + 1) + "] W3", "% VRef", "Point 3 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V4 extends RegisterUDouble {
        private final int index;

        public V4(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 20+ (index * 54), 1,  "[" + (index + 1) + "] V4", "% VRef", "Point 4 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W4 extends RegisterDouble {
        private final int index;

        public W4(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 21+ (index * 54), 1,  "[" + (index + 1) + "] W4", "% VRef", "Point 4 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V5 extends RegisterUDouble {
        private final int index;

        public V5(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 22+ (index * 54), 1,  "[" + (index + 1) + "] V5", "% VRef", "Point 5 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W5 extends RegisterDouble {
        private final int index;

        public W5(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 23+ (index * 54), 1,  "[" + (index + 1) + "] W5", "% VRef", "Point 5 Watts.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V6 extends RegisterUDouble {
        private final int index;

        public V6(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 24+ (index * 54), 1,  "[" + (index + 1) + "] V6", "% VRef", "Point 6 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W6 extends RegisterDouble {
        private final int index;

        public W6(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 25+ (index * 54), 1,  "[" + (index + 1) + "] W6", "% VRef", "Point 6 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V7 extends RegisterUDouble {
        private final int index;

        public V7(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 26+ (index * 54), 1,  "[" + (index + 1) + "] V7", "% VRef", "Point 7 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W7 extends RegisterDouble {
        private final int index;

        public W7(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 27+ (index * 54), 1,  "[" + (index + 1) + "] W7", "% VRef", "Point 7 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }


    public class V8 extends RegisterUDouble {

        private final int index;

        public V8(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 28+ (index * 54), 1,  "[" + (index + 1) + "] V8", "% VRef", "Point 8 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W8 extends RegisterDouble {
        private final int index;

        public W8(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 29+ (index * 54), 1,  "[" + (index + 1) + "] W8", "% VRef", "Point 8 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }


    public class V9 extends RegisterUDouble {

        private final int index;

        public V9(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 30+ (index * 54), 1,  "[" + (index + 1) + "] V9", "% VRef", "Point 9 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W9 extends RegisterDouble {

        private final int index;

        public W9(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 31+ (index * 54), 1,  "[" + (index + 1) + "] W9", "% VRef", "Point 9 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }


    public class V10 extends RegisterUDouble {

        private final int index;

        public V10(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 32+ (index * 54), 1,  "[" + (index + 1) + "] V10", "% VRef", "Point 10 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W10 extends RegisterDouble {
        private final int index;

        public W10(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 33+ (index * 54), 1,  "[" + (index + 1) + "] W10", "% VRef", "Point 10 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V11 extends RegisterUDouble {
        private final int index;

        public V11(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 34+ (index * 54), 1,  "[" + (index + 1) + "] V11", "% VRef", "Point 11 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W11 extends RegisterDouble {
        private final int index;

        public W11(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 35+ (index * 54), 1,  "[" + (index + 1) + "] W11", "% VRef", "Point 11 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V12 extends RegisterUDouble {
        private final int index;

        public V12(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 36+ (index * 54), 1,  "[" + (index + 1) + "] V12", "% VRef", "Point 12 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W12 extends RegisterDouble {
        private final int index;

        public W12(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 37+ (index * 54), 1,  "[" + (index + 1) + "] W12", "% VRef", "Point 12 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V13 extends RegisterUDouble {
        private final int index;

        public V13(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 38+ (index * 54), 1,  "[" + (index + 1) + "] V13", "% VRef", "Point 13 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W13 extends RegisterDouble {
        private final int index;

        public W13(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 39+ (index * 54), 1,  "[" + (index + 1) + "] W13", "% VRef", "Point 13 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V14 extends RegisterUDouble {
        private final int index;

        public V14(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 40+ (index * 54), 1,  "[" + (index + 1) + "] V14", "% VRef", "Point 14 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W14 extends RegisterDouble {
        private final int index;

        public W14(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 41+ (index * 54), 1,  "[" + (index + 1) + "] W14", "% VRef", "Point 14 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V15 extends RegisterUDouble {
        private final int index;

        public V15(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 42+ (index * 54), 1,  "[" + (index + 1) + "] V15", "% VRef", "Point 15 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W15 extends RegisterDouble {
        private final int index;

        public W15(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 43+ (index * 54), 1,  "[" + (index + 1) + "] W15", "% VRef", "Point 15 Watts.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V16 extends RegisterUDouble {
        private final int index;

        public V16(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 44+ (index * 54), 1,  "[" + (index + 1) + "] V16", "% VRef", "Point 16 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W16 extends RegisterDouble {
        private final int index;

        public W16(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 45+ (index * 54), 1,  "[" + (index + 1) + "] W16", "% VRef", "Point 16 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V17 extends RegisterUDouble {

        private final int index;

        public V17(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 46+ (index * 54), 1,  "[" + (index + 1) + "] V17", "% VRef", "Point 17 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W17 extends RegisterDouble {

        private final int index;

        public W17(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 47+ (index * 54), 1,  "[" + (index + 1) + "] W17", "% VRef", "Point 17 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V18 extends RegisterUDouble {
        private final int index;

        public V18(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 48+ (index * 54), 1,  "[" + (index + 1) + "] V18", "% VRef", "Point 18 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }

    }

    /**
     *
     */
    public class W18 extends RegisterDouble {

        private final int index;

        public W18(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 49+ (index * 54), 1,  "[" + (index + 1) + "] W18", "% VRef", "Point 18 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V19 extends RegisterUDouble {
        private final int index;

        public V19(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 50+ (index * 54), 1,  "[" + (index + 1) + "] V19", "% VRef", "Point 19 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W19 extends RegisterDouble {
        private final int index;

        public W19(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 51+ (index * 54), 1,  "[" + (index + 1) + "] W19", "% VRef", "Point 19 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V20 extends RegisterUDouble {

        private final int index;

        public V20(int aIndex, V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 52+ (index * 54), 1,  "[" + (index + 1) + "] V20", "% VRef", "Point 20 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W20 extends RegisterDouble {
        private final int index;

        public W20(int aIndex, DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 53+ (index * 54), 1,  "[" + (index + 1) + "] W20", "% VRef", "Point 20 Watts.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class CrvNam extends RegisterString {
        private final int index;

        public CrvNam(int aIndex, TcpModbusHandler tcpModbusHandler) {
            {
                index = aIndex;
                init(tcpModbusHandler.getVoltWatt_132(), 54+ (index * 54), 8,  "[" + (index + 1) + "] CrvNam", "", "Optional description for curve.", Rw.RW, Mandatory.O);
            }
        }
    }

    /**
     *
     */
    public class RmpPt1Tms extends RegisterUint16 {
        private final int index;

        public RmpPt1Tms(int aIndex, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 62+ (index * 54), 1,  "[" + (index + 1) + "] RmpPt1Tms", "Secs", "The time of the PT1 in seconds (time to accomplish a change of 95%).", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class RmpDecTmm extends RegisterUDouble {
        private final int index;

        public RmpDecTmm(int aIndex, RmpIncDec_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 63+ (index * 54), 1,  "[" + (index + 1) + "] RmpDecTmm", "% WMax/min", "The maximum rate at which the watt value may be reduced in response to changes in the voltage value.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class RmpIncTmm extends RegisterUDouble {
        private final int index;

        public RmpIncTmm(int aIndex, RmpIncDec_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 64+ (index * 54), 1,  "[" + (index + 1) + "] RmpIncTmm", "% WMax/min", "The maximum rate at which the watt value may be increased in response to changes in the voltage value.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class ReadOnly extends RegisterEnum16 {
        private final int index;

        ReadOnly(int aIndex, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltWatt_132(), 65+ (index * 54), 1,  "[" + (index + 1) + "] ReadOnly", "", "Enumerated value indicates if curve is read-only or can be modified.", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "READWRITE");
            hashtable.put((long) 1, "READONLY");
        }
    }

}

