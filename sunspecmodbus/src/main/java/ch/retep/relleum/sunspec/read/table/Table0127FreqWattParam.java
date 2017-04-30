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
public class Table0127FreqWattParam extends Table {

    private ID freqWattParamID;
    private L freqWattParamL;
    private WGra_SF freqWattParam6WGra_SF;
    private HzStrStop_SF freqWattParam7HzStrStop_SF;
    private RmpIncDec_SF freqWattParam8RmpIncDec_SF;

    private WGra freqWattParam0WGra;
    private HzStr freqWattParam1HzStr;
    private HzStop freqWattParam2HzStop;
    private HysEna freqWattParam3HysEna;
    private ModEna freqWattParam4ModEna;
    private HzStopWGra freqWattParam5HzStopWGra;
    private Pad freqWattParam9Pad;

    public Table0127FreqWattParam(TcpModbusHandler tcpModbusHandler) {
        init(tcpModbusHandler.getFreqWattParam_127(), 0, 12, "Freq Watt Param", "", "Freq Watt Param", Rw.R, Mandatory.M);
        freqWattParamID = new ID(tcpModbusHandler);
        freqWattParamL = new L(tcpModbusHandler);
        freqWattParam6WGra_SF = new WGra_SF(tcpModbusHandler);
        freqWattParam7HzStrStop_SF = new HzStrStop_SF(tcpModbusHandler);
        freqWattParam8RmpIncDec_SF = new RmpIncDec_SF(tcpModbusHandler);

        freqWattParam0WGra = new WGra(freqWattParam6WGra_SF, tcpModbusHandler);
        freqWattParam1HzStr = new HzStr(freqWattParam7HzStrStop_SF, tcpModbusHandler);
        freqWattParam2HzStop = new HzStop(freqWattParam7HzStrStop_SF, tcpModbusHandler);
        freqWattParam3HysEna = new HysEna( tcpModbusHandler);
        freqWattParam4ModEna = new ModEna( tcpModbusHandler);
        freqWattParam5HzStopWGra = new HzStopWGra(freqWattParam8RmpIncDec_SF, tcpModbusHandler);
        freqWattParam9Pad = new Pad(tcpModbusHandler);


        vector.add(freqWattParamID);
        vector.add(freqWattParamL);
        vector.add(freqWattParam6WGra_SF);
        vector.add(freqWattParam7HzStrStop_SF);
        vector.add(freqWattParam8RmpIncDec_SF);
        vector.add(freqWattParam0WGra);
        vector.add(freqWattParam1HzStr);
        vector.add(freqWattParam2HzStop);
        vector.add(freqWattParam3HysEna);
        vector.add(freqWattParam4ModEna);
        vector.add(freqWattParam5HzStopWGra);

        vector.add(freqWattParam9Pad);
    }

    /**
     * @return
     */
    public RetepEnum getID() {
        return freqWattParamID;
    }

    /**
     * @return
     */
    public RetepLong getL() {
        return freqWattParamL;
    }

    /**
     * @return
     */
    public RetepDouble getWGra() {
        return freqWattParam0WGra;
    }

    /**
     * @return
     */
    public RetepDouble getHzStr() {
        return freqWattParam1HzStr;
    }

    /**
     * @return
     */
    public RetepDouble getHzStop() {
        return freqWattParam2HzStop;
    }

    /**
     * @return
     */
    public RetepBitMask getHysEna() {
        return freqWattParam3HysEna;
    }

    /**
     * @return
     */
    public RetepBitMask getModEna() {
        return freqWattParam4ModEna;
    }

    /**
     * @return
     */
    public RetepDouble getHzStopWGra() {
        return freqWattParam5HzStopWGra;
    }

    /**
     * @return
     */
    public RetepLong getWGra_SF() {
        return freqWattParam6WGra_SF;
    }

    /**
     * @return
     */
    public RetepLong getHzStrStop_SF() {
        return freqWattParam7HzStrStop_SF;
    }

    /**
     * @return
     */
    public RetepLong getRmpIncDec_SF() {
        return freqWattParam8RmpIncDec_SF;
    }

    /**
     * @return
     */
    public RetepLong getPad() {
        return freqWattParam9Pad;
    }

    /**
     *
     */
    public class ID extends RegisterEnum16 {
        public ID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getFreqWattParam_127(), 0, 1, "Model", "", "Parameterized Frequency-Watt ", Rw.R, Mandatory.M);
            hashtable.put((long) 127, "SunSpec Freq-Watt Param");
        }
    }

    /**
     *
     */
    public class L extends RegisterUint16 {
        public L(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getFreqWattParam_127(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public class WGra extends RegisterUDouble {


        /**
         * @param aScalFactor
         */
        public WGra(WGra_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getFreqWattParam_127(), 2, 1, "WGra", "% PM/Hz", "The slope of the reduction in the maximum allowed watts output as a function of frequency.", Rw.RW, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class HzStr extends RegisterDouble {


        /**
         * @param aScalFactor
         */
        public HzStr(HzStrStop_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getFreqWattParam_127(), 3, 1, "HzStr", "Hz", "The frequency deviation from nominal frequency (ECPNomHz) at which a snapshot of the instantaneous power output is taken to act as the CAPPED power level (PM) and above which reduction in power output occurs.", Rw.RW, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class HzStop extends RegisterUDouble {


        /**
         * @param aScalFactor
         */
        public HzStop(HzStrStop_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getFreqWattParam_127(), 4, 1, "HzStop", "Hz", "The frequency deviation from nominal frequency (ECPNomHz) at which curtailed power output may return to normal and the cap on the power level value is removed.", Rw.RW, Mandatory.M);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class HysEna extends RegisterBitfield16 {
        public HysEna(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getFreqWattParam_127(), 5, 1, "HysEna", "", "Enable hysterisis", Rw.RW, Mandatory.M);
            hashtable.put((long) 0, "ENABLED");
        }
    }

    /**
     *
     */
    public class ModEna extends RegisterBitfield16 {
        public ModEna(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getFreqWattParam_127(), 6, 1, "ModEna", "", "Is Parameterized Frequency-Watt control active.", Rw.RW, Mandatory.M);
            hashtable.put((long) 0, "ENABLED");
        }
    }

    /**
     *
     */
    public class HzStopWGra extends RegisterDouble {



        /**
         * @param aScalFactor
         */
        public HzStopWGra(RmpIncDec_SF aScalFactor, TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getFreqWattParam_127(), 7, 1, "HzStopWGra", "% WMax/min", "The maximum time-based rate of change at which power output returns to normal after having been capped by an over frequency event.", Rw.RW, Mandatory.O);
            setScaleFactorMessage(aScalFactor);
        }
    }

    /**
     *
     */
    public class WGra_SF extends RegisterSunssf {
        public WGra_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getFreqWattParam_127(), 8, 1, "WGra_SF", "", "Scale factor for output gradient.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class HzStrStop_SF extends RegisterSunssf {
        public HzStrStop_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getFreqWattParam_127(), 9, 1, "HzStrStop_SF", "", "Scale factor for frequency deviations.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class RmpIncDec_SF extends RegisterSunssf {
        public RmpIncDec_SF(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getFreqWattParam_127(), 10, 1, "RmpIncDec_SF", "", "Scale factor for increment and decrement ramps.", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class Pad extends RegisterPad {
        public Pad(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getFreqWattParam_127(), 11, 1, "Pad", "", "Pad", Rw.R, Mandatory.O);
        }
    }
}
