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
import ch.retep.relleum.modbus.datatype.RegisterUint16;
import ch.retep.relleum.modbus.datatype.Table;
import ch.retep.relleum.sunspec.TcpModbusHandler;
import ch.retep.relleum.sunspec.datatype.RetepEnum;
import ch.retep.relleum.sunspec.datatype.RetepLong;

/**
 * @author Peter
 */
public class Table0008GetDeviceSecurityCertificate extends Table {

    private ID getDeviceSecurityCertificate00ID;
    private L getDeviceSecurityCertificate01L;
    private Fmt getDeviceSecurityCertificate02Fmt;
    private N getDeviceSecurityCertificate03N;
    private Cert getDeviceSecurityCertificate04Cert;

    public Table0008GetDeviceSecurityCertificate(TcpModbusHandler tcpModbusHandler) {
        init(tcpModbusHandler.getGetDeviceSecurityCertificate_8(), 0, 5, "Get Device Security Certificate Modell", "", "Get Device Security Certificate Modell ", Rw.R, Mandatory.M);

        getDeviceSecurityCertificate00ID = new ID(tcpModbusHandler);
        getDeviceSecurityCertificate01L = new L(tcpModbusHandler);
        getDeviceSecurityCertificate02Fmt = new Fmt(tcpModbusHandler);
        getDeviceSecurityCertificate03N = new N(tcpModbusHandler);
        getDeviceSecurityCertificate04Cert = new Cert(tcpModbusHandler);

        vector.add(getDeviceSecurityCertificate00ID);
        vector.add(getDeviceSecurityCertificate01L);

        vector.add(getDeviceSecurityCertificate02Fmt);
        vector.add(getDeviceSecurityCertificate03N);

        vector.add(getDeviceSecurityCertificate04Cert);

    }

    public RetepEnum getID() {
        return getDeviceSecurityCertificate00ID;
    }

    public RetepLong getL() {
        return getDeviceSecurityCertificate01L;
    }

    public RetepEnum getFmt() {
        return getDeviceSecurityCertificate02Fmt;
    }

    public RetepLong getN() {
        return getDeviceSecurityCertificate03N;
    }

    public RetepLong getCert() {
        return getDeviceSecurityCertificate04Cert;
    }

    public static class ID extends RegisterEnum16 {

        public ID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getGetDeviceSecurityCertificate_8(), 0, 1, "Model", "", "Security model for PKI", Rw.R, Mandatory.M);
            hashtable.put((long) 8, "SunSpec Secure Write Response Model (DRAFT 1)");
        }
    }

    public static class L extends RegisterUint16 {

        public L(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getGetDeviceSecurityCertificate_8(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    public static class Fmt extends RegisterEnum16 {

        public Fmt(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getGetDeviceSecurityCertificate_8(), 2, 1, "Format", "", "X.509 format of the certificate. DER or PEM.", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "NONE");
            hashtable.put((long) 1, "X509_PEM");
            hashtable.put((long) 2, "X509_DER");
        }
    }

    public static class N extends RegisterUint16 {

        public N(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getGetDeviceSecurityCertificate_8(), 3, 1, "N", "", "Number of registers to follow for the certificate", Rw.R, Mandatory.M);
        }
    }

    public static class Cert extends RegisterUint16 {

        public Cert(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getGetDeviceSecurityCertificate_8(), 4, 1, "Cert", "", "X.509 Certificate of the device", Rw.R, Mandatory.M);
        }
    }

}
