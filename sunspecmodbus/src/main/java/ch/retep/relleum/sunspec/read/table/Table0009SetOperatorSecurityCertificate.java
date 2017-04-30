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
public class Table0009SetOperatorSecurityCertificate extends Table {

    private  ID setOperatorSecurityCertificate00ID ;
    private  L setOperatorSecurityCertificate01L ;

    private  CertUID setOperatorSecurityCertificate02CertUID ;
    private  CertRole setOperatorSecurityCertificate03CertRole ;
    private  Fmt setOperatorSecurityCertificate04Fmt ;
    private  Typ setOperatorSecurityCertificate05Typ ;
    private  TotLn setOperatorSecurityCertificate06TotLn ;
    private  FrgLn setOperatorSecurityCertificate07FrgLn ;
    private  Frg1 setOperatorSecurityCertificate08Frg1 ;
    private  Frg2 setOperatorSecurityCertificate09Frg2 ;
    private  Frg3 setOperatorSecurityCertificate10Frg3 ;
    private  Frg4 setOperatorSecurityCertificate11Frg4 ;
    private  Frg5 setOperatorSecurityCertificate12Frg5 ;
    private  Frg6 setOperatorSecurityCertificate13Frg6 ;
    private  Frg7 setOperatorSecurityCertificate14Frg7 ;
    private  Frg8 setOperatorSecurityCertificate15Frg8 ;
    private  Frg9 setOperatorSecurityCertificate16Frg9 ;
    private  Frg10 setOperatorSecurityCertificate17Frg10;
    private  Frg11 setOperatorSecurityCertificate18Frg11;
    private  Frg12 setOperatorSecurityCertificate19Frg12;
    private  Frg13 setOperatorSecurityCertificate20Frg13;
    private  Frg14 setOperatorSecurityCertificate21Frg14;
    private  Frg15 setOperatorSecurityCertificate22Frg15;
    private  Frg16 setOperatorSecurityCertificate23Frg16;
    private  Frg17 setOperatorSecurityCertificate24Frg17;
    private  Frg18 setOperatorSecurityCertificate25Frg18;
    private  Frg19 setOperatorSecurityCertificate26Frg19;
    private  Frg20 setOperatorSecurityCertificate27Frg20;
    private  Frg21 setOperatorSecurityCertificate28Frg21;
    private  Frg22 setOperatorSecurityCertificate29Frg22;
    private  Frg23 setOperatorSecurityCertificate30Frg23;
    private  Frg24 setOperatorSecurityCertificate31Frg24 ;
    private  Frg25 setOperatorSecurityCertificate32Frg25 ;
    private  Frg26 setOperatorSecurityCertificate33Frg26 ;
    private  Frg27 setOperatorSecurityCertificate34Frg27 ;
    private  Frg28 setOperatorSecurityCertificate35Frg28 ;
    private  Frg29 setOperatorSecurityCertificate36Frg29 ;
    private  Frg30 setOperatorSecurityCertificate37Frg30 ;
    private  Frg31 setOperatorSecurityCertificate38Frg31 ;
    private  Frg32 setOperatorSecurityCertificate39Frg32 ;
    private  Frg33 setOperatorSecurityCertificate40Frg33 ;
    private  Frg34 setOperatorSecurityCertificate41Frg34 ;
    private  Frg35 setOperatorSecurityCertificate42Frg35 ;
    private  Frg36 setOperatorSecurityCertificate43Frg36 ;
    private  Frg37 setOperatorSecurityCertificate44Frg37 ;
    private  Frg38 setOperatorSecurityCertificate45Frg38 ;
    private  Frg39 setOperatorSecurityCertificate46Frg39 ;
    private  Frg40 setOperatorSecurityCertificate47Frg40 ;
    private  Frg41 setOperatorSecurityCertificate48Frg41 ;
    private  Frg42 setOperatorSecurityCertificate49Frg42 ;
    private  Frg43 setOperatorSecurityCertificate50Frg43 ;
    private  Frg44 setOperatorSecurityCertificate51Frg44 ;
    private  Frg45 setOperatorSecurityCertificate52Frg45 ;
    private  Frg46 setOperatorSecurityCertificate53Frg46 ;
    private  Frg47 setOperatorSecurityCertificate54Frg47 ;
    private  Frg48 setOperatorSecurityCertificate55Frg48 ;
    private  Frg49 setOperatorSecurityCertificate56Frg49 ;
    private  Frg50 setOperatorSecurityCertificate57Frg50 ;
    private  Frg51 setOperatorSecurityCertificate58Frg51 ;
    private  Frg52 setOperatorSecurityCertificate59Frg52 ;
    private  Frg53 setOperatorSecurityCertificate60Frg53 ;
    private  Frg54 setOperatorSecurityCertificate61Frg54 ;
    private  Frg55 setOperatorSecurityCertificate62Frg55 ;
    private  Frg56 setOperatorSecurityCertificate63Frg56 ;
    private  Frg57 setOperatorSecurityCertificate64Frg57 ;
    private  Frg58 setOperatorSecurityCertificate65Frg58 ;
    private  Frg59 setOperatorSecurityCertificate66Frg59 ;
    private  Frg60 setOperatorSecurityCertificate67Frg60 ;
    private  Frg61 setOperatorSecurityCertificate68Frg61 ;
    private  Frg62 setOperatorSecurityCertificate69Frg62 ;
    private  Frg63 setOperatorSecurityCertificate70Frg63 ;
    private  Frg64 setOperatorSecurityCertificate71Frg64 ;
    private  Frg65 setOperatorSecurityCertificate72Frg65 ;
    private  Frg66 setOperatorSecurityCertificate73Frg66 ;
    private  Frg67 setOperatorSecurityCertificate74Frg67 ;
    private  Frg68 setOperatorSecurityCertificate75Frg68 ;
    private  Frg69 setOperatorSecurityCertificate76Frg69 ;
    private  Frg70 setOperatorSecurityCertificate77Frg70 ;
    private  Frg71 setOperatorSecurityCertificate78Frg71 ;
    private  Frg72 setOperatorSecurityCertificate79Frg72 ;
    private  Frg73 setOperatorSecurityCertificate80Frg73 ;
    private  Frg74 setOperatorSecurityCertificate81Frg74 ;
    private  Frg75 setOperatorSecurityCertificate82Frg75 ;
    private  Frg78 setOperatorSecurityCertificate83Frg78 ;
    private  Frg79 setOperatorSecurityCertificate84Frg79 ;
    private  Frg80 setOperatorSecurityCertificate85Frg80 ;
    private  Ts setOperatorSecurityCertificate86Ts ;
    private  Ms setOperatorSecurityCertificate88Ms ;
    private  Seq setOperatorSecurityCertificate89Seq;
    private  UID setOperatorSecurityCertificate90UID;
    private  Role setOperatorSecurityCertificate91Role ;
    private  Alg setOperatorSecurityCertificate92Alg ;
    private  N setOperatorSecurityCertificate93N ;

