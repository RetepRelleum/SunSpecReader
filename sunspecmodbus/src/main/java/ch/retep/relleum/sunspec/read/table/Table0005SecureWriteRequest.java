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
public class Table0005SecureWriteRequest extends Table {

    private ID secureWriteRequest0ID;
    private L secureWriteRequest1L;
    private X secureWriteRequest2X;
    private Off1 secureWriteRequest3Off1;
    private Val1 secureWriteRequest4Val1;
    private Off2 secureWriteRequest5Off2;
    private Val2 secureWriteRequest6Val2;
    private Off3 secureWriteRequest7Off3;
    private Val3 secureWriteRequest8Val3;
    private Off4 secureWriteRequest9Off4;
    private Val4 secureWriteRequest10Val4;
    private Off5 secureWriteRequest11Off5;
    private Val5 secureWriteRequest12Val5;
    private Off6 secureWriteRequest13Off6;
    private Val6 secureWriteRequest14Val6;
    private Off7 secureWriteRequest15Off7;
    private Val7 secureWriteRequest16Val7;
    private Off8 secureWriteRequest17Off8;
    private Val8 secureWriteRequest18Val8;
    private Off9 secureWriteRequest19Off9;
    private Val9 secureWriteRequest20Val9;
    private Off10 secureWriteRequest21Off10;
    private Val10 secureWriteRequest22Val10;
    private Off11 secureWriteRequest23Off11;
    private Val11 secureWriteRequest24Val11;
    private Off12 secureWriteRequest25Off12;
    private Val12 secureWriteRequest26Val12;
    private Off13 secureWriteRequest27Off13;
    private Val13 secureWriteRequest28Val13;
    private Off14 secureWriteRequest29Off14;
    private Val14 secureWriteRequest30Val14;
    private Off15 secureWriteRequest31Off15;
    private Val15 secureWriteRequest32Val15;
    private Off16 secureWriteRequest33Off16;
    private Val16 secureWriteRequest34Val16;
    private Off17 secureWriteRequest35Off17;
    private Val17 secureWriteRequest36Val17;
    private Off18 secureWriteRequest37Off18;
    private Val18 secureWriteRequest38Val18;
    private Off19 secureWriteRequest39Off19;
    private Val19 secureWriteRequest40Val19;
    private Off20 secureWriteRequest41Off20;
    private Val20 secureWriteRequest42Val20;
    private Off21 secureWriteRequest43Off21;
    private Val21 secureWriteRequest44Val21;
    private Off22 secureWriteRequest45Off22;
    private Val22 secureWriteRequest46Val22;
    private Off23 secureWriteRequest47Off23;
    private Val23 secureWriteRequest48Val23;
    private Off24 secureWriteRequest49Off24;
    private Val24 secureWriteRequest50Val24;
    private Off25 secureWriteRequest51Off25;
    private Val25 secureWriteRequest52Val25;
    private Off26 secureWriteRequest53Off26;
    private Val26 secureWriteRequest54Val26;
    private Off27 secureWriteRequest55Off27;
    private Val27 secureWriteRequest56Val27;
    private Off28 secureWriteRequest57Off28;
    private Val28 secureWriteRequest58Val28;
    private Off29 secureWriteRequest59Off29;
    private Val29 secureWriteRequest60Val29;
    private Off30 secureWriteRequest61Off30;
    private Val30 secureWriteRequest62Val30;
    private Off31 secureWriteRequest63Off31;
    private Val31 secureWriteRequest64Val31;
    private Off32 secureWriteRequest65Off32;
    private Val32 secureWriteRequest66Val32;
    private Off33 secureWriteRequest67Off33;
    private Val33 secureWriteRequest68Val33;
    private Off34 secureWriteRequest69Off34;
    private Val34 secureWriteRequest70Val34;
    private Off35 secureWriteRequest71Off35;
    private Val35 secureWriteRequest72Val35;
    private Off36 secureWriteRequest73Off36;
    private Val36 secureWriteRequest74Val36;
    private Off37 secureWriteRequest75Off37;
    private Val37 secureWriteRequest76Val37;
    private Off38 secureWriteRequest77Off38;
    private Val38 secureWriteRequest78Val38;
    private Off39 secureWriteRequest79Off39;
    private Val39 secureWriteRequest80Val39;
    private Off40 secureWriteRequest81Off40;
    private Val40 secureWriteRequest82Val40;
    private Ts secureWriteRequest83Ts;
    private Ms secureWriteRequest85Ms;
    private Seq secureWriteRequest86Seq;
    private Role secureWriteRequest87Role;
    private Alg secureWriteRequest88Alg;
    private N secureWriteRequest89N;

