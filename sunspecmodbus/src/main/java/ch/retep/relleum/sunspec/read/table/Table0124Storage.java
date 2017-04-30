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
public class Table0124Storage extends Table {

    private  ID storageID;
    private  L storageL;
    private  WChaMax_SF storage16WChaMax_SF;
    private  WChaDisChaGra_SF storage17WChaDisChaGra_SF ;
    private  VAChaMax_SF storage18VAChaMax_SF ;
    private  MinRsvPct_SF storage19MinRsvPct_SF ;
    private  ChaState_SF storage20ChaState_SF ;
    private  StorAval_SF storage21StorAval_SF ;
    private  InBatV_SF storage22InBatV_SF ;
    private  InOutWRte_SF storage23InOutWRte_SF ;

    private  WChaMax storage0WChaMax ;
    private  WChaGra storage1WChaGra ;
    private  WDisChaGra storage2WDisChaGra ;
    private  StorCtl_Mod storage3StorCtl_Mod ;
    private  VAChaMax storage4VAChaMax ;
    private  MinRsvPct storage5MinRsvPct ;
    private  ChaState storage6ChaState;
    private  StorAval storage7StorAval ;
    private  InBatV storage8InBatV ;
    private  ChaSt storage9ChaSt ;
    private  OutWRte storage10OutWRte ;
    private  InWRte storage11InWRte ;
    private  InOutWRte_WinTms storage12InOutWRte_WinTms;
    private  InOutWRte_RvrtTms storage13InOutWRte_RvrtTms;
    private  InOutWRte_RmpTms storage14InOutWRte_RmpTms;
    private  ChaGriSet storage15ChaGriSet ;

    public Table0124Storage(TcpModbusHandler tcpModbusHandler) {
        init(tcpModbusHandler.getStorage_124(), 0, 26, "Storage Model", "", "Storage Model", Rw.R, Mandatory.M);

        storageID = new ID(tcpModbusHandler);
        storageL = new L(tcpModbusHandler);
         storage16WChaMax_SF = new WChaMax_SF(tcpModbusHandler);
         storage17WChaDisChaGra_SF = new WChaDisChaGra_SF(tcpModbusHandler);
         storage18VAChaMax_SF = new VAChaMax_SF(tcpModbusHandler);
        storage19MinRsvPct_SF = new MinRsvPct_SF(tcpModbusHandler);
        storage20ChaState_SF = new ChaState_SF(tcpModbusHandler);
        storage21StorAval_SF = new StorAval_SF(tcpModbusHandler);
         storage22InBatV_SF = new InBatV_SF(tcpModbusHandler);
        storage23InOutWRte_SF = new InOutWRte_SF(tcpModbusHandler);

         storage0WChaMax = new WChaMax(storage16WChaMax_SF,tcpModbusHandler);
        storage1WChaGra = new WChaGra(storage17WChaDisChaGra_SF,tcpModbusHandler);
       storage2WDisChaGra = new WDisChaGra(storage17WChaDisChaGra_SF,tcpModbusHandler);
        storage3StorCtl_Mod = new StorCtl_Mod(tcpModbusHandler);
        storage4VAChaMax = new VAChaMax(storage18VAChaMax_SF,tcpModbusHandler);
       storage5MinRsvPct = new MinRsvPct(storage19MinRsvPct_SF,tcpModbusHandler);
       storage6ChaState = new ChaState(storage20ChaState_SF,tcpModbusHandler);
        storage7StorAval = new StorAval(storage21StorAval_SF,tcpModbusHandler);
       storage8InBatV = new InBatV(storage22InBatV_SF,tcpModbusHandler);
       storage9ChaSt = new ChaSt(tcpModbusHandler);
        storage10OutWRte = new OutWRte(storage23InOutWRte_SF,tcpModbusHandler);
        storage11InWRte = new InWRte(storage23InOutWRte_SF,tcpModbusHandler);
       storage12InOutWRte_WinTms = new InOutWRte_WinTms(tcpModbusHandler);
        storage13InOutWRte_RvrtTms = new InOutWRte_RvrtTms(tcpModbusHandler);
        storage14InOutWRte_RmpTms = new InOutWRte_RmpTms(tcpModbusHandler);
       storage15ChaGriSet = new ChaGriSet(tcpModbusHandler);
        vector.add(storageID);
        vector.add(storageL);
        vector.add(storage16WChaMax_SF);
        vector.add(storage17WChaDisChaGra_SF);
        vector.add(storage18VAChaMax_SF);
        vector.add(storage19MinRsvPct_SF);
        vector.add(storage20ChaState_SF);
        vector.add(storage21StorAval_SF);
        vector.add(storage22InBatV_SF);
        vector.add(storage23InOutWRte_SF);
        vector.add(storage0WChaMax);
        vector.add(storage1WChaGra);
        vector.add(storage2WDisChaGra);
        vector.add(storage3StorCtl_Mod);
        vector.add(storage4VAChaMax);
        vector.add(storage5MinRsvPct);
        vector.add(storage6ChaState);
        vector.add(storage7StorAval);
        vector.add(storage8InBatV);
        vector.add(storage9ChaSt);
        vector.add(storage10OutWRte);
        vector.add(storage11InWRte);
        vector.add(storage12InOutWRte_WinTms);
        vector.add(storage13InOutWRte_RvrtTms);
        vector.add(storage14InOutWRte_RmpTms);
        vector.add(storage15ChaGriSet);

    }

