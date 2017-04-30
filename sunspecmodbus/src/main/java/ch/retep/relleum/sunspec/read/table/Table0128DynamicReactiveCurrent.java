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
public class Table0128DynamicReactiveCurrent extends Table {

    private ID dynamicReactiveCurrent00ID;
    private L dynamicReactiveCurrent01L;
    private ArGra_SF dynamicReactiveCurrent13ArGra_SF;
    private VRefPct_SF dynamicReactiveCurrent14VRefPct_SF;
    private ArGraMod dynamicReactiveCurrent02ArGraMod;
    private ArGraSag dynamicReactiveCurrent03ArGraSag;
    private ArGraSwell dynamicReactiveCurrent04ArGraSwell;
    private ModEna dynamicReactiveCurrent05ModEna;
    private FilTms dynamicReactiveCurrent06FilTms;
    private DbVMin dynamicReactiveCurrent07DbVMin;
    private DbVMax dynamicReactiveCurrent08DbVMax;
    private BlkZnV dynamicReactiveCurrent09BlkZnV;
    private HysBlkZnV dynamicReactiveCurrent10HysBlkZnV;
    private BlkZnTmms dynamicReactiveCurrent11BlkZnTmms;
    private HoldTmms dynamicReactiveCurrent12HoldTmms;
    private Pad dynamicReactiveCurrent15Pad;

    public Table0128DynamicReactiveCurrent(TcpModbusHandler tcpModbusHandler) {
        init(tcpModbusHandler.getDynamicReactiveCurrent_128(), 0, 16, "Dynamic Reactive Current", "", "Dynamic Reactive Current", Rw.R, Mandatory.M);


        dynamicReactiveCurrent00ID = new ID(tcpModbusHandler);
        dynamicReactiveCurrent01L = new L(tcpModbusHandler);
        dynamicReactiveCurrent13ArGra_SF = new ArGra_SF(tcpModbusHandler);
        dynamicReactiveCurrent14VRefPct_SF = new VRefPct_SF(tcpModbusHandler);
        dynamicReactiveCurrent02ArGraMod = new ArGraMod(tcpModbusHandler);
        dynamicReactiveCurrent03ArGraSag = new ArGraSag(dynamicReactiveCurrent13ArGra_SF, tcpModbusHandler);
        dynamicReactiveCurrent04ArGraSwell = new ArGraSwell(dynamicReactiveCurrent13ArGra_SF, tcpModbusHandler);
        dynamicReactiveCurrent05ModEna = new ModEna(tcpModbusHandler);
        dynamicReactiveCurrent06FilTms = new FilTms(tcpModbusHandler);
        dynamicReactiveCurrent07DbVMin = new DbVMin(dynamicReactiveCurrent14VRefPct_SF, tcpModbusHandler);
        dynamicReactiveCurrent08DbVMax = new DbVMax(dynamicReactiveCurrent14VRefPct_SF, tcpModbusHandler);
        dynamicReactiveCurrent09BlkZnV = new BlkZnV(dynamicReactiveCurrent14VRefPct_SF, tcpModbusHandler);
        dynamicReactiveCurrent10HysBlkZnV = new HysBlkZnV(dynamicReactiveCurrent14VRefPct_SF, tcpModbusHandler);
        dynamicReactiveCurrent11BlkZnTmms = new BlkZnTmms(tcpModbusHandler);
        dynamicReactiveCurrent12HoldTmms = new HoldTmms(tcpModbusHandler);
        dynamicReactiveCurrent15Pad = new Pad(tcpModbusHandler);

        vector.add(dynamicReactiveCurrent00ID);
        vector.add(dynamicReactiveCurrent01L);
        vector.add(dynamicReactiveCurrent13ArGra_SF);
        vector.add(dynamicReactiveCurrent14VRefPct_SF);
        vector.add(dynamicReactiveCurrent02ArGraMod);
        vector.add(dynamicReactiveCurrent03ArGraSag);
        vector.add(dynamicReactiveCurrent04ArGraSwell);
        vector.add(dynamicReactiveCurrent05ModEna);
        vector.add(dynamicReactiveCurrent06FilTms);
        vector.add(dynamicReactiveCurrent07DbVMin);
        vector.add(dynamicReactiveCurrent08DbVMax);
        vector.add(dynamicReactiveCurrent09BlkZnV);
        vector.add(dynamicReactiveCurrent10HysBlkZnV);
        vector.add(dynamicReactiveCurrent11BlkZnTmms);
        vector.add(dynamicReactiveCurrent12HoldTmms);
        vector.add(dynamicReactiveCurrent15Pad);

    }

    /**
     * @return
     */
    public RetepEnum getID() {
        return dynamicReactiveCurrent00ID;
    }

    /**
     * @return
     */
    public RetepLong getL() {
        return dynamicReactiveCurrent01L;
    }

    /**
     * @return
     */
    public RetepEnum getArGraMod() {
        return dynamicReactiveCurrent02ArGraMod;
    }

    /**
     * @return
     */
    public RetepDouble getArGraSag() {
        return dynamicReactiveCurrent03ArGraSag;
    }

    /**
     * @return
     */
    public RetepDouble getArGraSwell() {
        return dynamicReactiveCurrent04ArGraSwell;
    }

    /**
     * @return
     */
    public RetepBitMask getModEna() {
        return dynamicReactiveCurrent05ModEna;
    }

    /**
     * @return
     */
    public RetepLong getFilTms() {
        return dynamicReactiveCurrent06FilTms;
    }

    /**
     * @return
     */
    public RetepDouble getDbVMin() {
        return dynamicReactiveCurrent07DbVMin;
    }