    private  Cert setOperatorSecurityCertificate94Cert ;

    public Table0009SetOperatorSecurityCertificate(TcpModbusHandler tcpModbusHandler){
        init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 0, 95, "Set Operator Security Certificate Modell", "", "Set Operator Security Certificate Modell ", Rw.R, Mandatory.M);

         setOperatorSecurityCertificate00ID = new ID(tcpModbusHandler);
         setOperatorSecurityCertificate01L = new L(tcpModbusHandler);

         setOperatorSecurityCertificate02CertUID = new CertUID(tcpModbusHandler);
           setOperatorSecurityCertificate03CertRole = new CertRole(tcpModbusHandler);
           setOperatorSecurityCertificate04Fmt = new Fmt(tcpModbusHandler);
           setOperatorSecurityCertificate05Typ = new Typ(tcpModbusHandler);
           setOperatorSecurityCertificate06TotLn = new TotLn(tcpModbusHandler);
           setOperatorSecurityCertificate07FrgLn = new FrgLn(tcpModbusHandler);
           setOperatorSecurityCertificate08Frg1 = new Frg1(tcpModbusHandler);
           setOperatorSecurityCertificate09Frg2 = new Frg2(tcpModbusHandler);
           setOperatorSecurityCertificate10Frg3 = new Frg3(tcpModbusHandler);
           setOperatorSecurityCertificate11Frg4 = new Frg4(tcpModbusHandler);
           setOperatorSecurityCertificate12Frg5 = new Frg5(tcpModbusHandler);
           setOperatorSecurityCertificate13Frg6 = new Frg6(tcpModbusHandler);
           setOperatorSecurityCertificate14Frg7 = new Frg7(tcpModbusHandler);
           setOperatorSecurityCertificate15Frg8 = new Frg8(tcpModbusHandler);
           setOperatorSecurityCertificate16Frg9 = new Frg9(tcpModbusHandler);
           setOperatorSecurityCertificate17Frg10 = new Frg10(tcpModbusHandler);
           setOperatorSecurityCertificate18Frg11 = new Frg11(tcpModbusHandler);
           setOperatorSecurityCertificate19Frg12 = new Frg12(tcpModbusHandler);
           setOperatorSecurityCertificate20Frg13 = new Frg13(tcpModbusHandler);
           setOperatorSecurityCertificate21Frg14 = new Frg14(tcpModbusHandler);
           setOperatorSecurityCertificate22Frg15 = new Frg15(tcpModbusHandler);
           setOperatorSecurityCertificate23Frg16 = new Frg16(tcpModbusHandler);
           setOperatorSecurityCertificate24Frg17 = new Frg17(tcpModbusHandler);
           setOperatorSecurityCertificate25Frg18 = new Frg18(tcpModbusHandler);
           setOperatorSecurityCertificate26Frg19 = new Frg19(tcpModbusHandler);
           setOperatorSecurityCertificate27Frg20 = new Frg20(tcpModbusHandler);
           setOperatorSecurityCertificate28Frg21 = new Frg21(tcpModbusHandler);
           setOperatorSecurityCertificate29Frg22 = new Frg22(tcpModbusHandler);
           setOperatorSecurityCertificate30Frg23 = new Frg23(tcpModbusHandler);
           setOperatorSecurityCertificate31Frg24 = new Frg24(tcpModbusHandler);
           setOperatorSecurityCertificate32Frg25 = new Frg25(tcpModbusHandler);
           setOperatorSecurityCertificate33Frg26 = new Frg26(tcpModbusHandler);
           setOperatorSecurityCertificate34Frg27 = new Frg27(tcpModbusHandler);
           setOperatorSecurityCertificate35Frg28 = new Frg28(tcpModbusHandler);
           setOperatorSecurityCertificate36Frg29 = new Frg29(tcpModbusHandler);
           setOperatorSecurityCertificate37Frg30 = new Frg30(tcpModbusHandler);
           setOperatorSecurityCertificate38Frg31 = new Frg31(tcpModbusHandler);
           setOperatorSecurityCertificate39Frg32 = new Frg32(tcpModbusHandler);
           setOperatorSecurityCertificate40Frg33 = new Frg33(tcpModbusHandler);
           setOperatorSecurityCertificate41Frg34 = new Frg34(tcpModbusHandler);
           setOperatorSecurityCertificate42Frg35 = new Frg35(tcpModbusHandler);
           setOperatorSecurityCertificate43Frg36 = new Frg36(tcpModbusHandler);
           setOperatorSecurityCertificate44Frg37 = new Frg37(tcpModbusHandler);
           setOperatorSecurityCertificate45Frg38 = new Frg38(tcpModbusHandler);
           setOperatorSecurityCertificate46Frg39 = new Frg39(tcpModbusHandler);
           setOperatorSecurityCertificate47Frg40 = new Frg40(tcpModbusHandler);
           setOperatorSecurityCertificate48Frg41 = new Frg41(tcpModbusHandler);
           setOperatorSecurityCertificate49Frg42 = new Frg42(tcpModbusHandler);
           setOperatorSecurityCertificate50Frg43 = new Frg43(tcpModbusHandler);
           setOperatorSecurityCertificate51Frg44 = new Frg44(tcpModbusHandler);
           setOperatorSecurityCertificate52Frg45 = new Frg45(tcpModbusHandler);
           setOperatorSecurityCertificate53Frg46 = new Frg46(tcpModbusHandler);
           setOperatorSecurityCertificate54Frg47 = new Frg47(tcpModbusHandler);
           setOperatorSecurityCertificate55Frg48 = new Frg48(tcpModbusHandler);
           setOperatorSecurityCertificate56Frg49 = new Frg49(tcpModbusHandler);
           setOperatorSecurityCertificate57Frg50 = new Frg50(tcpModbusHandler);
           setOperatorSecurityCertificate58Frg51 = new Frg51(tcpModbusHandler);
           setOperatorSecurityCertificate59Frg52 = new Frg52(tcpModbusHandler);
           setOperatorSecurityCertificate60Frg53 = new Frg53(tcpModbusHandler);
           setOperatorSecurityCertificate61Frg54 = new Frg54(tcpModbusHandler);
           setOperatorSecurityCertificate62Frg55 = new Frg55(tcpModbusHandler);
           setOperatorSecurityCertificate63Frg56 = new Frg56(tcpModbusHandler);
           setOperatorSecurityCertificate64Frg57 = new Frg57(tcpModbusHandler);
           setOperatorSecurityCertificate65Frg58 = new Frg58(tcpModbusHandler);
           setOperatorSecurityCertificate66Frg59 = new Frg59(tcpModbusHandler);
           setOperatorSecurityCertificate67Frg60 = new Frg60(tcpModbusHandler);
           setOperatorSecurityCertificate68Frg61 = new Frg61(tcpModbusHandler);
           setOperatorSecurityCertificate69Frg62 = new Frg62(tcpModbusHandler);
           setOperatorSecurityCertificate70Frg63 = new Frg63(tcpModbusHandler);
           setOperatorSecurityCertificate71Frg64 = new Frg64(tcpModbusHandler);
           setOperatorSecurityCertificate72Frg65 = new Frg65(tcpModbusHandler);
           setOperatorSecurityCertificate73Frg66 = new Frg66(tcpModbusHandler);
           setOperatorSecurityCertificate74Frg67 = new Frg67(tcpModbusHandler);
           setOperatorSecurityCertificate75Frg68 = new Frg68(tcpModbusHandler);
           setOperatorSecurityCertificate76Frg69 = new Frg69(tcpModbusHandler);
           setOperatorSecurityCertificate77Frg70 = new Frg70(tcpModbusHandler);
           setOperatorSecurityCertificate78Frg71 = new Frg71(tcpModbusHandler);
           setOperatorSecurityCertificate79Frg72 = new Frg72(tcpModbusHandler);
           setOperatorSecurityCertificate80Frg73 = new Frg73(tcpModbusHandler);
           setOperatorSecurityCertificate81Frg74 = new Frg74(tcpModbusHandler);
           setOperatorSecurityCertificate82Frg75 = new Frg75(tcpModbusHandler);
           setOperatorSecurityCertificate83Frg78 = new Frg78(tcpModbusHandler);
           setOperatorSecurityCertificate84Frg79 = new Frg79(tcpModbusHandler);
           setOperatorSecurityCertificate85Frg80 = new Frg80(tcpModbusHandler);
           setOperatorSecurityCertificate88Ms = new Ms(tcpModbusHandler);
           setOperatorSecurityCertificate89Seq = new Seq(tcpModbusHandler);
           setOperatorSecurityCertificate90UID = new UID(tcpModbusHandler);
           setOperatorSecurityCertificate91Role = new Role(tcpModbusHandler);
           setOperatorSecurityCertificate92Alg = new Alg(tcpModbusHandler);
           setOperatorSecurityCertificate93N = new N(tcpModbusHandler);

