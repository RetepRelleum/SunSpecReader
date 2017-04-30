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

package ch.retep.relleum.sunspec;


import java.net.InetAddress;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

import ch.retep.relleum.modbus.Read0X03;
import ch.retep.relleum.modbus.datatype.RegisterUint16;
import ch.retep.relleum.modbus.datatype.Table;
import ch.retep.relleum.sunspec.read.table.Table0001Common;
import ch.retep.relleum.sunspec.read.table.Table0002BasicAggregator;
import ch.retep.relleum.sunspec.read.table.Table0003SecureDatasetReadRequest;
import ch.retep.relleum.sunspec.read.table.Table0004SecureDatasetReadResponse;
import ch.retep.relleum.sunspec.read.table.Table0005SecureWriteRequest;
import ch.retep.relleum.sunspec.read.table.Table0006SecureWriteSequentialRequest;
import ch.retep.relleum.sunspec.read.table.Table0007SecureWriteResponseModelDRAFT1;
import ch.retep.relleum.sunspec.read.table.Table0008GetDeviceSecurityCertificate;
import ch.retep.relleum.sunspec.read.table.Table0009SetOperatorSecurityCertificate;
import ch.retep.relleum.sunspec.read.table.Table0010CommunicationInterfaceHeader;
import ch.retep.relleum.sunspec.read.table.Table0011EthernetLinkLayer;
import ch.retep.relleum.sunspec.read.table.Table0012IPv4;
import ch.retep.relleum.sunspec.read.table.Table0103InverterThreePhase;
import ch.retep.relleum.sunspec.read.table.Table0120Nameplate;
import ch.retep.relleum.sunspec.read.table.Table0121BasicSettings;
import ch.retep.relleum.sunspec.read.table.Table0122MeasurementsStatus;
import ch.retep.relleum.sunspec.read.table.Table0123ImmediateControls;
import ch.retep.relleum.sunspec.read.table.Table0124Storage;
import ch.retep.relleum.sunspec.read.table.Table0126VoltVAR;
import ch.retep.relleum.sunspec.read.table.Table0127FreqWattParam;
import ch.retep.relleum.sunspec.read.table.Table0128DynamicReactiveCurrent;
import ch.retep.relleum.sunspec.read.table.Table0131WattPF;
import ch.retep.relleum.sunspec.read.table.Table0132VoltWatt;
import ch.retep.relleum.sunspec.read.table.Table0160MultipleMPPTInverterExtensionModel;
import ch.retep.relleum.sunspec.read.table.TableIdL;
import ch.retep.relleum.sunspec.read.table.TableSunspec;

import static java.lang.System.out;
import static java.lang.Thread.sleep;

/**
 * @author Peter
 */
public class TcpModbusHandler extends SunSpecVariables {
    protected int modbusRegisterNumber = 0;
    private Vector<Table> vector =  new Vector<>();
    /**
     *
     */
    public int modelIdNr;
    private RegisterUint16 modelID = null;
    private RegisterUint16 numberPicsTable = null;
    private TableIdL tableIdL = null;
    private boolean isInit = true;


    public boolean connect(SunSpecAdressItem sunSpecAdressItem) {
        boolean ret=super.connect(sunSpecAdressItem);
        if (ret) {
            vector = new Vector<>();
            modbusRegisterNumber = sunSpecAdressItem.getStartingAdress();
            init();
        }
        return ret;
    }



    public void setStartingAdress(int startingAdress) {
        modbusRegisterNumber =startingAdress;
    }



    /**
     * @param inetAddress
     * @param port
     * @return
     */
    @Override
    public boolean connect(InetAddress inetAddress, int port) {
        return connect(inetAddress, port, 40000);
    }

    /**
     * @param inetAddress
     * @param port
     * @param sunspecModbusRegisterStasrtNumber
     * @return
     */
    public boolean connect(InetAddress inetAddress, int port, int sunspecModbusRegisterStasrtNumber) {
        try {
            sleep(100);
        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        }
        boolean ret = super.connect(inetAddress, port);
        vector = new Vector<>();
        setStartingAdress(sunspecModbusRegisterStasrtNumber);
        init();
        return ret;
    }

