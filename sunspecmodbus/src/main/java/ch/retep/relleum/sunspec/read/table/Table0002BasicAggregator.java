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
import ch.retep.relleum.modbus.datatype.RegisterEnum16;
import ch.retep.relleum.modbus.datatype.RegisterEnum32;
import ch.retep.relleum.modbus.datatype.RegisterUint16;
import ch.retep.relleum.modbus.datatype.Table;
import ch.retep.relleum.sunspec.TcpModbusHandler;
import ch.retep.relleum.sunspec.datatype.RetepBitMask;
import ch.retep.relleum.sunspec.datatype.RetepEnum;
import ch.retep.relleum.sunspec.datatype.RetepLong;

public class Table0002BasicAggregator extends Table {

    private  ID basicAggregator00ID ;
    private  L basicAggregator01L ;

    private  AID basicAggregator02AID ;
    private  N basicAggregator03N ;
    private  UN basicAggregator04UN ;
    private  St basicAggregator05St ;
    private  StVnd basicAggregator06StVnd ;
    private  Evt basicAggregator07Evt ;
    private  EvtVnd basicAggregator09EvtVnd ;
    private  Ctl basicAggregator11Ctl ;
    private  CtlVnd basicAggregator12CtlVnd ;
    private  CtlVl basicAggregator14CtlVl ;

    public Table0002BasicAggregator (TcpModbusHandler tcpModbusHandler){
        init(tcpModbusHandler.getBasicAggregator_2(), 0, 16, "Basic Aggregator", "", "Basic Aggregator Modell ", Rw.R, Mandatory.M);
        basicAggregator00ID = new ID(tcpModbusHandler);
        basicAggregator01L = new L(tcpModbusHandler);

        basicAggregator02AID = new AID(tcpModbusHandler);
        basicAggregator03N = new N(tcpModbusHandler);
        basicAggregator04UN = new UN(tcpModbusHandler);
        basicAggregator05St = new St(tcpModbusHandler);
        basicAggregator06StVnd = new StVnd(tcpModbusHandler);
        basicAggregator07Evt = new Evt(tcpModbusHandler);
        basicAggregator09EvtVnd = new EvtVnd(tcpModbusHandler);
        basicAggregator11Ctl = new Ctl(tcpModbusHandler);
        basicAggregator12CtlVnd = new CtlVnd(tcpModbusHandler);
        basicAggregator14CtlVl = new CtlVl(tcpModbusHandler);
        vector.add(basicAggregator00ID);

        vector.add(basicAggregator01L);

        vector.add(basicAggregator02AID);

        vector.add(basicAggregator03N);

        vector.add(basicAggregator04UN);

        vector.add(basicAggregator05St);

        vector.add(basicAggregator06StVnd);

        vector.add(basicAggregator07Evt);

        vector.add(basicAggregator09EvtVnd);

        vector.add(basicAggregator11Ctl);

        vector.add(basicAggregator12CtlVnd);

        vector.add(basicAggregator14CtlVl);
    }

    public RetepEnum getID() {
        return basicAggregator00ID;
    }

    public RetepLong getL() {
        return basicAggregator01L;
    }

    public RetepLong getAID() {
        return basicAggregator02AID;
    }

    public RetepLong getN() {
        return basicAggregator03N;
    }

    public RetepLong getUN() {
        return basicAggregator04UN;
    }

    public RetepEnum getSt() {
        return basicAggregator05St;
    }

    public RetepEnum getStVnd() {
        return basicAggregator06StVnd;
    }

    public RetepBitMask getEvt() {
        return basicAggregator07Evt;
    }

    public RetepBitMask getEvtVnd() {
        return basicAggregator09EvtVnd;
    }

    public RetepEnum getCtl() {
        return basicAggregator11Ctl;
    }

    public RetepEnum getCtlVnd() {
        return basicAggregator12CtlVnd;
    }

    public RetepEnum getCtlVl() {
        return basicAggregator14CtlVl;
    }

    public  class ID extends RegisterEnum16 {

