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
public class Table0003SecureDatasetReadRequest extends Table {

    private ID secureDatasetReadRequest00ID;
    private L secureDatasetReadRequest01L ;
    private X secureDatasetReadRequest02X ;
    private Off1 secureDatasetReadRequest03Off1 ;
    private Off2 secureDatasetReadRequest04Off2 ;
    private Off3 secureDatasetReadRequest05Off3 ;
    private Off4 secureDatasetReadRequest06Off4 ;
    private Off5 secureDatasetReadRequest07Off5 ;
    private Off6 secureDatasetReadRequest08Off6 ;
    private Off7 secureDatasetReadRequest09Off7 ;
    private Off8 secureDatasetReadRequest10Off8 ;
    private Off9 secureDatasetReadRequest11Off9 ;
    private Off10 secureDatasetReadRequest12Off10 ;
    private Off11 secureDatasetReadRequest13Off11 ;
    private Off12 secureDatasetReadRequest14Off12 ;
    private Off13 secureDatasetReadRequest15Off13;
    private Off14 secureDatasetReadRequest16Off14;
    private Off15 secureDatasetReadRequest17Off15 ;
    private Off16 secureDatasetReadRequest18Off16 ;
    private Off17 secureDatasetReadRequest19Off17 ;
    private Off18 secureDatasetReadRequest20Off18 ;
    private Off19 secureDatasetReadRequest21Off19 ;
    private Off20 secureDatasetReadRequest22Off20 ;
    private Off21 secureDatasetReadRequest23Off21 ;
    private Off22 secureDatasetReadRequest24Off22 ;
    private Off23 secureDatasetReadRequest25Off23 ;
    private Off24 secureDatasetReadRequest26Off24 ;
    private Off25 secureDatasetReadRequest27Off25 ;
    private Off26 secureDatasetReadRequest28Off26 ;
    private Off27 secureDatasetReadRequest29Off27 ;
    private Off28 secureDatasetReadRequest30Off28 ;
    private Off29 secureDatasetReadRequest31Off29 ;
    private Off30 secureDatasetReadRequest32Off30 ;
    private Off31 secureDatasetReadRequest33Off31 ;
    private Off32 secureDatasetReadRequest34Off32 ;
    private Off33 secureDatasetReadRequest35Off33 ;
    private Off34 secureDatasetReadRequest36Off34 ;
    private Off35 secureDatasetReadRequest37Off35 ;
    private Off36 secureDatasetReadRequest38Off36 ;
    private Off37 secureDatasetReadRequest39Off37 ;
    private Off38 secureDatasetReadRequest40Off38 ;
    private Off39 secureDatasetReadRequest41Off39 ;
    private Off40 secureDatasetReadRequest42Off40 ;
    private Off41 secureDatasetReadRequest43Off41 ;
    private Off42 secureDatasetReadRequest44Off42 ;
    private Off43 secureDatasetReadRequest45Off43 ;
    private Off44 secureDatasetReadRequest46Off44 ;
    private Off45 secureDatasetReadRequest47Off45 ;
    private Off46 secureDatasetReadRequest48Off46 ;
    private Off47 secureDatasetReadRequest49Off47 ;
    private Off48 secureDatasetReadRequest50Off48 ;
    private Off49 secureDatasetReadRequest51Off49 ;
    private Off50 secureDatasetReadRequest52Off50 ;
    private Ts secureDatasetReadRequest53Ts ;
    private Ms secureDatasetReadRequest55Ms ;
    private Seq secureDatasetReadRequest56Seq;
    private Role secureDatasetReadRequest57Role ;
    private Alg secureDatasetReadRequest58Alg ;
    private N secureDatasetReadRequest59N ;
    private  DS[] dses ;
    private TcpModbusHandler tcpModbusHandler;