    private DS secureWriteRequest90DS;

    public Table0005SecureWriteRequest(TcpModbusHandler tcpModbusHandler)

    {
        init(tcpModbusHandler.getSecureWriteRequest_5(), 0, 91, "Secure Write Request Modell", "", "Secure Write Request Modell ", Rw.R, Mandatory.M);

        secureWriteRequest0ID = new ID(tcpModbusHandler);
        secureWriteRequest1L = new L(tcpModbusHandler);
        secureWriteRequest2X = new X(tcpModbusHandler);
        secureWriteRequest3Off1 = new Off1(tcpModbusHandler);
        secureWriteRequest4Val1 = new Val1(tcpModbusHandler);
        secureWriteRequest5Off2 = new Off2(tcpModbusHandler);
        secureWriteRequest6Val2 = new Val2(tcpModbusHandler);
        secureWriteRequest7Off3 = new Off3(tcpModbusHandler);
        secureWriteRequest8Val3 = new Val3(tcpModbusHandler);
        secureWriteRequest9Off4 = new Off4(tcpModbusHandler);
        secureWriteRequest10Val4 = new Val4(tcpModbusHandler);
        secureWriteRequest11Off5 = new Off5(tcpModbusHandler);
        secureWriteRequest12Val5 = new Val5(tcpModbusHandler);
        secureWriteRequest13Off6 = new Off6(tcpModbusHandler);
        secureWriteRequest14Val6 = new Val6(tcpModbusHandler);
        secureWriteRequest15Off7 = new Off7(tcpModbusHandler);
        secureWriteRequest16Val7 = new Val7(tcpModbusHandler);
        secureWriteRequest17Off8 = new Off8(tcpModbusHandler);
        secureWriteRequest18Val8 = new Val8(tcpModbusHandler);
        secureWriteRequest19Off9 = new Off9(tcpModbusHandler);
        secureWriteRequest20Val9 = new Val9(tcpModbusHandler);
        secureWriteRequest21Off10 = new Off10(tcpModbusHandler);
        secureWriteRequest22Val10 = new Val10(tcpModbusHandler);
        secureWriteRequest23Off11 = new Off11(tcpModbusHandler);
        secureWriteRequest24Val11 = new Val11(tcpModbusHandler);
        secureWriteRequest25Off12 = new Off12(tcpModbusHandler);
        secureWriteRequest26Val12 = new Val12(tcpModbusHandler);
        secureWriteRequest27Off13 = new Off13(tcpModbusHandler);
        secureWriteRequest28Val13 = new Val13(tcpModbusHandler);
        secureWriteRequest29Off14 = new Off14(tcpModbusHandler);
        secureWriteRequest30Val14 = new Val14(tcpModbusHandler);
        secureWriteRequest31Off15 = new Off15(tcpModbusHandler);
        secureWriteRequest32Val15 = new Val15(tcpModbusHandler);
        secureWriteRequest33Off16 = new Off16(tcpModbusHandler);
        secureWriteRequest34Val16 = new Val16(tcpModbusHandler);
        secureWriteRequest35Off17 = new Off17(tcpModbusHandler);
        secureWriteRequest36Val17 = new Val17(tcpModbusHandler);
        secureWriteRequest37Off18 = new Off18(tcpModbusHandler);
        secureWriteRequest38Val18 = new Val18(tcpModbusHandler);
        secureWriteRequest39Off19 = new Off19(tcpModbusHandler);
        secureWriteRequest40Val19 = new Val19(tcpModbusHandler);
        secureWriteRequest41Off20 = new Off20(tcpModbusHandler);
        secureWriteRequest42Val20 = new Val20(tcpModbusHandler);
        secureWriteRequest43Off21 = new Off21(tcpModbusHandler);
        secureWriteRequest44Val21 = new Val21(tcpModbusHandler);
        secureWriteRequest45Off22 = new Off22(tcpModbusHandler);
        secureWriteRequest46Val22 = new Val22(tcpModbusHandler);
        secureWriteRequest47Off23 = new Off23(tcpModbusHandler);
        secureWriteRequest48Val23 = new Val23(tcpModbusHandler);
        secureWriteRequest49Off24 = new Off24(tcpModbusHandler);
        secureWriteRequest50Val24 = new Val24(tcpModbusHandler);
        secureWriteRequest51Off25 = new Off25(tcpModbusHandler);
        secureWriteRequest52Val25 = new Val25(tcpModbusHandler);
        secureWriteRequest53Off26 = new Off26(tcpModbusHandler);
        secureWriteRequest54Val26 = new Val26(tcpModbusHandler);
        secureWriteRequest55Off27 = new Off27(tcpModbusHandler);
        secureWriteRequest56Val27 = new Val27(tcpModbusHandler);
        secureWriteRequest57Off28 = new Off28(tcpModbusHandler);
        secureWriteRequest58Val28 = new Val28(tcpModbusHandler);
        secureWriteRequest59Off29 = new Off29(tcpModbusHandler);
        secureWriteRequest60Val29 = new Val29(tcpModbusHandler);
        secureWriteRequest61Off30 = new Off30(tcpModbusHandler);
        secureWriteRequest62Val30 = new Val30(tcpModbusHandler);
        secureWriteRequest63Off31 = new Off31(tcpModbusHandler);
        secureWriteRequest64Val31 = new Val31(tcpModbusHandler);
        secureWriteRequest65Off32 = new Off32(tcpModbusHandler);
        secureWriteRequest66Val32 = new Val32(tcpModbusHandler);
        secureWriteRequest67Off33 = new Off33(tcpModbusHandler);
        secureWriteRequest68Val33 = new Val33(tcpModbusHandler);
        secureWriteRequest69Off34 = new Off34(tcpModbusHandler);
        secureWriteRequest70Val34 = new Val34(tcpModbusHandler);
        secureWriteRequest71Off35 = new Off35(tcpModbusHandler);
        secureWriteRequest72Val35 = new Val35(tcpModbusHandler);
        secureWriteRequest73Off36 = new Off36(tcpModbusHandler);
        secureWriteRequest74Val36 = new Val36(tcpModbusHandler);
        secureWriteRequest75Off37 = new Off37(tcpModbusHandler);
        secureWriteRequest76Val37 = new Val37(tcpModbusHandler);
        secureWriteRequest77Off38 = new Off38(tcpModbusHandler);
        secureWriteRequest78Val38 = new Val38(tcpModbusHandler);
        secureWriteRequest79Off39 = new Off39(tcpModbusHandler);
        secureWriteRequest80Val39 = new Val39(tcpModbusHandler);
        secureWriteRequest81Off40 = new Off40(tcpModbusHandler);
        secureWriteRequest82Val40 = new Val40(tcpModbusHandler);
        secureWriteRequest83Ts = new Ts(tcpModbusHandler);
        secureWriteRequest85Ms = new Ms(tcpModbusHandler);
        secureWriteRequest86Seq = new Seq(tcpModbusHandler);
        secureWriteRequest87Role = new Role(tcpModbusHandler);
        secureWriteRequest88Alg = new Alg(tcpModbusHandler);
        secureWriteRequest89N = new N(tcpModbusHandler);


        vector.add(secureWriteRequest0ID);
        vector.add(secureWriteRequest1L);

        vector.add(secureWriteRequest2X);
        vector.add(secureWriteRequest3Off1);
        vector.add(secureWriteRequest4Val1);
        vector.add(secureWriteRequest5Off2);
        vector.add(secureWriteRequest6Val2);
        vector.add(secureWriteRequest7Off3);
        vector.add(secureWriteRequest8Val3);
        vector.add(secureWriteRequest9Off4);
        vector.add(secureWriteRequest10Val4);
        vector.add(secureWriteRequest11Off5);
        vector.add(secureWriteRequest12Val5);
        vector.add(secureWriteRequest13Off6);
        vector.add(secureWriteRequest14Val6);
        vector.add(secureWriteRequest15Off7);
        vector.add(secureWriteRequest16Val7);
        vector.add(secureWriteRequest17Off8);
        vector.add(secureWriteRequest18Val8);
        vector.add(secureWriteRequest19Off9);
        vector.add(secureWriteRequest20Val9);
        vector.add(secureWriteRequest21Off10);
        vector.add(secureWriteRequest22Val10);
        vector.add(secureWriteRequest23Off11);
        vector.add(secureWriteRequest24Val11);
        vector.add(secureWriteRequest25Off12);
        vector.add(secureWriteRequest26Val12);
        vector.add(secureWriteRequest27Off13);
        vector.add(secureWriteRequest28Val13);
        vector.add(secureWriteRequest29Off14);
        vector.add(secureWriteRequest30Val14);
        vector.add(secureWriteRequest31Off15);
        vector.add(secureWriteRequest32Val15);
        vector.add(secureWriteRequest33Off16);
        vector.add(secureWriteRequest34Val16);
        vector.add(secureWriteRequest35Off17);
        vector.add(secureWriteRequest36Val17);
        vector.add(secureWriteRequest37Off18);
        vector.add(secureWriteRequest38Val18);
        vector.add(secureWriteRequest39Off19);
        vector.add(secureWriteRequest40Val19);
        vector.add(secureWriteRequest41Off20);
        vector.add(secureWriteRequest42Val20);
        vector.add(secureWriteRequest43Off21);
        vector.add(secureWriteRequest44Val21);
        vector.add(secureWriteRequest45Off22);
        vector.add(secureWriteRequest46Val22);
        vector.add(secureWriteRequest47Off23);
        vector.add(secureWriteRequest48Val23);
        vector.add(secureWriteRequest49Off24);
        vector.add(secureWriteRequest50Val24);
        vector.add(secureWriteRequest51Off25);
        vector.add(secureWriteRequest52Val25);
        vector.add(secureWriteRequest53Off26);
        vector.add(secureWriteRequest54Val26);
        vector.add(secureWriteRequest55Off27);
        vector.add(secureWriteRequest56Val27);
        vector.add(secureWriteRequest57Off28);
        vector.add(secureWriteRequest58Val28);
        vector.add(secureWriteRequest59Off29);
        vector.add(secureWriteRequest60Val29);
        vector.add(secureWriteRequest61Off30);
        vector.add(secureWriteRequest62Val30);
        vector.add(secureWriteRequest63Off31);
        vector.add(secureWriteRequest64Val31);
        vector.add(secureWriteRequest65Off32);
        vector.add(secureWriteRequest66Val32);
        vector.add(secureWriteRequest67Off33);
        vector.add(secureWriteRequest68Val33);
        vector.add(secureWriteRequest69Off34);
        vector.add(secureWriteRequest70Val34);
        vector.add(secureWriteRequest71Off35);
        vector.add(secureWriteRequest72Val35);
        vector.add(secureWriteRequest73Off36);
        vector.add(secureWriteRequest74Val36);
        vector.add(secureWriteRequest75Off37);
        vector.add(secureWriteRequest76Val37);
        vector.add(secureWriteRequest77Off38);
        vector.add(secureWriteRequest78Val38);
        vector.add(secureWriteRequest79Off39);
        vector.add(secureWriteRequest80Val39);
        vector.add(secureWriteRequest81Off40);
        vector.add(secureWriteRequest82Val40);
        vector.add(secureWriteRequest83Ts);
        vector.add(secureWriteRequest85Ms);
        vector.add(secureWriteRequest86Seq);
        vector.add(secureWriteRequest87Role);
        vector.add(secureWriteRequest88Alg);
        vector.add(secureWriteRequest89N);

        vector.add(secureWriteRequest90DS);
    }

