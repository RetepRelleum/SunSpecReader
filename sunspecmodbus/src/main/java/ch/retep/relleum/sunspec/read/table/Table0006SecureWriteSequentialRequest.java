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

public class Table0006SecureWriteSequentialRequest extends Table {

    private  ID SecureWriteSequentialRequest0ID ;
    private  L SecureWriteSequentialRequest1L ;

    private  X SecureWriteSequentialRequest2X ;
    private  Off SecureWriteSequentialRequest3Off ;
    private  Val1 SecureWriteSequentialRequest4Val1 ;
    private  Val2 SecureWriteSequentialRequest5Val2 ;
    private  Val3 SecureWriteSequentialRequest6Val3 ;
    private  Val4 SecureWriteSequentialRequest7Val4 ;
    private  Val5 SecureWriteSequentialRequest8Val5 ;
    private  Val6 SecureWriteSequentialRequest9Val6 ;
    private  Val7 SecureWriteSequentialRequest10Val7 ;
    private  Val8 SecureWriteSequentialRequest11Val8 ;
    private  Val9 SecureWriteSequentialRequest12Val9 ;
    private  Val10 SecureWriteSequentialRequest13Val10 ;
    private  Val11 SecureWriteSequentialRequest14Val11 ;
    private  Val12 SecureWriteSequentialRequest15Val12 ;
    private  Val13 SecureWriteSequentialRequest16Val13 ;
    private  Val14 SecureWriteSequentialRequest17Val14 ;
    private  Val15 SecureWriteSequentialRequest18Val15 ;
    private  Val16 SecureWriteSequentialRequest19Val16 ;
    private  Val17 SecureWriteSequentialRequest20Val17 ;
    private  Val18 SecureWriteSequentialRequest21Val18 ;
    private  Val19 SecureWriteSequentialRequest22Val19 ;
    private  Val20 SecureWriteSequentialRequest23Val20 ;
    private  Val21 SecureWriteSequentialRequest24Val21 ;
    private  Val22 SecureWriteSequentialRequest25Val22 ;
    private  Val23 SecureWriteSequentialRequest26Val23 ;
    private  Val24 SecureWriteSequentialRequest27Val24 ;
    private  Val25 SecureWriteSequentialRequest28Val25 ;
    private  Val26 SecureWriteSequentialRequest29Val26 ;
    private  Val27 SecureWriteSequentialRequest30Val27 ;
    private  Val28 SecureWriteSequentialRequest31Val28 ;
    private  Val29 SecureWriteSequentialRequest32Val29 ;
    private  Val30 SecureWriteSequentialRequest33Val30 ;
    private  Val31 SecureWriteSequentialRequest34Val31 ;
    private  Val32 SecureWriteSequentialRequest35Val32 ;
    private  Val33 SecureWriteSequentialRequest36Val33 ;
    private  Val34 SecureWriteSequentialRequest37Val34 ;
    private  Val35 SecureWriteSequentialRequest38Val35 ;
    private  Val36 SecureWriteSequentialRequest39Val36 ;
    private  Val37 SecureWriteSequentialRequest40Val37 ;
    private  Val38 SecureWriteSequentialRequest41Val38 ;
    private  Val39 SecureWriteSequentialRequest42Val39 ;
    private  Val40 SecureWriteSequentialRequest43Val40 ;
    private  Val41 SecureWriteSequentialRequest44Val41 ;
    private  Val42 SecureWriteSequentialRequest45Val42 ;
    private  Val43 SecureWriteSequentialRequest46Val43 ;
    private  Val44 SecureWriteSequentialRequest47Val44 ;
    private  Val45 SecureWriteSequentialRequest48Val45 ;
    private  Val46 SecureWriteSequentialRequest49Val46 ;
    private  Val47 SecureWriteSequentialRequest50Val47 ;
    private  Val48 SecureWriteSequentialRequest51Val48 ;
    private  Val49 SecureWriteSequentialRequest52Val49 ;
    private  Val50 SecureWriteSequentialRequest53Val50 ;
    private  Val51 SecureWriteSequentialRequest54Val51 ;
    private  Val52 SecureWriteSequentialRequest55Val52 ;
    private  Val53 SecureWriteSequentialRequest56Val53 ;
    private  Val54 SecureWriteSequentialRequest57Val54 ;
    private  Val55 SecureWriteSequentialRequest58Val55 ;
    private  Val56 SecureWriteSequentialRequest59Val56 ;
    private  Val57 SecureWriteSequentialRequest60Val57 ;
    private  Val58 SecureWriteSequentialRequest61Val58 ;
    private  Val59 SecureWriteSequentialRequest62Val59 ;
    private  Val60 SecureWriteSequentialRequest63Val60 ;
    private  Val61 SecureWriteSequentialRequest64Val61 ;
    private  Val62 SecureWriteSequentialRequest65Val62 ;
    private  Val63 SecureWriteSequentialRequest66Val63 ;
    private  Val64 SecureWriteSequentialRequest67Val64 ;
    private  Val65 SecureWriteSequentialRequest68Val65 ;
    private  Val66 SecureWriteSequentialRequest69Val66 ;
    private  Val67 SecureWriteSequentialRequest70Val67 ;
    private  Val68 SecureWriteSequentialRequest71Val68 ;
    private  Val69 SecureWriteSequentialRequest72Val69 ;
    private  Val70 SecureWriteSequentialRequest73Val70 ;
    private  Val71 SecureWriteSequentialRequest74Val71 ;
    private  Val72 SecureWriteSequentialRequest75Val72 ;
    private  Val73 SecureWriteSequentialRequest76Val73 ;
    private  Val74 SecureWriteSequentialRequest77Val74 ;
    private  Val75 SecureWriteSequentialRequest78Val75 ;
    private  Val76 SecureWriteSequentialRequest79Val76 ;
    private  Val77 SecureWriteSequentialRequest80Val77 ;
    private  Val78 SecureWriteSequentialRequest81Val78 ;
    private  Val79 SecureWriteSequentialRequest82Val79 ;
    private  Val80 SecureWriteSequentialRequest83Val80 ;
    private  Ts SecureWriteSequentialRequest84Ts ;
    private  Ms SecureWriteSequentialRequest86Ms ;
    private  Seq SecureWriteSequentialRequest87Seq ;
    private  Role SecureWriteSequentialRequest88Role ;
    private  Rsrvd SecureWriteSequentialRequest89Rsrvd ;
    private  Alg SecureWriteSequentialRequest90Alg ;
    private  N SecureWriteSequentialRequest91N ;