    public Table0003SecureDatasetReadRequest(TcpModbusHandler tcpModbusHandler)
    {
        init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 0, 61, "Secure Dataset Read Request", "", "Secure Dataset Read Request Modell ", Rw.R, Mandatory.M);
        this.tcpModbusHandler= tcpModbusHandler;
        secureDatasetReadRequest00ID = new ID(tcpModbusHandler);
        secureDatasetReadRequest01L = new L(tcpModbusHandler);
        secureDatasetReadRequest02X = new X(tcpModbusHandler);
        secureDatasetReadRequest03Off1 = new Off1(tcpModbusHandler);
       secureDatasetReadRequest04Off2 = new Off2(tcpModbusHandler);
         secureDatasetReadRequest05Off3 = new Off3(tcpModbusHandler);
        secureDatasetReadRequest06Off4 = new Off4(tcpModbusHandler);
         secureDatasetReadRequest07Off5 = new Off5(tcpModbusHandler);
      secureDatasetReadRequest08Off6 = new Off6(tcpModbusHandler);
      secureDatasetReadRequest09Off7 = new Off7(tcpModbusHandler);
       secureDatasetReadRequest10Off8 = new Off8(tcpModbusHandler);
      secureDatasetReadRequest11Off9 = new Off9(tcpModbusHandler);
       secureDatasetReadRequest12Off10 = new Off10(tcpModbusHandler);
       secureDatasetReadRequest13Off11 = new Off11(tcpModbusHandler);
      secureDatasetReadRequest14Off12 = new Off12(tcpModbusHandler);
      secureDatasetReadRequest15Off13 = new Off13(tcpModbusHandler);
       secureDatasetReadRequest16Off14 = new Off14(tcpModbusHandler);
       secureDatasetReadRequest17Off15 = new Off15(tcpModbusHandler);
       secureDatasetReadRequest18Off16 = new Off16(tcpModbusHandler);
      secureDatasetReadRequest19Off17 = new Off17(tcpModbusHandler);
       secureDatasetReadRequest20Off18 = new Off18(tcpModbusHandler);
       secureDatasetReadRequest21Off19 = new Off19(tcpModbusHandler);
      secureDatasetReadRequest22Off20 = new Off20(tcpModbusHandler);
      secureDatasetReadRequest23Off21 = new Off21(tcpModbusHandler);
     secureDatasetReadRequest24Off22 = new Off22(tcpModbusHandler);
      secureDatasetReadRequest25Off23 = new Off23(tcpModbusHandler);
       secureDatasetReadRequest26Off24 = new Off24(tcpModbusHandler);
        secureDatasetReadRequest27Off25 = new Off25(tcpModbusHandler);
       secureDatasetReadRequest28Off26 = new Off26(tcpModbusHandler);
        secureDatasetReadRequest29Off27 = new Off27(tcpModbusHandler);
        secureDatasetReadRequest30Off28 = new Off28(tcpModbusHandler);
        secureDatasetReadRequest31Off29 = new Off29(tcpModbusHandler);
       secureDatasetReadRequest32Off30 = new Off30(tcpModbusHandler);
         secureDatasetReadRequest33Off31 = new Off31(tcpModbusHandler);
        secureDatasetReadRequest34Off32 = new Off32(tcpModbusHandler);
         secureDatasetReadRequest35Off33 = new Off33(tcpModbusHandler);
       secureDatasetReadRequest36Off34 = new Off34(tcpModbusHandler);
      secureDatasetReadRequest37Off35 = new Off35(tcpModbusHandler);
        secureDatasetReadRequest38Off36 = new Off36(tcpModbusHandler);
      secureDatasetReadRequest39Off37 = new Off37(tcpModbusHandler);
         secureDatasetReadRequest40Off38 = new Off38(tcpModbusHandler);
       secureDatasetReadRequest41Off39 = new Off39(tcpModbusHandler);
      secureDatasetReadRequest42Off40 = new Off40(tcpModbusHandler);
     secureDatasetReadRequest43Off41 = new Off41(tcpModbusHandler);
        secureDatasetReadRequest44Off42 = new Off42(tcpModbusHandler);
       secureDatasetReadRequest45Off43 = new Off43(tcpModbusHandler);
      secureDatasetReadRequest46Off44 = new Off44(tcpModbusHandler);
       secureDatasetReadRequest47Off45 = new Off45(tcpModbusHandler);
       secureDatasetReadRequest48Off46 = new Off46(tcpModbusHandler);
       secureDatasetReadRequest49Off47 = new Off47(tcpModbusHandler);
      secureDatasetReadRequest50Off48 = new Off48(tcpModbusHandler);
       secureDatasetReadRequest51Off49 = new Off49(tcpModbusHandler);
       secureDatasetReadRequest52Off50 = new Off50(tcpModbusHandler);
      secureDatasetReadRequest53Ts = new Ts(tcpModbusHandler);
       secureDatasetReadRequest55Ms = new Ms(tcpModbusHandler);
      secureDatasetReadRequest56Seq = new Seq(tcpModbusHandler);
       secureDatasetReadRequest57Role = new Role(tcpModbusHandler);
       secureDatasetReadRequest58Alg = new Alg(tcpModbusHandler);
      secureDatasetReadRequest59N = new N(tcpModbusHandler);
      

