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

import ch.retep.relleum.modbus.datatype.RegisterBitfield32;
import ch.retep.relleum.modbus.datatype.RegisterDoubleACC32;
import ch.retep.relleum.modbus.datatype.RegisterEnum16;
import ch.retep.relleum.modbus.datatype.RegisterInt16;
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
public class Table0160MultipleMPPTInverterExtensionModel extends Table {

    private  TcpModbusHandler tcpModbusHandler;
    private  ID multipleMPPTInverterExtensionModel00ID  ;
    private  L multipleMPPTInverterExtensionModel01L;

    private  DCA_SF multipleMPPTInverterExtensionModel02DCA_SF;
    private  DCV_SF multipleMPPTInverterExtensionModel03DCV_SF;
    private  DCW_SF multipleMPPTInverterExtensionModel04DCW_SF;
    private  DCWH_SF multipleMPPTInverterExtensionModel05DCWH_SF;
    private  Evt multipleMPPTInverterExtensionModel06Evt;
    private  N multipleMPPTInverterExtensionModel08N;
    private  TmsPer multipleMPPTInverterExtensionModel09TmsPer;

    private IDM[] idms;
    private IDStr[] idStrs;
    private DCA[] dcas;
    private DCV[] dcvs;
    private DCW[] dcws;
    private DCWH[] dcwhs;
    private Tms[] tmses;
    private Tmp[] tmps;
    private DCSt[] dcSts;
    private DCEvt[] dcEvts;

    public Table0160MultipleMPPTInverterExtensionModel(TcpModbusHandler tcpModbusHandler) {
        this.tcpModbusHandler=tcpModbusHandler;
        init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 0, 50, "Multiple MPPT Inverter Extension Model Modell", "", "Multiple MPPT Inverter Extension Model Modell ", Rw.R, Mandatory.M);
        multipleMPPTInverterExtensionModel00ID = new ID(tcpModbusHandler);
        multipleMPPTInverterExtensionModel01L = new L(tcpModbusHandler);
        multipleMPPTInverterExtensionModel02DCA_SF = new DCA_SF(tcpModbusHandler);
        multipleMPPTInverterExtensionModel03DCV_SF = new DCV_SF(tcpModbusHandler);
        multipleMPPTInverterExtensionModel04DCW_SF = new DCW_SF(tcpModbusHandler);
        multipleMPPTInverterExtensionModel05DCWH_SF = new DCWH_SF(tcpModbusHandler);
        multipleMPPTInverterExtensionModel06Evt = new Evt(tcpModbusHandler);
        multipleMPPTInverterExtensionModel08N = new N(tcpModbusHandler);
        multipleMPPTInverterExtensionModel09TmsPer = new TmsPer(tcpModbusHandler);


        vector.add(multipleMPPTInverterExtensionModel00ID);
        vector.add(multipleMPPTInverterExtensionModel01L);