        public ID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicAggregator_2(), 0, 1, "Model", "", "Aggregates a collection of models for a given model id", Rw.R, Mandatory.M);
            hashtable.put((long) 2, "SunSpec Basic Aggregator");
        }



    }

    public  class L extends RegisterUint16 {

        public L(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicAggregator_2(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    public  class AID extends RegisterUint16 {

        public AID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicAggregator_2(), 2, 1, "AID", "", "Aggregated model id", Rw.R, Mandatory.M);
        }
    }

    public  class N extends RegisterUint16 {

        public N(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicAggregator_2(), 3, 1, "N", "", "Number of aggregated models", Rw.R, Mandatory.M);
        }
    }

    public  class UN extends RegisterUint16 {

        public UN(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicAggregator_2(), 4, 1, "UN", "", "Update Number.  Incrementing nunber each time the mappping is changed.  If the number is not changed from thelast reading the direct access to a specific offset will result in reading the same logical model as before.  Otherwise the entire model must be read to refresh the changes", Rw.R, Mandatory.M);
        }
    }

    public  class St extends RegisterEnum16 {

        public St(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicAggregator_2(), 5, 1, "Status", "", "Enumerated status code", Rw.R, Mandatory.M);
            hashtable.put((long) 1, "OFF");
            hashtable.put((long) 2, "ON");
            hashtable.put((long) 3, "FULL");
            hashtable.put((long) 4, "FAULT");
        }
    }

    public  class StVnd extends RegisterEnum16 {

        public StVnd(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicAggregator_2(), 6, 1, "Vendor Status", "", "Vendor specific status code", Rw.R, Mandatory.O);
        }
    }

    public  class Evt extends RegisterBitfield32 {

        public Evt(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicAggregator_2(), 7, 2, "Event Code", "", "Bitmask event code", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "GROUND_FAULT");
            hashtable.put((long) 1, "INPUT_OVER_VOLTAGE");
            hashtable.put((long) 11, "RESERVED");
            hashtable.put((long) 3, "DC_DISCONNECT");
            hashtable.put((long) 6, "MANUAL_SHUTDOWN");
            hashtable.put((long) 7, "OVER_TEMPERATURE");
            hashtable.put((long) 12, "BLOWN_FUSE");
            hashtable.put((long) 13, "UNDER_TEMPERATURE");
            hashtable.put((long) 14, "MEMORY_LOSS");
            hashtable.put((long) 15, "ARC_DETECTION");
            hashtable.put((long) 16, "THEFT_DETECTION");
            hashtable.put((long) 17, "OUTPUT_OVER_CURRENT");
            hashtable.put((long) 18, "OUTPUT_OVER_VOLTAGE");
            hashtable.put((long) 19, "OUTPUT_UNDER_VOLTAGE");
            hashtable.put((long) 20, "TEST_FAILED");
        }
    }

    public  class EvtVnd extends RegisterBitfield32 {

        public EvtVnd(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicAggregator_2(), 9, 2, "Vendor Event Code", "", "Vendor specific event code", Rw.R, Mandatory.O);
        }
    }

    public  class Ctl extends RegisterEnum16 {

        public Ctl(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicAggregator_2(), 11, 1, "Control", "", "Control register for all aggregated devices", Rw.R, Mandatory.O);
            hashtable.put((long) 0, "NONE");
            hashtable.put((long) 1, "AUTOMATIC");
            hashtable.put((long) 2, "FORCE_OFF");
            hashtable.put((long) 3, "TEST");
        }
    }

    public  class CtlVnd extends RegisterEnum32 {

        public CtlVnd(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicAggregator_2(), 12, 2, "Vendor Control", "", "Vendor control register for all aggregated devices", Rw.R, Mandatory.O);
        }
    }

    public  class CtlVl extends RegisterEnum32 {

        public CtlVl(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getBasicAggregator_2(), 14, 2, "Control Value", "", "Numerical value used as a parameter to the control", Rw.R, Mandatory.O);
        }
    }

}