    public RetepEnum getID() {
        return secureWriteRequest0ID;
    }

    public RetepLong getL() {
        return secureWriteRequest1L;
    }

    public RetepLong getX() {
        return secureWriteRequest2X;
    }

    public RetepLong getOff1() {
        return secureWriteRequest3Off1;
    }

    public RetepLong getVal1() {
        return secureWriteRequest4Val1;
    }

    public RetepLong getOff2() {
        return secureWriteRequest5Off2;
    }

    public RetepLong getVal2() {
        return secureWriteRequest6Val2;
    }

    public RetepLong getOff3() {
        return secureWriteRequest7Off3;
    }

    public RetepLong getVal3() {
        return secureWriteRequest8Val3;
    }

    public RetepLong getOff4() {
        return secureWriteRequest9Off4;
    }

    public RetepLong getVal4() {
        return secureWriteRequest10Val4;
    }

    public RetepLong getOff5() {
        return secureWriteRequest11Off5;
    }

    public RetepLong getVal5() {
        return secureWriteRequest12Val5;
    }

    public RetepLong getOff6() {
        return secureWriteRequest13Off6;
    }

    public RetepLong getVal6() {
        return secureWriteRequest14Val6;
    }

    public RetepLong getOff7() {
        return secureWriteRequest15Off7;
    }

