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
public class Table0126VoltVAR extends Table {
    private TcpModbusHandler tcpModbusHandler;
    private ID voltVarID;
    private L voltVarL;

    private ActCrv voltVar0ActCrv;
    private ModEna voltVar1ModEna;
    private WinTms voltVar2WinTms;
    private RvrtTms voltVar3RvrtTms;
    private RmpTms voltVar4RmpTms;
    private NCrv voltVar5NCrv;
    private NPt voltVar6NPt;
    private V_SF voltVar7V_SF;
    private DeptRef_SF voltVar8DeptRef_SF;
    private RmpIncDec_SF voltVar9RmpIncDec_SF;

    private ActPt[] voltVar0ActPts;
    private DeptRef[] voltVar1DeptRefs;
    private V1[] voltVar2V1s;
    private VAr1[] vAr1s;
    private V2[] voltVar4V2s;
    private VAr2[] voltVar5VAr2s;
    private V3[] voltVar6V3s;
    private VAr3[] voltVar7VAr3s;
    private V4[] voltVar8V4s;
    private VAr4[] voltVar9VAr4s;
    private V5[] voltVar10V5s;
    private VAr5[] voltVar11VAr5s;
    private V6[] voltVar12V6s;
    private VAr6[] voltVar13VAr6s;
    private V7[] voltVar14V7s;
    private VAr7[] voltVar15VAr7s;
    private V8[] voltVar16V8s;
    private VAr8[] voltVar17VAr8s;
    private V9[] voltVar18V9s;
    private VAr9[] voltVar19VAr9s;
    private V10[] voltVar20V10s;
    private VAr10[] voltVar21VAr10s;
    private V11[] voltVar22V11s;
    private VAr11[] voltVar23VAr11s;
    private V12[] voltVar24V12s;
    private VAr12[] voltVar25VAr12s;
    private V13[] voltVar26V13s;
    private VAr13[] voltVar27VAr13s;
    private V14[] voltVar28V14s;
    private VAr14[] voltVar29VAr14s;
    private V15[] voltVar30V15s;
    private VAr15[] voltVar31VAr15s;
    private V16[] voltVar32V16s;
    private VAr16[] voltVar33VAr16s;
    private V17[] voltVar34V17s;
    private VAr17[] voltVar35VAr17s;
    private V18[] voltVar36V18s;
    private VAr18[] voltVar37VAr18s;
    private V19[] voltVar38V19s;
    private VAr19[] voltVar39VAr19s;
    private V20[] voltVar40V20s;
    private VAr20[] voltVar41VAr20s;
    private CrvNam[] voltVar42CrvNams;
    private RmpTmsRB[] voltVar50RmpTmss;
    private RmpDecTmm[] voltVar51RmpDecTmms;
    private RmpIncTmm[] voltVar52RmpIncTmms;
    private ReadOnly[] voltVar53ReadOnlys;

    public Table0126VoltVAR(TcpModbusHandler tcpModbusHandler) {
        this.tcpModbusHandler = tcpModbusHandler;
        init(tcpModbusHandler.getVoltVAR_126(), 0, 66, " Volt VAR", "", " Volt VAR", Rw.R, Mandatory.M);
        voltVarID = new ID(tcpModbusHandler);
        voltVarL = new L(tcpModbusHandler);

        voltVar0ActCrv = new ActCrv(tcpModbusHandler);
        voltVar1ModEna = new ModEna(tcpModbusHandler);
        voltVar2WinTms = new WinTms(tcpModbusHandler);
        voltVar3RvrtTms = new RvrtTms(tcpModbusHandler);
        voltVar4RmpTms = new RmpTms(tcpModbusHandler);
        voltVar5NCrv = new NCrv(tcpModbusHandler);
        voltVar6NPt = new NPt(tcpModbusHandler);
        voltVar7V_SF = new V_SF(tcpModbusHandler);
        voltVar8DeptRef_SF = new DeptRef_SF(tcpModbusHandler);
        voltVar9RmpIncDec_SF = new RmpIncDec_SF(tcpModbusHandler);
        vector.add(voltVarID);
        vector.add(voltVarL);
        vector.add(voltVar7V_SF);
        vector.add(voltVar8DeptRef_SF);
        vector.add(voltVar9RmpIncDec_SF);
        vector.add(voltVar0ActCrv);
        vector.add(voltVar1ModEna);
        vector.add(voltVar2WinTms);
        vector.add(voltVar3RvrtTms);
        vector.add(voltVar4RmpTms);
        vector.add(voltVar5NCrv);
        vector.add(voltVar6NPt);
    }