           setOperatorSecurityCertificate94Cert = new Cert(tcpModbusHandler);
       
        vector.add(setOperatorSecurityCertificate00ID);
        vector.add(setOperatorSecurityCertificate01L);

        vector.add(setOperatorSecurityCertificate02CertUID);
        vector.add(setOperatorSecurityCertificate03CertRole);
        vector.add(setOperatorSecurityCertificate04Fmt);
        vector.add(setOperatorSecurityCertificate05Typ);
        vector.add(setOperatorSecurityCertificate06TotLn);
        vector.add(setOperatorSecurityCertificate07FrgLn);
        vector.add(setOperatorSecurityCertificate08Frg1);
        vector.add(setOperatorSecurityCertificate09Frg2);
        vector.add(setOperatorSecurityCertificate10Frg3);
        vector.add(setOperatorSecurityCertificate11Frg4);
        vector.add(setOperatorSecurityCertificate12Frg5);
        vector.add(setOperatorSecurityCertificate13Frg6);
        vector.add(setOperatorSecurityCertificate14Frg7);
        vector.add(setOperatorSecurityCertificate15Frg8);
        vector.add(setOperatorSecurityCertificate16Frg9);
        vector.add(setOperatorSecurityCertificate17Frg10);
        vector.add(setOperatorSecurityCertificate18Frg11);
        vector.add(setOperatorSecurityCertificate19Frg12);
        vector.add(setOperatorSecurityCertificate20Frg13);
        vector.add(setOperatorSecurityCertificate21Frg14);
        vector.add(setOperatorSecurityCertificate22Frg15);
        vector.add(setOperatorSecurityCertificate23Frg16);
        vector.add(setOperatorSecurityCertificate24Frg17);
        vector.add(setOperatorSecurityCertificate25Frg18);
        vector.add(setOperatorSecurityCertificate26Frg19);
        vector.add(setOperatorSecurityCertificate27Frg20);
        vector.add(setOperatorSecurityCertificate28Frg21);
        vector.add(setOperatorSecurityCertificate29Frg22);
        vector.add(setOperatorSecurityCertificate30Frg23);
        vector.add(setOperatorSecurityCertificate31Frg24);
        vector.add(setOperatorSecurityCertificate32Frg25);
        vector.add(setOperatorSecurityCertificate33Frg26);
        vector.add(setOperatorSecurityCertificate34Frg27);
        vector.add(setOperatorSecurityCertificate35Frg28);
        vector.add(setOperatorSecurityCertificate36Frg29);
        vector.add(setOperatorSecurityCertificate37Frg30);
        vector.add(setOperatorSecurityCertificate38Frg31);
        vector.add(setOperatorSecurityCertificate39Frg32);
        vector.add(setOperatorSecurityCertificate40Frg33);
        vector.add(setOperatorSecurityCertificate41Frg34);
        vector.add(setOperatorSecurityCertificate42Frg35);
        vector.add(setOperatorSecurityCertificate43Frg36);
        vector.add(setOperatorSecurityCertificate44Frg37);
        vector.add(setOperatorSecurityCertificate45Frg38);
        vector.add(setOperatorSecurityCertificate46Frg39);
        vector.add(setOperatorSecurityCertificate47Frg40);
        vector.add(setOperatorSecurityCertificate48Frg41);
        vector.add(setOperatorSecurityCertificate49Frg42);
        vector.add(setOperatorSecurityCertificate50Frg43);
        vector.add(setOperatorSecurityCertificate51Frg44);
        vector.add(setOperatorSecurityCertificate52Frg45);
        vector.add(setOperatorSecurityCertificate53Frg46);
        vector.add(setOperatorSecurityCertificate54Frg47);
        vector.add(setOperatorSecurityCertificate55Frg48);
        vector.add(setOperatorSecurityCertificate56Frg49);
        vector.add(setOperatorSecurityCertificate57Frg50);
        vector.add(setOperatorSecurityCertificate58Frg51);
        vector.add(setOperatorSecurityCertificate59Frg52);
        vector.add(setOperatorSecurityCertificate60Frg53);
        vector.add(setOperatorSecurityCertificate61Frg54);
        vector.add(setOperatorSecurityCertificate62Frg55);
        vector.add(setOperatorSecurityCertificate63Frg56);
        vector.add(setOperatorSecurityCertificate64Frg57);
        vector.add(setOperatorSecurityCertificate65Frg58);
        vector.add(setOperatorSecurityCertificate66Frg59);
        vector.add(setOperatorSecurityCertificate67Frg60);
        vector.add(setOperatorSecurityCertificate68Frg61);
        vector.add(setOperatorSecurityCertificate69Frg62);
        vector.add(setOperatorSecurityCertificate70Frg63);
        vector.add(setOperatorSecurityCertificate71Frg64);
        vector.add(setOperatorSecurityCertificate72Frg65);
        vector.add(setOperatorSecurityCertificate73Frg66);
        vector.add(setOperatorSecurityCertificate74Frg67);
        vector.add(setOperatorSecurityCertificate75Frg68);
        vector.add(setOperatorSecurityCertificate76Frg69);
        vector.add(setOperatorSecurityCertificate77Frg70);
        vector.add(setOperatorSecurityCertificate78Frg71);
        vector.add(setOperatorSecurityCertificate79Frg72);
        vector.add(setOperatorSecurityCertificate80Frg73);
        vector.add(setOperatorSecurityCertificate81Frg74);
        vector.add(setOperatorSecurityCertificate82Frg75);
        vector.add(setOperatorSecurityCertificate83Frg78);
        vector.add(setOperatorSecurityCertificate84Frg79);
        vector.add(setOperatorSecurityCertificate85Frg80);
        vector.add(setOperatorSecurityCertificate86Ts);
        vector.add(setOperatorSecurityCertificate88Ms);
        vector.add(setOperatorSecurityCertificate89Seq);
        vector.add(setOperatorSecurityCertificate90UID);
        vector.add(setOperatorSecurityCertificate91Role);
        vector.add(setOperatorSecurityCertificate92Alg);
        vector.add(setOperatorSecurityCertificate93N);