    public RetepLong getVal7() {
        return secureWriteRequest16Val7;
    }

    public RetepLong getOff8() {
        return secureWriteRequest17Off8;
    }

    public RetepLong getVal8() {
        return secureWriteRequest18Val8;
    }

    public RetepLong getOff9() {
        return secureWriteRequest19Off9;
    }

    public RetepLong getVal9() {
        return secureWriteRequest20Val9;
    }

    public RetepLong getOff10() {
        return secureWriteRequest21Off10;
    }

    public RetepLong getVal10() {
        return secureWriteRequest22Val10;
    }

    public RetepLong getOff11() {
        return secureWriteRequest23Off11;
    }

    public RetepLong getVal11() {
        return secureWriteRequest24Val11;
    }

    public RetepLong getOff12() {
        return secureWriteRequest25Off12;
    }

    public RetepLong getVal12() {
        return secureWriteRequest26Val12;
    }

    public RetepLong getOff13() {
        return secureWriteRequest27Off13;
    }

    public RetepLong getVal13() {
        return secureWriteRequest28Val13;
    }

    public RetepLong getOff14() {
        return secureWriteRequest29Off14;
    }

    public RetepLong getVal14() {
        return secureWriteRequest30Val14;
    }

    public RetepLong getOff15() {
        return secureWriteRequest31Off15;
    }

