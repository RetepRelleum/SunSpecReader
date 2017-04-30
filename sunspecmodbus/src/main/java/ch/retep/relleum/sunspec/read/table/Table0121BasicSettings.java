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
public class Table0121BasicSettings extends Table {

    private  ID basicSettings00ID;
    private  L basicSettings01L;
    private  WMax_SF basicSettings22WMax_SF;
    private  VRef_SF basicSettings23VRef_SF;
    private  VRefOfs_SF basicSettings24VRefOfs_SF;
    private  VMinMax_SF basicSettings25VMinMax_SF;
    private  VAMax_SF basicSettings26VAMax_SF;
    private  VArMax_SF basicSettings27VArMax_SF;
    private  WGra_SF basicSettings28WGra_SF;
    private  PFMin_SF basicSettings29PFMin_SF;
    private  MaxRmpRte_SF basicSettings30MaxRmpRte_SF;
    private  ECPNomHz_SF basicSettings31ECPNomHz_SF;
    private  WMax basicSettings02WMax;
    private  VRef basicSettings03VRef;
    private  VRefOfs basicSettings04VRefOfs;
    private  VMax basicSettings05VMax;
    private  VMin basicSettings06VMin;
    private  VAMax basicSettings07VAMax;
    private  VArMaxQ1 basicSettings08VArMaxQ1;
    private  VArMaxQ2 basicSettings09VArMaxQ2;
    private  VArMaxQ3 basicSettings10VArMaxQ3;
    private  VArMaxQ4 basicSettings11VArMaxQ4;
    private  WGra basicSettings12WGra;
    private  PFMinQ1 basicSettings13PFMinQ1;
    private  PFMinQ2 basicSettings14PFMinQ2;
    private  PFMinQ3 basicSettings15PFMinQ3;
    private  PFMinQ4 basicSettings16PFMinQ4;
    private  VArAct basicSettings17VArAct;
    private  ClcTotVA basicSettings18ClcTotVA;
    private  MaxRmpRte basicSettings19MaxRmpRte;
    private  ECPNomHz basicSettings20ECPNomHz;
    private  ConnPh basicSettings21ConnPh;

    public Table0121BasicSettings(TcpModbusHandler tcpModbusHandler) {
        init(tcpModbusHandler.getBasicSettings_121(), 0, 32, "BasicSettings", "", "BasicSettings", Rw.nan, Mandatory.nan);

        basicSettings00ID = new ID(tcpModbusHandler);
        basicSettings01L = new L(tcpModbusHandler);
        basicSettings22WMax_SF = new WMax_SF(tcpModbusHandler);
        basicSettings23VRef_SF = new VRef_SF(tcpModbusHandler);
        basicSettings24VRefOfs_SF = new VRefOfs_SF(tcpModbusHandler);
        basicSettings25VMinMax_SF = new VMinMax_SF(tcpModbusHandler);
        basicSettings26VAMax_SF = new VAMax_SF(tcpModbusHandler);
        basicSettings27VArMax_SF = new VArMax_SF(tcpModbusHandler);
        basicSettings28WGra_SF = new WGra_SF(tcpModbusHandler);
        basicSettings29PFMin_SF = new PFMin_SF(tcpModbusHandler);
        basicSettings30MaxRmpRte_SF = new MaxRmpRte_SF(tcpModbusHandler);
        basicSettings31ECPNomHz_SF = new ECPNomHz_SF(tcpModbusHandler);
        basicSettings02WMax = new WMax(basicSettings22WMax_SF, tcpModbusHandler);
        basicSettings03VRef = new VRef(basicSettings23VRef_SF, tcpModbusHandler);
        basicSettings04VRefOfs = new VRefOfs(basicSettings24VRefOfs_SF, tcpModbusHandler);
        basicSettings05VMax = new VMax(basicSettings25VMinMax_SF, tcpModbusHandler);
        basicSettings06VMin = new VMin(basicSettings25VMinMax_SF, tcpModbusHandler);
        basicSettings07VAMax = new VAMax(basicSettings26VAMax_SF, tcpModbusHandler);
        basicSettings08VArMaxQ1 = new VArMaxQ1(basicSettings27VArMax_SF, tcpModbusHandler);
        basicSettings09VArMaxQ2 = new VArMaxQ2(basicSettings27VArMax_SF, tcpModbusHandler);
        basicSettings10VArMaxQ3 = new VArMaxQ3(basicSettings27VArMax_SF, tcpModbusHandler);
        basicSettings11VArMaxQ4 = new VArMaxQ4(basicSettings27VArMax_SF, tcpModbusHandler);
        basicSettings12WGra = new WGra(basicSettings28WGra_SF, tcpModbusHandler);
        basicSettings13PFMinQ1 = new PFMinQ1(basicSettings29PFMin_SF, tcpModbusHandler);
        basicSettings14PFMinQ2 = new PFMinQ2(basicSettings29PFMin_SF, tcpModbusHandler);
        basicSettings15PFMinQ3 = new PFMinQ3(basicSettings29PFMin_SF, tcpModbusHandler);
        basicSettings16PFMinQ4 = new PFMinQ4(basicSettings29PFMin_SF, tcpModbusHandler);
        basicSettings17VArAct = new VArAct(tcpModbusHandler);
        basicSettings18ClcTotVA = new ClcTotVA(tcpModbusHandler);
        basicSettings19MaxRmpRte = new MaxRmpRte(basicSettings30MaxRmpRte_SF, tcpModbusHandler);
        basicSettings20ECPNomHz = new ECPNomHz(basicSettings31ECPNomHz_SF, tcpModbusHandler);
        basicSettings21ConnPh = new ConnPh(tcpModbusHandler);

        vector.add(basicSettings00ID);
        vector.add(basicSettings01L);
        vector.add(basicSettings22WMax_SF);
        vector.add(basicSettings23VRef_SF);
        vector.add(basicSettings24VRefOfs_SF);
        vector.add(basicSettings25VMinMax_SF);
        vector.add(basicSettings26VAMax_SF);
        vector.add(basicSettings27VArMax_SF);
        vector.add(basicSettings28WGra_SF);
        vector.add(basicSettings29PFMin_SF);
        vector.add(basicSettings30MaxRmpRte_SF);
        vector.add(basicSettings31ECPNomHz_SF);
        vector.add(basicSettings02WMax);
        vector.add(basicSettings03VRef);
        vector.add(basicSettings04VRefOfs);
        vector.add(basicSettings05VMax);
        vector.add(basicSettings06VMin);
        vector.add(basicSettings07VAMax);
        vector.add(basicSettings08VArMaxQ1);
        vector.add(basicSettings09VArMaxQ2);
        vector.add(basicSettings10VArMaxQ3);
        vector.add(basicSettings11VArMaxQ4);
        vector.add(basicSettings12WGra);
        vector.add(basicSettings13PFMinQ1);
        vector.add(basicSettings14PFMinQ2);
        vector.add(basicSettings15PFMinQ3);
        vector.add(basicSettings16PFMinQ4);
        vector.add(basicSettings17VArAct);
        vector.add(basicSettings18ClcTotVA);
        vector.add(basicSettings19MaxRmpRte);
        vector.add(basicSettings20ECPNomHz);
        vector.add(basicSettings21ConnPh);

    }

