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

import ch.retep.relleum.modbus.datatype.RegisterDouble;
import ch.retep.relleum.modbus.datatype.RegisterEnum16;
import ch.retep.relleum.modbus.datatype.RegisterPad;
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
public class Table0120Nameplate extends Table {
    private ID nameplate00ID;
    private L nameplate01L;
    private DERTyp nameplate02DERTyp;
    private WRtg_SF nameplate04WRtg_SF;
    private WRtg nameplate03WRtg;
    private VARtg_SF nameplate06VARtg_SF;
    private VARtg nameplate05VARtg;
    private VArRtg_SF nameplate11VArRtg_SF;
    private VArRtgQ1 nameplate07VArRtgQ1;
    private VArRtgQ2 nameplate08VArRtgQ2;
    private VArRtgQ3 nameplate09VArRtgQ3;
    private VArRtgQ4 nameplate10VArRtgQ4;
    private ARtg_SF nameplate13ARtg_SF;
    private ARtg nameplate12ARtg;
    private PFRtg_SF nameplate18PFRtg_SF;
    private PFRtgQ1 nameplate14PFRtgQ1;
    private PFRtgQ2 nameplate15PFRtgQ2;
    private PFRtgQ3 nameplate16PFRtgQ3;
    private PFRtgQ4 nameplate17PFRtgQ4;
    private WHRtg_SF nameplate20WHRtg_SF;
    private WHRtg nameplate19WHRtg;
    private AhrRtg_SF nameplate22AhrRtg_SF;
    private AhrRtg nameplate21AhrRtg;
    private MaxChaRte_SF nameplate24MaxChaRte_SF;
    private MaxChaRte nameplate23MaxChaRte;
    private MaxDisChaRte_SF nameplate26MaxDisChaRte_SF;
    private MaxDisChaRte nameplate25MaxDisChaRte;
    private Pad nameplate27Pad;


    public Table0120Nameplate(TcpModbusHandler tcpModbusHandler) {
        init(tcpModbusHandler.getNameplate_120(), 0, 28, "Nameplate", "", "Nameplate", Rw.nan, Mandatory.nan);
        nameplate00ID = new ID(tcpModbusHandler);
        nameplate01L = new L(tcpModbusHandler);
        nameplate02DERTyp = new DERTyp(tcpModbusHandler);
        nameplate04WRtg_SF = new WRtg_SF(tcpModbusHandler);
        nameplate03WRtg = new WRtg(nameplate04WRtg_SF, tcpModbusHandler);
        nameplate06VARtg_SF = new VARtg_SF(tcpModbusHandler);
        nameplate05VARtg = new VARtg(nameplate06VARtg_SF, tcpModbusHandler);
        nameplate11VArRtg_SF = new VArRtg_SF(tcpModbusHandler);
        nameplate07VArRtgQ1 = new VArRtgQ1(nameplate11VArRtg_SF, tcpModbusHandler);
        nameplate08VArRtgQ2 = new VArRtgQ2(nameplate11VArRtg_SF, tcpModbusHandler);
        nameplate09VArRtgQ3 = new VArRtgQ3(nameplate11VArRtg_SF, tcpModbusHandler);
        nameplate10VArRtgQ4 = new VArRtgQ4(nameplate11VArRtg_SF, tcpModbusHandler);
        nameplate13ARtg_SF = new ARtg_SF(tcpModbusHandler);
        nameplate12ARtg = new ARtg(nameplate13ARtg_SF, tcpModbusHandler);
        nameplate18PFRtg_SF = new PFRtg_SF(tcpModbusHandler);
        nameplate14PFRtgQ1 = new PFRtgQ1(nameplate18PFRtg_SF, tcpModbusHandler);
        nameplate15PFRtgQ2 = new PFRtgQ2(nameplate18PFRtg_SF, tcpModbusHandler);
        nameplate16PFRtgQ3 = new PFRtgQ3(nameplate18PFRtg_SF, tcpModbusHandler);
        nameplate17PFRtgQ4 = new PFRtgQ4(nameplate18PFRtg_SF, tcpModbusHandler);
        nameplate20WHRtg_SF = new WHRtg_SF(tcpModbusHandler);
        nameplate19WHRtg = new WHRtg(nameplate20WHRtg_SF, tcpModbusHandler);
        nameplate22AhrRtg_SF = new AhrRtg_SF(tcpModbusHandler);
        nameplate21AhrRtg = new AhrRtg(nameplate22AhrRtg_SF, tcpModbusHandler);
        nameplate24MaxChaRte_SF = new MaxChaRte_SF(tcpModbusHandler);
        nameplate23MaxChaRte = new MaxChaRte(nameplate24MaxChaRte_SF, tcpModbusHandler);
        nameplate26MaxDisChaRte_SF = new MaxDisChaRte_SF(tcpModbusHandler);
        nameplate25MaxDisChaRte = new MaxDisChaRte(nameplate26MaxDisChaRte_SF, tcpModbusHandler);
        nameplate27Pad = new Pad(tcpModbusHandler);
        vector.add(nameplate00ID);
        vector.add(nameplate01L);
        vector.add(nameplate04WRtg_SF);
        vector.add(nameplate06VARtg_SF);
        vector.add(nameplate11VArRtg_SF);
        vector.add(nameplate13ARtg_SF);
        vector.add(nameplate18PFRtg_SF);
        vector.add(nameplate20WHRtg_SF);
        vector.add(nameplate22AhrRtg_SF);
        vector.add(nameplate24MaxChaRte_SF);
        vector.add(nameplate26MaxDisChaRte_SF);
        vector.add(nameplate02DERTyp);
        vector.add(nameplate03WRtg);
        vector.add(nameplate05VARtg);
        vector.add(nameplate07VArRtgQ1);
        vector.add(nameplate08VArRtgQ2);
        vector.add(nameplate09VArRtgQ3);
        vector.add(nameplate10VArRtgQ4);
        vector.add(nameplate12ARtg);
        vector.add(nameplate14PFRtgQ1);
        vector.add(nameplate15PFRtgQ2);
        vector.add(nameplate16PFRtgQ3);
        vector.add(nameplate17PFRtgQ4);
        vector.add(nameplate19WHRtg);
        vector.add(nameplate21AhrRtg);
        vector.add(nameplate23MaxChaRte);
        vector.add(nameplate25MaxDisChaRte);
        vector.add(nameplate27Pad);
    }

