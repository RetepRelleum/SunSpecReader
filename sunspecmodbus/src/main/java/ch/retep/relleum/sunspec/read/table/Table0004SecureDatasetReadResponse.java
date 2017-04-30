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
import ch.retep.relleum.modbus.datatype.RegisterUint32;
import ch.retep.relleum.modbus.datatype.Table;
import ch.retep.relleum.sunspec.TcpModbusHandler;
import ch.retep.relleum.sunspec.datatype.RetepEnum;
import ch.retep.relleum.sunspec.datatype.RetepLong;

/**
 * @author Peter
 */
public class Table0004SecureDatasetReadResponse extends Table {

    private ID secureDatasetReadResponse0ID;
    private L secureDatasetReadResponse1L;

    private RqSeq secureDatasetReadResponse2RqSeq;
    private Sts secureDatasetReadResponse3Sts;
    private X secureDatasetReadResponse4X;
    private Val1 secureDatasetReadResponse5Val1;
    private Val2 secureDatasetReadResponse6Val2;
    private Val3 secureDatasetReadResponse7Val3;
    private Val4 secureDatasetReadResponse8Val4;
    private Val5 secureDatasetReadResponse9Val5;
    private Val6 secureDatasetReadResponse10Val6;
    private Val7 secureDatasetReadResponse11Val7;
    private Val8 secureDatasetReadResponse12Val8;
    private Val9 secureDatasetReadResponse13Val9;
    private Val10 secureDatasetReadResponse14Val10;
    private Val11 secureDatasetReadResponse15Val11;
    private Val12 secureDatasetReadResponse16Val12;
    private Val13 secureDatasetReadResponse17Val13;
    private Val14 secureDatasetReadResponse18Val14;
    private Val15 secureDatasetReadResponse19Val15;
    private Val16 secureDatasetReadResponse20Val16;
    private Val17 secureDatasetReadResponse21Val17;
    private Val18 secureDatasetReadResponse22Val18;
    private Val19 secureDatasetReadResponse23Val19;
    private Val20 secureDatasetReadResponse24Val20;
    private Val21 secureDatasetReadResponse25Val21;
    private Val22 secureDatasetReadResponse26Val22;
    private Val23 secureDatasetReadResponse27Val23;
    private Val24 secureDatasetReadResponse28Val24;
    private Val25 secureDatasetReadResponse29Val25;
    private Val26 secureDatasetReadResponse30Val26;
    private Val27 secureDatasetReadResponse31Val27;
    private Val28 secureDatasetReadResponse32Val28;
    private Val29 secureDatasetReadResponse33Val29;
    private Val30 secureDatasetReadResponse34Val30;
    private Val31 secureDatasetReadResponse35Val31;
    private Val32 secureDatasetReadResponse36Val32;
    private Val33 secureDatasetReadResponse37Val33;
    private Val34 secureDatasetReadResponse38Val34;
    private Val35 secureDatasetReadResponse39Val35;
    private Val36 secureDatasetReadResponse40Val36;
    private Val37 secureDatasetReadResponse41Val37;
    private Val38 secureDatasetReadResponse42Val38;
    private Val39 secureDatasetReadResponse43Val39;
    private Val40 secureDatasetReadResponse44Val40;
    private Val41 secureDatasetReadResponse45Val41;
    private Val42 secureDatasetReadResponse46Val42;
    private Val43 secureDatasetReadResponse47Val43;
    private Val44 secureDatasetReadResponse48Val44;
    private Val45 secureDatasetReadResponse49Val45;
    private Val46 secureDatasetReadResponse50Val46;
    private Val47 secureDatasetReadResponse51Val47;
    private Val48 secureDatasetReadResponse52Val48;
    private Val49 secureDatasetReadResponse53Val49;
    private Val50 secureDatasetReadResponse54Val50;
    private Ts secureDatasetReadResponse55Ts;
    private Ms secureDatasetReadResponse57Ms;
    private Seq secureDatasetReadResponse58Seq;
    private Alm secureDatasetReadResponse59Alm;
    private Alg secureDatasetReadResponse60Alg ;
    private N secureDatasetReadResponse61N ;
    private TcpModbusHandler tcpModbusHandler;

