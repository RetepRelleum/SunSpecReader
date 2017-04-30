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

import ch.retep.relleum.modbus.datatype.RegisterAcc64;
import ch.retep.relleum.modbus.datatype.RegisterBitfield16;
import ch.retep.relleum.modbus.datatype.RegisterBitfield32;
import ch.retep.relleum.modbus.datatype.RegisterDouble;
import ch.retep.relleum.modbus.datatype.RegisterEnum16;
import ch.retep.relleum.modbus.datatype.RegisterString;
import ch.retep.relleum.modbus.datatype.RegisterSunssf;
import ch.retep.relleum.modbus.datatype.RegisterUDouble;
import ch.retep.relleum.modbus.datatype.RegisterUint16;
import ch.retep.relleum.modbus.datatype.RegisterUint32;
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
public class Table0122MeasurementsStatus extends Table {

    private ID measurementsStatus00ID;
    private L measurementsStatus01L;

    private PVConn measurementsStatus02PVConn;
    private StorConn measurementsStatus03StorConn;
    private ECPConn measurementsStatus04ECPConn;
    private ActWh measurementsStatus05ActWh;
    private ActVAh measurementsStatus09ActVAh;
    private ActVArhQ1 measurementsStatus13ActVArhQ1;
    private ActVArhQ2 measurementsStatus17ActVArhQ2;
    private ActVArhQ3 measurementsStatus21ActVArhQ3;
    private ActVArhQ4 measurementsStatus25ActVArhQ4;
    private VArAval_SF measurementsStatus30VArAval_SF;
    private VArAval measurementsStatus29VArAval;

    private WAval_SF measurementsStatus32WAval_SF;
    private WAval measurementsStatus31WAval;

    private StSetLimMsk measurementsStatus33StSetLimMsk;
    private StActCtl measurementsStatus35StActCtl;
    private TmSrc measurementsStatus37TmSrc;
    private Tms measurementsStatus41Tms;
    private RtSt measurementsStatus43RtSt;
    private Ris_SF measurementsStatus45Ris_SF;
    private Ris measurementsStatus44Ris;

    public Table0122MeasurementsStatus(TcpModbusHandler tcpModbusHandler) {
        init(tcpModbusHandler.getMeasurementsStatus_122(), 0, 46, "MeasurementsStatus", "", "MeasurementsStatus", Rw.nan, Mandatory.nan);
        measurementsStatus00ID = new ID(tcpModbusHandler);
        measurementsStatus01L = new L(tcpModbusHandler);

        measurementsStatus02PVConn = new PVConn(tcpModbusHandler);
        measurementsStatus03StorConn = new StorConn(tcpModbusHandler);
        measurementsStatus04ECPConn = new ECPConn(tcpModbusHandler);
        measurementsStatus05ActWh = new ActWh(tcpModbusHandler);
        measurementsStatus09ActVAh = new ActVAh(tcpModbusHandler);
        measurementsStatus13ActVArhQ1 = new ActVArhQ1(tcpModbusHandler);
        measurementsStatus17ActVArhQ2 = new ActVArhQ2(tcpModbusHandler);
        measurementsStatus21ActVArhQ3 = new ActVArhQ3(tcpModbusHandler);
        measurementsStatus25ActVArhQ4 = new ActVArhQ4(tcpModbusHandler);
        measurementsStatus30VArAval_SF = new VArAval_SF(tcpModbusHandler);
        measurementsStatus29VArAval = new VArAval(measurementsStatus30VArAval_SF, tcpModbusHandler);

        measurementsStatus32WAval_SF = new WAval_SF(tcpModbusHandler);
        measurementsStatus31WAval = new WAval(measurementsStatus32WAval_SF, tcpModbusHandler);

        measurementsStatus33StSetLimMsk = new StSetLimMsk(tcpModbusHandler);
        measurementsStatus35StActCtl = new StActCtl(tcpModbusHandler);
        measurementsStatus37TmSrc = new TmSrc(tcpModbusHandler);
        measurementsStatus41Tms = new Tms(tcpModbusHandler);
        measurementsStatus43RtSt = new RtSt(tcpModbusHandler);
        measurementsStatus45Ris_SF = new Ris_SF(tcpModbusHandler);
        measurementsStatus44Ris = new Ris(measurementsStatus45Ris_SF, tcpModbusHandler);

        vector.add(measurementsStatus00ID);
        vector.add(measurementsStatus01L);
        vector.add(measurementsStatus30VArAval_SF);
        vector.add(measurementsStatus32WAval_SF);
        vector.add(measurementsStatus45Ris_SF);
        vector.add(measurementsStatus02PVConn);
        vector.add(measurementsStatus03StorConn);
        vector.add(measurementsStatus04ECPConn);
        vector.add(measurementsStatus05ActWh);
        vector.add(measurementsStatus09ActVAh);
        vector.add(measurementsStatus13ActVArhQ1);
        vector.add(measurementsStatus17ActVArhQ2);
        vector.add(measurementsStatus21ActVArhQ3);
        vector.add(measurementsStatus25ActVArhQ4);
        vector.add(measurementsStatus29VArAval);

        vector.add(measurementsStatus31WAval);

        vector.add(measurementsStatus33StSetLimMsk);
        vector.add(measurementsStatus35StActCtl);
        vector.add(measurementsStatus37TmSrc);
        vector.add(measurementsStatus41Tms);
        vector.add(measurementsStatus43RtSt);
        vector.add(measurementsStatus44Ris);

    }

