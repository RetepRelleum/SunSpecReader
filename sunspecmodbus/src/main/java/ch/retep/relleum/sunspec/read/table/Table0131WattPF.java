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
import ch.retep.relleum.modbus.datatype.RegisterPad;
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
public class Table0131WattPF extends Table {
    private TcpModbusHandler tcpModbusHandler;
    private ID wattPF00ID;
    private L wattPF1L;

    private ActCrv wattPF02ActCrv;
    private ModEna wattPF03ModEna;
    private WinTms wattPF04WinTms;
    private RvrtTms wattPF05RvrtTms;
    private RmpTms wattPF06RmpTms;
    private NCrv wattPF07NCrv;
    private NPt wattPF08NPt;
    private W_SF wattPF09W_SF;
    private PF_SF wattPF10PF_SF;
    private RmpIncDec_SF wattPF11RmpIncDec_SF;

    private ActPt[] wattPF12ActPts;
    private W1[] wattPF13W1s;
    private PF1[] wattPF14PF1s;
    private W2[] wattPF15W2s;
    private PF2[] wattPF16PF2s;
    private W3[] wattPF17W3s;
    private PF3[] wattPF18PF3s;
    private W4[] wattPF19W4s;
    private PF4[] wattPF20PF4s;
    private W5[] wattPF21W5s;
    private PF5[] wattPF22PF5s;
    private W6[] wattPF23W6s;
    private PF6[] wattPF24PF6s;
    private W7[] wattPF25W7s;
    private PF7[] wattPF26PF7s;
    private W8[] wattPF27W8s;
    private PF8[] wattPF28PF8s;
    private W9[] wattPF29W9s;
    private PF9[] wattPF30PF9s;
    private W10[] wattPF31W10s;
    private PF10[] wattPF32PF10s;
    private W11[] wattPF33W11s;
    private PF11[] wattPF34PF11s;
    private W12[] wattPF35W12s;
    private PF12[] wattPF36PF12s;
    private W13[] wattPF37W13s;
    private PF13[] wattPF38PF13s;
    private W14[] wattPF39W14s;
    private PF14[] wattPF40PF14s;
    private W15[] wattPF41W15s;
    private PF15[] wattPF42PF15s;
    private W16[] wattPF43W16s;
    private PF16[] wattPF44PF16s;
    private W17[] wattPF45W17s;
    private PF17[] wattPF46PF17s;
    private W18[] wattPF47W18s;
    private PF18[] wattPF48PF18s;
    private W19[] wattPF49W19s;
    private PF19[] wattPF50PF19s;
    private W20[] wattPF51W20s;
    private PF20[] wattPF52PF20s;
    private CrvNam[] wattPF53CrvNams;
    private RmpPT1Tms[] wattPF61RmpPT1Tmss;
    private RmpDecTmm[] wattPF62RmpDecTmms;
    private RmpIncTmm[] wattPF63RmpIncTmms;
    private ReadOnly[] wattPF64ReadOnlys;
    private Pad[] wattPF65Pads;

    public Table0131WattPF(TcpModbusHandler tcpModbusHandler) {
        this.tcpModbusHandler = tcpModbusHandler;
        init(tcpModbusHandler.getWattPF_131(), 0, 66, "Watt-PF Modell", "", "Watt-PF Modell ", Rw.R, Mandatory.M);

        wattPF00ID = new ID(tcpModbusHandler);
        wattPF1L = new L(tcpModbusHandler);

        wattPF02ActCrv = new ActCrv(tcpModbusHandler);
        wattPF03ModEna = new ModEna(tcpModbusHandler);
        wattPF04WinTms = new WinTms(tcpModbusHandler);
        wattPF05RvrtTms = new RvrtTms(tcpModbusHandler);
        wattPF06RmpTms = new RmpTms(tcpModbusHandler);
        wattPF07NCrv = new NCrv(tcpModbusHandler);
        wattPF08NPt = new NPt(tcpModbusHandler);
        wattPF09W_SF = new W_SF(tcpModbusHandler);
        wattPF10PF_SF = new PF_SF(tcpModbusHandler);
        wattPF11RmpIncDec_SF = new RmpIncDec_SF(tcpModbusHandler);

        vector.add(wattPF00ID);
        vector.add(wattPF1L);
        vector.add(wattPF09W_SF);
        vector.add(wattPF10PF_SF);
        vector.add(wattPF11RmpIncDec_SF);

        vector.add(wattPF02ActCrv);
        vector.add(wattPF03ModEna);
        vector.add(wattPF04WinTms);
        vector.add(wattPF05RvrtTms);
        vector.add(wattPF06RmpTms);
        vector.add(wattPF07NCrv);
        vector.add(wattPF08NPt);

    }