    /**
     * @return
     */
    public RetepEnum getID() {
        return basicSettings00ID;
    }

    /**
     * @return
     */
    public RetepLong getL() {
        return basicSettings01L;
    }

    /**
     * @return
     */
    public RetepDouble getWMax() {
        return basicSettings02WMax;
    }

    /**
     * @return
     */
    public RetepDouble getVRef() {
        return basicSettings03VRef;
    }

    /**
     * @return
     */
    public RetepDouble getVRefOfs() {
        return basicSettings04VRefOfs;
    }

    /**
     * @return
     */
    public RetepDouble getVMax() {
        return basicSettings05VMax;
    }

    /**
     * @return
     */
    public RetepDouble getVMin() {
        return basicSettings06VMin;
    }

    /**
     * @return
     */
    public RetepDouble getVAMax() {
        return basicSettings07VAMax;
    }

    /**
     * @return
     */
    public RetepDouble getVArMaxQ1() {
        return basicSettings08VArMaxQ1;
    }

    /**
     * @return
     */
    public RetepDouble getVArMaxQ2() {
        return basicSettings09VArMaxQ2;
    }

    /**
     * @return
     */
    public RetepDouble getVArMaxQ3() {
        return basicSettings10VArMaxQ3;
    }

    /**
     * @return
     */
    public RetepDouble getVArMaxQ4() {
        return basicSettings11VArMaxQ4;
    }

    /**
     * @return
     */
    public RetepDouble getWGra() {
        return basicSettings12WGra;
    }

    /**
     * @return
     */
    public RetepDouble getPFMinQ1() {
        return basicSettings13PFMinQ1;
    }

    /**
     * @return
     */
    public RetepDouble getPFMinQ2() {
        return basicSettings14PFMinQ2;
    }

    /**
     * @return
     */
    public RetepDouble getPFMinQ3() {
        return basicSettings15PFMinQ3;
    }

    /**
     * @return
     */
    public RetepDouble getPFMinQ4() {
        return basicSettings16PFMinQ4;
    }

    /**
     * @return
     */
    public RetepEnum getVArAct() {
        return basicSettings17VArAct;
    }