    /**
     * @return
     */
    public RetepEnum getID() {
        return storageID;
    }

    /**
     * @return
     */
    public RetepLong getL() {
        return storageL;
    }

    /**
     * @return
     */
    public RetepDouble getWChaMax() {
        return storage0WChaMax;
    }

    /**
     * @return
     */
    public RetepDouble getWChaGra() {
        return storage1WChaGra;
    }

    /**
     * @return
     */
    public RetepDouble getWDisChaGra() {
        return storage2WDisChaGra;
    }

    /**
     * @return
     */
    public RetepBitMask getStorCtl_Mod() {
        return storage3StorCtl_Mod;
    }

    /**
     * @return
     */
    public RetepDouble getVAChaMax() {
        return storage4VAChaMax;
    }

    /**
     * @return
     */
    public RetepDouble getMinRsvPct() {
        return storage5MinRsvPct;
    }

    /**
     * @return
     */
    public RetepDouble getChaState() {
        return storage6ChaState;
    }

    /**
     * @return
     */
    public RetepDouble getStorAval() {
        return storage7StorAval;
    }

    /**
     * @return
     */
    public RetepDouble getInBatV() {
        return storage8InBatV;
    }

    /**
     * @return
     */
    public RetepEnum getChaSt() {
        return storage9ChaSt;
    }

    /**
     * @return
     */
    public RetepDouble getOutWRte() {
        return storage10OutWRte;
    }

    /**
     * @return
     */
    public RetepDouble getInWRte() {
        return storage11InWRte;
    }

    /**
     * @return
     */
    public RetepLong getInOutWRte_WinTms() {
        return storage12InOutWRte_WinTms;
    }

    /**
     * @return
     */
    public RetepLong getInOutWRte_RvrtTms() {
        return storage13InOutWRte_RvrtTms;
    }

    /**
     * @return
     */
    public RetepLong getInOutWRte_RmpTms() {
        return storage14InOutWRte_RmpTms;
    }

    /**
     * @return
     */
    public RetepEnum getChaGriSet() {
        return storage15ChaGriSet;
    }

    /**
     * @return
     */
    public RetepLong getWChaMax_SF() {
        return storage16WChaMax_SF;
    }

    /**
     * @return
     */
    public RetepLong getWChaDisChaGra_SF() {
        return storage17WChaDisChaGra_SF;
    }

    /**
     * @return
     */
    public RetepLong getVAChaMax_SF() {
        return storage18VAChaMax_SF;
    }

    /**
     * @return
     */
    public RetepLong getMinRsvPct_SF() {
        return storage19MinRsvPct_SF;
    }

    /**
     * @return
     */
    public RetepLong getChaState_SF() {
        return storage20ChaState_SF;
    }

    /**
     * @return
     */
    public RetepLong getStorAval_SF() {
        return storage21StorAval_SF;
    }

    /**
     * @return
     */
    public RetepLong getInBatV_SF() {
        return storage22InBatV_SF;
    }

    /**
     * @return
     */
    public RetepLong getInOutWRte_SF() {
        return storage23InOutWRte_SF;
    }