    public RetepLong getVal15() {
        return secureWriteRequest32Val15;
    }

    public RetepLong getOff16() {
        return secureWriteRequest33Off16;
    }

    public RetepLong getVal16() {
        return secureWriteRequest34Val16;
    }

    public RetepLong getOff17() {
        return secureWriteRequest35Off17;
    }

    public RetepLong getVal17() {
        return secureWriteRequest36Val17;
    }

    public RetepLong getOff18() {
        return secureWriteRequest37Off18;
    }

    public RetepLong getVal18() {
        return secureWriteRequest38Val18;
    }

    public RetepLong getOff19() {
        return secureWriteRequest39Off19;
    }

    public RetepLong getVal19() {
        return secureWriteRequest40Val19;
    }

    public RetepLong getOff20() {
        return secureWriteRequest41Off20;
    }

    public RetepLong getVal20() {
        return secureWriteRequest42Val20;
    }

    public RetepLong getOff21() {
        return secureWriteRequest43Off21;
    }

    public RetepLong getVal21() {
        return secureWriteRequest44Val21;
    }

    public RetepLong getOff22() {
        return secureWriteRequest45Off22;
    }

    public RetepLong getVal22() {
        return secureWriteRequest46Val22;
    }

    public RetepLong getOff23() {
        return secureWriteRequest47Off23;
    }