    /**
     * @return
     */
    public RetepEnum getClcTotVA() {
        return basicSettings18ClcTotVA;
    }

    /**
     * @return
     */
    public RetepDouble getMaxRmpRte() {
        return basicSettings19MaxRmpRte;
    }

    /**
     * @return
     */
    public RetepDouble getECPNomHz() {
        return basicSettings20ECPNomHz;
    }

    /**
     * @return
     */
    public RetepEnum getConnPh() {
        return basicSettings21ConnPh;
    }

    /**
     * @return
     */
    public RetepLong getWMax_SF() {
        return basicSettings22WMax_SF;
    }

    /**
     * @return
     */
    public RetepLong getVRef_SF() {
        return basicSettings23VRef_SF;
    }

    /**
     * @return
     */
    public RetepLong getVRefOfs_SF() {
        return basicSettings24VRefOfs_SF;
    }

    /**
     * @return
     */
    public RetepLong getVMinMax_SF() {
        return basicSettings25VMinMax_SF;
    }

    /**
     * @return
     */
    public RetepLong getVAMax_SF() {
        return basicSettings26VAMax_SF;
    }

    /**
     * @return
     */
    public RetepLong getVArMax_SF() {
        return basicSettings27VArMax_SF;
    }

    /**
     * @return
     */
    public RetepLong getWGra_SF() {
        return basicSettings28WGra_SF;
    }

    /**
     * @return
     */
    public RetepLong getPFMin_SF() {
        return basicSettings29PFMin_SF;
    }

    /**
     * @return
     */
    public RetepLong getMaxRmpRte_SF() {
        return basicSettings30MaxRmpRte_SF;
    }

    /**
     * @return
     */
    public RetepLong getECPNomHz_SF() {
        return basicSettings31ECPNomHz_SF;
    }