    /**
     *
     */
    public  class ID extends RegisterEnum16 {
     public ID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 0, 1, "Model", "", "Basic Storage Controls ", Rw.R, Mandatory.M);
            hashtable.put((long) 124, "SunSpec Storage Controls");
        }
    }

    /**
     *
     */

    public  class L extends RegisterUint16 {

        public L(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }


    }

    /**
     *
     */
    public  class WChaMax extends RegisterUDouble {


        public WChaMax(WChaMax_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 2, 1, "WChaMax", "W", "Setpoint for maximum charge.", Rw.RW, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class WChaGra extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public WChaGra(WChaDisChaGra_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 3, 1, "WChaGra", "% WChaMax/sec", "Setpoint for maximum charging rate. Default is MaxChaRte.", Rw.RW, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class WDisChaGra extends RegisterUDouble {



        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public WDisChaGra(WChaDisChaGra_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 4, 1, "WDisChaGra", "% WChaMax/sec", "Setpoint for maximum discharge rate. Default is MaxDisChaRte.", Rw.RW, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class StorCtl_Mod extends RegisterBitfield16 {



        public StorCtl_Mod(TcpModbusHandler tcpModbusHandler) {
            hashtable.put((long) 0, "CHARGE");
            hashtable.put((long) 1, "DiSCHARGE");
            init(tcpModbusHandler.getStorage_124(), 5, 1, "StorCtl_Mod", "", "Activate hold/discharge/charge storage control mode. Bitfield value.", Rw.RW, Mandatory.M);

        }
    }

    /**
     *
     */
    public  class VAChaMax extends RegisterUDouble {



        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public VAChaMax(VAChaMax_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 6, 1, "VAChaMax", "VA", "Setpoint for maximum charging VA.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class MinRsvPct extends RegisterUDouble {

        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public MinRsvPct(MinRsvPct_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 7, 1, "MinRsvPct", "% WChaMax", "Setpoint for minimum reserve for storage as a percentage of the nominal maximum storage.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class ChaState extends RegisterUDouble {



        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public ChaState(ChaState_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 8, 1, "ChaState", "% AhrRtg", "Currently available energy as a percent of the capacity rating.", Rw.R, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class StorAval extends RegisterUDouble {



        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public StorAval(StorAval_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 9, 1, "StorAval", "AH", "State of charge (ChaState) minus storage reserve (MinRsvPct) times capacity rating (AhrRtg).", Rw.R, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class InBatV extends RegisterUDouble {



        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public InBatV(InBatV_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 10, 1, "InBatV", "V", "Internal battery voltage.", Rw.R, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class ChaSt extends RegisterEnum16 {



        public ChaSt(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 11, 1, "ChaSt", "", "Charge status of storage device. Enumerated value.", Rw.R, Mandatory.O);
            hashtable.put((long) 1, "OFF");
            hashtable.put((long) 2, "EMPTY");
            hashtable.put((long) 3, "DISCHARGING");
            hashtable.put((long) 4, "CHARGING");
            hashtable.put((long) 5, "FULL");
            hashtable.put((long) 6, "HOLDING");
            hashtable.put((long) 7, "TESTING");
        }
    }

    /**
     *
     */
    public  class OutWRte extends RegisterDouble {



        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public OutWRte(InOutWRte_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 12, 1, "OutWRte", "% WDisChaMax", "Percent of max discharge rate.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class InWRte extends RegisterDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public InWRte(InOutWRte_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 13, 1, "InWRte", "% WChaMax", "Percent of max charging rate.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public  class InOutWRte_WinTms extends RegisterUint16 {

        public InOutWRte_WinTms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 14, 1, "InOutWRte_WinTms", "Secs", "Time window for charge/discharge rate change.", Rw.RW, Mandatory.O);
        }


    }

    /**
     *
     */
    public  class InOutWRte_RvrtTms extends RegisterUint16 {

        public InOutWRte_RvrtTms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 15, 1, "InOutWRte_RvrtTms", "Secs", "Timeout period for charge/discharge rate.", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class InOutWRte_RmpTms extends RegisterUint16 {

        public InOutWRte_RmpTms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 16, 1, "InOutWRte_RmpTms", "Secs", "Ramp time for moving from current setpoint to new setpoint.", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class ChaGriSet extends RegisterEnum16 {

        public ChaGriSet(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 17, 1, "ChaGriSet", "", "ChaGriSet", Rw.RW, Mandatory.O);
            hashtable.put((long) 0, "PV");
            hashtable.put((long) 1, "GRID");
        }
    }

    /**
     *
     */
    public  class WChaMax_SF extends RegisterSunssf {

        public WChaMax_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 18, 1, "WChaMax_SF", "", "Scale factor for maximum charge.", Rw.R, Mandatory.M);
        }



    }

    /**
     *
     */
    public  class WChaDisChaGra_SF extends RegisterSunssf {

        public WChaDisChaGra_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 19, 1, "WChaDisChaGra_SF", "", "Scale factor for maximum charge and discharge rate.", Rw.R, Mandatory.M);
        }



    }

    /**
     *
     */
    public  class VAChaMax_SF extends RegisterSunssf {

        public VAChaMax_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 20, 1, "VAChaMax_SF", "", "Scale factor for maximum charging VA.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class MinRsvPct_SF extends RegisterSunssf {

        public MinRsvPct_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 21, 1, "MinRsvPct_SF", "", "Scale factor for minimum reserve percentage.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class ChaState_SF extends RegisterSunssf {

        public ChaState_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 22, 1, "ChaState_SF", "", "Scale factor for available energy percent.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class StorAval_SF extends RegisterSunssf {

        public StorAval_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 23, 1, "StorAval_SF", "", "Scale factor for state of charge.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class InBatV_SF extends RegisterSunssf {

        public InBatV_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 24, 1, "InBatV_SF", "", "Scale factor for battery voltage.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class InOutWRte_SF extends RegisterSunssf {

        public InOutWRte_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getStorage_124(), 25, 1, "InOutWRte_SF", "", "Scale factor for percent charge/discharge rate.", Rw.R, Mandatory.O);
        }
    }

}