        vector.add(setOperatorSecurityCertificate94Cert);

    }

    public RetepEnum getID() {
        return setOperatorSecurityCertificate00ID;
    }

    public RetepLong getL() {
        return setOperatorSecurityCertificate01L;
    }

    public RetepLong getCertUID() {
        return setOperatorSecurityCertificate02CertUID;
    }

    public RetepLong getCertRole() {
        return setOperatorSecurityCertificate03CertRole;
    }

    public RetepEnum getFmt() {
        return setOperatorSecurityCertificate04Fmt;
    }

    public RetepEnum getTyp() {
        return setOperatorSecurityCertificate05Typ;
    }

    public RetepLong getTotLn() {
        return setOperatorSecurityCertificate06TotLn;
    }

    public RetepLong getFrgLn() {
        return setOperatorSecurityCertificate07FrgLn;
    }

    public RetepLong getFrg1() {
        return setOperatorSecurityCertificate08Frg1;
    }

    public RetepLong getFrg2() {
        return setOperatorSecurityCertificate09Frg2;
    }

    public RetepLong getFrg3() {
        return setOperatorSecurityCertificate10Frg3;
    }

    public RetepLong getFrg4() {
        return setOperatorSecurityCertificate11Frg4;
    }

    public RetepLong getFrg5() {
        return setOperatorSecurityCertificate12Frg5;
    }

    public RetepLong getFrg6() {
        return setOperatorSecurityCertificate13Frg6;
    }

    public RetepLong getFrg7() {
        return setOperatorSecurityCertificate14Frg7;
    }

    public RetepLong getFrg8() {
        return setOperatorSecurityCertificate15Frg8;
    }

    public RetepLong getFrg9() {
        return setOperatorSecurityCertificate16Frg9;
    }

    public RetepLong getFrg10() {
        return setOperatorSecurityCertificate17Frg10;
    }

    public RetepLong getFrg11() {
        return setOperatorSecurityCertificate18Frg11;
    }

    public RetepLong getFrg12() {
        return setOperatorSecurityCertificate19Frg12;
    }

    public RetepLong getFrg13() {
        return setOperatorSecurityCertificate20Frg13;
    }

    public RetepLong getFrg14() {
        return setOperatorSecurityCertificate21Frg14;
    }

    public RetepLong getFrg15() {
        return setOperatorSecurityCertificate22Frg15;
    }

    public RetepLong getFrg16() {
        return setOperatorSecurityCertificate23Frg16;
    }

    public RetepLong getFrg17() {
        return setOperatorSecurityCertificate24Frg17;
    }

    public RetepLong getFrg18() {
        return setOperatorSecurityCertificate25Frg18;
    }

    public RetepLong getFrg19() {
        return setOperatorSecurityCertificate26Frg19;
    }

    public RetepLong getFrg20() {
        return setOperatorSecurityCertificate27Frg20;
    }

    public RetepLong getFrg21() {
        return setOperatorSecurityCertificate28Frg21;
    }

    public RetepLong getFrg22() {
        return setOperatorSecurityCertificate29Frg22;
    }

    public RetepLong getFrg23() {
        return setOperatorSecurityCertificate30Frg23;
    }

    public RetepLong getFrg24() {
        return setOperatorSecurityCertificate31Frg24;
    }

    public RetepLong getFrg25() {
        return setOperatorSecurityCertificate32Frg25;
    }

    public RetepLong getFrg26() {
        return setOperatorSecurityCertificate33Frg26;
    }

    public RetepLong getFrg27() {
        return setOperatorSecurityCertificate34Frg27;
    }

    public RetepLong getFrg28() {
        return setOperatorSecurityCertificate35Frg28;
    }

    public RetepLong getFrg29() {
        return setOperatorSecurityCertificate36Frg29;
    }

    public RetepLong getFrg30() {
        return setOperatorSecurityCertificate37Frg30;
    }

    public RetepLong getFrg31() {
        return setOperatorSecurityCertificate38Frg31;
    }

    public RetepLong getFrg32() {
        return setOperatorSecurityCertificate39Frg32;
    }

    public RetepLong getFrg33() {
        return setOperatorSecurityCertificate40Frg33;
    }

    public RetepLong getFrg34() {
        return setOperatorSecurityCertificate41Frg34;
    }

    public RetepLong getFrg35() {
        return setOperatorSecurityCertificate42Frg35;
    }

    public RetepLong getFrg36() {
        return setOperatorSecurityCertificate43Frg36;
    }

    public RetepLong getFrg37() {
        return setOperatorSecurityCertificate44Frg37;
    }

    public RetepLong getFrg38() {
        return setOperatorSecurityCertificate45Frg38;
    }

    public RetepLong getFrg39() {
        return setOperatorSecurityCertificate46Frg39;
    }

    public RetepLong getFrg40() {
        return setOperatorSecurityCertificate47Frg40;
    }

    public RetepLong getFrg41() {
        return setOperatorSecurityCertificate48Frg41;
    }

    public RetepLong getFrg42() {
        return setOperatorSecurityCertificate49Frg42;
    }

    public RetepLong getFrg43() {
        return setOperatorSecurityCertificate50Frg43;
    }

    public RetepLong getFrg44() {
        return setOperatorSecurityCertificate51Frg44;
    }

    public RetepLong getFrg45() {
        return setOperatorSecurityCertificate52Frg45;
    }

    public RetepLong getFrg46() {
        return setOperatorSecurityCertificate53Frg46;
    }

    public RetepLong getFrg47() {
        return setOperatorSecurityCertificate54Frg47;
    }

    public RetepLong getFrg48() {
        return setOperatorSecurityCertificate55Frg48;
    }

    public RetepLong getFrg49() {
        return setOperatorSecurityCertificate56Frg49;
    }

    public RetepLong getFrg50() {
        return setOperatorSecurityCertificate57Frg50;
    }

    public RetepLong getFrg51() {
        return setOperatorSecurityCertificate58Frg51;
    }

    public RetepLong getFrg52() {
        return setOperatorSecurityCertificate59Frg52;
    }

    public RetepLong getFrg53() {
        return setOperatorSecurityCertificate60Frg53;
    }

    public RetepLong getFrg54() {
        return setOperatorSecurityCertificate61Frg54;
    }

    public RetepLong getFrg55() {
        return setOperatorSecurityCertificate62Frg55;
    }

    public RetepLong getFrg56() {
        return setOperatorSecurityCertificate63Frg56;
    }

    public RetepLong getFrg57() {
        return setOperatorSecurityCertificate64Frg57;
    }

    public RetepLong getFrg58() {
        return setOperatorSecurityCertificate65Frg58;
    }

    public RetepLong getFrg59() {
        return setOperatorSecurityCertificate66Frg59;
    }

    public RetepLong getFrg60() {
        return setOperatorSecurityCertificate67Frg60;
    }

    public RetepLong getFrg61() {
        return setOperatorSecurityCertificate68Frg61;
    }

    public RetepLong getFrg62() {
        return setOperatorSecurityCertificate69Frg62;
    }

    public RetepLong getFrg63() {
        return setOperatorSecurityCertificate70Frg63;
    }

    public RetepLong getFrg64() {
        return setOperatorSecurityCertificate71Frg64;
    }

    public RetepLong getFrg65() {
        return setOperatorSecurityCertificate72Frg65;
    }

    public RetepLong getFrg66() {
        return setOperatorSecurityCertificate73Frg66;
    }

    public RetepLong getFrg67() {
        return setOperatorSecurityCertificate74Frg67;
    }

    public RetepLong getFrg68() {
        return setOperatorSecurityCertificate75Frg68;
    }

    public RetepLong getFrg69() {
        return setOperatorSecurityCertificate76Frg69;
    }

    public RetepLong getFrg70() {
        return setOperatorSecurityCertificate77Frg70;
    }

    public RetepLong getFrg71() {
        return setOperatorSecurityCertificate78Frg71;
    }

    public RetepLong getFrg72() {
        return setOperatorSecurityCertificate79Frg72;
    }

    public RetepLong getFrg73() {
        return setOperatorSecurityCertificate80Frg73;
    }

    public RetepLong getFrg74() {
        return setOperatorSecurityCertificate81Frg74;
    }

    public RetepLong getFrg75() {
        return setOperatorSecurityCertificate82Frg75;
    }

    public RetepLong getFrg78() {
        return setOperatorSecurityCertificate83Frg78;
    }

    public RetepLong getFrg79() {
        return setOperatorSecurityCertificate84Frg79;
    }

    public RetepLong getFrg80() {
        return setOperatorSecurityCertificate85Frg80;
    }

    public RetepLong getTs() {
        return setOperatorSecurityCertificate86Ts;
    }

    public RetepLong getMs() {
        return setOperatorSecurityCertificate88Ms;
    }

    public RetepLong getSeq() {
        return setOperatorSecurityCertificate89Seq;
    }

    public RetepLong getUID() {
        return setOperatorSecurityCertificate90UID;
    }

    public RetepLong getRole() {
        return setOperatorSecurityCertificate91Role;
    }

    public RetepEnum getAlg() {
        return setOperatorSecurityCertificate92Alg;
    }

    public RetepLong getN() {
        return setOperatorSecurityCertificate93N;
    }

    public RetepLong getCert() {
        return setOperatorSecurityCertificate94Cert;
    }

    public class ID extends RegisterEnum16 {

      private ID(TcpModbusHandler tcpModbusHandler)  {
          init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 0, 1, "Model", "", "Security model for PKI", Rw.R, Mandatory.M);
            hashtable.put((long) 9, "SunSpec Set Operator Security Certificate");
        }
    }

    public class L extends RegisterUint16 {

 private L(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 1, 1, "Model Length", "", "Model Length", Rw.R, Mandatory.M);
        }
    }

    public class CertUID extends RegisterUint16 {

 private CertUID(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 2, 1, "Cert_UID", "", "User ID for this certificate", Rw.RW, Mandatory.M);
        }
    }

    public class CertRole extends RegisterUint16 {

 private CertRole(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 3, 1, "Cert_Role", "", "Role for this certificate", Rw.RW, Mandatory.M);
        }
    }

    public class Fmt extends RegisterEnum16 {

 private Fmt(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 4, 1, "Format", "", "Format of this certificate", Rw.RW, Mandatory.M);
            hashtable.put((long) 0, "NONE");
            hashtable.put((long) 1, "X509_PEM");
            hashtable.put((long) 2, "X509_DER");
        }
    }

    public class Typ extends RegisterEnum16 {

 private Typ(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 5, 1, "Type", "", "Type of this certificate", Rw.RW, Mandatory.M);
            hashtable.put((long) 0, "DEV_KEY_PAIR");
            hashtable.put((long) 1, "DEV_SHARED_KEY");
            hashtable.put((long) 2, "OPERATOR_PUB");
            hashtable.put((long) 3, "OPERATOR_SHARED");
            hashtable.put((long) 4, "CA_PUB");
        }
    }

    public class TotLn extends RegisterUint16 {

 private TotLn(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 6, 1, "Total Length", "", "Total Length of the Certificate", Rw.RW, Mandatory.M);
        }
    }

    public class FrgLn extends RegisterUint16 {

 private FrgLn(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 7, 1, "Fragment length", "", "Length of this fragment", Rw.RW, Mandatory.M);
        }
    }

    public class Frg1 extends RegisterUint16 {

 private Frg1(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 8, 1, "Frag1", "", "First word of this fragment", Rw.RW, Mandatory.M);
        }
    }

    public class Frg2 extends RegisterUint16 {

 private Frg2(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 9, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg3 extends RegisterUint16 {

 private Frg3(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 10, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg4 extends RegisterUint16 {

 private Frg4(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 11, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg5 extends RegisterUint16 {

 private Frg5(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 12, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg6 extends RegisterUint16 {

 private Frg6(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 13, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg7 extends RegisterUint16 {

 private Frg7(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 14, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg8 extends RegisterUint16 {

 private Frg8(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 15, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg9 extends RegisterUint16 {

 private Frg9(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 16, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg10 extends RegisterUint16 {

 private Frg10(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 17, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg11 extends RegisterUint16 {

 private Frg11(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 18, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg12 extends RegisterUint16 {

 private Frg12(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 19, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg13 extends RegisterUint16 {

 private Frg13(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 20, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg14 extends RegisterUint16 {

 private Frg14(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 21, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg15 extends RegisterUint16 {

 private Frg15(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 22, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg16 extends RegisterUint16 {

 private Frg16(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 23, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg17 extends RegisterUint16 {

 private Frg17(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 24, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg18 extends RegisterUint16 {

 private Frg18(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 25, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg19 extends RegisterUint16 {

 private Frg19(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 26, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg20 extends RegisterUint16 {

 private Frg20(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 27, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg21 extends RegisterUint16 {

 private Frg21(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 28, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg22 extends RegisterUint16 {

 private Frg22(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 29, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg23 extends RegisterUint16 {

 private Frg23(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 30, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg24 extends RegisterUint16 {

 private Frg24(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 31, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg25 extends RegisterUint16 {

 private Frg25(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 32, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg26 extends RegisterUint16 {

 private Frg26(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 33, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg27 extends RegisterUint16 {

 private Frg27(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 34, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg28 extends RegisterUint16 {

 private Frg28(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 35, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg29 extends RegisterUint16 {

 private Frg29(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 36, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg30 extends RegisterUint16 {

 private Frg30(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 37, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg31 extends RegisterUint16 {

 private Frg31(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 38, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg32 extends RegisterUint16 {

 private Frg32(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 39, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg33 extends RegisterUint16 {

 private Frg33(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 40, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg34 extends RegisterUint16 {

 private Frg34(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 41, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg35 extends RegisterUint16 {

 private Frg35(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 42, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg36 extends RegisterUint16 {

 private Frg36(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 43, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg37 extends RegisterUint16 {

 private Frg37(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 44, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg38 extends RegisterUint16 {

 private Frg38(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 45, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg39 extends RegisterUint16 {

 private Frg39(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 46, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg40 extends RegisterUint16 {

 private Frg40(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 47, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg41 extends RegisterUint16 {

 private Frg41(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 48, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg42 extends RegisterUint16 {

 private Frg42(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 49, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg43 extends RegisterUint16 {

 private Frg43(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 50, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg44 extends RegisterUint16 {

 private Frg44(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 51, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg45 extends RegisterUint16 {

 private Frg45(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 52, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg46 extends RegisterUint16 {

 private Frg46(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 53, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg47 extends RegisterUint16 {

 private Frg47(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 54, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg48 extends RegisterUint16 {

 private Frg48(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 55, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg49 extends RegisterUint16 {

 private Frg49(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 56, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg50 extends RegisterUint16 {

 private Frg50(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 57, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg51 extends RegisterUint16 {

 private Frg51(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 58, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg52 extends RegisterUint16 {

 private Frg52(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 59, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg53 extends RegisterUint16 {

 private Frg53(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 60, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg54 extends RegisterUint16 {

 private Frg54(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 61, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg55 extends RegisterUint16 {

 private Frg55(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 62, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg56 extends RegisterUint16 {

 private Frg56(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 63, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg57 extends RegisterUint16 {

 private Frg57(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 64, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg58 extends RegisterUint16 {

 private Frg58(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 65, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg59 extends RegisterUint16 {

 private Frg59(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 66, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg60 extends RegisterUint16 {

 private Frg60(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 67, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg61 extends RegisterUint16 {

 private Frg61(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 68, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg62 extends RegisterUint16 {

 private Frg62(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 69, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg63 extends RegisterUint16 {

 private Frg63(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 70, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg64 extends RegisterUint16 {

 private Frg64(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 71, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg65 extends RegisterUint16 {

 private Frg65(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 72, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg66 extends RegisterUint16 {

 private Frg66(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 73, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg67 extends RegisterUint16 {

 private Frg67(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 74, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg68 extends RegisterUint16 {

 private Frg68(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 75, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg69 extends RegisterUint16 {

 private Frg69(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 76, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg70 extends RegisterUint16 {

 private Frg70(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 77, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg71 extends RegisterUint16 {

 private Frg71(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 78, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg72 extends RegisterUint16 {

 private Frg72(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 79, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg73 extends RegisterUint16 {

 private Frg73(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 80, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg74 extends RegisterUint16 {

 private Frg74(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 81, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg75 extends RegisterUint16 {

 private Frg75(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 82, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg78 extends RegisterUint16 {

 private Frg78(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 83, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg79 extends RegisterUint16 {

 private Frg79(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 84, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

    public class Frg80 extends RegisterUint16 {

 private Frg80(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 85, 1, "Frag80", "", "Last word of this fragment", Rw.RW, Mandatory.M);
        }
    }

    public class Ts extends RegisterUint32 {

 private Ts(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 86, 2, "Timestamp", "", "Timestamp value is the number of seconds since January 1, 2000", Rw.RW, Mandatory.M);
        }
    }

    public class Ms extends RegisterUint16 {

 private Ms(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 88, 1, "Milliseconds", "", "Millisecond counter 0-999", Rw.RW, Mandatory.M);
        }
    }

    public class Seq extends RegisterUint16 {

 private Seq(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 89, 1, "Sequence", "", "Sequence number of request", Rw.RW, Mandatory.M);
        }
    }

    public class UID extends RegisterUint16 {

 private UID(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 90, 1, "UID", "", "User ID for the request signature", Rw.RW, Mandatory.M);
        }
    }

    public class Role extends RegisterUint16 {

 private Role(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 91, 1, "Role", "", "Signing key used 0-5", Rw.RW, Mandatory.M);
        }
    }

    public class Alg extends RegisterEnum16 {

 private Alg(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 92, 1, "Algorithm", "", "Algorithm used to compute the digital signature", Rw.RW, Mandatory.M);
            hashtable.put((long) 0, "NONE");
            hashtable.put((long) 1, "AES-GMAC-64");
            hashtable.put((long) 2, "ECC-256");
        }
    }

    public class N extends RegisterUint16 {

 private N(TcpModbusHandler tcpModbusHandler)  {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 93, 1, "N", "", "Number of registers to follow for the certificate", Rw.RW, Mandatory.M);
        }
    }

    public class Cert extends RegisterUint16 {

        private Cert(TcpModbusHandler tcpModbusHandler) {
            init(tcpModbusHandler.getSetOperatorSecurityCertificate_9(), 94, 1, "", "", "", Rw.RW, Mandatory.M);
        }
    }

}
