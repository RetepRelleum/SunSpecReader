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
import ch.retep.relleum.modbus.datatype.RegisterUint32;
import ch.retep.relleum.modbus.datatype.Table;
import ch.retep.relleum.sunspec.TcpModbusHandler;
import ch.retep.relleum.sunspec.datatype.RetepEnum;
import ch.retep.relleum.sunspec.datatype.RetepLong;

public class Table0007SecureWriteResponseModelDRAFT1 extends Table {

    private  ID secureWriteResponseModelDRAFT100ID ;
    private  L secureWriteResponseModelDRAFT101L ;

    private  RqSeq secureWriteResponseModelDRAFT102RqSeq ;
    private  Sts secureWriteResponseModelDRAFT103Sts ;
    private  Ts secureWriteResponseModelDRAFT104Ts ;
    private  Ms secureWriteResponseModelDRAFT106Ms ;
    private  Seq secureWriteResponseModelDRAFT107Seq ;
    private  Alm secureWriteResponseModelDRAFT108Alm ;
    private  Rsrvd secureWriteResponseModelDRAFT109Rsrvd ;
    private  Alg secureWriteResponseModelDRAFT110Alg ;
    private  N secureWriteResponseModelDRAFT111N ;

    private  DS secureWriteResponseModelDRAFT112DS ;

    public Table0007SecureWriteResponseModelDRAFT1(TcpModbusHandler tcpModbusHandler)  {
        init(tcpModbusHandler.getSecureWriteResponseModelDRAFT1_7(), 0, 13, "Secure Write Response Model (DRAFT 1) Modell", "", "Secure Write Response Model (DRAFT 1) Modell ", Rw.R, Mandatory.M);

         secureWriteResponseModelDRAFT100ID = new ID(tcpModbusHandler);
         secureWriteResponseModelDRAFT101L = new L(tcpModbusHandler);

         secureWriteResponseModelDRAFT102RqSeq = new RqSeq(tcpModbusHandler);
         secureWriteResponseModelDRAFT103Sts = new Sts(tcpModbusHandler);
         secureWriteResponseModelDRAFT104Ts = new Ts(tcpModbusHandler);
         secureWriteResponseModelDRAFT106Ms = new Ms(tcpModbusHandler);
         secureWriteResponseModelDRAFT107Seq = new Seq(tcpModbusHandler);
         secureWriteResponseModelDRAFT108Alm = new Alm(tcpModbusHandler);
         secureWriteResponseModelDRAFT109Rsrvd = new Rsrvd(tcpModbusHandler);
         secureWriteResponseModelDRAFT110Alg = new Alg(tcpModbusHandler);
         secureWriteResponseModelDRAFT111N = new N(tcpModbusHandler);


        vector.add(secureWriteResponseModelDRAFT100ID);
        vector.add(secureWriteResponseModelDRAFT101L);

        vector.add(secureWriteResponseModelDRAFT102RqSeq);
        vector.add(secureWriteResponseModelDRAFT103Sts);
        vector.add(secureWriteResponseModelDRAFT104Ts);
        vector.add(secureWriteResponseModelDRAFT106Ms);
        vector.add(secureWriteResponseModelDRAFT107Seq);
        vector.add(secureWriteResponseModelDRAFT108Alm);
        vector.add(secureWriteResponseModelDRAFT109Rsrvd);
        vector.add(secureWriteResponseModelDRAFT110Alg);
        vector.add(secureWriteResponseModelDRAFT111N);

        vector.add(secureWriteResponseModelDRAFT112DS);
    }

    public RetepEnum getID() {
        return secureWriteResponseModelDRAFT100ID;
    }

    public RetepLong getL() {
        return secureWriteResponseModelDRAFT101L;
    }

    public RetepLong getRqSeq() {
        return secureWriteResponseModelDRAFT102RqSeq;
    }

    public RetepEnum getSts() {
        return secureWriteResponseModelDRAFT103Sts;
    }

    public RetepLong getTs() {
        return secureWriteResponseModelDRAFT104Ts;
    }

    public RetepLong getMs() {
        return secureWriteResponseModelDRAFT106Ms;
    }

    public RetepLong getSeq() {
        return secureWriteResponseModelDRAFT107Seq;
    }

    public RetepEnum getAlm() {
        return secureWriteResponseModelDRAFT108Alm;
    }

    public RetepLong getRsrvd() {
        return secureWriteResponseModelDRAFT109Rsrvd;
    }

    public RetepEnum getAlg() {
        return secureWriteResponseModelDRAFT110Alg;
    }

    public RetepLong getN() {
        return secureWriteResponseModelDRAFT111N;
    }

    public RetepLong getDS() {
        return secureWriteResponseModelDRAFT112DS;
    }

    public static class ID extends RegisterEnum16 {

public ID (TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteResponseModelDRAFT1_7(), 0, 1, "Model", "", "Include a digital signature over the response", Rw.R, Mandatory.M);
            hashtable.put((long) 7, "SunSpec Secure Write Response Model (DRAFT 1)");
        }
    }

    public static class L extends RegisterUint16 {

public L(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteResponseModelDRAFT1_7(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    public static class RqSeq extends RegisterUint16 {

public RqSeq(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteResponseModelDRAFT1_7(), 2, 1, "Request Sequence", "", "Sequence number from the request", Rw.R, Mandatory.M);
        }
    }

    public static class Sts extends RegisterEnum16 {

public Sts(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteResponseModelDRAFT1_7(), 3, 1, "Status", "", "Status of last write operation", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "SUCCESS");
            hashtable.put((long) 1, "DS");
            hashtable.put((long) 2, "ACL");
            hashtable.put((long) 3, "OFF");
            hashtable.put((long) 4, "VAL");
        }
    }

    public static class Ts extends RegisterUint32 {

public Ts(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteResponseModelDRAFT1_7(), 4, 2, "Timestamp", "", "Timestamp value is the number of seconds since January 1, 2000", Rw.R, Mandatory.M);
        }
    }

    public static class Ms extends RegisterUint16 {

public Ms(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteResponseModelDRAFT1_7(), 6, 1, "Milliseconds", "", "Millisecond counter 0-999", Rw.R, Mandatory.M);
        }
    }

    public static class Seq extends RegisterUint16 {

public Seq(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteResponseModelDRAFT1_7(), 7, 1, "Sequence", "", "Sequence number of response", Rw.R, Mandatory.M);
        }
    }

    public static class Alm extends RegisterEnum16 {

public Alm(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteResponseModelDRAFT1_7(), 8, 1, "Alarm", "", "Bitmask alarm code", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "NONE");
            hashtable.put((long) 1, "ALM");
        }
    }

    public static class Rsrvd extends RegisterPad {

public Rsrvd(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteResponseModelDRAFT1_7(), 9, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Alg extends RegisterEnum16 {

public Alg(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteResponseModelDRAFT1_7(), 10, 1, "Algorithm", "", "Algorithm used to compute the digital signature", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "NONE");
            hashtable.put((long) 1, "AES-GMAC-64");
            hashtable.put((long) 2, "ECC-256");
        }
    }

    public static class N extends RegisterUint16 {

public N(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteResponseModelDRAFT1_7(), 11, 1, "N", "", "Number of registers comprising the digital signature.", Rw.RW, Mandatory.M);
        }
    }

    public static class DS extends RegisterUint16 {

public DS(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteResponseModelDRAFT1_7(), 12, 1, "DS", "", "Digital Signature", Rw.RW, Mandatory.O);
        }
    }

}