    public RetepLong getVal23() {
        return secureWriteRequest48Val23;
    }

    public RetepLong getOff24() {
        return secureWriteRequest49Off24;
    }

    public RetepLong getVal24() {
        return secureWriteRequest50Val24;
    }

    public RetepLong getOff25() {
        return secureWriteRequest51Off25;
    }

    public RetepLong getVal25() {
        return secureWriteRequest52Val25;
    }

    public RetepLong getOff26() {
        return secureWriteRequest53Off26;
    }

    public RetepLong getVal26() {
        return secureWriteRequest54Val26;
    }

    public RetepLong getOff27() {
        return secureWriteRequest55Off27;
    }

    public RetepLong getVal27() {
        return secureWriteRequest56Val27;
    }

    public RetepLong getOff28() {
        return secureWriteRequest57Off28;
    }

    public RetepLong getVal28() {
        return secureWriteRequest58Val28;
    }

    public RetepLong getOff29() {
        return secureWriteRequest59Off29;
    }

    public RetepLong getVal29() {
        return secureWriteRequest60Val29;
    }

    public RetepLong getOff30() {
        return secureWriteRequest61Off30;
    }

    public RetepLong getVal30() {
        return secureWriteRequest62Val30;
    }

    public RetepLong getOff31() {
        return secureWriteRequest63Off31;
    }

    public RetepLong getVal31() {
        return secureWriteRequest64Val31;
    }

    public RetepLong getOff32() {
        return secureWriteRequest65Off32;
    }

    public RetepLong getVal32() {
        return secureWriteRequest66Val32;
    }

    public RetepLong getOff33() {
        return secureWriteRequest67Off33;
    }

    public RetepLong getVal33() {
        return secureWriteRequest68Val33;
    }

    public RetepLong getOff34() {
        return secureWriteRequest69Off34;
    }

    public RetepLong getVal34() {
        return secureWriteRequest70Val34;
    }

    public RetepLong getOff35() {
        return secureWriteRequest71Off35;
    }

    public RetepLong getVal35() {
        return secureWriteRequest72Val35;
    }

    public RetepLong getOff36() {
        return secureWriteRequest73Off36;
    }

    public RetepLong getVal36() {
        return secureWriteRequest74Val36;
    }

    public RetepLong getOff37() {
        return secureWriteRequest75Off37;
    }

    public RetepLong getVal37() {
        return secureWriteRequest76Val37;
    }

    public RetepLong getOff38() {
        return secureWriteRequest77Off38;
    }

    public RetepLong getVal38() {
        return secureWriteRequest78Val38;
    }

    public RetepLong getOff39() {
        return secureWriteRequest79Off39;
    }

    public RetepLong getVal39() {
        return secureWriteRequest80Val39;
    }

    public RetepLong getOff40() {
        return secureWriteRequest81Off40;
    }

    public RetepLong getVal40() {
        return secureWriteRequest82Val40;
    }

    public RetepLong getTs() {
        return secureWriteRequest83Ts;
    }

    public RetepLong getMs() {
        return secureWriteRequest85Ms;
    }