        vector.add(secureDatasetReadRequest00ID);
        vector.add(secureDatasetReadRequest01L);

        vector.add(secureDatasetReadRequest02X);
        vector.add(secureDatasetReadRequest03Off1);
        vector.add(secureDatasetReadRequest04Off2);
        vector.add(secureDatasetReadRequest05Off3);
        vector.add(secureDatasetReadRequest06Off4);
        vector.add(secureDatasetReadRequest07Off5);
        vector.add(secureDatasetReadRequest08Off6);
        vector.add(secureDatasetReadRequest09Off7);
        vector.add(secureDatasetReadRequest10Off8);
        vector.add(secureDatasetReadRequest11Off9);
        vector.add(secureDatasetReadRequest12Off10);
        vector.add(secureDatasetReadRequest13Off11);
        vector.add(secureDatasetReadRequest14Off12);
        vector.add(secureDatasetReadRequest15Off13);
        vector.add(secureDatasetReadRequest16Off14);
        vector.add(secureDatasetReadRequest17Off15);
        vector.add(secureDatasetReadRequest18Off16);
        vector.add(secureDatasetReadRequest19Off17);
        vector.add(secureDatasetReadRequest20Off18);
        vector.add(secureDatasetReadRequest21Off19);
        vector.add(secureDatasetReadRequest22Off20);
        vector.add(secureDatasetReadRequest23Off21);
        vector.add(secureDatasetReadRequest24Off22);
        vector.add(secureDatasetReadRequest25Off23);
        vector.add(secureDatasetReadRequest26Off24);
        vector.add(secureDatasetReadRequest27Off25);
        vector.add(secureDatasetReadRequest28Off26);
        vector.add(secureDatasetReadRequest29Off27);
        vector.add(secureDatasetReadRequest30Off28);
        vector.add(secureDatasetReadRequest31Off29);
        vector.add(secureDatasetReadRequest32Off30);
        vector.add(secureDatasetReadRequest33Off31);
        vector.add(secureDatasetReadRequest34Off32);
        vector.add(secureDatasetReadRequest35Off33);
        vector.add(secureDatasetReadRequest36Off34);
        vector.add(secureDatasetReadRequest37Off35);
        vector.add(secureDatasetReadRequest38Off36);
        vector.add(secureDatasetReadRequest39Off37);
        vector.add(secureDatasetReadRequest40Off38);
        vector.add(secureDatasetReadRequest41Off39);
        vector.add(secureDatasetReadRequest42Off40);
        vector.add(secureDatasetReadRequest43Off41);
        vector.add(secureDatasetReadRequest44Off42);
        vector.add(secureDatasetReadRequest45Off43);
        vector.add(secureDatasetReadRequest46Off44);
        vector.add(secureDatasetReadRequest47Off45);
        vector.add(secureDatasetReadRequest48Off46);
        vector.add(secureDatasetReadRequest49Off47);
        vector.add(secureDatasetReadRequest50Off48);
        vector.add(secureDatasetReadRequest51Off49);
        vector.add(secureDatasetReadRequest52Off50);
        vector.add(secureDatasetReadRequest53Ts);
        vector.add(secureDatasetReadRequest55Ms);
        vector.add(secureDatasetReadRequest56Seq);
        vector.add(secureDatasetReadRequest57Role);
        vector.add(secureDatasetReadRequest58Alg);
        vector.add(secureDatasetReadRequest59N);


    }
    @Override
    public void setResponseInit(byte[] bArry) {
        super.setResponseInit(bArry);
        int size = (((int) getL().toLong() - 58));
        dses= new DS[size];
        for (int i = 0; i < size; i++) {
            dses[i]=new DS(i,tcpModbusHandler);
            dses[i].setResponse2(this.getBB());
            vector.add(dses[i]);
        }



        }

    public RetepEnum getID() {
        return secureDatasetReadRequest00ID;
    }

    public RetepLong getL() {
        return secureDatasetReadRequest01L;
    }

    public RetepLong getX() {
        return secureDatasetReadRequest02X;
    }

    public RetepLong getOff1() {
        return secureDatasetReadRequest03Off1;
    }

    public RetepLong getOff2() {
        return secureDatasetReadRequest04Off2;
    }

    public RetepLong getOff3() {
        return secureDatasetReadRequest05Off3;
    }

    public RetepLong getOff4() {
        return secureDatasetReadRequest06Off4;
    }

    public RetepLong getOff5() {
        return secureDatasetReadRequest07Off5;
    }

    public RetepLong getOff6() {
        return secureDatasetReadRequest08Off6;
    }

    public RetepLong getOff7() {
        return secureDatasetReadRequest09Off7;
    }

    public RetepLong getOff8() {
        return secureDatasetReadRequest10Off8;
    }

    public RetepLong getOff9() {
        return secureDatasetReadRequest11Off9;
    }

    public RetepLong getOff10() {
        return secureDatasetReadRequest12Off10;
    }

    public RetepLong getOff11() {
        return secureDatasetReadRequest13Off11;
    }

    public RetepLong getOff12() {
        return secureDatasetReadRequest14Off12;
    }

    public RetepLong getOff13() {
        return secureDatasetReadRequest15Off13;
    }

    public RetepLong getOff14() {
        return secureDatasetReadRequest16Off14;
    }

    public RetepLong getOff15() {
        return secureDatasetReadRequest17Off15;
    }

    public RetepLong getOff16() {
        return secureDatasetReadRequest18Off16;
    }

    public RetepLong getOff17() {
        return secureDatasetReadRequest19Off17;
    }

    public RetepLong getOff18() {
        return secureDatasetReadRequest20Off18;
    }

    public RetepLong getOff19() {
        return secureDatasetReadRequest21Off19;
    }

    public RetepLong getOff20() {
        return secureDatasetReadRequest22Off20;
    }

    public RetepLong getOff21() {
        return secureDatasetReadRequest23Off21;
    }

    public RetepLong getOff22() {
        return secureDatasetReadRequest24Off22;
    }

    public RetepLong getOff23() {
        return secureDatasetReadRequest25Off23;
    }

    public RetepLong getOff24() {
        return secureDatasetReadRequest26Off24;
    }

    public RetepLong getOff25() {
        return secureDatasetReadRequest27Off25;
    }

    public RetepLong getOff26() {
        return secureDatasetReadRequest28Off26;
    }

    public RetepLong getOff27() {
        return secureDatasetReadRequest29Off27;
    }

    public RetepLong getOff28() {
        return secureDatasetReadRequest30Off28;
    }

    public RetepLong getOff29() {
        return secureDatasetReadRequest31Off29;
    }

    public RetepLong getOff30() {
        return secureDatasetReadRequest32Off30;
    }

    public RetepLong getOff31() {
        return secureDatasetReadRequest33Off31;
    }

    public RetepLong getOff32() {
        return secureDatasetReadRequest34Off32;
    }

    public RetepLong getOff33() {
        return secureDatasetReadRequest35Off33;
    }

    public RetepLong getOff34() {
        return secureDatasetReadRequest36Off34;
    }

    public RetepLong getOff35() {
        return secureDatasetReadRequest37Off35;
    }

    public RetepLong getOff36() {
        return secureDatasetReadRequest38Off36;
    }

    public RetepLong getOff37() {
        return secureDatasetReadRequest39Off37;
    }

    public RetepLong getOff38() {
        return secureDatasetReadRequest40Off38;
    }

    public RetepLong getOff39() {
        return secureDatasetReadRequest41Off39;
    }

    public RetepLong getOff40() {
        return secureDatasetReadRequest42Off40;
    }

    public RetepLong getOff41() {
        return secureDatasetReadRequest43Off41;
    }

    public RetepLong getOff42() {
        return secureDatasetReadRequest44Off42;
    }

    public RetepLong getOff43() {
        return secureDatasetReadRequest45Off43;
    }

    public RetepLong getOff44() {
        return secureDatasetReadRequest46Off44;
    }

    public RetepLong getOff45() {
        return secureDatasetReadRequest47Off45;
    }

    public RetepLong getOff46() {
        return secureDatasetReadRequest48Off46;
    }

    public RetepLong getOff47() {
        return secureDatasetReadRequest49Off47;
    }

    public RetepLong getOff48() {
        return secureDatasetReadRequest50Off48;
    }

    public RetepLong getOff49() {
        return secureDatasetReadRequest51Off49;
    }

    public RetepLong getOff50() {
        return secureDatasetReadRequest52Off50;
    }

    public RetepLong getTs() {
        return secureDatasetReadRequest53Ts;
    }

    public RetepLong getMs() {
        return secureDatasetReadRequest55Ms;
    }

    public RetepLong getSeq() {
        return secureDatasetReadRequest56Seq;
    }

    public RetepLong getRole() {
        return secureDatasetReadRequest57Role;
    }

    public RetepEnum getAlg() {
        return secureDatasetReadRequest58Alg;
    }

    public RetepLong getN() {
        return secureDatasetReadRequest59N;
    }

    public RetepLong getDS(int index ) {
        return dses[index];
    }

    public  class ID extends RegisterEnum16 {
    
     public ID (TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 0, 1, "Model", "", "Request a digial signature over a specifed set of data registers", Rw.R, Mandatory.M);
            hashtable.put((long) 3, "SunSpec Secure Dataset Read Reques");
        }
    }

    public  class L extends RegisterUint16 {

        public L(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    public  class X extends RegisterUint16 {

        public X(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 2, 1, "X", "", "Number of registers being requested", Rw.RW, Mandatory.M);
        }
    }

    public  class Off1 extends RegisterUint16 {

        public Off1(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 3, 1, "Offset1", "", "Offset of value to read", Rw.RW, Mandatory.M);
        }
    }

    public  class Off2 extends RegisterUint16 {

        public Off2(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 4, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off3 extends RegisterUint16 {

        public Off3(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 5, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off4 extends RegisterUint16 {

        public Off4(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 6, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off5 extends RegisterUint16 {

        public Off5(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 7, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off6 extends RegisterUint16 {

        public Off6(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 8, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off7 extends RegisterUint16 {

        public Off7(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 9, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off8 extends RegisterUint16 {

        public Off8(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 10, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off9 extends RegisterUint16 {

        public Off9(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 11, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off10 extends RegisterUint16 {

        public Off10(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 12, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off11 extends RegisterUint16 {

        public Off11(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 13, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off12 extends RegisterUint16 {

        public Off12(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 14, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off13 extends RegisterUint16 {

        public Off13(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 15, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off14 extends RegisterUint16 {

        public Off14(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 16, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off15 extends RegisterUint16 {

        public Off15(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 17, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off16 extends RegisterUint16 {

        public Off16(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 18, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off17 extends RegisterUint16 {

        public Off17(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 19, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off18 extends RegisterUint16 {

        public Off18(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 20, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off19 extends RegisterUint16 {

        public Off19(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 21, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off20 extends RegisterUint16 {

        public Off20(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 22, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off21 extends RegisterUint16 {

        public Off21(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 23, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off22 extends RegisterUint16 {

        public Off22(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 24, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off23 extends RegisterUint16 {

        public Off23(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 25, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off24 extends RegisterUint16 {

        public Off24(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 26, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off25 extends RegisterUint16 {

        public Off25(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 27, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off26 extends RegisterUint16 {

        public Off26(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 28, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off27 extends RegisterUint16 {

        public Off27(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 29, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off28 extends RegisterUint16 {

        public Off28(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 30, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off29 extends RegisterUint16 {

        public Off29(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 31, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off30 extends RegisterUint16 {

        public Off30(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 32, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off31 extends RegisterUint16 {

        public Off31(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 33, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off32 extends RegisterUint16 {

        public Off32(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 34, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off33 extends RegisterUint16 {

        public Off33(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 35, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off34 extends RegisterUint16 {

        public Off34(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 36, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off35 extends RegisterUint16 {

        public Off35(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 37, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off36 extends RegisterUint16 {

        public Off36(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 38, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off37 extends RegisterUint16 {

        public Off37(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 39, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off38 extends RegisterUint16 {

        public Off38(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 40, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off39 extends RegisterUint16 {

        public Off39(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 41, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off40 extends RegisterUint16 {

        public Off40(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 42, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off41 extends RegisterUint16 {

        public Off41(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 43, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off42 extends RegisterUint16 {

        public Off42(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 44, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off43 extends RegisterUint16 {

        public Off43(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 45, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off44 extends RegisterUint16 {

        public Off44(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 46, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off45 extends RegisterUint16 {

        public Off45(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 47, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off46 extends RegisterUint16 {

        public Off46(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 48, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off47 extends RegisterUint16 {

        public Off47(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 49, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off48 extends RegisterUint16 {

        public Off48(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 50, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off49 extends RegisterUint16 {

        public Off49(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 51, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Off50 extends RegisterUint16 {

        public Off50(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 52, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public  class Ts extends RegisterUint32 {

        public Ts(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 53, 2, "Timestamp", "", "Timestamp value is the number of seconds since January 1, 2000", Rw.RW, Mandatory.M);
        }
    }

    public  class Ms extends RegisterUint16 {

        public Ms(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 55, 1, "Milliseconds", "", "Millisecond counter 0-999", Rw.RW, Mandatory.M);
        }
    }

    public  class Seq extends RegisterUint16 {

        public Seq(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 56, 1, "Sequence", "", "Sequence number of request", Rw.RW, Mandatory.M);
        }
    }

    public  class Role extends RegisterUint16 {

        public Role(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 57, 1, "Role", "", "Digital Signature ID", Rw.RW, Mandatory.M);
        }
    }

    public  class Alg extends RegisterEnum16 {

        public Alg(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 58, 1, "Algorithm", "", "Algorithm used to compute the digital signature", Rw.R, Mandatory.M);
            hashtable.put((long) 0, "NONE");
            hashtable.put((long) 1, "AES-GMAC-64");
            hashtable.put((long) 2, "ECC-256");
        }
    }

    public  class N extends RegisterUint16 {

        public N(TcpModbusHandler tcpModbusHandler)    {
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 59, 1, "N", "", "Number of registers comprising the digital signature.", Rw.R, Mandatory.M);
        }
    }

    public  class DS extends RegisterUint16 {
        private int index;
        public DS(int aIndex,TcpModbusHandler tcpModbusHandler) {
            index = aIndex;
            init(tcpModbusHandler.getSecureDatasetReadRequest_3(), 60+ index , 1, "DS "+index, "", "Digital Signature", Rw.R, Mandatory.M);
        }

    }

}