    @Override
    public void setResponseInit(byte[] bArry) {
        super.setResponseInit(bArry);
        int size = (((int) getL().toLong() - 10) / 54);
        wattPF12ActPts = new ActPt[size];
        wattPF13W1s = new W1[size];
        wattPF14PF1s = new PF1[size];
        wattPF15W2s = new W2[size];
        wattPF16PF2s = new PF2[size];
        wattPF17W3s = new W3[size];
        wattPF18PF3s = new PF3[size];
        wattPF19W4s = new W4[size];
        wattPF20PF4s = new PF4[size];
        wattPF21W5s = new W5[size];
        wattPF22PF5s = new PF5[size];
        wattPF23W6s = new W6[size];
        wattPF24PF6s = new PF6[size];
        wattPF25W7s = new W7[size];
        wattPF26PF7s = new PF7[size];
        wattPF27W8s = new W8[size];
        wattPF28PF8s = new PF8[size];
        wattPF29W9s = new W9[size];
        wattPF30PF9s = new PF9[size];
        wattPF31W10s = new W10[size];
        wattPF32PF10s = new PF10[size];
        wattPF33W11s = new W11[size];
        wattPF34PF11s = new PF11[size];
        wattPF35W12s = new W12[size];
        wattPF36PF12s = new PF12[size];
        wattPF37W13s = new W13[size];
        wattPF38PF13s = new PF13[size];
        wattPF39W14s = new W14[size];
        wattPF40PF14s = new PF14[size];
        wattPF41W15s = new W15[size];
        wattPF42PF15s = new PF15[size];
        wattPF43W16s = new W16[size];
        wattPF44PF16s = new PF16[size];
        wattPF45W17s = new W17[size];
        wattPF46PF17s = new PF17[size];
        wattPF47W18s = new W18[size];
        wattPF48PF18s = new PF18[size];
        wattPF49W19s = new W19[size];
        wattPF50PF19s = new PF19[size];
        wattPF51W20s = new W20[size];
        wattPF52PF20s = new PF20[size];
        wattPF53CrvNams = new CrvNam[size];
        wattPF61RmpPT1Tmss = new RmpPT1Tms[size];
        wattPF62RmpDecTmms = new RmpDecTmm[size];
        wattPF63RmpIncTmms = new RmpIncTmm[size];
        wattPF64ReadOnlys = new ReadOnly[size];
        wattPF65Pads = new Pad[size];
        for (int i = 0; i < size; i++) {
            wattPF12ActPts[i] = new ActPt(i, tcpModbusHandler);
            wattPF13W1s[i] = new W1(i, wattPF09W_SF, tcpModbusHandler);
            wattPF14PF1s[i] = new PF1(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF15W2s[i] = new W2(i, wattPF09W_SF, tcpModbusHandler);
            wattPF16PF2s[i] = new PF2(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF17W3s[i] = new W3(i, wattPF09W_SF, tcpModbusHandler);
            wattPF18PF3s[i] = new PF3(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF19W4s[i] = new W4(i, wattPF09W_SF, tcpModbusHandler);
            wattPF20PF4s[i] = new PF4(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF21W5s[i] = new W5(i, wattPF09W_SF, tcpModbusHandler);
            wattPF22PF5s[i] = new PF5(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF23W6s[i] = new W6(i, wattPF09W_SF, tcpModbusHandler);
            wattPF24PF6s[i] = new PF6(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF25W7s[i] = new W7(i, wattPF09W_SF, tcpModbusHandler);
            wattPF26PF7s[i] = new PF7(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF27W8s[i] = new W8(i, wattPF09W_SF, tcpModbusHandler);
            wattPF28PF8s[i] = new PF8(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF29W9s[i] = new W9(i, wattPF09W_SF, tcpModbusHandler);
            wattPF30PF9s[i] = new PF9(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF31W10s[i] = new W10(i, wattPF09W_SF, tcpModbusHandler);
            wattPF32PF10s[i] = new PF10(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF33W11s[i] = new W11(i, wattPF09W_SF, tcpModbusHandler);
            wattPF34PF11s[i] = new PF11(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF35W12s[i] = new W12(i, wattPF09W_SF, tcpModbusHandler);
            wattPF36PF12s[i] = new PF12(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF37W13s[i] = new W13(i, wattPF09W_SF, tcpModbusHandler);
            wattPF38PF13s[i] = new PF13(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF39W14s[i] = new W14(i, wattPF09W_SF, tcpModbusHandler);
            wattPF40PF14s[i] = new PF14(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF41W15s[i] = new W15(i, wattPF09W_SF, tcpModbusHandler);
            wattPF42PF15s[i] = new PF15(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF43W16s[i] = new W16(i, wattPF09W_SF, tcpModbusHandler);
            wattPF44PF16s[i] = new PF16(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF45W17s[i] = new W17(i, wattPF09W_SF, tcpModbusHandler);
            wattPF46PF17s[i] = new PF17(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF47W18s[i] = new W18(i, wattPF09W_SF, tcpModbusHandler);
            wattPF48PF18s[i] = new PF18(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF49W19s[i] = new W19(i, wattPF09W_SF, tcpModbusHandler);
            wattPF50PF19s[i] = new PF19(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF51W20s[i] = new W20(i, wattPF09W_SF, tcpModbusHandler);
            wattPF52PF20s[i] = new PF20(i, wattPF10PF_SF, tcpModbusHandler);
            wattPF53CrvNams[i] = new CrvNam(i, tcpModbusHandler);
            wattPF61RmpPT1Tmss[i] = new RmpPT1Tms(i, tcpModbusHandler);
            wattPF62RmpDecTmms[i] = new RmpDecTmm(i, wattPF11RmpIncDec_SF, tcpModbusHandler);
            wattPF63RmpIncTmms[i] = new RmpIncTmm(i, wattPF11RmpIncDec_SF, tcpModbusHandler);
            wattPF64ReadOnlys[i] = new ReadOnly(i, tcpModbusHandler);
            wattPF65Pads[i] = new Pad(i, tcpModbusHandler);
            vector.add(wattPF12ActPts[i]);
            vector.add(wattPF13W1s[i]);
            vector.add(wattPF14PF1s[i]);
            vector.add(wattPF15W2s[i]);
            vector.add(wattPF16PF2s[i]);
            vector.add(wattPF17W3s[i]);
            vector.add(wattPF18PF3s[i]);
            vector.add(wattPF19W4s[i]);
            vector.add(wattPF20PF4s[i]);
            vector.add(wattPF21W5s[i]);
            vector.add(wattPF22PF5s[i]);
            vector.add(wattPF23W6s[i]);
            vector.add(wattPF24PF6s[i]);
            vector.add(wattPF25W7s[i]);
            vector.add(wattPF26PF7s[i]);
            vector.add(wattPF27W8s[i]);
            vector.add(wattPF28PF8s[i]);
            vector.add(wattPF29W9s[i]);
            vector.add(wattPF30PF9s[i]);
            vector.add(wattPF31W10s[i]);
            vector.add(wattPF32PF10s[i]);
            vector.add(wattPF33W11s[i]);
            vector.add(wattPF34PF11s[i]);
            vector.add(wattPF35W12s[i]);
            vector.add(wattPF36PF12s[i]);
            vector.add(wattPF37W13s[i]);
            vector.add(wattPF38PF13s[i]);
            vector.add(wattPF39W14s[i]);
            vector.add(wattPF40PF14s[i]);
            vector.add(wattPF41W15s[i]);
            vector.add(wattPF42PF15s[i]);
            vector.add(wattPF43W16s[i]);
            vector.add(wattPF44PF16s[i]);
            vector.add(wattPF45W17s[i]);
            vector.add(wattPF46PF17s[i]);
            vector.add(wattPF47W18s[i]);
            vector.add(wattPF48PF18s[i]);
            vector.add(wattPF49W19s[i]);
            vector.add(wattPF50PF19s[i]);
            vector.add(wattPF51W20s[i]);
            vector.add(wattPF52PF20s[i]);
            vector.add(wattPF53CrvNams[i]);
            vector.add(wattPF61RmpPT1Tmss[i]);
            vector.add(wattPF62RmpDecTmms[i]);
            vector.add(wattPF63RmpIncTmms[i]);
            vector.add(wattPF64ReadOnlys[i]);
            vector.add(wattPF65Pads[i]);
        }
    }

    /**
     * @return
     */
    public RetepEnum getID() {
        return wattPF00ID;
    }

    /**
     * @return
     */
    public RetepLong getL() {
        return wattPF1L;
    }

    /**
     * @return
     */
    public RetepLong getActCrv() {
        return wattPF02ActCrv;
    }

    /**
     * @return
     */
    public RetepBitMask getModEna() {
        return wattPF03ModEna;
    }

    /**
     * @return
     */
    public RetepLong getWinTms() {
        return wattPF04WinTms;
    }

    /**
     * @return
     */
    public RetepLong getRvrtTms() {
        return wattPF05RvrtTms;
    }

    /**
     * @return
     */
    public RetepLong getRmpTms() {
        return wattPF06RmpTms;
    }

    /**
     * @return
     */
    public RetepLong getNCrv() {
        return wattPF07NCrv;
    }

    /**
     * @return
     */
    public RetepLong getNPt() {
        return wattPF08NPt;
    }

    /**
     * @return
     */
    public RetepLong getW_SF() {
        return wattPF09W_SF;
    }

    /**
     * @return
     */
    public RetepLong getPF_SF() {
        return wattPF10PF_SF;
    }

    /**
     * @return
     */
    public RetepLong getRmpIncDec_SF() {
        return wattPF11RmpIncDec_SF;
    }

    /**
     * @return
     */
    public RetepLong getActPt(int index) {
        return wattPF12ActPts[index];
    }

    /**
     * @return
     */
    public RetepDouble getW1(int index) {
        return wattPF13W1s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF1(int index) {
        return wattPF14PF1s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW2(int index) {
        return wattPF15W2s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF2(int index) {
        return wattPF16PF2s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW3(int index) {
        return wattPF17W3s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF3(int index) {
        return wattPF18PF3s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW4(int index) {
        return wattPF19W4s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF4(int index) {
        return wattPF20PF4s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW5(int index) {
        return wattPF21W5s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF5(int index) {
        return wattPF22PF5s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW6(int index) {
        return wattPF23W6s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF6(int index) {
        return wattPF24PF6s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW7(int index) {
        return wattPF25W7s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF7(int index) {
        return wattPF26PF7s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW8(int index) {
        return wattPF27W8s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF8(int index) {
        return wattPF28PF8s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW9(int index) {
        return wattPF29W9s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF9(int index) {
        return wattPF30PF9s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW10(int index) {
        return wattPF31W10s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF10(int index) {
        return wattPF32PF10s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW11(int index) {
        return wattPF33W11s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF11(int index) {
        return wattPF34PF11s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW12(int index) {
        return wattPF35W12s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF12(int index) {
        return wattPF36PF12s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW13(int index) {
        return wattPF37W13s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF13(int index) {
        return wattPF38PF13s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW14(int index) {
        return wattPF39W14s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF14(int index) {
        return wattPF40PF14s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW15(int index) {
        return wattPF41W15s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF15(int index) {
        return wattPF42PF15s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW16(int index) {
        return wattPF43W16s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF16(int index) {
        return wattPF44PF16s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW17(int index) {
        return wattPF45W17s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF17(int index) {
        return wattPF46PF17s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW18(int index) {
        return wattPF47W18s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF18(int index) {
        return wattPF48PF18s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW19(int index) {
        return wattPF49W19s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF19(int index) {
        return wattPF50PF19s[index];
    }

    /**
     * @return
     */
    public RetepDouble getW20(int index) {
        return wattPF51W20s[index];
    }

    /**
     * @return
     */
    public RetepDouble getPF20(int index) {
        return wattPF52PF20s[index];
    }

    /**
     * @return
     */
    public RetepString getCrvNam(int index) {
        return wattPF53CrvNams[index];
    }

    /**
     * @return
     */
    public RetepLong getRmpPT1Tms(int index) {
        return wattPF61RmpPT1Tmss[index];
    }

    /**
     * @return
     */
    public RetepDouble getRmpDecTmm(int index) {
        return wattPF62RmpDecTmms[index];
    }

    /**
     * @return
     */
    public RetepDouble getRmpIncTmm(int index) {
        return wattPF63RmpIncTmms[index];
    }

    /**
     * @return
     */
    public RetepEnum getReadOnly(int index) {
        return wattPF64ReadOnlys[index];
    }

    /**
     * @return
     */
    public RetepLong getPad(int index) {
        return wattPF65Pads[index];
    }

    /**
     *
     */
    public class ID extends RegisterEnum16 {
        public ID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getWattPF_131(), 0, 1, "Model", "", "Watt-Power Factor ", Rw.R, Mandatory.M);
            hashtable.put((long) 131, "SunSpec Watt-PF");
        }
    }

    /**
     *
     */
    public class L extends RegisterUint16 {
        public L(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getWattPF_131(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }


    public class ActCrv extends RegisterUint16 {
        public ActCrv(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getWattPF_131(), 2, 1, "ActCrv", "", "Index of active curve. 0=no active curve.", Rw.RW, Mandatory.M);
        }
    }


    public class ModEna extends RegisterBitfield16 {
        public ModEna(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getWattPF_131(), 3, 1, "ModEna", "", "Is watt-PF mode active.", Rw.RW, Mandatory.M);
            hashtable.put((long) 0, "ENABLED");

        }
    }

    /**
     *
     */
    public class WinTms extends RegisterUint16 {
        public WinTms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getWattPF_131(), 4, 1, "WinTms", "Secs", "Time window for watt-PF change.", Rw.RW, Mandatory.O);
        }
    }


    public class RvrtTms extends RegisterUint16 {
        public RvrtTms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getWattPF_131(), 5, 1, "RvrtTms", "Secs", "Timeout period for watt-PF curve selection.", Rw.RW, Mandatory.O);
        }
    }


    public class RmpTms extends RegisterUint16 {
        public RmpTms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getWattPF_131(), 6, 1, "RmpTms", "Secs", "Ramp time for moving from current mode to new mode.", Rw.RW, Mandatory.O);
        }
    }


    public class NCrv extends RegisterUint16 {
        public NCrv(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getWattPF_131(), 7, 1, "NCrv", "", "Number of curves supported (recommend 4).", Rw.R, Mandatory.M);
        }
    }


    public class NPt extends RegisterUint16 {
        public NPt(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getWattPF_131(), 8, 1, "NPt", "", "Max number of points in array.", Rw.R, Mandatory.M);
        }
    }


    public class W_SF extends RegisterSunssf {
        public W_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getWattPF_131(), 9, 1, "W_SF", "", "Scale factor for percent WMax.", Rw.R, Mandatory.M);
        }
    }


    public class PF_SF extends RegisterSunssf {
        public PF_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getWattPF_131(), 10, 1, "PF_SF", "", "Scale factor for PF.", Rw.R, Mandatory.M);
        }
    }


    public class RmpIncDec_SF extends RegisterSunssf {
        public RmpIncDec_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getWattPF_131(), 11, 1, "RmpIncDec_SF", "", "Scale factor for increment and decrement ramps.", Rw.R, Mandatory.O);
        }
    }


    public class ActPt extends RegisterUint16 {
        private final int index;

        public ActPt(int aIndex, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 12 + (index * 54), 1, "[" + (index + 1) + "] ActPt", "", "Number of active points in array.", Rw.RW, Mandatory.M);
        }
    }


    public class W1 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public W1(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 13 + (index * 54), 1, "[" + (index + 1) + "] W1", "% WMax", "Point 1 Watts.", Rw.RW, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }


    public class PF1 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public PF1(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 14 + (index * 54), 1, "[" + (index + 1) + "] PF1", "cos()", "Point 1 PF in EEI notation.", Rw.RW, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }


    public class W2 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public W2(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 15 + (index * 54), 1, "[" + (index + 1) + "] W2", "% WMax", "Point 2 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }


    public class PF2 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public PF2(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 16 + (index * 54), 1, "[" + (index + 1) + "] PF2", "cos()", "Point 2 PF in EEI notation.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }


    public class W3 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public W3(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 17 + (index * 54), 1, "[" + (index + 1) + "] W3", "% WMax", "Point 3 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }


    public class PF3 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public PF3(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 18 + (index * 54), 1, "[" + (index + 1) + "] PF3", "cos()", "Point 3 PF in EEI notation.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }


    public class W4 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public W4(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 19 + (index * 54), 1, "[" + (index + 1) + "] W4", "% WMax", "Point 4 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }


    public class PF4 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public PF4(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 20 + (index * 54), 1, "[" + (index + 1) + "] PF4", "cos()", "Point 4 PF in EEI notation.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }


    public class W5 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public W5(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 21 + (index * 54), 1, "[" + (index + 1) + "] W5", "% WMax", "Point 5 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }


    public class PF5 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public PF5(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 22 + (index * 54), 1, "[" + (index + 1) + "] PF5", "cos()", "Point 5 PF in EEI notation.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }


    public class W6 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public W6(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 23 + (index * 54), 1, "[" + (index + 1) + "] W6", "% WMax", "Point 6 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }


    public class PF6 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public PF6(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 24 + (index * 54), 1, "[" + (index + 1) + "] PF6", "cos()", "Point 6 PF in EEI notation.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W7 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public W7(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 25 + (index * 54), 1, "[" + (index + 1) + "] W7", "% WMax", "Point 7 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class PF7 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public PF7(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 26 + (index * 54), 1, "[" + (index + 1) + "] PF7", "cos()", "Point 7 PF in EEI notation.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W8 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public W8(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 27 + (index * 54), 1, "[" + (index + 1) + "] W8", "% WMax", "Point 8 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class PF8 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public PF8(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 28 + (index * 54), 1, "[" + (index + 1) + "] PF8", "cos()", "Point 8 PF in EEI notation.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W9 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public W9(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 29 + (index * 54), 1, "[" + (index + 1) + "] W9", "% WMax", "Point 9 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class PF9 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public PF9(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 30 + (index * 54), 1, "[" + (index + 1) + "] PF9", "cos()", "Point 9 PF in EEI notation.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W10 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public W10(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 31 + (index * 54), 1, "[" + (index + 1) + "] W10", "% WMax", "Point 10 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class PF10 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public PF10(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 32 + (index * 54), 1, "[" + (index + 1) + "] PF10", "cos()", "Point 10 PF in EEI notation.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W11 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public W11(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 33 + (index * 54), 1, "[" + (index + 1) + "] W11", "% WMax", "Point 11 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class PF11 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public PF11(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 34 + (index * 54), 1, "[" + (index + 1) + "] PF11", "cos()", "Point 11 PF in EEI notation.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W12 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public W12(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 35 + (index * 54), 1, "[" + (index + 1) + "] W12", "% WMax", "Point 12 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class PF12 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public PF12(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 36 + (index * 54), 1, "[" + (index + 1) + "] PF12", "cos()", "Point 12 PF in EEI notation.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W13 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public W13(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 37 + (index * 54), 1, "[" + (index + 1) + "] W13", "% WMax", "Point 13 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class PF13 extends RegisterDouble {

        private final int index;

        /**
         * @param aScalFactor
         */
        public PF13(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 38 + (index * 54), 1, "[" + (index + 1) + "] PF13", "cos()", "Point 13 PF in EEI notation.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W14 extends RegisterDouble {

        private final int index;

        /**
         * @param aScalFactor
         */
        public W14(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 39 + (index * 54), 1, "[" + (index + 1) + "] W14", "% WMax", "Point 14 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class PF14 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public PF14(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 40 + (index * 54), 1, "[" + (index + 1) + "] PF14", "cos()", "Point 14 PF in EEI notation.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W15 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public W15(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 41 + (index * 54), 1, "[" + (index + 1) + "] W15", "% WMax", "Point 15 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class PF15 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public PF15(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 42 + (index * 54), 1, "[" + (index + 1) + "] PF15", "cos()", "Point 15 PF in EEI notation.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W16 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public W16(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 43 + (index * 54), 1, "[" + (index + 1) + "] W16", "% WMax", "Point 16 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class PF16 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public PF16(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 44 + (index * 54), 1, "[" + (index + 1) + "] PF16", "cos()", "Point 16 PF in EEI notation.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W17 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public W17(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 45 + (index * 54), 1, "[" + (index + 1) + "] W17", "% WMax", "Point 17 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class PF17 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public PF17(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 46 + (index * 54), 1, "[" + (index + 1) + "] PF17", "cos()", "Point 17 PF in EEI notation.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W18 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public W18(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 47 + (index * 54), 1, "[" + (index + 1) + "] W18", "% WMax", "Point 18 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class PF18 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public PF18(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 48 + (index * 54), 1, "[" + (index + 1) + "] PF18", "cos()", "Point 18 PF in EEI notation.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W19 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public W19(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 49 + (index * 54), 1, "[" + (index + 1) + "] W19", "% WMax", "Point 19 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class PF19 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public PF19(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 50 + (index * 54), 1, "[" + (index + 1) + "] PF19", "cos()", "Point 19 PF in EEI notation.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class W20 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public W20(int aIndex, W_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 51 + (index * 54), 1, "[" + (index + 1) + "] W20", "% WMax", "Point 20 Watts.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class PF20 extends RegisterDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public PF20(int aIndex, PF_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 52 + (index * 54), 1, "[" + (index + 1) + "] PF20", "cos()", "Point 20 PF in EEI notation.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class CrvNam extends RegisterString {
        private final int index;

        public CrvNam(int aIndex, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 53 + (index * 54), 8, "[" + (index + 1) + "] CrvNam", "", "Optional description for curve.", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class RmpPT1Tms extends RegisterUint16 {
        private final int index;

        public RmpPT1Tms(int aIndex, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 61 + (index * 54), 1, "[" + (index + 1) + "] RmpPT1Tms", "Secs", "The time of the PT1 in seconds (time to accomplish a change of 95%).", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class RmpDecTmm extends RegisterUDouble {
        private final int index;


        /**
         * @param aScalFactor
         */
        public RmpDecTmm(int aIndex, RmpIncDec_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 62 + (index * 54), 1, "[" + (index + 1) + "] RmpDecTmm", "% PF/min", "The maximum rate at which the power factor may be reduced in response to changes in the power value.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class RmpIncTmm extends RegisterUDouble {
        private final int index;

        /**
         * @param aScalFactor
         */
        public RmpIncTmm(int aIndex, RmpIncDec_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 63 + (index * 54), 1, "[" + (index + 1) + "] RmpIncTmm", "% PF/min", "The maximum rate at which the power factor may be increased in response to changes in the power value.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class ReadOnly extends RegisterEnum16 {
        private final int index;

        public ReadOnly(int aIndex, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 64 + (index * 54), 1, "[" + (index + 1) + "] ReadOnly", "", "Enumerated value indicates if curve is read-only or can be modified.", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "READWRITE");
            hashtable.put((long) 1, "READONLY");
        }
    }

    /**
     *
     */
    public class Pad extends RegisterPad {
        private final int index;

        public Pad(int aIndex, TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getWattPF_131(), 65 + (index * 54), 1, "[" + (index + 1) + "] Pad", "", "Pad", Rw.R, Mandatory.O);
        }
    }

}