    private  DS SecureWriteSequentialRequest92DS ;
   public Table0006SecureWriteSequentialRequest(TcpModbusHandler tcpModbusHandler)
    {
        init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 0, 93, "Secure Write Sequential Request Modell", "", "Secure Write Sequential Request Modell ", Rw.R, Mandatory.M);


         SecureWriteSequentialRequest0ID = new ID(tcpModbusHandler);
         SecureWriteSequentialRequest1L = new L(tcpModbusHandler);

         SecureWriteSequentialRequest2X = new X(tcpModbusHandler);
         SecureWriteSequentialRequest3Off = new Off(tcpModbusHandler);
         SecureWriteSequentialRequest4Val1 = new Val1(tcpModbusHandler);
         SecureWriteSequentialRequest5Val2 = new Val2(tcpModbusHandler);
         SecureWriteSequentialRequest6Val3 = new Val3(tcpModbusHandler);
         SecureWriteSequentialRequest7Val4 = new Val4(tcpModbusHandler);
         SecureWriteSequentialRequest8Val5 = new Val5(tcpModbusHandler);
         SecureWriteSequentialRequest9Val6 = new Val6(tcpModbusHandler);
         SecureWriteSequentialRequest10Val7 = new Val7(tcpModbusHandler);
         SecureWriteSequentialRequest11Val8 = new Val8(tcpModbusHandler);
         SecureWriteSequentialRequest12Val9 = new Val9(tcpModbusHandler);
         SecureWriteSequentialRequest13Val10 = new Val10(tcpModbusHandler);
         SecureWriteSequentialRequest14Val11 = new Val11(tcpModbusHandler);
         SecureWriteSequentialRequest15Val12 = new Val12(tcpModbusHandler);
         SecureWriteSequentialRequest16Val13 = new Val13(tcpModbusHandler);
         SecureWriteSequentialRequest17Val14 = new Val14(tcpModbusHandler);
         SecureWriteSequentialRequest18Val15 = new Val15(tcpModbusHandler);
         SecureWriteSequentialRequest19Val16 = new Val16(tcpModbusHandler);
         SecureWriteSequentialRequest20Val17 = new Val17(tcpModbusHandler);
         SecureWriteSequentialRequest21Val18 = new Val18(tcpModbusHandler);
         SecureWriteSequentialRequest22Val19 = new Val19(tcpModbusHandler);
         SecureWriteSequentialRequest23Val20 = new Val20(tcpModbusHandler);
         SecureWriteSequentialRequest24Val21 = new Val21(tcpModbusHandler);
         SecureWriteSequentialRequest25Val22 = new Val22(tcpModbusHandler);
         SecureWriteSequentialRequest26Val23 = new Val23(tcpModbusHandler);
         SecureWriteSequentialRequest27Val24 = new Val24(tcpModbusHandler);
         SecureWriteSequentialRequest28Val25 = new Val25(tcpModbusHandler);
         SecureWriteSequentialRequest29Val26 = new Val26(tcpModbusHandler);
         SecureWriteSequentialRequest30Val27 = new Val27(tcpModbusHandler);
         SecureWriteSequentialRequest31Val28 = new Val28(tcpModbusHandler);
         SecureWriteSequentialRequest32Val29 = new Val29(tcpModbusHandler);
         SecureWriteSequentialRequest33Val30 = new Val30(tcpModbusHandler);
         SecureWriteSequentialRequest34Val31 = new Val31(tcpModbusHandler);
         SecureWriteSequentialRequest35Val32 = new Val32(tcpModbusHandler);
         SecureWriteSequentialRequest36Val33 = new Val33(tcpModbusHandler);
         SecureWriteSequentialRequest37Val34 = new Val34(tcpModbusHandler);
         SecureWriteSequentialRequest38Val35 = new Val35(tcpModbusHandler);
         SecureWriteSequentialRequest39Val36 = new Val36(tcpModbusHandler);
         SecureWriteSequentialRequest40Val37 = new Val37(tcpModbusHandler);
         SecureWriteSequentialRequest41Val38 = new Val38(tcpModbusHandler);
         SecureWriteSequentialRequest42Val39 = new Val39(tcpModbusHandler);
         SecureWriteSequentialRequest43Val40 = new Val40(tcpModbusHandler);
         SecureWriteSequentialRequest44Val41 = new Val41(tcpModbusHandler);
         SecureWriteSequentialRequest45Val42 = new Val42(tcpModbusHandler);
         SecureWriteSequentialRequest46Val43 = new Val43(tcpModbusHandler);
         SecureWriteSequentialRequest47Val44 = new Val44(tcpModbusHandler);
         SecureWriteSequentialRequest48Val45 = new Val45(tcpModbusHandler);
         SecureWriteSequentialRequest49Val46 = new Val46(tcpModbusHandler);
         SecureWriteSequentialRequest50Val47 = new Val47(tcpModbusHandler);
         SecureWriteSequentialRequest51Val48 = new Val48(tcpModbusHandler);
         SecureWriteSequentialRequest52Val49 = new Val49(tcpModbusHandler);
         SecureWriteSequentialRequest53Val50 = new Val50(tcpModbusHandler);
         SecureWriteSequentialRequest54Val51 = new Val51(tcpModbusHandler);
         SecureWriteSequentialRequest55Val52 = new Val52(tcpModbusHandler);
         SecureWriteSequentialRequest56Val53 = new Val53(tcpModbusHandler);
         SecureWriteSequentialRequest57Val54 = new Val54(tcpModbusHandler);
         SecureWriteSequentialRequest58Val55 = new Val55(tcpModbusHandler);
         SecureWriteSequentialRequest59Val56 = new Val56(tcpModbusHandler);
         SecureWriteSequentialRequest60Val57 = new Val57(tcpModbusHandler);
         SecureWriteSequentialRequest61Val58 = new Val58(tcpModbusHandler);
         SecureWriteSequentialRequest62Val59 = new Val59(tcpModbusHandler);
         SecureWriteSequentialRequest63Val60 = new Val60(tcpModbusHandler);
         SecureWriteSequentialRequest64Val61 = new Val61(tcpModbusHandler);
         SecureWriteSequentialRequest65Val62 = new Val62(tcpModbusHandler);
         SecureWriteSequentialRequest66Val63 = new Val63(tcpModbusHandler);
         SecureWriteSequentialRequest67Val64 = new Val64(tcpModbusHandler);
         SecureWriteSequentialRequest68Val65 = new Val65(tcpModbusHandler);
         SecureWriteSequentialRequest69Val66 = new Val66(tcpModbusHandler);
         SecureWriteSequentialRequest70Val67 = new Val67(tcpModbusHandler);
         SecureWriteSequentialRequest71Val68 = new Val68(tcpModbusHandler);
         SecureWriteSequentialRequest72Val69 = new Val69(tcpModbusHandler);
         SecureWriteSequentialRequest73Val70 = new Val70(tcpModbusHandler);
         SecureWriteSequentialRequest74Val71 = new Val71(tcpModbusHandler);
         SecureWriteSequentialRequest75Val72 = new Val72(tcpModbusHandler);
         SecureWriteSequentialRequest76Val73 = new Val73(tcpModbusHandler);
         SecureWriteSequentialRequest77Val74 = new Val74(tcpModbusHandler);
         SecureWriteSequentialRequest78Val75 = new Val75(tcpModbusHandler);
         SecureWriteSequentialRequest79Val76 = new Val76(tcpModbusHandler);
         SecureWriteSequentialRequest80Val77 = new Val77(tcpModbusHandler);
         SecureWriteSequentialRequest81Val78 = new Val78(tcpModbusHandler);
         SecureWriteSequentialRequest82Val79 = new Val79(tcpModbusHandler);
         SecureWriteSequentialRequest83Val80 = new Val80(tcpModbusHandler);
         SecureWriteSequentialRequest84Ts = new Ts(tcpModbusHandler);
         SecureWriteSequentialRequest86Ms = new Ms(tcpModbusHandler);
         SecureWriteSequentialRequest87Seq = new Seq(tcpModbusHandler);
         SecureWriteSequentialRequest88Role = new Role(tcpModbusHandler);
         SecureWriteSequentialRequest89Rsrvd = new Rsrvd(tcpModbusHandler);
         SecureWriteSequentialRequest90Alg = new Alg(tcpModbusHandler);
         SecureWriteSequentialRequest91N = new N(tcpModbusHandler);
        SecureWriteSequentialRequest92DS= new DS(tcpModbusHandler);
     
     
        vector.add(SecureWriteSequentialRequest0ID);
        vector.add(SecureWriteSequentialRequest1L);

