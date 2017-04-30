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

import ch.retep.relleum.modbus.datatype.RegisterEnum16;
import ch.retep.relleum.modbus.datatype.RegisterPad;
import ch.retep.relleum.modbus.datatype.RegisterUint16;
import ch.retep.relleum.modbus.datatype.Table;
import ch.retep.relleum.sunspec.TcpModbusHandler;
import ch.retep.relleum.sunspec.datatype.RetepEnum;
import ch.retep.relleum.sunspec.datatype.RetepLong;

public class Table0010CommunicationInterfaceHeader extends Table {

    private ID communicationInterfaceHeader00ID;
    private L communicationInterfaceHeader01L;

    private St communicationInterfaceHeader02St;
    private Ctl communicationInterfaceHeader03Ctl;
    private Typ communicationInterfaceHeader04Typ;
    private Pad communicationInterfaceHeader05Pad;

    public Table0010CommunicationInterfaceHeader(TcpModbusHandler tcpModbusHandler) {
        init(tcpModbusHandler.getCommunicationInterfaceHeader_10(), 0, 6, "Communication Interface Header Modell", "", "Communication Interface Header Modell ", Rw.R, Mandatory.M);
        communicationInterfaceHeader00ID = new ID(tcpModbusHandler);
        communicationInterfaceHeader01L = new L(tcpModbusHandler);

        communicationInterfaceHeader02St = new St(tcpModbusHandler);
        communicationInterfaceHeader03Ctl = new Ctl(tcpModbusHandler);
        communicationInterfaceHeader04Typ = new Typ(tcpModbusHandler);
        communicationInterfaceHeader05Pad = new Pad(tcpModbusHandler);

        vector.add(communicationInterfaceHeader00ID);
        vector.add(communicationInterfaceHeader01L);

        vector.add(communicationInterfaceHeader02St);
        vector.add(communicationInterfaceHeader03Ctl);
        vector.add(communicationInterfaceHeader04Typ);
        vector.add(communicationInterfaceHeader05Pad);
    }

    public RetepEnum getID() {
        return communicationInterfaceHeader00ID;
    }

    public RetepLong getL() {
        return communicationInterfaceHeader01L;
    }

    public RetepEnum getSt() {
        return communicationInterfaceHeader02St;
    }

    public RetepLong getCtl() {
        return communicationInterfaceHeader03Ctl;
    }

    public RetepEnum getTyp() {
        return communicationInterfaceHeader04Typ;
    }

    public RetepLong getPad() {
        return communicationInterfaceHeader05Pad;
    }

    public class ID extends RegisterEnum16 {
        public ID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getCommunicationInterfaceHeader_10(), 0, 1, "Model", "", "To be included first for a complete interface description", Rw.R, Mandatory.M);
            hashtable.put((long) 9, "SunSpec Set Operator Security Certificate");
        }


    }

    public class L extends RegisterUint16 {

        public L(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getCommunicationInterfaceHeader_10(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    public class St extends RegisterEnum16 {

        public St(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getCommunicationInterfaceHeader_10(), 2, 1, "Interface Status", "", "Overall interface status", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "DOWN");
            hashtable.put((long) 1, "UP");
            hashtable.put((long) 2, "FAULT");
        }
    }

    public class Ctl extends RegisterUint16 {

        public Ctl(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getCommunicationInterfaceHeader_10(), 3, 1, "Interface Control", "", "Overall interface control (TBD)", Rw.RW, Mandatory.O);
        }
    }

    public class Typ extends RegisterEnum16 {

        public Typ(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getCommunicationInterfaceHeader_10(), 4, 1, "Physical Access Type", "", "Enumerated value.  Type of physical media", Rw.R, Mandatory.O);
            hashtable.put((long) 0, "UNKNOWN");
            hashtable.put((long) 1, "INTERNAL");
            hashtable.put((long) 2, "TWISTED_PAIR");
            hashtable.put((long) 3, "FIBER");
            hashtable.put((long) 4, "WIRELESS");
        }
    }

    public class Pad extends RegisterPad {

        public Pad(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getCommunicationInterfaceHeader_10(), 5, 1, "", "", "", Rw.R, Mandatory.O);
        }
    }

}