    public RetepLong getSeq() {
        return secureWriteRequest86Seq;
    }

    public RetepLong getRole() {
        return secureWriteRequest87Role;
    }

    public RetepEnum getAlg() {
        return secureWriteRequest88Alg;
    }

    public RetepLong getN() {
        return secureWriteRequest89N;
    }

    public RetepLong getDS() {
        return secureWriteRequest90DS;
    }

    public class ID extends RegisterEnum16 {

        public ID(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 0, 1, "Model", "", "Include a digial signature along with the control data", Rw.R, Mandatory.M);
            hashtable.put((long) 5, "SunSpec Secure Write Request");
        }
    }

    public class L extends RegisterUint16 {

        public L(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    public class X extends RegisterUint16 {

        public X(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 2, 1, "X", "", "Number of (offset, value) pairs being written", Rw.RW, Mandatory.M);
        }
    }

    public class Off1 extends RegisterUint16 {

        public Off1(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 3, 1, "Offset1", "", "Offset of control register to write value to", Rw.RW, Mandatory.M);
        }
    }

    public class Val1 extends RegisterUint16 {

        public Val1(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 4, 1, "Value1", "", "Value to write to control register at offset", Rw.RW, Mandatory.M);
        }
    }

    public class Off2 extends RegisterUint16 {

        public Off2(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 5, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val2 extends RegisterUint16 {

        public Val2(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 6, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off3 extends RegisterUint16 {

        public Off3(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 7, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val3 extends RegisterUint16 {

        public Val3(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 8, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off4 extends RegisterUint16 {

        public Off4(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 9, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val4 extends RegisterUint16 {

        public Val4(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 10, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off5 extends RegisterUint16 {

        public Off5(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 11, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val5 extends RegisterUint16 {

        public Val5(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 12, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off6 extends RegisterUint16 {

        public Off6(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 13, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val6 extends RegisterUint16 {

        public Val6(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 14, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off7 extends RegisterUint16 {

        public Off7(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 15, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val7 extends RegisterUint16 {

        public Val7(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 16, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off8 extends RegisterUint16 {

        public Off8(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 17, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val8 extends RegisterUint16 {

        public Val8(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 18, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off9 extends RegisterUint16 {

        public Off9(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 19, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val9 extends RegisterUint16 {

        public Val9(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 20, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off10 extends RegisterUint16 {

        public Off10(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 21, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val10 extends RegisterUint16 {

        public Val10(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 22, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off11 extends RegisterUint16 {

        public Off11(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 23, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val11 extends RegisterUint16 {

        public Val11(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 24, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off12 extends RegisterUint16 {

        public Off12(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 25, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val12 extends RegisterUint16 {

        public Val12(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 26, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off13 extends RegisterUint16 {

        public Off13(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 27, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val13 extends RegisterUint16 {

        public Val13(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 28, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off14 extends RegisterUint16 {

        public Off14(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 29, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val14 extends RegisterUint16 {

        public Val14(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 30, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off15 extends RegisterUint16 {

        public Off15(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 31, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val15 extends RegisterUint16 {

        public Val15(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 32, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off16 extends RegisterUint16 {

        public Off16(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 33, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val16 extends RegisterUint16 {

        public Val16(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 34, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off17 extends RegisterUint16 {

        public Off17(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 35, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val17 extends RegisterUint16 {

        public Val17(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 36, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off18 extends RegisterUint16 {

        public Off18(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 37, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val18 extends RegisterUint16 {

        public Val18(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 38, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off19 extends RegisterUint16 {

        public Off19(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 39, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val19 extends RegisterUint16 {

        public Val19(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 40, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off20 extends RegisterUint16 {

        public Off20(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 41, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val20 extends RegisterUint16 {

        public Val20(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 42, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off21 extends RegisterUint16 {

        public Off21(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 43, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val21 extends RegisterUint16 {

        public Val21(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 44, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off22 extends RegisterUint16 {

        public Off22(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 45, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val22 extends RegisterUint16 {

        public Val22(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 46, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off23 extends RegisterUint16 {

        public Off23(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 47, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val23 extends RegisterUint16 {

        public Val23(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 48, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off24 extends RegisterUint16 {

        public Off24(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 49, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val24 extends RegisterUint16 {

        public Val24(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 50, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off25 extends RegisterUint16 {

        public Off25(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 51, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val25 extends RegisterUint16 {

        public Val25(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 52, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off26 extends RegisterUint16 {

        public Off26(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 53, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val26 extends RegisterUint16 {

        public Val26(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 54, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off27 extends RegisterUint16 {

        public Off27(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 55, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val27 extends RegisterUint16 {

        public Val27(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 56, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off28 extends RegisterUint16 {

        public Off28(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 57, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val28 extends RegisterUint16 {

        public Val28(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 58, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off29 extends RegisterUint16 {

        public Off29(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 59, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val29 extends RegisterUint16 {

        public Val29(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 60, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off30 extends RegisterUint16 {

        public Off30(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 61, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val30 extends RegisterUint16 {

        public Val30(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 62, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off31 extends RegisterUint16 {

        public Off31(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 63, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val31 extends RegisterUint16 {

        public Val31(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 64, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off32 extends RegisterUint16 {

        public Off32(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 65, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val32 extends RegisterUint16 {

        public Val32(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 66, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off33 extends RegisterUint16 {

        public Off33(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 67, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val33 extends RegisterUint16 {

        public Val33(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 68, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off34 extends RegisterUint16 {

        public Off34(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 69, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val34 extends RegisterUint16 {

        public Val34(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 70, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off35 extends RegisterUint16 {

        public Off35(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 71, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val35 extends RegisterUint16 {

        public Val35(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 72, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off36 extends RegisterUint16 {

        public Off36(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 73, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val36 extends RegisterUint16 {

        public Val36(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 74, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off37 extends RegisterUint16 {

        public Off37(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 75, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val37 extends RegisterUint16 {

        public Val37(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 76, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off38 extends RegisterUint16 {

        public Off38(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 77, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val38 extends RegisterUint16 {

        public Val38(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 78, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off39 extends RegisterUint16 {

        public Off39(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 79, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val39 extends RegisterUint16 {

        public Val39(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 80, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Off40 extends RegisterUint16 {

        public Off40(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 81, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Val40 extends RegisterUint16 {

        public Val40(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 82, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Ts extends RegisterUint32 {

        public Ts(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 83, 2, "Timestamp", "", "Timestamp value is the number of seconds since January 1, 2000", Rw.RW, Mandatory.M);
        }
    }

    public class Ms extends RegisterUint16 {

        public Ms(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 85, 1, "Milliseconds", "", "Millisecond counter 0-999", Rw.RW, Mandatory.M);
        }
    }

    public class Seq extends RegisterUint16 {

        public Seq(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 86, 1, "Sequence", "", "Sequence number of request", Rw.RW, Mandatory.M);
        }
    }

    public class Role extends RegisterUint16 {

        public Role(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 87, 1, "Role", "", "Signing key used 0-5", Rw.RW, Mandatory.M);
        }
    }

    public class Alg extends RegisterEnum16 {

        public Alg(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 88, 1, "Algorithm", "", "Algorithm used to compute the digital signature", Rw.RW, Mandatory.M);
            hashtable.put((long) 0, "NONE");
            hashtable.put((long) 1, "AES-GMAC-64");
            hashtable.put((long) 2, "ECC-256");
        }
    }

    public class N extends RegisterUint16 {

        public N(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 89, 1, "N", "", "Number of registers comprising the digital signature.", Rw.RW, Mandatory.M);
        }
    }

    public class DS extends RegisterUint16 {

        public DS(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSecureWriteRequest_5(), 90, 1, "DS", "", "Digital Signature", Rw.RW, Mandatory.O);
        }
    }

}