    /**
     * @return
     */
    public RetepEnum getID() {
        return measurementsStatus00ID;
    }

    /**
     * @return
     */
    public RetepLong getL() {
        return measurementsStatus01L;
    }

    /**
     * @return
     */
    public RetepBitMask getPVConn() {
        return measurementsStatus02PVConn;
    }

    /**
     * @return
     */
    public RetepBitMask getStorConn() {
        return measurementsStatus03StorConn;
    }

    /**
     * @return
     */
    public RetepBitMask getECPConn() {
        return measurementsStatus04ECPConn;
    }

    /**
     * @return
     */
    public RetepLong getActWh() {
        return measurementsStatus05ActWh;
    }

    /**
     * @return
     */
    public RetepLong getActVAh() {
        return measurementsStatus09ActVAh;
    }

    /**
     * @return
     */
    public RetepLong getActVArhQ1() {
        return measurementsStatus13ActVArhQ1;
    }

    /**
     * @return
     */
    public RetepLong getActVArhQ2() {
        return measurementsStatus17ActVArhQ2;
    }

    /**
     * @return
     */
    public RetepLong getActVArhQ3() {
        return measurementsStatus21ActVArhQ3;
    }

    /**
     * @return
     */
    public RetepLong getActVArhQ4() {
        return measurementsStatus25ActVArhQ4;
    }

    /**
     * @return
     */
    public RetepDouble getVArAval() {
        return measurementsStatus29VArAval;
    }

    /**
     * @return
     */
    public RetepLong getVArAval_SF() {
        return measurementsStatus30VArAval_SF;
    }

    /**
     * @return
     */
    public RetepDouble getWAval() {
        return measurementsStatus31WAval;
    }

    /**
     * @return
     */
    public RetepLong getWAval_SF() {
        return measurementsStatus32WAval_SF;
    }

    /**
     * @return
     */
    public RetepBitMask getStSetLimMsk() {
        return measurementsStatus33StSetLimMsk;
    }

    /**
     * @return
     */
    public RetepBitMask getStActCtl() {
        return measurementsStatus35StActCtl;
    }

    /**
     * @return
     */
    public RetepString getTmSrc() {
        return measurementsStatus37TmSrc;
    }

    /**
     * @return
     */
    public RetepLong getTms() {
        return measurementsStatus41Tms;
    }

    /**
     * @return
     */
    public RetepBitMask getRtSt() {
        return measurementsStatus43RtSt;
    }

    /**
     * @return
     */
    public RetepDouble getRis() {
        return measurementsStatus44Ris;
    }

    /**
     * @return
     */
    public RetepLong getRis_SF() {
        return measurementsStatus45Ris_SF;
    }

    /**
     *
     */
    public class ID extends RegisterEnum16 {