    /**
     * @return
     */
    public RetepEnum getID() {
        return nameplate00ID;
    }

    /**
     * @return
     */
    public RetepLong getL() {
        return nameplate01L;
    }

    /**
     * @return
     */
    public RetepEnum getDERTyp() {
        return nameplate02DERTyp;
    }

    /**
     * @return
     */
    public RetepDouble getWRtg() {
        return nameplate03WRtg;
    }

    /**
     * @return
     */
    public RetepLong getWRtg_SF() {
        return nameplate04WRtg_SF;
    }

    /**
     * @return
     */
    public RetepDouble getVARtg() {
        return nameplate05VARtg;
    }

    /**
     * @return
     */
    public RetepLong getVARtg_SF() {
        return nameplate06VARtg_SF;
    }

    /**
     * @return
     */
    public RetepDouble getVArRtgQ1() {
        return nameplate07VArRtgQ1;
    }

    /**
     * @return
     */
    public RetepDouble getVArRtgQ2() {
        return nameplate08VArRtgQ2;
    }

    /**
     * @return
     */
    public RetepDouble getVArRtgQ3() {
        return nameplate09VArRtgQ3;
    }

    /**
     * @return
     */
    public RetepDouble getVArRtgQ4() {
        return nameplate10VArRtgQ4;
    }

    /**
     * @return
     */
    public RetepLong getVArRtg_SF() {
        return nameplate11VArRtg_SF;
    }

    /**
     * @return
     */
    public RetepDouble getARtg() {
        return nameplate12ARtg;
    }

    /**
     * @return
     */
    public RetepLong getARtg_SF() {
        return nameplate13ARtg_SF;
    }

    /**
     * @return
     */
    public RetepDouble getPFRtgQ1() {
        return nameplate14PFRtgQ1;
    }

    /**
     * @return
     */
    public RetepDouble getPFRtgQ2() {
        return nameplate15PFRtgQ2;
    }

    /**
     * @return
     */
    public RetepDouble getPFRtgQ3() {
        return nameplate16PFRtgQ3;
    }

    /**
     * @return
     */
    public RetepDouble getPFRtgQ4() {
        return nameplate17PFRtgQ4;
    }

    /**
     * @return
     */
    public RetepLong getPFRtg_SF() {
        return nameplate18PFRtg_SF;
    }

    /**
     * @return
     */
    public RetepDouble getWHRtg() {
        return nameplate19WHRtg;
    }

    /**
     * @return
     */
    public RetepLong getWHRtg_SF() {
        return nameplate20WHRtg_SF;
    }

    /**
     * @return
     */
    public RetepDouble getAhrRtg() {
        return nameplate21AhrRtg;
    }

    /**
     * @return
     */
    public RetepLong getAhrRtg_SF() {
        return nameplate22AhrRtg_SF;
    }

    /**
     * @return
     */
    public RetepDouble getMaxChaRte() {
        return nameplate23MaxChaRte;
    }

    /**
     * @return
     */
    public RetepLong getMaxChaRte_SF() {
        return nameplate24MaxChaRte_SF;
    }

    /**
     * @return
     */
    public RetepDouble getMaxDisChaRte() {
        return nameplate25MaxDisChaRte;
    }

    /**
     * @return
     */
    public RetepLong getMaxDisChaRte_SF() {
        return nameplate26MaxDisChaRte_SF;
    }

    /**
     * @return
     */
    public RetepLong getPad() {
        return nameplate27Pad;
    }

    /**
     *
     */
    public static class ID extends RegisterEnum16 {