        vector.add(SecureWriteSequentialRequest2X);
        vector.add(SecureWriteSequentialRequest3Off);
        vector.add(SecureWriteSequentialRequest4Val1);
        vector.add(SecureWriteSequentialRequest5Val2);
        vector.add(SecureWriteSequentialRequest6Val3);
        vector.add(SecureWriteSequentialRequest7Val4);
        vector.add(SecureWriteSequentialRequest8Val5);
        vector.add(SecureWriteSequentialRequest9Val6);
        vector.add(SecureWriteSequentialRequest10Val7);
        vector.add(SecureWriteSequentialRequest11Val8);
        vector.add(SecureWriteSequentialRequest12Val9);
        vector.add(SecureWriteSequentialRequest13Val10);
        vector.add(SecureWriteSequentialRequest14Val11);
        vector.add(SecureWriteSequentialRequest15Val12);
        vector.add(SecureWriteSequentialRequest16Val13);
        vector.add(SecureWriteSequentialRequest17Val14);
        vector.add(SecureWriteSequentialRequest18Val15);
        vector.add(SecureWriteSequentialRequest19Val16);
        vector.add(SecureWriteSequentialRequest20Val17);
        vector.add(SecureWriteSequentialRequest21Val18);
        vector.add(SecureWriteSequentialRequest22Val19);
        vector.add(SecureWriteSequentialRequest23Val20);
        vector.add(SecureWriteSequentialRequest24Val21);
        vector.add(SecureWriteSequentialRequest25Val22);
        vector.add(SecureWriteSequentialRequest26Val23);
        vector.add(SecureWriteSequentialRequest27Val24);
        vector.add(SecureWriteSequentialRequest28Val25);
        vector.add(SecureWriteSequentialRequest29Val26);
        vector.add(SecureWriteSequentialRequest30Val27);
        vector.add(SecureWriteSequentialRequest31Val28);
        vector.add(SecureWriteSequentialRequest32Val29);
        vector.add(SecureWriteSequentialRequest33Val30);
        vector.add(SecureWriteSequentialRequest34Val31);
        vector.add(SecureWriteSequentialRequest35Val32);
        vector.add(SecureWriteSequentialRequest36Val33);
        vector.add(SecureWriteSequentialRequest37Val34);
        vector.add(SecureWriteSequentialRequest38Val35);
        vector.add(SecureWriteSequentialRequest39Val36);
        vector.add(SecureWriteSequentialRequest40Val37);
        vector.add(SecureWriteSequentialRequest41Val38);
        vector.add(SecureWriteSequentialRequest42Val39);
        vector.add(SecureWriteSequentialRequest43Val40);
        vector.add(SecureWriteSequentialRequest44Val41);
        vector.add(SecureWriteSequentialRequest45Val42);
        vector.add(SecureWriteSequentialRequest46Val43);
        vector.add(SecureWriteSequentialRequest47Val44);
        vector.add(SecureWriteSequentialRequest48Val45);
        vector.add(SecureWriteSequentialRequest49Val46);
        vector.add(SecureWriteSequentialRequest50Val47);
        vector.add(SecureWriteSequentialRequest51Val48);
        vector.add(SecureWriteSequentialRequest52Val49);
        vector.add(SecureWriteSequentialRequest53Val50);
        vector.add(SecureWriteSequentialRequest54Val51);
        vector.add(SecureWriteSequentialRequest55Val52);
        vector.add(SecureWriteSequentialRequest56Val53);
        vector.add(SecureWriteSequentialRequest57Val54);
        vector.add(SecureWriteSequentialRequest58Val55);
        vector.add(SecureWriteSequentialRequest59Val56);
        vector.add(SecureWriteSequentialRequest60Val57);
        vector.add(SecureWriteSequentialRequest61Val58);
        vector.add(SecureWriteSequentialRequest62Val59);
        vector.add(SecureWriteSequentialRequest63Val60);
        vector.add(SecureWriteSequentialRequest64Val61);
        vector.add(SecureWriteSequentialRequest65Val62);
        vector.add(SecureWriteSequentialRequest66Val63);
        vector.add(SecureWriteSequentialRequest67Val64);
        vector.add(SecureWriteSequentialRequest68Val65);
        vector.add(SecureWriteSequentialRequest69Val66);
        vector.add(SecureWriteSequentialRequest70Val67);
        vector.add(SecureWriteSequentialRequest71Val68);
        vector.add(SecureWriteSequentialRequest72Val69);
        vector.add(SecureWriteSequentialRequest73Val70);
        vector.add(SecureWriteSequentialRequest74Val71);
        vector.add(SecureWriteSequentialRequest75Val72);
        vector.add(SecureWriteSequentialRequest76Val73);
        vector.add(SecureWriteSequentialRequest77Val74);
        vector.add(SecureWriteSequentialRequest78Val75);
        vector.add(SecureWriteSequentialRequest79Val76);
        vector.add(SecureWriteSequentialRequest80Val77);
        vector.add(SecureWriteSequentialRequest81Val78);
        vector.add(SecureWriteSequentialRequest82Val79);
        vector.add(SecureWriteSequentialRequest83Val80);
        vector.add(SecureWriteSequentialRequest84Ts);
        vector.add(SecureWriteSequentialRequest86Ms);
        vector.add(SecureWriteSequentialRequest87Seq);
        vector.add(SecureWriteSequentialRequest88Role);
        vector.add(SecureWriteSequentialRequest89Rsrvd);
        vector.add(SecureWriteSequentialRequest90Alg);
        vector.add(SecureWriteSequentialRequest91N);