    @Override
    public void setResponseInit(byte[] bArry) {
        super.setResponseInit(bArry);
        int size = (((int) getL().toLong() - 10) / 54);
        voltVar0ActPts =new ActPt[size];
        voltVar1DeptRefs =new DeptRef[size];
        voltVar2V1s=new V1[size];
        vAr1s =new VAr1[size];
        voltVar4V2s =new V2[size];
        voltVar5VAr2s =new VAr2[size];
        voltVar6V3s=new V3[size];
        voltVar7VAr3s =new VAr3[size];
        voltVar8V4s =new V4[size];
        voltVar9VAr4s =new VAr4[size];
        voltVar10V5s =new V5[size];
        voltVar11VAr5s =new VAr5[size];
        voltVar12V6s  =new V6[size];
        voltVar13VAr6s =new VAr6[size];
        voltVar14V7s  =new V7[size];
        voltVar15VAr7s =new VAr7[size];
        voltVar16V8s   =new V8[size];
        voltVar17VAr8s  =new VAr8[size];
        voltVar18V9s     =new V9[size];
        voltVar19VAr9s  =new VAr9[size];
        voltVar20V10s   =new V10[size];
        voltVar21VAr10s   =new VAr10[size];
        voltVar22V11s  =new V11[size];
        voltVar23VAr11s  =new VAr11[size];
        voltVar24V12s   =new V12[size];
        voltVar25VAr12s    =new VAr12[size];
        voltVar26V13s  =new V13[size];
        voltVar27VAr13s  =new VAr13[size];
        voltVar28V14s  =new V14[size];
        voltVar29VAr14s  =new VAr14[size];
        voltVar30V15s  =new V15[size];
        voltVar31VAr15s   =new VAr15[size];
        voltVar32V16s =new V16[size];
        voltVar33VAr16s   =new VAr16[size];
        voltVar34V17s    =new V17[size];
        voltVar35VAr17s  =new VAr17[size];
        voltVar36V18s  =new V18[size];
        voltVar37VAr18s      =new VAr18[size];
        voltVar38V19s    =new V19[size];
        voltVar39VAr19s  =new VAr19[size];
        voltVar40V20s   =new V20[size];
        voltVar41VAr20s =new VAr20[size];
        voltVar42CrvNams   =new CrvNam[size];
        voltVar50RmpTmss =new RmpTmsRB[size];
        voltVar51RmpDecTmms =new RmpDecTmm[size];
        voltVar52RmpIncTmms =new RmpIncTmm[size];
        voltVar53ReadOnlys  =new ReadOnly[size];

        for (int i = 0; i < size; i++) {
            voltVar0ActPts[i] = new ActPt(i, tcpModbusHandler);
            voltVar1DeptRefs[i] = new DeptRef(i, tcpModbusHandler);
            voltVar2V1s[i] = new V1(i, voltVar7V_SF, tcpModbusHandler);
            vAr1s[i] = new VAr1(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar4V2s[i] = new V2(i, voltVar7V_SF, tcpModbusHandler);
            voltVar5VAr2s[i] = new VAr2(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar6V3s[i] = new V3(i, voltVar7V_SF, tcpModbusHandler);
            voltVar7VAr3s[i] = new VAr3(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar8V4s[i] = new V4(i, voltVar7V_SF, tcpModbusHandler);
            voltVar9VAr4s[i] = new VAr4(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar10V5s[i] = new V5(i, voltVar7V_SF, tcpModbusHandler);
            voltVar11VAr5s[i] = new VAr5(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar12V6s[i] = new V6(i, voltVar7V_SF, tcpModbusHandler);
            voltVar13VAr6s[i] = new VAr6(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar14V7s[i] = new V7(i, voltVar7V_SF, tcpModbusHandler);
            voltVar15VAr7s[i] = new VAr7(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar16V8s[i] = new V8(i, voltVar7V_SF, tcpModbusHandler);
            voltVar17VAr8s[i] = new VAr8(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar18V9s[i] = new V9(i, voltVar7V_SF, tcpModbusHandler);
            voltVar19VAr9s[i] = new VAr9(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar20V10s[i] = new V10(i, voltVar7V_SF, tcpModbusHandler);
            voltVar21VAr10s[i] = new VAr10(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar22V11s[i] = new V11(i, voltVar7V_SF, tcpModbusHandler);
            voltVar23VAr11s[i] = new VAr11(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar24V12s[i] = new V12(i, voltVar7V_SF, tcpModbusHandler);
            voltVar25VAr12s[i] = new VAr12(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar26V13s[i] = new V13(i, voltVar7V_SF, tcpModbusHandler);
            voltVar27VAr13s[i] = new VAr13(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar28V14s[i] = new V14(i, voltVar7V_SF, tcpModbusHandler);
            voltVar29VAr14s[i] = new VAr14(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar30V15s[i] = new V15(i, voltVar7V_SF, tcpModbusHandler);
            voltVar31VAr15s[i] = new VAr15(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar32V16s[i] = new V16(i, voltVar7V_SF, tcpModbusHandler);
            voltVar33VAr16s[i] = new VAr16(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar34V17s[i] = new V17(i, voltVar7V_SF, tcpModbusHandler);
            voltVar35VAr17s[i] = new VAr17(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar36V18s[i] = new V18(i, voltVar7V_SF, tcpModbusHandler);
            voltVar37VAr18s[i] = new VAr18(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar38V19s[i] = new V19(i, voltVar7V_SF, tcpModbusHandler);
            voltVar39VAr19s[i] = new VAr19(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar40V20s[i] = new V20(i, voltVar7V_SF, tcpModbusHandler);
            voltVar41VAr20s[i] = new VAr20(i, voltVar8DeptRef_SF, tcpModbusHandler);
            voltVar42CrvNams[i] = new CrvNam(i, tcpModbusHandler);
            voltVar50RmpTmss[i] = new RmpTmsRB(i, tcpModbusHandler);
            voltVar51RmpDecTmms[i] = new RmpDecTmm(i, voltVar9RmpIncDec_SF, tcpModbusHandler);
            voltVar52RmpIncTmms[i] = new RmpIncTmm(i, voltVar9RmpIncDec_SF, tcpModbusHandler);
            voltVar53ReadOnlys[i] = new ReadOnly(i, tcpModbusHandler);
            vector.add(voltVar0ActPts[i]);
            vector.add(voltVar1DeptRefs[i]);
            vector.add(voltVar2V1s[i]);
            vector.add(vAr1s[i]);
            vector.add(voltVar4V2s[i]);
            vector.add(voltVar5VAr2s[i]);
            vector.add(voltVar6V3s[i]);
            vector.add(voltVar7VAr3s[i]);
            vector.add(voltVar8V4s[i]);
            vector.add(voltVar9VAr4s[i]);
            vector.add(voltVar10V5s[i]);
            vector.add(voltVar11VAr5s[i]);
            vector.add(voltVar12V6s[i]);
            vector.add(voltVar13VAr6s[i]);
            vector.add(voltVar14V7s[i]);
            vector.add(voltVar15VAr7s[i]);
            vector.add(voltVar16V8s[i]);
            vector.add(voltVar17VAr8s[i]);
            vector.add(voltVar18V9s[i]);
            vector.add(voltVar19VAr9s[i]);
            vector.add(voltVar20V10s[i]);
            vector.add(voltVar21VAr10s[i]);
            vector.add(voltVar22V11s[i]);
            vector.add(voltVar23VAr11s[i]);
            vector.add(voltVar24V12s[i]);
            vector.add(voltVar25VAr12s[i]);
            vector.add(voltVar26V13s[i]);
            vector.add(voltVar27VAr13s[i]);
            vector.add(voltVar28V14s[i]);
            vector.add(voltVar29VAr14s[i]);
            vector.add(voltVar30V15s[i]);
            vector.add(voltVar31VAr15s[i]);
            vector.add(voltVar32V16s[i]);
            vector.add(voltVar33VAr16s[i]);
            vector.add(voltVar34V17s[i]);
            vector.add(voltVar35VAr17s[i]);
            vector.add(voltVar36V18s[i]);
            vector.add(voltVar37VAr18s[i]);
            vector.add(voltVar38V19s[i]);
            vector.add(voltVar39VAr19s[i]);
            vector.add(voltVar40V20s[i]);
            vector.add(voltVar41VAr20s[i]);
            vector.add(voltVar42CrvNams[i]);
            vector.add(voltVar50RmpTmss[i]);
            vector.add(voltVar51RmpDecTmms[i]);
            vector.add(voltVar52RmpIncTmms[i]);
            vector.add(voltVar53ReadOnlys[i]);
        }
    }

    /**
     * @return
     */
    public RetepEnum getID() {
        return voltVarID;
    }

    /**
     * @return
     */
    public RetepLong getL() {
        return voltVarL;
    }

    /**
     * @return
     */
    public RetepLong getActCrv() {
        return voltVar0ActCrv;
    }

    /**
     * @return
     */
    public RetepBitMask getModEna() {
        return voltVar1ModEna;
    }

    /**
     * @return
     */
    public RetepLong getWinTms() {
        return voltVar2WinTms;
    }

    /**
     * @return
     */
    public RetepLong getRvrtTms() {
        return voltVar3RvrtTms;
    }

    /**
     * @return
     */
    public RetepLong getRmpTms() {
        return voltVar4RmpTms;
    }

    /**
     * @return
     */
    public RetepLong getNCrv() {
        return voltVar5NCrv;
    }

    /**
     * @return
     */
    public RetepLong getNPt() {
        return voltVar6NPt;
    }

    /**
     * @return
     */
    public RetepLong getV_SF() {
        return voltVar7V_SF;
    }

    /**
     * @return
     */
    public RetepLong getDeptRef_SF() {
        return voltVar8DeptRef_SF;
    }

    /**
     * @return
     */
    public RetepLong getRmpIncDec_SF() {
        return voltVar9RmpIncDec_SF;
    }

    /**
     * @return
     */
    public RetepLong getActPt(int index) {
        return voltVar0ActPts[index];
    }

    /**
     * @return
     */
    public RetepEnum getDeptRef(int index) {
        return voltVar1DeptRefs[index];
    }

    /**
     * @return
     */
    public RetepDouble getV1(int index) {
        return voltVar2V1s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr1(int index) {
        return vAr1s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV2(int index) {
        return voltVar4V2s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr2(int index) {
        return voltVar5VAr2s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV3(int index) {
        return voltVar6V3s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr3(int index) {
        return voltVar7VAr3s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV4(int index) {
        return voltVar8V4s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr4(int index) {
        return voltVar9VAr4s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV5(int index) {
        return voltVar10V5s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr5(int index) {
        return voltVar11VAr5s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV6(int index) {
        return voltVar12V6s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr6(int index) {
        return voltVar13VAr6s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV7(int index) {
        return voltVar14V7s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr7(int index) {
        return voltVar15VAr7s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV8(int index) {
        return voltVar16V8s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr8(int index) {
        return voltVar17VAr8s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV9(int index) {
        return voltVar18V9s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr9(int index) {
        return voltVar19VAr9s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV10(int index) {
        return voltVar20V10s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr10(int index) {
        return voltVar21VAr10s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV11(int index) {
        return voltVar22V11s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr11(int index) {
        return voltVar23VAr11s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV12(int index) {
        return voltVar24V12s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr12(int index) {
        return voltVar25VAr12s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV13(int index) {
        return voltVar26V13s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr13(int index) {
        return voltVar27VAr13s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV14(int index) {
        return voltVar28V14s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr14(int index) {
        return voltVar29VAr14s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV15(int index) {
        return voltVar30V15s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr15(int index) {
        return voltVar31VAr15s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV16(int index) {
        return voltVar32V16s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr16(int index) {
        return voltVar33VAr16s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV17(int index) {
        return voltVar34V17s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr17(int index) {
        return voltVar35VAr17s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV18(int index) {
        return voltVar36V18s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr18(int index) {
        return voltVar37VAr18s[index];
    }

    /**
     * @return
     */
    public RetepDouble get38V19(int index) {
        return voltVar38V19s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr19(int index) {
        return voltVar39VAr19s[index];
    }

    /**
     * @return
     */
    public RetepDouble getV20(int index) {
        return voltVar40V20s[index];
    }

    /**
     * @return
     */
    public RetepDouble getVAr20(int index) {
        return voltVar41VAr20s[index];
    }

    /**
     * @return
     */
    public RetepString getCrvNam(int index) {
        return voltVar42CrvNams[index];
    }

    /**
     * @return
     */
    public RetepLong getRmpTmsRB(int index) {
        return voltVar50RmpTmss[index];
    }

    /**
     * @return
     */
    public RetepDouble getRmpDecTmm(int index) {
        return voltVar51RmpDecTmms[index];
    }

    /**
     * @return
     */
    public RetepDouble getRmpIncTmm(int index) {
        return voltVar52RmpIncTmms[index];
    }

    /**
     * @return
     */
    public RetepEnum getReadOnly(int index) {
        return voltVar53ReadOnlys[index];
    }

    /**
     *
     */
    public class ID extends RegisterEnum16 {

        public ID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltVAR_126(), 0, 1, "Model", "", " Volt-VAR Arrays ", Rw.R, Mandatory.M);
            hashtable.put((long) 126, "SunSpec  Volt-VAR Controls");
        }


    }

    /**
     *
     */
    public class L extends RegisterUint16 {

        public L(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltVAR_126(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class ActCrv extends RegisterUint16 {

        public ActCrv(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltVAR_126(), 2, 1, "ActCrv", "", "Index of active curve. 0=no active curve.", Rw.RW, Mandatory.M);
        }
    }

    /**
     *
     */
    public class ModEna extends RegisterBitfield16 {

        public ModEna(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltVAR_126(), 3, 1, "ModEna", "", "Is Volt-VAR control active.", Rw.RW, Mandatory.M);
            hashtable.put((long) 0, "ENABLED");
        }
    }

    /**
     *
     */
    public class WinTms extends RegisterUint16 {

        public WinTms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltVAR_126(), 4, 1, "WinTms", "Secs", "Time window for volt-VAR change.", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class RvrtTms extends RegisterUint16 {

        public RvrtTms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltVAR_126(), 5, 1, "RvrtTms", "Secs", "Timeout period for volt-VAR curve selection.", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class RmpTms extends RegisterUint16 {

        public RmpTms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltVAR_126(), 6, 1, "RmpTms", "Secs", "The time of the PT1 in seconds (time to accomplish a change of 95%).", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class NCrv extends RegisterUint16 {

        public NCrv(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltVAR_126(), 7, 1, "NCrv", "", "Number of curves supported (recommend 4).", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class NPt extends RegisterUint16 {

        public NPt(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltVAR_126(), 8, 1, "NPt", "", "Number of curve points supported (maximum of 20).", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class V_SF extends RegisterSunssf {

        public V_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltVAR_126(), 9, 1, "V_SF", "", "Scale factor for percent VRef.", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class DeptRef_SF extends RegisterSunssf {

        public DeptRef_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltVAR_126(), 10, 1, "DeptRef_SF", "", "scale factor for dependent variable.", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class RmpIncDec_SF extends RegisterSunssf {

        public RmpIncDec_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getVoltVAR_126(), 11, 1, "RmpIncDec_SF", "", "Scale factor for increment and decrement ramps.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class ActPt extends RegisterUint16 {
        private final int index;

        public ActPt(int aIndex,TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 12 + (index * 54), 1,"[" + (index + 1) + "] ActPt", "", "Number of active points in array.", Rw.RW, Mandatory.M);
        }
    }

    /**
     *
     */
    public class DeptRef extends RegisterEnum16 {
        private final int index;

        public DeptRef(int aIndex,TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 13 + (index * 54), 1,"[" + (index + 1) + "] DeptRef", "", "Meaning of dependent variable: 1=%WMax 2=%VArMax 3=%VArAval.", Rw.RW, Mandatory.M);
            hashtable.put((long) 1, "WMax");
            hashtable.put((long) 2, "VArMax");
            hashtable.put((long) 3, "VArAval");
        }
    }

    /**
     *
     */
    public class V1 extends RegisterUDouble {
        private final int index;

        public V1(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 14 + (index * 54), 1,"[" + (index + 1) + "] V1", "% VRef", "Point 1 Volts.", Rw.RW, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr1 extends RegisterDouble {
        private final int index;

        public VAr1(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 15 + (index * 54), 1,"[" + (index + 1) + "] VAr1", "", "Point 1 VARs.", Rw.RW, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V2 extends RegisterUDouble {
        private final int index;

        public V2(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 16 + (index * 54), 1,"[" + (index + 1) + "] V2", "% VRef", "Point 2 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr2 extends RegisterDouble {
        private final int index;

        public VAr2(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 17 + (index * 54), 1,"[" + (index + 1) + "] VAr2", "", "Point 2 VARs.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V3 extends RegisterUDouble {
        private final int index;

        public V3(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 18 + (index * 54), 1,"[" + (index + 1) + "] V3", "% VRef", "Point 2 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr3 extends RegisterDouble {
        private final int index;

        public VAr3(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 19 + (index * 54), 1,"[" + (index + 1) + "] VAr3", "", "Point 3 VARs.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V4 extends RegisterUDouble {
        private final int index;

        public V4(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 20 + (index * 54), 1,"[" + (index + 1) + "] V4", "% VRef", "Point 4 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr4 extends RegisterDouble {
        private final int index;

        public VAr4(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 21 + (index * 54), 1,"[" + (index + 1) + "] VAr4", "", "Point 4 VARs.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V5 extends RegisterUDouble {
        private final int index;

        public V5(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 22 + (index * 54), 1,"[" + (index + 1) + "] V5", "% VRef", "Point 5 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr5 extends RegisterUDouble {
        private final int index;

        public VAr5(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 23 + (index * 54), 1,"[" + (index + 1) + "] VAr5", "", "Point 5 VARs.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V6 extends RegisterUDouble {
        private final int index;

        public V6(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 24 + (index * 54), 1,"[" + (index + 1) + "] V6", "% VRef", "Point 6 Volts.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr6 extends RegisterDouble {
        private final int index;

        public VAr6(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 25 + (index * 54), 1,"[" + (index + 1) + "] VAr6", "", "Point 6 VARs.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V7 extends RegisterUDouble {
        private final int index;

        public V7(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 26 + (index * 54), 1,"[" + (index + 1) + "] V7", "% VRef", "Point 7 Volts.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr7 extends RegisterDouble {
        private final int index;

        public VAr7(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 27 + (index * 54), 1,"[" + (index + 1) + "] VAr7", "", "Point 7 VARs.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V8 extends RegisterUDouble {
        private final int index;

        public V8(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 28 + (index * 54), 1,"[" + (index + 1) + "] V8", "% VRef", "Point 8 Volts.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr8 extends RegisterDouble {
        private final int index;

        public VAr8(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 29 + (index * 54), 1,"[" + (index + 1) + "] VAr8", "", "Point 8 VARs.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V9 extends RegisterUDouble {
        private final int index;

        public V9(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 30 + (index * 54), 1,"[" + (index + 1) + "] V9", "% VRef", "Point 9 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr9 extends RegisterUDouble {
        private final int index;

        public VAr9(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 31 + (index * 54), 1,"[" + (index + 1) + "] VAr9", "", "Point 9 VARs.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V10 extends RegisterUDouble {
        private final int index;

        public V10(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 32 + (index * 54), 1,"[" + (index + 1) + "] V10", "% VRef", "Point 10 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr10 extends RegisterDouble {
        private final int index;

        public VAr10(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 33 + (index * 54), 1,"[" + (index + 1) + "] VAr10", "", "Point 10 VARs.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V11 extends RegisterUDouble {
        private final int index;

        public V11(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 34 + (index * 54), 1,"[" + (index + 1) + "] V11", "% VRef", "Point 11 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr11 extends RegisterDouble {
        private final int index;

        public VAr11(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 35 + (index * 54), 1,"[" + (index + 1) + "] VAr11", "", "Point 11 VARs.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V12 extends RegisterUDouble {
        private final int index;

        public V12(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 36 + (index * 54), 1,"[" + (index + 1) + "] V12", "% VRef", "Point 12 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr12 extends RegisterDouble {
        private final int index;

        public VAr12(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 37 + (index * 54), 1,"[" + (index + 1) + "] VAr12", "", "Point 12 VARs.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V13 extends RegisterUDouble {
        private final int index;

        public V13(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 38 + (index * 54), 1,"[" + (index + 1) + "] V13", "% VRef", "Point 13 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr13 extends RegisterDouble {
        private final int index;

        public VAr13(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 39 + (index * 54), 1,"[" + (index + 1) + "] VAr13", "", "Point 13 VARs.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V14 extends RegisterUDouble {
        private final int index;

        public V14(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 40 + (index * 54), 1,"[" + (index + 1) + "] V14", "% VRef", "Point 14 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr14 extends RegisterDouble {
        private final int index;

        public VAr14(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 41 + (index * 54), 1,"[" + (index + 1) + "] VAr14", "", "Point 14 VARs.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V15 extends RegisterUDouble {
        private final int index;

        public V15(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 42 + (index * 54), 1,"[" + (index + 1) + "] V15", "% VRef", "Point 15 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr15 extends RegisterDouble {
        private final int index;

        public VAr15(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 43 + (index * 54), 1,"[" + (index + 1) + "] VAr15", "", "Point 15 VARs.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V16 extends RegisterUDouble {
        private final int index;

        public V16(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 44 + (index * 54), 1,"[" + (index + 1) + "] V16", "% VRef", "Point 16 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr16 extends RegisterDouble {
        private final int index;

        public VAr16(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 45 + (index * 54), 1,"[" + (index + 1) + "] VAr16", "", "Point 16 VARs.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V17 extends RegisterUDouble {
        private final int index;

        public V17(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 46 + (index * 54), 1,"[" + (index + 1) + "] V17", "% VRef", "Point 17 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr17 extends RegisterDouble {
        private final int index;

        public VAr17(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 47 + (index * 54), 1,"[" + (index + 1) + "] VAr17", "", "Point 17 VARs.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V18 extends RegisterUDouble {
        private final int index;

        public V18(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 48 + (index * 54), 1,"[" + (index + 1) + "] V18", "% VRef", "Point 18 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr18 extends RegisterDouble {
        private final int index;

        public VAr18(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 49 + (index * 54), 1,"[" + (index + 1) + "] VAr18", "", "Point 18 VARs.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V19 extends RegisterUDouble {
        private final int index;

        public V19(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 50 + (index * 54), 1,"[" + (index + 1) + "] V19", "% VRef", "Point 19 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr19 extends RegisterDouble {
        private final int index;

        public VAr19(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 51 + (index * 54), 1,"[" + (index + 1) + "] VAr19", "", "Point 19 VARs.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class V20 extends RegisterUDouble {
        private final int index;

        public V20(int aIndex,V_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 52 + (index * 54), 1,"[" + (index + 1) + "] V20", "% VRef", "Point 20 Volts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VAr20 extends RegisterDouble {
        private final int index;

        public VAr20(int aIndex,DeptRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 53 + (index * 54), 1,"[" + (index + 1) + "] VAr20", "", "Point 20 VARs.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class CrvNam extends RegisterString {
        private final int index;

        public CrvNam(int aIndex,TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 54 + (index * 54), 8, "[" + (index + 1) + "] CrvNam", "", "Optional description for curve. (Max 16 chars)", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class RmpTmsRB extends RegisterUint16 {
        private final int index;

        public RmpTmsRB(int aIndex,TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 62 + (index * 54), 1,"[" + (index + 1) + "] RmpTmsRB", "Secs", "", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class RmpDecTmm extends RegisterUDouble {
        private final int index;

        public RmpDecTmm(int aIndex,RmpIncDec_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 63 + (index * 54), 1,"[" + (index + 1) + "] RmpDecTmm", "% ref_value/min", "The maximum rate at which the VAR value may be reduced in response to changes in the voltage value. %refVal is %WMax %VArMax or %VArAval depending on value of DeptRef.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class RmpIncTmm extends RegisterUDouble {
        private final int index;

        public RmpIncTmm(int aIndex,RmpIncDec_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 64 + (index * 54), 1,"[" + (index + 1) + "] RmpIncTmm", "% ref_value/min", "The maximum rate at which the VAR value may be increased in response to changes in the voltage value. %refVal is %WMax %VArMax or %VArAval depending on value of DeptRef.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class ReadOnly extends RegisterEnum16 {
        private final int index;

        public ReadOnly(int aIndex,TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getVoltVAR_126(), 65 + (index * 54), 1,"[" + (index + 1) + "] ReadOnly", "", "Boolean flag indicates if curve is read-only or can be modified.", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "READWRITE");
            hashtable.put((long) 1, "READONLY");
        }


    }

}