    /**
     * @return
     */
    public RetepDouble getDbVMax() {
        return dynamicReactiveCurrent08DbVMax;
    }

    /**
     * @return
     */
    public RetepDouble getBlkZnV() {
        return dynamicReactiveCurrent09BlkZnV;
    }

    /**
     * @return
     */
    public RetepDouble getHysBlkZnV() {
        return dynamicReactiveCurrent10HysBlkZnV;
    }

    /**
     * @return
     */
    public RetepLong getBlkZnTmms() {
        return dynamicReactiveCurrent11BlkZnTmms;
    }

    /**
     * @return
     */
    public RetepLong getHoldTmms() {
        return dynamicReactiveCurrent12HoldTmms;
    }

    /**
     * @return
     */
    public RetepLong getArGra_SF() {
        return dynamicReactiveCurrent13ArGra_SF;
    }

    /**
     * @return
     */
    public RetepLong geVRefPct_SF() {
        return dynamicReactiveCurrent14VRefPct_SF;
    }

    /**
     * @return
     */
    public RetepLong getPad() {
        return dynamicReactiveCurrent15Pad;
    }

    /**
     *
     */
    public class ID extends RegisterEnum16 {
        private ID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getDynamicReactiveCurrent_128(), 0, 1, "Model", "", "Dynamic Reactive Current ", Rw.R, Mandatory.M);
            hashtable.put((long) 128, "SunSpec Dynamic Reactive Current");
        }
    }

    /**
     *
     */
    public class L extends RegisterUint16 {
        private L(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getDynamicReactiveCurrent_128(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class ArGraMod extends RegisterEnum16 {
        private ArGraMod(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getDynamicReactiveCurrent_128(), 2, 1, "ArGraMod", "", "Indicates if gradients trend toward zero at the edges of the deadband or trend toward zero at the center of the deadband.", Rw.RW, Mandatory.M);
            hashtable.put((long) 0, "EDGE");
            hashtable.put((long) 1, "CENTER");
        }
    }

    /**
     *
     */
    public class ArGraSag extends RegisterUDouble {


        /**
         * @param aScalFactor
         */
        public ArGraSag(ArGra_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getDynamicReactiveCurrent_128(), 3, 1, "ArGraSag", "%ARtg/%dV", "The gradient used to increase capacitive dynamic current. A value of 0 indicates no additional reactive current support.", Rw.RW, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class ArGraSwell extends RegisterUDouble {


        /**
         * @param aScalFactor
         */
        public ArGraSwell(ArGra_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getDynamicReactiveCurrent_128(), 4, 1, "ArGraSwell", "%ARtg/%dV", "The gradient used to increase inductive dynamic current.  A value of 0 indicates no additional reactive current support.", Rw.RW, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class ModEna extends RegisterBitfield16 {
        private ModEna(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getDynamicReactiveCurrent_128(), 5, 1, "ModEna", "", "Activate dynamic reactive current model", Rw.RW, Mandatory.M);
            hashtable.put((long) 0, "ENABLED");

        }
    }

    /**
     *
     */
    public class FilTms extends RegisterUint16 {
        private FilTms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getDynamicReactiveCurrent_128(), 6, 1, "FilTms", "Secs", "The time window used to calculate the moving average voltage.", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class DbVMin extends RegisterUDouble {


        /**
         * @param aScalFactor
         */
        public DbVMin(VRefPct_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getDynamicReactiveCurrent_128(), 7, 1, "DbVMin", "% VRef", "The lower delta voltage limit for which negative voltage deviations less than this value no dynamic vars are produced.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class DbVMax extends RegisterUDouble {


        /**
         * @param aScalFactor
         */
        public DbVMax(VRefPct_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getDynamicReactiveCurrent_128(), 8, 1, "DbVMax", "% VRef", "The upper delta voltage limit for which positive voltage deviations less than this value no dynamic current produced.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class BlkZnV extends RegisterUDouble {


        /**
         * @param aScalFactor
         */
        public BlkZnV(VRefPct_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getDynamicReactiveCurrent_128(), 9, 1, "BlkZnV", "% VRef", "Block zone voltage which defines a lower voltage boundary below which no dynamic current is produced.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class HysBlkZnV extends RegisterUDouble {


        /**
         * @param aScalFactor
         */
        public HysBlkZnV(VRefPct_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getDynamicReactiveCurrent_128(), 10, 1, "HysBlkZnV", "% VRef", "Hysteresis voltage used with BlkZnV.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class BlkZnTmms extends RegisterUint16 {
        private BlkZnTmms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getDynamicReactiveCurrent_128(), 11, 1, "BlkZnTmms", "mSecs", "Block zone time the time before which reactive current support remains active regardless of how low the voltage drops.", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class HoldTmms extends RegisterUint16 {
        private HoldTmms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getDynamicReactiveCurrent_128(), 12, 1, "HoldTmms", "mSecs", "Hold time during which reactive current support continues after the average voltage has entered the dead zone.", Rw.RW, Mandatory.O);
        }
    }

    /**
     *
     */
    public class ArGra_SF extends RegisterSunssf {
        private ArGra_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getDynamicReactiveCurrent_128(), 13, 1, "ArGra_SF", "", "Scale factor for the gradients.", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class VRefPct_SF extends RegisterSunssf {
        private VRefPct_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getDynamicReactiveCurrent_128(), 14, 1, "VRefPct_SF", "", "Scale factor for the voltage zone and limit settings.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class Pad extends RegisterPad {
        private Pad(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getDynamicReactiveCurrent_128(), 15, 1, "Pad", "", "Pad", Rw.R, Mandatory.O);
        }
    }

}