    private void init() {
        modbusRegisterNumber = getModbusRegisterNumber() + 1;

        TableSunspec tableSunspec = new TableSunspec(this) {
            @Override
            public void doOnResponse() {
                super.doOnResponse();
                if (getSunSpecID().toLong() != 0x53756e53) {
                    out.println("ModbusSunspecException"+getSunSpecID().toLong()) ;
                } else {
                    out.println("ModbusSunspecID");
                    sendRequest(tableIdL);
                }
            }
        };
        modbusRegisterNumber = getModbusRegisterNumber() + 1;
        modbusRegisterNumber = getModbusRegisterNumber() + 1;


        tableIdL = new TableIdL(this) {
            @Override
            public void doOnResponse() {
                super.doOnResponse();
                if (!getID().isNaN()) {
                    setModbusRegisterNr((int) getID().toLong(), getModbusRegisterNumber(), (int) getL().toLong());
                    modbusRegisterNumber = getModbusRegisterNumber() + (int) getL().toLong() + 2;
                    init(getModbusRegisterNumber(), 0, 2, "Model ID init", "", "Model ID init", Rw.nan, Mandatory.nan);
                    sendRequest(this);
                } else {
                    isInit = false;
                }
            }
        };

        sendRequest(tableSunspec);


        while (isInit) {
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
        }

    }