    private DS[] dses;

    public Table0004SecureDatasetReadResponse(TcpModbusHandler tcpModbusHandler) {
        this.tcpModbusHandler =tcpModbusHandler;
        init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 0, 63, "Secure Dataset Read Response Modell", "", "Secure Dataset Read Response Modell ", Rw.R, Mandatory.M);
         secureDatasetReadResponse0ID = new ID(tcpModbusHandler);
         secureDatasetReadResponse1L = new L(tcpModbusHandler);

         secureDatasetReadResponse2RqSeq = new RqSeq(tcpModbusHandler);
         secureDatasetReadResponse3Sts = new Sts(tcpModbusHandler);
         secureDatasetReadResponse4X = new X(tcpModbusHandler);
         secureDatasetReadResponse5Val1 = new Val1(tcpModbusHandler);
         secureDatasetReadResponse6Val2 = new Val2(tcpModbusHandler);
         secureDatasetReadResponse7Val3 = new Val3(tcpModbusHandler);
         secureDatasetReadResponse8Val4 = new Val4(tcpModbusHandler);
         secureDatasetReadResponse9Val5 = new Val5(tcpModbusHandler);
         secureDatasetReadResponse10Val6 = new Val6(tcpModbusHandler);
         secureDatasetReadResponse11Val7 = new Val7(tcpModbusHandler);
         secureDatasetReadResponse12Val8 = new Val8(tcpModbusHandler);
         secureDatasetReadResponse13Val9 = new Val9(tcpModbusHandler);
         secureDatasetReadResponse14Val10 = new Val10(tcpModbusHandler);
         secureDatasetReadResponse15Val11 = new Val11(tcpModbusHandler);
         secureDatasetReadResponse16Val12 = new Val12(tcpModbusHandler);
         secureDatasetReadResponse17Val13 = new Val13(tcpModbusHandler);
         secureDatasetReadResponse18Val14 = new Val14(tcpModbusHandler);
         secureDatasetReadResponse19Val15 = new Val15(tcpModbusHandler);
         secureDatasetReadResponse20Val16 = new Val16(tcpModbusHandler);
         secureDatasetReadResponse21Val17 = new Val17(tcpModbusHandler);
         secureDatasetReadResponse22Val18 = new Val18(tcpModbusHandler);
         secureDatasetReadResponse23Val19 = new Val19(tcpModbusHandler);
         secureDatasetReadResponse24Val20 = new Val20(tcpModbusHandler);
         secureDatasetReadResponse25Val21 = new Val21(tcpModbusHandler);
         secureDatasetReadResponse26Val22 = new Val22(tcpModbusHandler);
         secureDatasetReadResponse27Val23 = new Val23(tcpModbusHandler);
         secureDatasetReadResponse28Val24 = new Val24(tcpModbusHandler);
         secureDatasetReadResponse29Val25 = new Val25(tcpModbusHandler);
         secureDatasetReadResponse30Val26 = new Val26(tcpModbusHandler);
         secureDatasetReadResponse31Val27 = new Val27(tcpModbusHandler);
         secureDatasetReadResponse32Val28 = new Val28(tcpModbusHandler);
         secureDatasetReadResponse33Val29 = new Val29(tcpModbusHandler);
         secureDatasetReadResponse34Val30 = new Val30(tcpModbusHandler);
         secureDatasetReadResponse35Val31 = new Val31(tcpModbusHandler);
         secureDatasetReadResponse36Val32 = new Val32(tcpModbusHandler);
         secureDatasetReadResponse37Val33 = new Val33(tcpModbusHandler);
         secureDatasetReadResponse38Val34 = new Val34(tcpModbusHandler);
         secureDatasetReadResponse39Val35 = new Val35(tcpModbusHandler);
         secureDatasetReadResponse40Val36 = new Val36(tcpModbusHandler);
         secureDatasetReadResponse41Val37 = new Val37(tcpModbusHandler);
         secureDatasetReadResponse42Val38 = new Val38(tcpModbusHandler);
         secureDatasetReadResponse43Val39 = new Val39(tcpModbusHandler);
         secureDatasetReadResponse44Val40 = new Val40(tcpModbusHandler);
         secureDatasetReadResponse45Val41 = new Val41(tcpModbusHandler);
         secureDatasetReadResponse46Val42 = new Val42(tcpModbusHandler);
         secureDatasetReadResponse47Val43 = new Val43(tcpModbusHandler);
         secureDatasetReadResponse48Val44 = new Val44(tcpModbusHandler);
         secureDatasetReadResponse49Val45 = new Val45(tcpModbusHandler);
         secureDatasetReadResponse50Val46 = new Val46(tcpModbusHandler);
         secureDatasetReadResponse51Val47 = new Val47(tcpModbusHandler);
         secureDatasetReadResponse52Val48 = new Val48(tcpModbusHandler);
         secureDatasetReadResponse53Val49 = new Val49(tcpModbusHandler);
         secureDatasetReadResponse54Val50 = new Val50(tcpModbusHandler);
         secureDatasetReadResponse55Ts = new Ts(tcpModbusHandler);
         secureDatasetReadResponse57Ms = new Ms(tcpModbusHandler);
         secureDatasetReadResponse58Seq = new Seq(tcpModbusHandler);
         secureDatasetReadResponse59Alm = new Alm(tcpModbusHandler);
         secureDatasetReadResponse60Alg = new Alg(tcpModbusHandler);
         secureDatasetReadResponse61N = new N(tcpModbusHandler);
        vector.add(secureDatasetReadResponse0ID);