    /**
     *
     */
    public  class ID extends RegisterEnum16 {
     private ID(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getBasicSettings_121(), 0, 1, "Model", "", "Inverter Controls Basic Settings ", Rw.R, Mandatory.M);
            hashtable.put((long) 121, "SunSpec Basic Settings");
        }
    }

    /**
     *
     */
    public  class L extends RegisterUint16 {

        private L(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getBasicSettings_121(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public  class WMax extends RegisterUDouble {

    
        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public WMax(WMax_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicSettings_121(), 2, 1, "WMax", "W", "Setting for maximum power output. Default to WRtg.", Rw.RW, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class VRef extends RegisterUDouble {

       

        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public VRef(VRef_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicSettings_121(), 3, 1, "VRef", "V", "Voltage at the PCC.", Rw.RW, Mandatory.M);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class VRefOfs extends RegisterDouble {

    

        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public VRefOfs(VRefOfs_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicSettings_121(), 4, 1, "VRefOfs", "V", "Offset  from PCC to inverter.", Rw.RW, Mandatory.M);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class VMax extends RegisterUDouble {

       
        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public VMax(VMinMax_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicSettings_121(), 5, 1, "VMax", "V", "Setpoint for maximum voltage.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class VMin extends RegisterUDouble {

       

        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public VMin(VMinMax_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicSettings_121(), 6, 1, "VMin", "V", "Setpoint for minimum voltage.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class VAMax extends RegisterUDouble {

   
        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public VAMax(VAMax_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicSettings_121(), 7, 1, "VAMax", "VA", "Setpoint for maximum apparent power. Default to VARtg.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class VArMaxQ1 extends RegisterDouble {

        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public VArMaxQ1(VArMax_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicSettings_121(), 8, 1, "VArMaxQ1", "var", "Setting for maximum reactive power in quadrant 1. Default to VArRtgQ1.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class VArMaxQ2 extends RegisterDouble {

      
        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public VArMaxQ2(VArMax_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicSettings_121(), 9, 1, "VArMaxQ2", "var", "Setting for maximum reactive power in quadrant 2. Default to VArRtgQ2.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class VArMaxQ3 extends RegisterDouble {

     

        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public VArMaxQ3(VArMax_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicSettings_121(), 10, 1, "VArMaxQ3", "var", "Setting for maximum reactive power in quadrant 3. Default to VArRtgQ3.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class VArMaxQ4 extends RegisterDouble {

       

        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public VArMaxQ4(VArMax_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicSettings_121(), 11, 1, "VArMaxQ4", "var", "Setting for maximum reactive power in quadrant 4. Default to VArRtgQ4.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class WGra extends RegisterUDouble {

       
        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public WGra(WGra_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicSettings_121(), 12, 1, "WGra", "% WMax/sec", "Default ramp rate of change of active power due to command or internal action.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class PFMinQ1 extends RegisterDouble {

       

        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public PFMinQ1(PFMin_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicSettings_121(), 13, 1, "PFMinQ1", "cos()", "Setpoint for minimum power factor value in quadrant 1. Default to PFRtgQ1.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class PFMinQ2 extends RegisterDouble {

     
        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public PFMinQ2(PFMin_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicSettings_121(), 14, 1, "PFMinQ2", "cos()", "Setpoint for minimum power factor value in quadrant 2. Default to PFRtgQ2.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class PFMinQ3 extends RegisterDouble {

      
        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public PFMinQ3(PFMin_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicSettings_121(), 15, 1, "PFMinQ3", "cos()", "Setpoint for minimum power factor value in quadrant 3. Default to PFRtgQ3.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class PFMinQ4 extends RegisterDouble {

       

        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public PFMinQ4(PFMin_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicSettings_121(), 16, 1, "PFMinQ4", "cos()", "Setpoint for minimum power factor value in quadrant 4. Default to PFRtgQ4.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class VArAct extends RegisterEnum16 {


        public VArAct(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicSettings_121(), 17, 1, "VArAct", "", "VAR action on change between charging and discharging: 1=switch 2=maintain VAR characterization.", Rw.RW, Mandatory.O);
            hashtable.put((long) 1, "SWITCH");
            hashtable.put((long) 2, "MAINTAIN");
        }
    }

    /**
     *
     */
    public  class ClcTotVA extends RegisterEnum16 {

        private ClcTotVA(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getBasicSettings_121(), 18, 1, "ClcTotVA", "", "Calculation method for total apparent power. 1=vector 2=arithmetic.", Rw.RW, Mandatory.O);
            hashtable.put((long) 1, "VECTOR");
            hashtable.put((long) 2, "ARITHMETIC");
        }
    }

    /**
     *
     */
    public  class MaxRmpRte extends RegisterUDouble {

       

        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public MaxRmpRte(MaxRmpRte_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicSettings_121(), 19, 1, "MaxRmpRte", "% WGra", "Setpoint for maximum ramp rate as percentage of nominal maximum ramp rate. This setting will limit the rate that watts delivery to the grid can increase or decrease in response to intermittent PV generation.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class ECPNomHz extends RegisterDouble {

      
        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public ECPNomHz(ECPNomHz_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicSettings_121(), 20, 1, "ECPNomHz", "Hz", "Setpoint for nominal frequency at the ECP.", Rw.RW, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class ConnPh extends RegisterEnum16 {

        private ConnPh(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getBasicSettings_121(), 21, 1, "ConnPh", "", "Identity of connected phase for single phase inverters. A=1 B=2 C=3.", Rw.RW, Mandatory.O);
            hashtable.put((long) 1, "A");
            hashtable.put((long) 2, "B");
            hashtable.put((long) 3, "C");
        }
    }

    /**
     *
     */
    public  class WMax_SF extends RegisterSunssf {

        private WMax_SF(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getBasicSettings_121(), 22, 1, "WMax_SF", "", "Scale factor for real power.", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public  class VRef_SF extends RegisterSunssf {

        private VRef_SF(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getBasicSettings_121(), 23, 1, "VRef_SF", "", "Scale factor for voltage at the PCC.", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public  class VRefOfs_SF extends RegisterSunssf {

        private VRefOfs_SF(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getBasicSettings_121(), 24, 1, "VRefOfs_SF", "", "Scale factor for offset voltage.", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public  class VMinMax_SF extends RegisterSunssf {

        private VMinMax_SF(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getBasicSettings_121(), 25, 1, "VMinMax_SF", "", "Scale factor for min/max voltages.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class VAMax_SF extends RegisterSunssf {

        private VAMax_SF(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getBasicSettings_121(), 26, 1, "VAMax_SF", "", "Scale factor for apparent power.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class VArMax_SF extends RegisterSunssf {

        private VArMax_SF(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getBasicSettings_121(), 27, 1, "VArMax_SF", "", "Scale factor for reactive power.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class WGra_SF extends RegisterSunssf {

        private WGra_SF(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getBasicSettings_121(), 28, 1, "WGra_SF", "", "Scale factor for default ramp rate.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class PFMin_SF extends RegisterSunssf {

        private PFMin_SF(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getBasicSettings_121(), 29, 1, "PFMin_SF", "", "Scale factor for minimum power factor.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class MaxRmpRte_SF extends RegisterSunssf {

        private MaxRmpRte_SF(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getBasicSettings_121(), 30, 1, "MaxRmpRte_SF", "", "Scale factor for maximum ramp percentage.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class ECPNomHz_SF extends RegisterSunssf {

        private ECPNomHz_SF(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getBasicSettings_121(), 31, 1, "ECPNomHz_SF", "", "Scale factor for nominal frequency.", Rw.R, Mandatory.O);
        }
    }
}