    public void setModbusRegisterNr(int modelIdNr, int modbusRegisterNumber, int qreg) {

        switch (modelIdNr) {
            case 1:
                common_1 = modbusRegisterNumber;
                Table0001Common table0001Common = new Table0001Common(this);
                table0001Common.setQuantityOfRegisters(qreg + 4);
                vector.add(table0001Common);
                break;
            case 2:
                basicAggregator_2 = modbusRegisterNumber;
                Table0002BasicAggregator table0002BasicAggregator = new Table0002BasicAggregator(this);
                table0002BasicAggregator.setQuantityOfRegisters(qreg + 2);
                vector.add(new Table0002BasicAggregator(this));
                break;
            case 3:
                secureDatasetReadRequest_3 = modbusRegisterNumber;
                Table0003SecureDatasetReadRequest table0003SecureDatasetReadRequest = new Table0003SecureDatasetReadRequest(this);
                table0003SecureDatasetReadRequest.setQuantityOfRegisters(qreg + 2);
                vector.add(table0003SecureDatasetReadRequest);
                break;
            case 4:
                secureDatasetReadResponse_4 = modbusRegisterNumber;
                Table0004SecureDatasetReadResponse table0004SecureDatasetReadResponse = new Table0004SecureDatasetReadResponse(this);
                table0004SecureDatasetReadResponse.setQuantityOfRegisters(qreg + 2);
                vector.add(table0004SecureDatasetReadResponse);
                break;
            case 5:
                secureWriteRequest_5 = modbusRegisterNumber;
                Table0005SecureWriteRequest table0005SecureWriteRequest = new Table0005SecureWriteRequest(this);
                table0005SecureWriteRequest.setQuantityOfRegisters(qreg + 2);
                vector.add(table0005SecureWriteRequest);
                break;
            case 6:
                secureWriteSequentialRequest_6 = modbusRegisterNumber;
                Table0006SecureWriteSequentialRequest table0006SecureWriteSequentialRequest = new Table0006SecureWriteSequentialRequest(this);
                table0006SecureWriteSequentialRequest.setQuantityOfRegisters(qreg + 2);
                vector.add(table0006SecureWriteSequentialRequest);
                break;
            case 7:
                secureWriteResponseModelDRAFT1_7 = modbusRegisterNumber;
                Table0007SecureWriteResponseModelDRAFT1 table0007SecureWriteResponseModelDRAFT1 = new Table0007SecureWriteResponseModelDRAFT1(this);
                table0007SecureWriteResponseModelDRAFT1.setQuantityOfRegisters(qreg + 2);
                vector.add(table0007SecureWriteResponseModelDRAFT1);
                break;
            case 8:
                getDeviceSecurityCertificate_8 = modbusRegisterNumber;
                Table0008GetDeviceSecurityCertificate table0008GetDeviceSecurityCertificate = new Table0008GetDeviceSecurityCertificate(this);
                table0008GetDeviceSecurityCertificate.setQuantityOfRegisters(qreg + 2);
                vector.add(table0008GetDeviceSecurityCertificate);
                break;
            case 9:
                setOperatorSecurityCertificate_9 = modbusRegisterNumber;
                Table0009SetOperatorSecurityCertificate table0009SetOperatorSecurityCertificate = new Table0009SetOperatorSecurityCertificate(this);
                table0009SetOperatorSecurityCertificate.setQuantityOfRegisters(qreg + 2);
                vector.add(table0009SetOperatorSecurityCertificate);
                break;
            case 10:
                communicationInterfaceHeader_10 = modbusRegisterNumber;
                Table0010CommunicationInterfaceHeader table0010CommunicationInterfaceHeader = new Table0010CommunicationInterfaceHeader(this);
                table0010CommunicationInterfaceHeader.setQuantityOfRegisters(qreg + 2);
                vector.add(table0010CommunicationInterfaceHeader);
                break;
            case 11:
                ethernetLinkLayer_11 = modbusRegisterNumber;
                Table0011EthernetLinkLayer table0011EthernetLinkLayer = new Table0011EthernetLinkLayer(this);
                table0011EthernetLinkLayer.setQuantityOfRegisters(qreg + 2);
                vector.add(table0011EthernetLinkLayer);
                break;
            case 12:
                iPv4_12 = modbusRegisterNumber;
                Table0012IPv4 table0012IPv4 = new Table0012IPv4(this);
                table0012IPv4.setQuantityOfRegisters(qreg + 2);
                vector.add(table0012IPv4);
                break;
            case 13:
                iPv6_13 = modbusRegisterNumber;
                break;
            case 14:
                proxyServer_14 = modbusRegisterNumber;
                break;
            case 15:
                interfaceCountersModel_15 = modbusRegisterNumber;
                break;
            case 16:
                simpleIPNetwork_16 = modbusRegisterNumber;
                break;
            case 17:
                serialInterface_17 = modbusRegisterNumber;
                break;
            case 18:
                CcellularLink_18 = modbusRegisterNumber;
                break;
            case 19:
                pPPLink_19 = modbusRegisterNumber;
                break;
            case 101:
                inverterSinglePhase_101 = modbusRegisterNumber;
                break;
            case 102:
                inverterSplitPhase_102 = modbusRegisterNumber;

                break;
            case 103:
                inverterThreePhase_103 = modbusRegisterNumber;
                Table0103InverterThreePhase table0103InverterThreePhase = new Table0103InverterThreePhase(this);
                table0103InverterThreePhase.setQuantityOfRegisters(qreg + 2);
                vector.add(table0103InverterThreePhase);
                break;
            case 111:
                inverterSinglePhaseFLOAT_111 = modbusRegisterNumber;
                break;
            case 112:
                inverterSplitPhaseFLOAT_112 = modbusRegisterNumber;
                break;
            case 113:
                inverterThreePhaseFLOAT_113 = modbusRegisterNumber;
                break;
            case 120:
                nameplate_120 = modbusRegisterNumber;
                Table0120Nameplate table0120Nameplate = new Table0120Nameplate(this);
                table0120Nameplate.setQuantityOfRegisters(qreg + 2);
                vector.add(table0120Nameplate);
                break;
            case 121:
                basicSettings_121 = modbusRegisterNumber;
                Table0121BasicSettings table0121BasicSettings = new Table0121BasicSettings(this);
                table0121BasicSettings.setQuantityOfRegisters(qreg + 2);
                vector.add(table0121BasicSettings);
                break;
            case 122:
                measurementsStatus_122 = modbusRegisterNumber;
                Table0122MeasurementsStatus table0122MeasurementsStatus = new Table0122MeasurementsStatus(this);
                table0122MeasurementsStatus.setQuantityOfRegisters(qreg + 2);
                vector.add(table0122MeasurementsStatus);
                break;
            case 123:
                immediateControls_123 = modbusRegisterNumber;
                Table0123ImmediateControls table0123ImmediateControls = new Table0123ImmediateControls(this);
                table0123ImmediateControls.setQuantityOfRegisters(qreg + 2);
                vector.add(table0123ImmediateControls);
                break;
            case 124:
                storage_124 = modbusRegisterNumber;
                Table0124Storage table0124Storage = new Table0124Storage(this);
                table0124Storage.setQuantityOfRegisters(qreg + 2);
                vector.add(table0124Storage);
                break;
            case 125:
                pricing_125 = modbusRegisterNumber;
                break;
            case 126:
                voltVAR_126 = modbusRegisterNumber;
                Table0126VoltVAR table0126StaticVoltVAR = new Table0126VoltVAR(this);
                table0126StaticVoltVAR.setQuantityOfRegisters(qreg + 2);
                vector.add(table0126StaticVoltVAR);
                break;
            case 127:
                freqWattParam_127 = modbusRegisterNumber;
                Table0127FreqWattParam table0127FreqWattParam = new Table0127FreqWattParam(this);
                table0127FreqWattParam.setQuantityOfRegisters(qreg + 2);
                vector.add(table0127FreqWattParam);
                break;
            case 128:
                dynamicReactiveCurrent_128 = modbusRegisterNumber;
                Table0128DynamicReactiveCurrent table0128DynamicReactiveCurrent = new Table0128DynamicReactiveCurrent(this);
                table0128DynamicReactiveCurrent.setQuantityOfRegisters(qreg + 2);
                vector.add(table0128DynamicReactiveCurrent);
                break;
            case 129:
                lVRTD_129 = modbusRegisterNumber;
                break;
            case 130:
                hVRTD_130 = modbusRegisterNumber;
                break;
            case 131:
                wattPF_131 = modbusRegisterNumber;
                Table0131WattPF table0131WattPF = new Table0131WattPF(this);
                table0131WattPF.setQuantityOfRegisters(qreg + 2);
                vector.add(table0131WattPF);
                break;
            case 132:
                voltWatt_132 = modbusRegisterNumber;
                Table0132VoltWatt table0132VoltWatt = new Table0132VoltWatt(this);
                table0132VoltWatt.setQuantityOfRegisters(qreg + 2);
                vector.add(table0132VoltWatt);
                break;
            case 133:
                basicScheduling_133 = modbusRegisterNumber;
                break;
            case 134:
                freqWattCrv_134 = modbusRegisterNumber;
                break;
            case 135:
                lFRT_135 = modbusRegisterNumber;
                break;
            case 136:
                hFRT_136 = modbusRegisterNumber;
                break;
            case 137:
                lVRTC_137 = modbusRegisterNumber;
                break;
            case 138:
                hVRTC_138 = modbusRegisterNumber;
                break;
            case 139:
                lVRTX_139 = modbusRegisterNumber;
                break;
            case 140:
                hVRTX_140 = modbusRegisterNumber;
                break;
            case 141:
                lFRTC_141 = modbusRegisterNumber;
                break;
            case 142:
                hFRTC_142 = modbusRegisterNumber;
                break;
            case 143:
                lFRTX_143 = modbusRegisterNumber;
                break;
            case 144:
                lFRTX_144 = modbusRegisterNumber;
                break;
            case 145:
                extendedSettings_145 = modbusRegisterNumber;
                break;
            case 160:
                multipleMPPTInverterExtensionModel_160 = modbusRegisterNumber;
                Table0160MultipleMPPTInverterExtensionModel table0160MultipleMPPTInverterExtensionModel = new Table0160MultipleMPPTInverterExtensionModel(this);
                table0160MultipleMPPTInverterExtensionModel.setQuantityOfRegisters(qreg + 2);
                vector.add(table0160MultipleMPPTInverterExtensionModel);
                break;
            case 201:
                meterSinglePhasesinglephaseANorABmeter_201 = modbusRegisterNumber;
                break;
            case 202:
                splitsinglephaseABNmeter_202 = modbusRegisterNumber;
                break;
            case 2203:
                wyeConnectthreephaseabcnmeter_203 = modbusRegisterNumber;
                break;
            case 204:
                deltaConnectthreephaseabcmeter_204 = modbusRegisterNumber;
                break;
            case 211:
                singlephaseANorABmeter_211 = modbusRegisterNumber;
                break;
            case 212:
                splitsinglephaseABNmeter_212 = modbusRegisterNumber;
                break;
            case 213:
                wyeConnectthreephaseabcnmeter_213 = modbusRegisterNumber;
                break;
            case 214:
                deltaConnectthreephaseabcmeter_214 = modbusRegisterNumber;
                break;
            case 220:
                secureACMeterSelectedReadings_220 = modbusRegisterNumber;
                break;
            case 302:
                irradianceModel_302 = modbusRegisterNumber;
                break;
            case 303:
                backofModuleTemperatureModel_303 = modbusRegisterNumber;
                break;
            case 304:
                inclinometerModel_304 = modbusRegisterNumber;
                break;
            case 305:
                gPS_305 = modbusRegisterNumber;
                break;
            case 306:
                referencePointModel_306 = modbusRegisterNumber;
                break;
            case 307:
                baseMet_307 = modbusRegisterNumber;
                break;
            case 308:
                miniMetModel_308 = modbusRegisterNumber;
                break;
            case 401:
                stringCombinerCurrent_401 = modbusRegisterNumber;
                break;
            case 402:
                stringCombinerAdvanced_402 = modbusRegisterNumber;
                break;
            case 403:
                stringCombinerCurrent_403 = modbusRegisterNumber;
                break;
            case 404:
                stringCombinerAdvanced_404 = modbusRegisterNumber;
                break;
            case 501:
                solarModule_501 = modbusRegisterNumber;
                break;
            case 502:
                solarModule_502 = modbusRegisterNumber;
                break;
            case 601:
                trackerControllerDRAFT2_601 = modbusRegisterNumber;
                break;
            case 801:
                energyStorageBaseModelDEPRECATED_801 = modbusRegisterNumber;
                break;
            case 802:
                batteryBaseModel_802 = modbusRegisterNumber;
                break;
            case 803:
                lithiumIonBatteryBankModel_803 = modbusRegisterNumber;
                break;
            case 804:
                lithiumIonStringModel_804 = modbusRegisterNumber;
                break;
            case 805:
                lithiumIonModuleModel_805 = modbusRegisterNumber;
                break;
            case 806:
                flowBatteryModel_806 = modbusRegisterNumber;
                break;
            case 807:
                flowBatteryStringModel_807 = modbusRegisterNumber;
                break;
            case 808:
                flowBatteryModuleModel_808 = modbusRegisterNumber;
                break;
            case 809:
                flowBatteryStackModel_809 = modbusRegisterNumber;
                break;
            case 63001:
                sunSpecTestModel1_63001 = modbusRegisterNumber;
                break;
            case 63002:
                sunSpecTestModel2_63002 = modbusRegisterNumber;
                break;
            case 64001:
                verisStatusandConfiguration_64001 = modbusRegisterNumber;
                break;
            case 64020:
                mersenGreenString_64020 = modbusRegisterNumber;
                break;
            case 64101:
                eltekInverterExtension_64101 = modbusRegisterNumber;
                break;
            case 64110:
                outBackAXSdevice_64110 = modbusRegisterNumber;
                break;
            case 64111:
                basicChargeController_64111 = modbusRegisterNumber;
                break;
            case 64112:
                outBackFMChargeController_64112 = modbusRegisterNumber;
                break;

        }
    }