        vector.add(SecureWriteSequentialRequest92DS);

    }

    public RetepEnum getID() {
        return SecureWriteSequentialRequest0ID;
    }

    public RetepLong getL() {
        return SecureWriteSequentialRequest1L;
    }

    public RetepLong getX() {
        return SecureWriteSequentialRequest2X;
    }

    public RetepLong getOff() {
        return SecureWriteSequentialRequest3Off;
    }

    public RetepLong getVal1() {
        return SecureWriteSequentialRequest4Val1;
    }

    public RetepLong getVal2() {
        return SecureWriteSequentialRequest5Val2;
    }

    public RetepLong getVal3() {
        return SecureWriteSequentialRequest6Val3;
    }

    public RetepLong getVal4() {
        return SecureWriteSequentialRequest7Val4;
    }

    public RetepLong getVal5() {
        return SecureWriteSequentialRequest8Val5;
    }

    public RetepLong getVal6() {
        return SecureWriteSequentialRequest9Val6;
    }

    public RetepLong getVal7() {
        return SecureWriteSequentialRequest10Val7;
    }

    public RetepLong getVal8() {
        return SecureWriteSequentialRequest11Val8;
    }

    public RetepLong getVal9() {
        return SecureWriteSequentialRequest12Val9;
    }

    public RetepLong getVal10() {
        return SecureWriteSequentialRequest13Val10;
    }

    public RetepLong getVal11() {
        return SecureWriteSequentialRequest14Val11;
    }

    public RetepLong getVal12() {
        return SecureWriteSequentialRequest15Val12;
    }

    public RetepLong getVal13() {
        return SecureWriteSequentialRequest16Val13;
    }

    public RetepLong getVal14() {
        return SecureWriteSequentialRequest17Val14;
    }

    public RetepLong getVal15() {
        return SecureWriteSequentialRequest18Val15;
    }

    public RetepLong getVal16() {
        return SecureWriteSequentialRequest19Val16;
    }

    public RetepLong getVal17() {
        return SecureWriteSequentialRequest20Val17;
    }

    public RetepLong getVal18() {
        return SecureWriteSequentialRequest21Val18;
    }

    public RetepLong getVal19() {
        return SecureWriteSequentialRequest22Val19;
    }

    public RetepLong getVal20() {
        return SecureWriteSequentialRequest23Val20;
    }

    public RetepLong getVal21() {
        return SecureWriteSequentialRequest24Val21;
    }

    public RetepLong getVal22() {
        return SecureWriteSequentialRequest25Val22;
    }

    public RetepLong getVal23() {
        return SecureWriteSequentialRequest26Val23;
    }

    public RetepLong getVal24() {
        return SecureWriteSequentialRequest27Val24;
    }

    public RetepLong getVal25() {
        return SecureWriteSequentialRequest28Val25;
    }

    public RetepLong getVal26() {
        return SecureWriteSequentialRequest29Val26;
    }

    public RetepLong getVal27() {
        return SecureWriteSequentialRequest30Val27;
    }

    public RetepLong getVal28() {
        return SecureWriteSequentialRequest31Val28;
    }

    public RetepLong getVal29() {
        return SecureWriteSequentialRequest32Val29;
    }

    public RetepLong getVal30() {
        return SecureWriteSequentialRequest33Val30;
    }

    public RetepLong getVal31() {
        return SecureWriteSequentialRequest34Val31;
    }

    public RetepLong getVal32() {
        return SecureWriteSequentialRequest35Val32;
    }

    public RetepLong getVal33() {
        return SecureWriteSequentialRequest36Val33;
    }

    public RetepLong getVal34() {
        return SecureWriteSequentialRequest37Val34;
    }

    public RetepLong getVal35() {
        return SecureWriteSequentialRequest38Val35;
    }

    public RetepLong getVal36() {
        return SecureWriteSequentialRequest39Val36;
    }

    public RetepLong getVal37() {
        return SecureWriteSequentialRequest40Val37;
    }

    public RetepLong getVal38() {
        return SecureWriteSequentialRequest41Val38;
    }

    public RetepLong getVal39() {
        return SecureWriteSequentialRequest42Val39;
    }

    public RetepLong getVal40() {
        return SecureWriteSequentialRequest43Val40;
    }

    public RetepLong getVal41() {
        return SecureWriteSequentialRequest44Val41;
    }

    public RetepLong getVal42() {
        return SecureWriteSequentialRequest45Val42;
    }

    public RetepLong getVal43() {
        return SecureWriteSequentialRequest46Val43;
    }

    public RetepLong getVal44() {
        return SecureWriteSequentialRequest47Val44;
    }

    public RetepLong getVal45() {
        return SecureWriteSequentialRequest48Val45;
    }

    public RetepLong getVal46() {
        return SecureWriteSequentialRequest49Val46;
    }

    public RetepLong getVal47() {
        return SecureWriteSequentialRequest50Val47;
    }

    public RetepLong getVal48() {
        return SecureWriteSequentialRequest51Val48;
    }

    public RetepLong getVal49() {
        return SecureWriteSequentialRequest52Val49;
    }

    public RetepLong getVal50() {
        return SecureWriteSequentialRequest53Val50;
    }

    public RetepLong getVal51() {
        return SecureWriteSequentialRequest54Val51;
    }

    public RetepLong getVal52() {
        return SecureWriteSequentialRequest55Val52;
    }

    public RetepLong getVal53() {
        return SecureWriteSequentialRequest56Val53;
    }

    public RetepLong getVal54() {
        return SecureWriteSequentialRequest57Val54;
    }

    public RetepLong getVal55() {
        return SecureWriteSequentialRequest58Val55;
    }

    public RetepLong getVal56() {
        return SecureWriteSequentialRequest59Val56;
    }

    public RetepLong getVal57() {
        return SecureWriteSequentialRequest60Val57;
    }

    public RetepLong getVal58() {
        return SecureWriteSequentialRequest61Val58;
    }

    public RetepLong getVal59() {
        return SecureWriteSequentialRequest62Val59;
    }

    public RetepLong getVal60() {
        return SecureWriteSequentialRequest63Val60;
    }

    public RetepLong getVal61() {
        return SecureWriteSequentialRequest64Val61;
    }

    public RetepLong getVal62() {
        return SecureWriteSequentialRequest65Val62;
    }

    public RetepLong getVal63() {
        return SecureWriteSequentialRequest66Val63;
    }

    public RetepLong getVal64() {
        return SecureWriteSequentialRequest67Val64;
    }

    public RetepLong getVal65() {
        return SecureWriteSequentialRequest68Val65;
    }

    public RetepLong getVal66() {
        return SecureWriteSequentialRequest69Val66;
    }

    public RetepLong getVal67() {
        return SecureWriteSequentialRequest70Val67;
    }

    public RetepLong getVal68() {
        return SecureWriteSequentialRequest71Val68;
    }

    public RetepLong getVal69() {
        return SecureWriteSequentialRequest72Val69;
    }

    public RetepLong getVal70() {
        return SecureWriteSequentialRequest73Val70;
    }

    public RetepLong getVal71() {
        return SecureWriteSequentialRequest74Val71;
    }

    public RetepLong getVal72() {
        return SecureWriteSequentialRequest75Val72;
    }

    public RetepLong getVal73() {
        return SecureWriteSequentialRequest76Val73;
    }

    public RetepLong getVal74() {
        return SecureWriteSequentialRequest77Val74;
    }

    public RetepLong getVal75() {
        return SecureWriteSequentialRequest78Val75;
    }

    public RetepLong getVal76() {
        return SecureWriteSequentialRequest79Val76;
    }

    public RetepLong getVal77() {
        return SecureWriteSequentialRequest80Val77;
    }

    public RetepLong getVal78() {
        return SecureWriteSequentialRequest81Val78;
    }

    public RetepLong getVal79() {
        return SecureWriteSequentialRequest82Val79;
    }

    public RetepLong getVal80() {
        return SecureWriteSequentialRequest83Val80;
    }

    public RetepLong getTs() {
        return SecureWriteSequentialRequest84Ts;
    }

    public RetepLong getMs() {
        return SecureWriteSequentialRequest86Ms;
    }

    public RetepLong getSeq() {
        return SecureWriteSequentialRequest87Seq;
    }

    public RetepLong getRole() {
        return SecureWriteSequentialRequest88Role;
    }

    public RetepLong getRsrvd() {
        return SecureWriteSequentialRequest89Rsrvd;
    }

    public RetepEnum getAlg() {
        return SecureWriteSequentialRequest90Alg;
    }

    public RetepLong getN() {
        return SecureWriteSequentialRequest91N;
    }

    public RetepLong getDS() {
        return SecureWriteSequentialRequest92DS;
    }

    public static class ID extends RegisterEnum16 {

public ID (TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 0, 1, "Model", "", "Include a digial signature along with the control data", Rw.R, Mandatory.M);
            hashtable.put((long) 6, "SunSpec Secure Write Sequential Request");
        }
    }

    public static class L extends RegisterUint16 {

public L(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    public static class X extends RegisterUint16 {

public X(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 2, 1, "X", "", "Number of (offset, value) pairs being written", Rw.RW, Mandatory.M);
        }
    }

    public static class Off extends RegisterUint16 {

public Off(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 3, 1, "Offset", "", "Starting offset for write operation", Rw.RW, Mandatory.M);
        }
    }

    public static class Val1 extends RegisterUint16 {

public Val1(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 4, 1, "Value1", "", "Value to write to control register at offset", Rw.RW, Mandatory.M);
        }
    }

    public static class Val2 extends RegisterUint16 {

public Val2(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 5, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val3 extends RegisterUint16 {

public Val3(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 6, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val4 extends RegisterUint16 {

public Val4(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 7, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val5 extends RegisterUint16 {

public Val5(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 8, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val6 extends RegisterUint16 {

public Val6(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 9, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val7 extends RegisterUint16 {

public Val7(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 10, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val8 extends RegisterUint16 {

public Val8(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 11, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val9 extends RegisterUint16 {

public Val9(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 12, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val10 extends RegisterUint16 {

public Val10(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 13, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val11 extends RegisterUint16 {

public Val11(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 14, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val12 extends RegisterUint16 {

public Val12(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 15, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val13 extends RegisterUint16 {

public Val13(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 16, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val14 extends RegisterUint16 {

public Val14(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 17, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val15 extends RegisterUint16 {

public Val15(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 18, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val16 extends RegisterUint16 {

public Val16(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 19, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val17 extends RegisterUint16 {

public Val17(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 20, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val18 extends RegisterUint16 {

public Val18(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 21, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val19 extends RegisterUint16 {

public Val19(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 22, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val20 extends RegisterUint16 {

public Val20(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 23, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val21 extends RegisterUint16 {

public Val21(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 24, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val22 extends RegisterUint16 {

public Val22(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 25, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val23 extends RegisterUint16 {

public Val23(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 26, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val24 extends RegisterUint16 {

public Val24(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 27, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val25 extends RegisterUint16 {

public Val25(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 28, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val26 extends RegisterUint16 {

public Val26(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 29, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val27 extends RegisterUint16 {

public Val27(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 30, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val28 extends RegisterUint16 {

public Val28(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 31, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val29 extends RegisterUint16 {

public Val29(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 32, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val30 extends RegisterUint16 {

public Val30(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 33, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val31 extends RegisterUint16 {

public Val31(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 34, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val32 extends RegisterUint16 {

public Val32(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 35, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val33 extends RegisterUint16 {

public Val33(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 36, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val34 extends RegisterUint16 {

public Val34(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 37, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val35 extends RegisterUint16 {

public Val35(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 38, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val36 extends RegisterUint16 {

public Val36(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 39, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val37 extends RegisterUint16 {

public Val37(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 40, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val38 extends RegisterUint16 {

public Val38(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 41, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val39 extends RegisterUint16 {

public Val39(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 42, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val40 extends RegisterUint16 {

public Val40(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 43, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val41 extends RegisterUint16 {

public Val41(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 44, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val42 extends RegisterUint16 {

public Val42(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 45, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val43 extends RegisterUint16 {

public Val43(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 46, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val44 extends RegisterUint16 {

public Val44(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 47, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val45 extends RegisterUint16 {

public Val45(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 48, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val46 extends RegisterUint16 {

public Val46(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 49, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val47 extends RegisterUint16 {

public Val47(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 50, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val48 extends RegisterUint16 {

public Val48(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 51, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val49 extends RegisterUint16 {

public Val49(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 52, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val50 extends RegisterUint16 {

public Val50(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 53, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val51 extends RegisterUint16 {

public Val51(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 54, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val52 extends RegisterUint16 {

public Val52(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 55, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val53 extends RegisterUint16 {

public Val53(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 56, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val54 extends RegisterUint16 {

public Val54(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 57, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val55 extends RegisterUint16 {

public Val55(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 58, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val56 extends RegisterUint16 {

public Val56(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 59, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val57 extends RegisterUint16 {

public Val57(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 60, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val58 extends RegisterUint16 {

public Val58(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 61, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val59 extends RegisterUint16 {

public Val59(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 62, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val60 extends RegisterUint16 {

public Val60(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 63, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val61 extends RegisterUint16 {

public Val61(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 64, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val62 extends RegisterUint16 {

public Val62(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 65, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val63 extends RegisterUint16 {

public Val63(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 66, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val64 extends RegisterUint16 {

public Val64(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 67, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val65 extends RegisterUint16 {

public Val65(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 68, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val66 extends RegisterUint16 {

public Val66(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 69, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val67 extends RegisterUint16 {

public Val67(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 70, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val68 extends RegisterUint16 {

public Val68(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 71, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val69 extends RegisterUint16 {

public Val69(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 72, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val70 extends RegisterUint16 {

public Val70(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 73, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val71 extends RegisterUint16 {

public Val71(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 74, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val72 extends RegisterUint16 {

public Val72(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 75, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val73 extends RegisterUint16 {

public Val73(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 76, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val74 extends RegisterUint16 {

public Val74(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 77, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val75 extends RegisterUint16 {

public Val75(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 78, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val76 extends RegisterUint16 {

public Val76(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 79, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val77 extends RegisterUint16 {

public Val77(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 80, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val78 extends RegisterUint16 {

public Val78(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 81, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val79 extends RegisterUint16 {

public Val79(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 82, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Val80 extends RegisterUint16 {

public Val80(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 83, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Ts extends RegisterUint32 {

public Ts(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 84, 2, "Timestamp", "", "Timestamp value is the number of seconds since January 1, 2000", Rw.RW, Mandatory.M);
        }
    }

    public static class Ms extends RegisterUint16 {

public Ms(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 86, 1, "Milliseconds", "", "Millisecond counter 0-999", Rw.RW, Mandatory.M);
        }
    }

    public static class Seq extends RegisterUint16 {

public Seq(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 87, 1, "Sequence", "", "Sequence number of request", Rw.RW, Mandatory.M);
        }
    }

    public static class Role extends RegisterUint16 {

public Role(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 88, 1, "Role", "", "Signing key used 0-5", Rw.RW, Mandatory.M);
        }
    }

    public static class Rsrvd extends RegisterPad {

public Rsrvd(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 89, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public static class Alg extends RegisterEnum16 {

public Alg(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 90, 1, "Algorithm", "", "Algorithm used to compute the digital signature", Rw.RW, Mandatory.M);
            hashtable.put((long) 0, "NONE");
            hashtable.put((long) 1, "AES-GMAC-64");
            hashtable.put((long) 2, "ECC-256");

        }
    }

    public static class N extends RegisterUint16 {

public N(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 91, 1, "N", "", "Number of registers comprising the digital signature.", Rw.RW, Mandatory.M);
        }
    }

    public static class DS extends RegisterUint16 {

public DS(TcpModbusHandler tcpModbusHandler){
            init(tcpModbusHandler.getSecureWriteSequentialRequest_6(), 92, 1, "DS", "", "Digital Signature", Rw.RW, Mandatory.O);
        }
    }

}