        vector.add(secureDatasetReadResponse1L);

        vector.add(secureDatasetReadResponse2RqSeq);

        vector.add(secureDatasetReadResponse3Sts);

        vector.add(secureDatasetReadResponse4X);

        vector.add(secureDatasetReadResponse5Val1);

        vector.add(secureDatasetReadResponse6Val2);

        vector.add(secureDatasetReadResponse7Val3);

        vector.add(secureDatasetReadResponse8Val4);

        vector.add(secureDatasetReadResponse9Val5);

        vector.add(secureDatasetReadResponse10Val6);

        vector.add(secureDatasetReadResponse11Val7);

        vector.add(secureDatasetReadResponse12Val8);

        vector.add(secureDatasetReadResponse13Val9);

        vector.add(secureDatasetReadResponse14Val10);

        vector.add(secureDatasetReadResponse15Val11);

        vector.add(secureDatasetReadResponse16Val12);

        vector.add(secureDatasetReadResponse17Val13);

        vector.add(secureDatasetReadResponse18Val14);

        vector.add(secureDatasetReadResponse19Val15);

        vector.add(secureDatasetReadResponse20Val16);

        vector.add(secureDatasetReadResponse21Val17);

        vector.add(secureDatasetReadResponse22Val18);

        vector.add(secureDatasetReadResponse23Val19);

        vector.add(secureDatasetReadResponse24Val20);

        vector.add(secureDatasetReadResponse25Val21);

        vector.add(secureDatasetReadResponse26Val22);

        vector.add(secureDatasetReadResponse27Val23);

        vector.add(secureDatasetReadResponse28Val24);

        vector.add(secureDatasetReadResponse29Val25);

        vector.add(secureDatasetReadResponse30Val26);

        vector.add(secureDatasetReadResponse31Val27);

        vector.add(secureDatasetReadResponse32Val28);

        vector.add(secureDatasetReadResponse33Val29);

        vector.add(secureDatasetReadResponse34Val30);

        vector.add(secureDatasetReadResponse35Val31);

        vector.add(secureDatasetReadResponse36Val32);

        vector.add(secureDatasetReadResponse37Val33);

        vector.add(secureDatasetReadResponse38Val34);

        vector.add(secureDatasetReadResponse39Val35);

        vector.add(secureDatasetReadResponse40Val36);

        vector.add(secureDatasetReadResponse41Val37);

        vector.add(secureDatasetReadResponse42Val38);

        vector.add(secureDatasetReadResponse43Val39);

        vector.add(secureDatasetReadResponse44Val40);

        vector.add(secureDatasetReadResponse45Val41);

        vector.add(secureDatasetReadResponse46Val42);

        vector.add(secureDatasetReadResponse47Val43);

        vector.add(secureDatasetReadResponse48Val44);