        public ID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 0, 1, "Model", "", "Inverter Controls Extended Measurements and Status ", Rw.R, Mandatory.M);
            hashtable.put((long) 122, "SunSpec Measurements Status");
        }
    }

    /**
     *
     */
    public class L extends RegisterUint16 {

        public L(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class PVConn extends RegisterBitfield16 {

        public PVConn(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 2, 1, "PVConn", "", "PV inverter present/available status. Enumerated value.", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "CONNECTED");
            hashtable.put((long) 1, "AVAILABLE");
            hashtable.put((long) 2, "OPERATING");
            hashtable.put((long) 3, "TEST");
        }
    }

    /**
     *
     */
    public class StorConn extends RegisterBitfield16 {

        public StorConn(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 3, 1, "StorConn", "", "Storage inverter present/available status. Enumerated value.", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "CONNECTED");
            hashtable.put((long) 1, "AVAILABLE");
            hashtable.put((long) 2, "OPERATING");
            hashtable.put((long) 3, "TEST");
        }
    }

    /**
     *
     */
    public class ECPConn extends RegisterBitfield16 {

        public ECPConn(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 4, 1, "ECPConn", "", "ECP connection status: disconnected=0  connected=1.", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "CONNECTED");
        }
    }

    /**
     *
     */
    public class ActWh extends RegisterAcc64 {

        public ActWh(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 5, 4, "ActWh", "Wh", "AC lifetime active (real) energy output.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class ActVAh extends RegisterAcc64 {

        public ActVAh(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 9, 4, "ActVAh", "VAh", "AC lifetime apparent energy output.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class ActVArhQ1 extends RegisterAcc64 {

        public ActVArhQ1(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 13, 4, "ActVArhQ1", "varh", "AC lifetime reactive energy output in quadrant 1.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class ActVArhQ2 extends RegisterAcc64 {

        public ActVArhQ2(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 17, 4, "ActVArhQ2", "varh", "AC lifetime reactive energy output in quadrant 2.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class ActVArhQ3 extends RegisterAcc64 {

        public ActVArhQ3(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 21, 4, "ActVArhQ3", "varh", "AC lifetime negative energy output  in quadrant 3.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class ActVArhQ4 extends RegisterAcc64 {

        public ActVArhQ4(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 25, 4, "ActVArhQ4", "varh", "AC lifetime reactive energy output  in quadrant 4.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class VArAval extends RegisterDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public VArAval(VArAval_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 29, 1, "VArAval", "var", "Amount of VARs available without impacting watts output.", Rw.R, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class VArAval_SF extends RegisterSunssf {

        public VArAval_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 30, 1, "VArAval_SF", "", "Scale factor for available VARs.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class WAval extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public WAval(WAval_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 31, 1, "WAval", "var", "Amount of Watts available.", Rw.R, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class WAval_SF extends RegisterSunssf {

        public WAval_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 32, 1, "WAval_SF", "", "Scale factor for available Watts.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class StSetLimMsk extends RegisterBitfield32 {

        public StSetLimMsk(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 33, 2, "StSetLimMsk", "", "Bit Mask indicating setpoint limit(s) reached.", Rw.R, Mandatory.O);
            hashtable.put((long) 0, "WMax");
            hashtable.put((long) 1, "VAMax");
            hashtable.put((long) 2, "VArAval");
            hashtable.put((long) 3, "VArMaxQ1");
            hashtable.put((long) 4, "VArMaxQ2");
            hashtable.put((long) 5, "VArMaxQ3");
            hashtable.put((long) 6, "VArMaxQ4");
            hashtable.put((long) 7, "PFMinQ1");
            hashtable.put((long) 8, "PFMinQ2");
            hashtable.put((long) 9, "PFMinQ3");
            hashtable.put((long) 10, "PFMinQ4");
        }
    }

    /**
     *
     */
    public class StActCtl extends RegisterBitfield32 {

        public StActCtl(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 35, 2, "StActCtl", "", "Bit Mask indicating which inverter controls are currently active.", Rw.R, Mandatory.O);
            hashtable.put((long) 0, "FixedW");
            hashtable.put((long) 1, "FixedVAR");
            hashtable.put((long) 2, "FixedPF");
            hashtable.put((long) 3, "Volt-VAr");
            hashtable.put((long) 4, "Freq-Watt-Param");
            hashtable.put((long) 5, "Freq-Watt-Curve");
            hashtable.put((long) 6, "Dyn-Reactive-Current");
            hashtable.put((long) 7, "LVRT");
            hashtable.put((long) 8, "HVRT");
            hashtable.put((long) 9, "Watt-PF");
            hashtable.put((long) 10, "Volt-Watt");
            hashtable.put((long) 12, "Scheduled");
            hashtable.put((long) 13, "LFRT");
            hashtable.put((long) 14, "HFRT");
        }
    }

    /**
     *
     */
    public class TmSrc extends RegisterString {

        public TmSrc(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 37, 4, "TmSrc", "", "Source of time synchronization.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class Tms extends RegisterUint32 {

        public Tms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 41, 2, "Tms", "Secs", "Seconds since 01-01-2000 00:00 UTC", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class RtSt extends RegisterBitfield16 {

        public RtSt(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 43, 1, "RtSt", "", "Bit Mask indicating active ride-through status.", Rw.R, Mandatory.O);
            hashtable.put((long) 0, "LVRT_ACTIVE");
            hashtable.put((long) 1, "HVRT_ACTIVE");
            hashtable.put((long) 2, "LFRT_ACTIVE");
            hashtable.put((long) 3, "HFRT_ACTIVE");
        }
    }

    /**
     *
     */
    public class Ris extends RegisterUDouble {


        /**
         * @param aScalFactor
         * @param tcpModbusHandler
         */
        public Ris(Ris_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getMeasurementsStatus_122(), 44, 1, "Ris", "ohms", "Isolation resistance.", Rw.R, Mandatory.O);

            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class Ris_SF extends RegisterSunssf {

        public Ris_SF(TcpModbusHandler tcpModbusHandler) {
            {
                init(tcpModbusHandler.getMeasurementsStatus_122(), 45, 1, "Ris_SF", "", "Scale factor for isolation resistance.", Rw.R, Mandatory.O);
            }
        }
    }
}