        vector.add(multipleMPPTInverterExtensionModel02DCA_SF);
        vector.add(multipleMPPTInverterExtensionModel03DCV_SF);
        vector.add(multipleMPPTInverterExtensionModel04DCW_SF);
        vector.add(multipleMPPTInverterExtensionModel05DCWH_SF);
        vector.add(multipleMPPTInverterExtensionModel06Evt);
        vector.add(multipleMPPTInverterExtensionModel08N);
        vector.add(multipleMPPTInverterExtensionModel09TmsPer);

    }

    @Override
    public void setResponseInit(byte[] bArry) {
        super.setResponseInit(bArry);
        int size = (((int) getL().toLong() - 8) / 20);
        idms = new IDM[size];
        idStrs = new IDStr[size];
        dcas = new DCA[size];
        dcvs = new DCV[size];
        dcws = new DCW[size];
        dcwhs = new DCWH[size];
        tmses = new Tms[size];
        tmps = new Tmp[size];
        dcSts = new DCSt[size];
        dcEvts = new DCEvt[size];
        for (int i = 0; i < size; i++) {

            idms[i] = new IDM(i,tcpModbusHandler);
            idStrs[i] = new IDStr(i,tcpModbusHandler);
            dcas[i] = new DCA(multipleMPPTInverterExtensionModel02DCA_SF, i,tcpModbusHandler);
            dcvs[i] = new DCV(multipleMPPTInverterExtensionModel03DCV_SF, i,tcpModbusHandler);
            dcws[i] = new DCW(multipleMPPTInverterExtensionModel04DCW_SF, i,tcpModbusHandler);
            dcwhs[i] = new DCWH(multipleMPPTInverterExtensionModel05DCWH_SF, i,tcpModbusHandler);
            tmses[i] = new Tms(i,tcpModbusHandler);
            tmps[i] = new Tmp(i,tcpModbusHandler);
            dcSts[i] = new DCSt(i,tcpModbusHandler);
            dcEvts[i] = new DCEvt(i,tcpModbusHandler);
            idms[i].setResponse2(this.getBB());
            idStrs[i].setResponse2(this.getBB());
            dcas[i].setResponse2(this.getBB());
            dcvs[i].setResponse2(this.getBB());
            dcws[i].setResponse2(this.getBB());
            dcwhs[i].setResponse2(this.getBB());
            tmses[i].setResponse2(this.getBB());
            tmps[i].setResponse2(this.getBB());
            dcSts[i].setResponse2(this.getBB());
            dcEvts[i].setResponse2(this.getBB());

            vector.add(idms[i]);
            vector.add(idStrs[i]);
            vector.add(dcas[i]);
            vector.add(dcvs[i]);
            vector.add(dcws[i]);
            vector.add(dcwhs[i]);
            vector.add(tmses[i]);
            vector.add(tmps[i]);
            vector.add(dcSts[i]);
            vector.add(dcEvts[i]);
        }


    }

    /**
     * @return
     */
    public RetepEnum getID() {
        return multipleMPPTInverterExtensionModel00ID;
    }

    /**
     * @return
     */
    public RetepLong getL() {
        return multipleMPPTInverterExtensionModel01L;
    }

    /**
     * @return
     */
    public RetepLong getDCA_SF() {
        return multipleMPPTInverterExtensionModel02DCA_SF;
    }

    /**
     * @return
     */
    public RetepLong getDCV_SF() {
        return multipleMPPTInverterExtensionModel03DCV_SF;
    }

    /**
     * @return
     */
    public RetepLong getDCW_SF() {
        return multipleMPPTInverterExtensionModel04DCW_SF;
    }

    /**
     * @return
     */
    public RetepLong getDCWH_SF() {
        return multipleMPPTInverterExtensionModel05DCWH_SF;
    }

    /**
     * @return
     */
    public RetepBitMask getEvt() {
        return multipleMPPTInverterExtensionModel06Evt;
    }

    /**
     * @return
     */
    public RetepLong getN() {
        return multipleMPPTInverterExtensionModel08N;
    }

    /**
     * @return
     */
    public RetepLong getTmsPer() {
        return multipleMPPTInverterExtensionModel09TmsPer;
    }

    /**
     * @return
     */
    public RetepLong getMID(int index) {
        return idms[index];
    }

    /**
     * @return
     */
    public RetepString getIDStr(int index) {
        return idStrs[index];
    }

    /**
     * @return
     */
    public RetepDouble getDCA(int index) {
        return dcas[index];
    }

    /**
     * @return
     */
    public RetepDouble getDCV(int index) {
        return dcvs[index];
    }

    /**
     * @return
     */
    public RetepDouble getDCW(int index) {
        return dcws[index];
    }

    /**
     * @return
     */
    public RetepDouble getDCWH(int index) {
        return dcwhs[index];
    }

    /**
     * @return
     */
    public RetepLong getTms(int index) {
        return tmses[index];
    }

    /**
     * @return
     */
    public RetepLong getTmp(int index) {
        return tmps[index];
    }

    /**
     * @return
     */
    public RetepEnum getDCSt(int index) {
        return dcSts[index];
    }

    /**
     * @return
     */
    public RetepBitMask getDCEvt(int index) {
        return dcEvts[index];
    }

    /**
     *
     */
    public  class ID extends RegisterEnum16 {
        ID(TcpModbusHandler tcpModbusHandler)
        {
            init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 0, 1, "Model", "", "", Rw.R, Mandatory.M);
            hashtable.put((long) 160, "Multiple MPPT Inverter Extension");
        }


    }

    /**
     *
     */
    public  class L extends RegisterUint16 {
        L(TcpModbusHandler tcpModbusHandler)
        {
            init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    /**
     *
     */
    public  class DCA_SF extends RegisterSunssf {
        DCA_SF(TcpModbusHandler tcpModbusHandler)
        {
            init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 2, 1, "Current Scale Factor", "", "", Rw.R, Mandatory.O);
        }


    }

    /**
     *
     */
    public  class DCV_SF extends RegisterSunssf {
        DCV_SF(TcpModbusHandler tcpModbusHandler)
        {
            init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 3, 1, "Voltage Scale Factor", "", "", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class DCW_SF extends RegisterSunssf {
        DCW_SF(TcpModbusHandler tcpModbusHandler)
        {
            init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 4, 1, "Power Scale Factor", "", "", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class DCWH_SF extends RegisterSunssf {
        DCWH_SF(TcpModbusHandler tcpModbusHandler)
        {
            init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 5, 1, "Energy Scale Factor", "", "", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class Evt extends RegisterBitfield32 {
        Evt(TcpModbusHandler tcpModbusHandler)
        {
            init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 6, 2, "Global Events", "", "", Rw.R, Mandatory.O);
            hashtable.put((long) 0, "GROUND_FAULT");
            hashtable.put((long) 1, "INPUT_OVER_VOLTAGE");
            hashtable.put((long) 19, "RESERVED");
            hashtable.put((long) 3, "DC_DISCONNECT");
            hashtable.put((long) 5, "CABINET_OPEN");
            hashtable.put((long) 6, "MANUAL_SHUTDOWN");
            hashtable.put((long) 7, "OVER_TEMP");
            hashtable.put((long) 12, "BLOWN_FUSE");
            hashtable.put((long) 13, "UNDER_TEMP");
            hashtable.put((long) 14, "MEMORY_LOSS");
            hashtable.put((long) 15, "ARC_DETECTION");
            hashtable.put((long) 20, "TEST_FAILED");
            hashtable.put((long) 21, "INPUT_UNDER_VOLTAGE");
            hashtable.put((long) 22, "INPUT_OVER_CURRENT");
        }
    }

    /**
     *
     */
    public  class N extends RegisterUint16 {
        N(TcpModbusHandler tcpModbusHandler)
        {
            init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 8, 1, "Number of Modules", "", "", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class TmsPer extends RegisterUint16 {
        TmsPer(TcpModbusHandler tcpModbusHandler)
        {
            init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 9, 1, "Timestamp Period", "", "", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class IDM extends RegisterUint16 {
        private  int index;

        public IDM(int aIndex,TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 10 + (index * 20), 1, "["+(index + 1)+"] Input ID " , "", "", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public  class IDStr extends RegisterString {
        private  int index;

        public IDStr(int aIndex,TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 11 + (index * 20), 8, "["+(index + 1)+"] Input ID Sting ", "", "", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class DCA extends RegisterUDouble {
        private  int index;

        public DCA(DCA_SF aScalFactor, int aIndex,TcpModbusHandler tcpModbusHandler) {
            setScaleFactorMessage(aScalFactor);
            index = aIndex;
            init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 19 + (index * 20), 1, "["+(index + 1)+"] DC Current ", "A", "", Rw.R, Mandatory.O);

        }
    }

    /**
     *
     */
    public class DCV extends RegisterUDouble {
        private  int index;

        public DCV(DCV_SF aScalFactor, int aIndex,TcpModbusHandler tcpModbusHandler) {
            setScaleFactorMessage(aScalFactor);
            index = aIndex;
            init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 20 + (index * 20), 1, "["+(index + 1)+"] DC Voltage ", "V", "", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class DCW extends RegisterUDouble {
        private  int index;

        public DCW(DCW_SF aScalFactor, int aIndex,TcpModbusHandler tcpModbusHandler) {
            setScaleFactorMessage(aScalFactor);
            index = aIndex;
            init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 21 + (index * 20), 1, "["+(index + 1)+"] DC Power " , "W", "", Rw.R, Mandatory.O);

        }
    }

    /**
     *
     */
    public class DCWH extends RegisterDoubleACC32 {
        private  int index;

        public DCWH(DCWH_SF aScalFactor, int aIndex,TcpModbusHandler tcpModbusHandler) {
            setScaleFactorMessage(aScalFactor);
            index = aIndex;
            init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 22 + (index * 20), 2, "["+(index + 1)+"] Lifetime Energy " , "Wh", "", Rw.R, Mandatory.O);

        }
    }

    /**
     *
     */
    public class Tms extends RegisterUint32 {
        private  int index;

        public Tms(int aIndex,TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 24 + (index * 20), 2, "["+(index + 1)+"] Timestamp ", "Secs", "", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class Tmp extends RegisterInt16 {
        private  int index;

        public Tmp(int aIndex,TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 26 + (index * 20), 1, "["+(index + 1)+"] Temperature ", "C", "", Rw.R, Mandatory.O);
        }
    }

    /**
     *
     */
    public class DCSt extends RegisterEnum16 {
        private  int index;

        public DCSt(int aIndex,TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 27 + (index * 20), 1, "["+(index + 1)+"] Operating State", "", "", Rw.R, Mandatory.O);
            hashtable.put((long) 1, "OFF");
            hashtable.put((long) 2, "SLEEPING");
            hashtable.put((long) 3, "STARTING");
            hashtable.put((long) 4, "MPPT");
            hashtable.put((long) 5, "THROTTLED");
            hashtable.put((long) 6, "SHUTTING_DOWN");
            hashtable.put((long) 7, "FAULT");
            hashtable.put((long) 8, "STANDBY");
            hashtable.put((long) 9, "TEST");
            hashtable.put((long) 19, "RESERVED");
        }
    }

    /**
     *
     */
    public class DCEvt extends RegisterBitfield32 {
        private  int index;


        {

            hashtable.put((long) 0, "GROUND_FAULT");
            hashtable.put((long) 1, "INPUT_OVER_VOLTAGE");
            hashtable.put((long) 19, "RESERVED");
            hashtable.put((long) 3, "DC_DISCONNECT");
            hashtable.put((long) 5, "CABINET_OPEN");
            hashtable.put((long) 6, "MANUAL_SHUTDOWN");
            hashtable.put((long) 7, "OVER_TEMP");
            hashtable.put((long) 12, "BLOWN_FUSE");
            hashtable.put((long) 13, "UNDER_TEMP");
            hashtable.put((long) 14, "MEMORY_LOSS");
            hashtable.put((long) 15, "ARC_DETECTION");
            hashtable.put((long) 20, "TEST_FAILED");
            hashtable.put((long) 21, "INPUT_UNDER_VOLTAGE");
            hashtable.put((long) 22, "INPUT_OVER_CURRENT");
        }

        public DCEvt(int aIndex,TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getMultipleMPPTInverterExtensionModel_160(), 28 + (index * 20), 2, "["+(index + 1)+"] Module Events", "", "", Rw.R, Mandatory.O);

        }
    }
}