        public ID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 0, 1, "Model", "", "Inverter Controls Nameplate Ratings ", Rw.R, Mandatory.M);
            hashtable.put((long) 120, "SunSpec Nameplate");
        }
    }

    /**
     *
     */
    public static class L extends RegisterUint16 {

        public L(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public static class DERTyp extends RegisterEnum16 {

        public DERTyp(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 2, 1, "DERTyp", "", "Type of DER device. Default value is 4 to indicate PV device.", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public static class WRtg extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public WRtg(WRtg_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 3, 1, "WRtg", "W", "Continuous power output capability of the inverter.", Rw.R, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public static class WRtg_SF extends RegisterSunssf {

        public WRtg_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 4, 1, "WRtg_SF", "", "Scale factor", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public static class VARtg extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public VARtg(VARtg_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 5, 1, "VARtg", "VA", "Continuous Volt-Ampere capability of the inverter.", Rw.R, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public static class VARtg_SF extends RegisterSunssf {

        public VARtg_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 6, 1, "VARtg_SF", "", "Scale factor", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public static class VArRtgQ1 extends RegisterDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public VArRtgQ1(VArRtg_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            init(tcpModbusHandler.getNameplate_120(), 7, 1, "VArRtgQ1", "var", "Continuous VAR capability of the inverter in quadrant 1.", Rw.R, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public static class VArRtgQ2 extends RegisterDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public VArRtgQ2(VArRtg_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 8, 1, "VArRtgQ2", "var", "Continuous VAR capability of the inverter in quadrant 2.", Rw.R, Mandatory.M);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public static class VArRtgQ3 extends RegisterDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public VArRtgQ3(VArRtg_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 9, 1, "VArRtgQ3", "var", "Continuous VAR capability of the inverter in quadrant 3.", Rw.R, Mandatory.M);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public static class VArRtgQ4 extends RegisterDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public VArRtgQ4(VArRtg_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 10, 1, "VArRtgQ4", "var", "Continuous VAR capability of the inverter in quadrant 4.", Rw.R, Mandatory.M);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public static class VArRtg_SF extends RegisterSunssf {

        public VArRtg_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 11, 1, "VArRtg_SF", "", "Scale factor", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public static class ARtg extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public ARtg(ARtg_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 12, 1, "ARtg", "A", "Maximum RMS AC current level capability of the inverter.", Rw.R, Mandatory.M);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public static class ARtg_SF extends RegisterSunssf {

        public ARtg_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 13, 1, "ARtg_SF", "", "Scale factor", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public static class PFRtgQ1 extends RegisterDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public PFRtgQ1(PFRtg_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {

            init(tcpModbusHandler.getNameplate_120(), 14, 1, "PFRtgQ1", "cos()", "Minimum power factor capability of the inverter in quadrant 1.", Rw.R, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public static class PFRtgQ2 extends RegisterDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public PFRtgQ2(PFRtg_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 15, 1, "PFRtgQ2", "cos()", "Minimum power factor capability of the inverter in quadrant 2.", Rw.R, Mandatory.M);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public static class PFRtgQ3 extends RegisterDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public PFRtgQ3(PFRtg_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 16, 1, "PFRtgQ3", "cos()", "Minimum power factor capability of the inverter in quadrant 3.", Rw.R, Mandatory.M);


            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public static class PFRtgQ4 extends RegisterDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public PFRtgQ4(PFRtg_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 17, 1, "PFRtgQ4", "cos()", "Minimum power factor capability of the inverter in quadrant 4.", Rw.R, Mandatory.M);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public static class PFRtg_SF extends RegisterSunssf {

        public PFRtg_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 18, 1, "PFRtg_SF", "", "Scale factor", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public static class WHRtg extends RegisterUDouble {

        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public WHRtg(WHRtg_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 19, 1, "WHRtg", "Wh", "Nominal energy rating of storage device.", Rw.R, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public static class WHRtg_SF extends RegisterSunssf {

        public WHRtg_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 20, 1, "WHRtg_SF", "", "Scale factor", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public static class AhrRtg extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public AhrRtg(AhrRtg_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 21, 1, "AhrRtg", "AH", "The useable capacity of the battery.  Maximum charge minus minimum charge from a technology capability perspective (Amp-hour capacity rating).", Rw.R, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public static class AhrRtg_SF extends RegisterSunssf {

        public AhrRtg_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 22, 1, "AhrRtg_SF", "", "Scale factor for amp-hour rating.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public static class MaxChaRte extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public MaxChaRte(MaxChaRte_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 23, 1, "MaxChaRte", "W", "Maximum rate of energy transfer into the storage device.", Rw.R, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public static class MaxChaRte_SF extends RegisterSunssf {

        public MaxChaRte_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 24, 1, "MaxChaRte_SF", "", "Scale factor", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public static class MaxDisChaRte extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public MaxDisChaRte(MaxDisChaRte_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 25, 1, "MaxDisChaRte", "W", "Maximum rate of energy transfer out of the storage device.", Rw.R, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public static class MaxDisChaRte_SF extends RegisterSunssf {

        public MaxDisChaRte_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 26, 1, "MaxDisChaRte_SF", "", "Scale factor", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public static class Pad extends RegisterPad {

        public Pad(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getNameplate_120(), 27, 1, "Pad", "", "Pad register.", Rw.R, Mandatory.O);
        }
    }
}