        vector.add(secureDatasetReadResponse49Val45);

        vector.add(secureDatasetReadResponse50Val46);

        vector.add(secureDatasetReadResponse51Val47);

        vector.add(secureDatasetReadResponse52Val48);

        vector.add(secureDatasetReadResponse53Val49);

        vector.add(secureDatasetReadResponse54Val50);

        vector.add(secureDatasetReadResponse55Ts);

        vector.add(secureDatasetReadResponse57Ms);

        vector.add(secureDatasetReadResponse58Seq);

        vector.add(secureDatasetReadResponse59Alm);

        vector.add(secureDatasetReadResponse60Alg);

        vector.add(secureDatasetReadResponse61N);


    }

    @Override
    public void setResponseInit(byte[] bArry) {
        super.setResponseInit(bArry);
        int size = (((int) getL().toLong() - 60));
        dses = new DS[size];
        for (int i = 0; i < size; i++) {
            dses[i] = new DS(i);
            dses[i].setResponse2(this.getBB());
            vector.add(dses[i]);
        }


    }

    public RetepEnum getID() {
        return secureDatasetReadResponse0ID;
    }

    public RetepLong getL() {
        return secureDatasetReadResponse1L;
    }

    public RetepLong getRqSeq() {
        return secureDatasetReadResponse2RqSeq;
    }

    public RetepEnum getSts() {
        return secureDatasetReadResponse3Sts;
    }

    public RetepLong getX() {
        return secureDatasetReadResponse4X;
    }

    public RetepLong getVal1() {
        return secureDatasetReadResponse5Val1;
    }

    public RetepLong getVal2() {
        return secureDatasetReadResponse6Val2;
    }

    public RetepLong getVal3() {
        return secureDatasetReadResponse7Val3;
    }

    public RetepLong getVal4() {
        return secureDatasetReadResponse8Val4;
    }

    public RetepLong getVal5() {
        return secureDatasetReadResponse9Val5;
    }

    public RetepLong getVal6() {
        return secureDatasetReadResponse10Val6;
    }

    public RetepLong getVal7() {
        return secureDatasetReadResponse11Val7;
    }

    public RetepLong getVal8() {
        return secureDatasetReadResponse12Val8;
    }

    public RetepLong getVal9() {
        return secureDatasetReadResponse13Val9;
    }

    public RetepLong getVal10() {
        return secureDatasetReadResponse14Val10;
    }

    public RetepLong getVal11() {
        return secureDatasetReadResponse15Val11;
    }

    public RetepLong getVal12() {
        return secureDatasetReadResponse16Val12;
    }

    public RetepLong getVal13() {
        return secureDatasetReadResponse17Val13;
    }

    public RetepLong getVal14() {
        return secureDatasetReadResponse18Val14;
    }

    public RetepLong getVal15() {
        return secureDatasetReadResponse19Val15;
    }

    public RetepLong getVal16() {
        return secureDatasetReadResponse20Val16;
    }

    public RetepLong getVal17() {
        return secureDatasetReadResponse21Val17;
    }

    public RetepLong getVal18() {
        return secureDatasetReadResponse22Val18;
    }

    public RetepLong getVal19() {
        return secureDatasetReadResponse23Val19;
    }

    public RetepLong getVal20() {
        return secureDatasetReadResponse24Val20;
    }

    public RetepLong getVal21() {
        return secureDatasetReadResponse25Val21;
    }

    public RetepLong getVal22() {
        return secureDatasetReadResponse26Val22;
    }

    public RetepLong getVal23() {
        return secureDatasetReadResponse27Val23;
    }

    public RetepLong getVal24() {
        return secureDatasetReadResponse28Val24;
    }

    public RetepLong getVal25() {
        return secureDatasetReadResponse29Val25;
    }

    public RetepLong getVal26() {
        return secureDatasetReadResponse30Val26;
    }

    public RetepLong getVal27() {
        return secureDatasetReadResponse31Val27;
    }

    public RetepLong getVal28() {
        return secureDatasetReadResponse32Val28;
    }

    public RetepLong getVal29() {
        return secureDatasetReadResponse33Val29;
    }

    public RetepLong getVal30() {
        return secureDatasetReadResponse34Val30;
    }

    public RetepLong getVal31() {
        return secureDatasetReadResponse35Val31;
    }

    public RetepLong getVal32() {
        return secureDatasetReadResponse36Val32;
    }

    public RetepLong getVal33() {
        return secureDatasetReadResponse37Val33;
    }

    public RetepLong getVal34() {
        return secureDatasetReadResponse38Val34;
    }

    public RetepLong getVal35() {
        return secureDatasetReadResponse39Val35;
    }

    public RetepLong getVal36() {
        return secureDatasetReadResponse40Val36;
    }

    public RetepLong getVal37() {
        return secureDatasetReadResponse41Val37;
    }

    public RetepLong getVal38() {
        return secureDatasetReadResponse42Val38;
    }

    public RetepLong getVal39() {
        return secureDatasetReadResponse43Val39;
    }

    public RetepLong getVal40() {
        return secureDatasetReadResponse44Val40;
    }

    public RetepLong getVal41() {
        return secureDatasetReadResponse45Val41;
    }

    public RetepLong getVal42() {
        return secureDatasetReadResponse46Val42;
    }

    public RetepLong getVal43() {
        return secureDatasetReadResponse47Val43;
    }

    public RetepLong getVal44() {
        return secureDatasetReadResponse48Val44;
    }

    public RetepLong getVal45() {
        return secureDatasetReadResponse49Val45;
    }

    public RetepLong getVal46() {
        return secureDatasetReadResponse50Val46;
    }

    public RetepLong getVal47() {
        return secureDatasetReadResponse51Val47;
    }

    public RetepLong getVal48() {
        return secureDatasetReadResponse52Val48;
    }

    public RetepLong getVal49() {
        return secureDatasetReadResponse53Val49;
    }

    public RetepLong getVal50() {
        return secureDatasetReadResponse54Val50;
    }

    public RetepLong getTs() {
        return secureDatasetReadResponse55Ts;
    }

    public RetepLong getMs() {
        return secureDatasetReadResponse57Ms;
    }

    public RetepLong getSeq() {
        return secureDatasetReadResponse58Seq;
    }

    public RetepEnum getAlm() {
        return secureDatasetReadResponse59Alm;
    }

    public RetepEnum getAlg() {
        return secureDatasetReadResponse60Alg;
    }

    public RetepLong getN() {
        return secureDatasetReadResponse61N;
    }

    public RetepLong getDS(int index) {
        return dses[index];
    }

    public static class ID extends RegisterEnum16 {

        public ID (TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 0, 1, "Model", "", "Compute a digial signature over a specifed set of data registers", Rw.R, Mandatory.M);
            hashtable.put((long) 4, "SunSpec Secure Dataset Read Response");
        }
    }

    public static class L extends RegisterUint16 {

public L(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    public static class RqSeq extends RegisterUint16 {

public RqSeq(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 2, 1, "Request Sequence", "", "Sequence number from the request", Rw.R, Mandatory.M);
        }
    }

    public static class Sts extends RegisterEnum16 {

public Sts(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 3, 1, "Status", "", "Status of last read operation", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "SUCCESS");
            hashtable.put((long) 1, "DS");
            hashtable.put((long) 2, "ACL");
            hashtable.put((long) 3, "OFF");
        }
    }

    public static class X extends RegisterUint16 {

public X(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 4, 1, "X", "", "Number of values from the request", Rw.R, Mandatory.M);
        }
    }

    public static class Val1 extends RegisterUint16 {

public Val1(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 5, 1, "Value1", "", "Copy of value from register Off1.", Rw.R, Mandatory.M);
        }
    }

    public static class Val2 extends RegisterUint16 {

public Val2(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 6, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val3 extends RegisterUint16 {

public Val3(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 7, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val4 extends RegisterUint16 {

public Val4(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 8, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val5 extends RegisterUint16 {

public Val5(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 9, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val6 extends RegisterUint16 {

public Val6(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 10, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val7 extends RegisterUint16 {

public Val7(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 11, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val8 extends RegisterUint16 {

public Val8(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 12, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val9 extends RegisterUint16 {

public Val9(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 13, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val10 extends RegisterUint16 {

public Val10(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 14, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val11 extends RegisterUint16 {

public Val11(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 15, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val12 extends RegisterUint16 {

public Val12(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 16, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val13 extends RegisterUint16 {

public Val13(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 17, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val14 extends RegisterUint16 {

public Val14(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 18, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val15 extends RegisterUint16 {

public Val15(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 19, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val16 extends RegisterUint16 {

public Val16(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 20, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val17 extends RegisterUint16 {

public Val17(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 21, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val18 extends RegisterUint16 {

public Val18(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 22, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val19 extends RegisterUint16 {

public Val19(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 23, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val20 extends RegisterUint16 {

public Val20(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 24, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val21 extends RegisterUint16 {

public Val21(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 25, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val22 extends RegisterUint16 {

public Val22(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 26, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val23 extends RegisterUint16 {

public Val23(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 27, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val24 extends RegisterUint16 {

public Val24(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 28, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val25 extends RegisterUint16 {

public Val25(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 29, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val26 extends RegisterUint16 {

public Val26(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 30, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val27 extends RegisterUint16 {

public Val27(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 31, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val28 extends RegisterUint16 {

public Val28(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 32, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val29 extends RegisterUint16 {

public Val29(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 33, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val30 extends RegisterUint16 {

public Val30(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 34, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val31 extends RegisterUint16 {

public Val31(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 35, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val32 extends RegisterUint16 {

public Val32(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 36, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val33 extends RegisterUint16 {

public Val33(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 37, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val34 extends RegisterUint16 {

public Val34(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 38, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val35 extends RegisterUint16 {

public Val35(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 39, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val36 extends RegisterUint16 {

public Val36(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 40, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val37 extends RegisterUint16 {

public Val37(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 41, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val38 extends RegisterUint16 {

public Val38(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 42, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val39 extends RegisterUint16 {

public Val39(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 43, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val40 extends RegisterUint16 {

public Val40(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 44, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val41 extends RegisterUint16 {

public Val41(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 45, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val42 extends RegisterUint16 {

public Val42(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 46, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val43 extends RegisterUint16 {

public Val43(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 47, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val44 extends RegisterUint16 {

public Val44(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 48, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val45 extends RegisterUint16 {

public Val45(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 49, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val46 extends RegisterUint16 {

public Val46(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 50, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val47 extends RegisterUint16 {

public Val47(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 51, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val48 extends RegisterUint16 {

public Val48(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 52, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val49 extends RegisterUint16 {

public Val49(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 53, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Val50 extends RegisterUint16 {

public Val50(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 54, 1, "", "", "", Rw.R, Mandatory.M);
        }
    }

    public static class Ts extends RegisterUint32 {

public Ts(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 55, 2, "Timestamp", "", "Timestamp value is the number of seconds since January 1, 2000", Rw.R, Mandatory.M);
        }
    }

    public static class Ms extends RegisterUint16 {

public Ms(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 57, 1, "Milliseconds", "", "Millisecond counter 0-999", Rw.R, Mandatory.M);
        }
    }

    public static class Seq extends RegisterUint16 {

public Seq(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 58, 1, "Sequence", "", "Sequence number of response", Rw.R, Mandatory.M);
        }
    }

    public static class Alm extends RegisterEnum16 {

public Alm(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 59, 1, "Alarm", "", "Bitmask alarm code", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "NONE");
            hashtable.put((long) 1, "ALM");
        }
    }

    public static class Alg extends RegisterEnum16 {

public Alg(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 60, 1, "Algorithm", "", "Algorithm used to compute the digital signature", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "NONE");
            hashtable.put((long) 1, "AES-GMAC-64");
            hashtable.put((long) 2, "ECC-256");
        }
    }

    public static class N extends RegisterUint16 {

public N(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 61, 1, "N", "", "Number of registers comprising the digital signature.", Rw.R, Mandatory.M);
        }
    }

    public class DS extends RegisterUint16 {

        private int index;

        public DS(int aIndex) {
            index = aIndex;
            init(tcpModbusHandler.getSecureDatasetReadResponse_4(), 62 + index, 1, "DS " + index, "", "Digital Signature", Rw.R, Mandatory.M);
        }
    }

}