    /**
     * @return
     */
    public Iterator<Table> getTables() {
        return vector.iterator();
    }

    /**
     *
     */
    public void sendAllTable() {
        for (Iterator<Table> iterator = getTables(); iterator.hasNext(); ) {
            sendRequest(iterator.next());
        }
    }

    /**
     *
     */
    public void sendAllMessage() {
        for (Iterator<Table> iterator = getTables(); iterator.hasNext(); ) {
            Table table = iterator.next();
            for (Iterator<Read0X03> iteratorRegister = table.getMessages(); iteratorRegister.hasNext(); ) {
                sendRequest(iteratorRegister.next());
            }
        }
    }

    public Hashtable<Long, Read0X03> getAllMessage() {
        Hashtable<Long, Read0X03> longRead0X03Hashtable = new Hashtable<>();
        for (Iterator<Table> iterator = getTables(); iterator.hasNext(); ) {
            Table table = iterator.next();
            for (Iterator<Read0X03> iteratorRegister = table.getMessages(); iteratorRegister.hasNext(); ) {
                longRead0X03Hashtable.put((long) iteratorRegister.next().getStartingAddress(), iteratorRegister.next());
            }
        }
        return longRead0X03Hashtable;
    }

    public int getModbusRegisterNumber() {
        return modbusRegisterNumber;
    }
}
