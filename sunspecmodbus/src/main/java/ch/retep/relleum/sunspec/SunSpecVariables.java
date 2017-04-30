/*
 * Copyright © 2017 , Peter Müller. All rights reserved.
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

import ch.retep.relleum.modbus.TcpHandler;

/**
 * Created by Peter on 15.02.2017.
 */

public class SunSpecVariables extends TcpHandler {

    /**
     *
     */
    protected  int common_1 = 0;
    /**
     *
     */
    protected  int basicAggregator_2 = 0;
    /**
     *
     */
    protected  int secureDatasetReadRequest_3 = 0;
    /**
     *
     */
    protected  int secureDatasetReadResponse_4 = 0;
    /**
     *
     */
    protected  int secureWriteRequest_5 = 0;
    /**
     *
     */
    protected  int secureWriteSequentialRequest_6 = 0;
    /**
     *
     */
    protected  int secureWriteResponseModelDRAFT1_7 = 0;
    /**
     *
     */
    protected  int getDeviceSecurityCertificate_8 = 0;
    /**
     *
     */
    protected  int setOperatorSecurityCertificate_9 = 0;
    /**
     *
     */
    protected  int communicationInterfaceHeader_10 = 0;
    /**
     *
     */
    protected  int ethernetLinkLayer_11 = 0;
    /**
     *
     */
    protected  int iPv4_12 = 0;
    /**
     *
     */
    protected  int iPv6_13 = 0;
    /**
     *
     */
    protected  int proxyServer_14 = 0;
    /**
     *
     */
    protected  int interfaceCountersModel_15 = 0;
    /**
     *
     */
    protected  int simpleIPNetwork_16 = 0;
    /**
     *
     */
    protected  int serialInterface_17 = 0;
    /**
     *
     */
    protected  int CcellularLink_18 = 0;
    /**
     *
     */
    protected  int pPPLink_19 = 0;
    /**
     *
     */
    protected  int inverterSinglePhase_101 = 0;
    /**
     *
     */
    protected  int inverterSplitPhase_102 = 0;
    /**
     *
     */
    protected  int inverterThreePhase_103 = 0;
    /**
     *
     */
    protected  int inverterSinglePhaseFLOAT_111 = 0;
    /**
     *
     */
    protected  int inverterSplitPhaseFLOAT_112 = 0;
    /**
     *
     */
    protected  int inverterThreePhaseFLOAT_113 = 0;
    /**
     *
     */
    protected  int nameplate_120 = 0;
    /**
     *
     */
    protected  int basicSettings_121 = 0;
    /**
     *
     */
    protected  int measurementsStatus_122 = 0;
    /**
     *
     */
    protected  int immediateControls_123 = 0;
    /**
     *
     */
    protected  int storage_124 = 0;
    /**
     *
     */
    protected  int pricing_125 = 0;
    /**
     *
     */
    protected  int voltVAR_126 = 0;
    /**
     *
     */
    protected  int freqWattParam_127 = 0;
    /**
     *
     */
    protected  int dynamicReactiveCurrent_128 = 0;
    /**
     *
     */
    protected  int lVRTD_129 = 0;
    /**
     *
     */
    protected  int hVRTD_130 = 0;
    /**
     *
     */
    protected  int wattPF_131 = 0;
    /**
     *
     */
    protected  int voltWatt_132 = 0;
    /**
     *
     */
    protected  int basicScheduling_133 = 0;
    /**
     *
     */
    protected  int freqWattCrv_134 = 0;
    /**
     *
     */
    protected  int lFRT_135 = 0;
    /**
     *
     */
    protected  int hFRT_136 = 0;
    /**
     *
     */
    protected  int lVRTC_137 = 0;
    /**
     *
     */
    protected  int hVRTC_138 = 0;
    /**
     *
     */
    protected  int lVRTX_139 = 0;
    /**
     *
     */
    protected  int hVRTX_140 = 0;
    /**
     *
     */
    protected  int lFRTC_141 = 0;
    /**
     *
     */
    protected  int hFRTC_142 = 0;
    /**
     *
     */
    protected  int lFRTX_143 = 0;
    /**
     *
     */
    protected  int lFRTX_144 = 0;
    /**
     *
     */
    protected  int extendedSettings_145 = 0;
    /**
     *
     */
    protected  int multipleMPPTInverterExtensionModel_160 = 0;
    /**
     *
     */
    protected  int meterSinglePhasesinglephaseANorABmeter_201 = 0;
    /**
     *
     */
    protected  int splitsinglephaseABNmeter_202 = 0;
    /**
     *
     */
    protected  int wyeConnectthreephaseabcnmeter_203 = 0;
    /**
     *
     */
    protected  int deltaConnectthreephaseabcmeter_204 = 0;
    /**
     *
     */
    protected  int singlephaseANorABmeter_211 = 0;
    /**
     *
     */
    protected  int splitsinglephaseABNmeter_212 = 0;
    /**
     *
     */
    protected  int wyeConnectthreephaseabcnmeter_213 = 0;
    /**
     *
     */
    protected  int deltaConnectthreephaseabcmeter_214 = 0;
    /**
     *
     */
    protected  int secureACMeterSelectedReadings_220 = 0;
    /**
     *
     */
    protected  int irradianceModel_302 = 0;
    /**
     *
     */
    protected  int backofModuleTemperatureModel_303 = 0;
    /**
     *
     */
    protected  int inclinometerModel_304 = 0;
    /**
     *
     */
    protected  int gPS_305 = 0;
    /**
     *
     */
    protected  int referencePointModel_306 = 0;
    /**
     *
     */
    protected  int baseMet_307 = 0;
    /**
     *
     */
    protected  int miniMetModel_308 = 0;
    /**
     *
     */
    protected  int stringCombinerCurrent_401 = 0;
    /**
     *
     */
    protected  int stringCombinerAdvanced_402 = 0;
    /**
     *
     */
    protected  int stringCombinerCurrent_403 = 0;
    /**
     *
     */
    protected  int stringCombinerAdvanced_404 = 0;
    /**
     *
     */
    protected  int solarModule_501 = 0;
    /**
     *
     */
    protected  int solarModule_502 = 0;
    /**
     *
     */
    protected  int trackerControllerDRAFT2_601 = 0;
    /**
     *
     */
    protected  int energyStorageBaseModelDEPRECATED_801 = 0;
    /**
     *
     */
    protected  int batteryBaseModel_802 = 0;
    /**
     *
     */
    protected  int lithiumIonBatteryBankModel_803 = 0;
    /**
     *
     */
    protected  int lithiumIonStringModel_804 = 0;
    /**
     *
     */
    protected  int lithiumIonModuleModel_805 = 0;
    /**
     *
     */
    protected  int flowBatteryModel_806 = 0;
    /**
     *
     */
    protected  int flowBatteryStringModel_807 = 0;
    /**
     *
     */
    protected  int flowBatteryModuleModel_808 = 0;
    /**
     *
     */
    protected  int flowBatteryStackModel_809 = 0;
    /**
     *
     */
    protected  int sunSpecTestModel1_63001 = 0;
    /**
     *
     */
    protected  int sunSpecTestModel2_63002 = 0;
    /**
     *
     */
    protected  int verisStatusandConfiguration_64001 = 0;
    /**
     *
     */
    protected  int mersenGreenString_64020 = 0;
    /**
     *
     */
    protected  int eltekInverterExtension_64101 = 0;
    /**
     *
     */
    protected  int outBackAXSdevice_64110 = 0;
    /**
     *
     */
    protected  int basicChargeController_64111 = 0;

    protected int outBackFMChargeController_64112 = 0;

    /**
     * @return the common_1
     */
    public  int getCommon_1() {
        return common_1;
    }

    /**
     * @return the basicAggregator_2
     */
    public  int getBasicAggregator_2() {
        return basicAggregator_2;
    }

    /**
     * @return the secureDatasetReadRequest_3
     */
    public  int getSecureDatasetReadRequest_3() {
        return secureDatasetReadRequest_3;
    }

    /**
     * @return the secureDatasetReadResponse_4
     */
    public  int getSecureDatasetReadResponse_4() {
        return secureDatasetReadResponse_4;
    }

    /**
     * @return the secureWriteRequest_5
     */
    public  int getSecureWriteRequest_5() {
        return secureWriteRequest_5;
    }

    /**
     * @return the secureWriteSequentialRequest_6
     */
    public  int getSecureWriteSequentialRequest_6() {
        return secureWriteSequentialRequest_6;
    }

    /**
     * @return the secureWriteResponseModelDRAFT1_7
     */
    public  int getSecureWriteResponseModelDRAFT1_7() {
        return secureWriteResponseModelDRAFT1_7;
    }

    /**
     * @return the getDeviceSecurityCertificate_8
     */
    public  int getGetDeviceSecurityCertificate_8() {
        return getDeviceSecurityCertificate_8;
    }

    /**
     * @return the setOperatorSecurityCertificate_9
     */
    public  int getSetOperatorSecurityCertificate_9() {
        return setOperatorSecurityCertificate_9;
    }

    /**
     * @return the communicationInterfaceHeader_10
     */
    public  int getCommunicationInterfaceHeader_10() {
        return communicationInterfaceHeader_10;
    }

    /**
     * @return the ethernetLinkLayer_11
     */
    public  int getEthernetLinkLayer_11() {
        return ethernetLinkLayer_11;
    }

    /**
     * @return the iPv4_12
     */
    public  int getiPv4_12() {
        return iPv4_12;
    }

    /**
     * @return the iPv6_13
     */
    public  int getiPv6_13() {
        return iPv6_13;
    }

    /**
     * @return the proxyServer_14
     */
    public  int getProxyServer_14() {
        return proxyServer_14;
    }

    /**
     * @return the interfaceCountersModel_15
     */
    public  int getInterfaceCountersModel_15() {
        return interfaceCountersModel_15;
    }

    /**
     * @return the simpleIPNetwork_16
     */
    public  int getSimpleIPNetwork_16() {
        return simpleIPNetwork_16;
    }

    /**
     * @return the serialInterface_17
     */
    public  int getSerialInterface_17() {
        return serialInterface_17;
    }

    /**
     * @return the CcellularLink_18
     */
    public  int getCcellularLink_18() {
        return CcellularLink_18;
    }

    /**
     * @return the pPPLink_19
     */
    public  int getpPPLink_19() {
        return pPPLink_19;
    }

    /**
     * @return the inverterSinglePhase_101
     */
    public  int getInverterSinglePhase_101() {
        return inverterSinglePhase_101;
    }

    /**
     * @return the inverterSplitPhase_102
     */
    public  int getInverterSplitPhase_102() {
        return inverterSplitPhase_102;
    }

    /**
     * @return the inverterThreePhase_103
     */
    public  int getInverterThreePhase_103() {
        return inverterThreePhase_103;
    }

    /**
     * @return the inverterSinglePhaseFLOAT_111
     */
    public  int getInverterSinglePhaseFLOAT_111() {
        return inverterSinglePhaseFLOAT_111;
    }

    /**
     * @return the inverterSplitPhaseFLOAT_112
     */
    public  int getInverterSplitPhaseFLOAT_112() {
        return inverterSplitPhaseFLOAT_112;
    }

    /**
     * @return the inverterThreePhaseFLOAT_113
     */
    public  int getInverterThreePhaseFLOAT_113() {
        return inverterThreePhaseFLOAT_113;
    }

    /**
     * @return the nameplate_120
     */
    public  int getNameplate_120() {
        return nameplate_120;
    }

    /**
     * @return the basicSettings_121
     */
    public  int getBasicSettings_121() {
        return basicSettings_121;
    }

    /**
     * @return the measurementsStatus_122
     */
    public  int getMeasurementsStatus_122() {
        return measurementsStatus_122;
    }

    /**
     * @return the immediateControls_123
     */
    public  int getImmediateControls_123() {
        return immediateControls_123;
    }

    /**
     * @return the storage_124
     */
    public  int getStorage_124() {
        return storage_124;
    }

    /**
     * @return the pricing_125
     */
    public  int getPricing_125() {
        return pricing_125;
    }

    /**
     * @return the VoltVAR_126
     */
    public  int getVoltVAR_126() {
        return voltVAR_126;
    }

    /**
     * @return the freqWattParam_127
     */
    public  int getFreqWattParam_127() {
        return freqWattParam_127;
    }

    /**
     * @return the dynamicReactiveCurrent_128
     */
    public  int getDynamicReactiveCurrent_128() {
        return dynamicReactiveCurrent_128;
    }

    /**
     * @return the lVRTD_129
     */
    public  int getlVRTD_129() {
        return lVRTD_129;
    }

    /**
     * @return the hVRTD_130
     */
    public  int gethVRTD_130() {
        return hVRTD_130;
    }

    /**
     * @return the wattPF_131
     */
    public  int getWattPF_131() {
        return wattPF_131;
    }

    /**
     * @return the voltWatt_132
     */
    public  int getVoltWatt_132() {
        return voltWatt_132;
    }

    /**
     * @return the basicScheduling_133
     */
    public  int getBasicScheduling_133() {
        return basicScheduling_133;
    }

    /**
     * @return the freqWattCrv_134
     */
    public  int getFreqWattCrv_134() {
        return freqWattCrv_134;
    }

    /**
     * @return the lFRT_135
     */
    public  int getlFRT_135() {
        return lFRT_135;
    }

    /**
     * @return the hFRT_136
     */
    public  int gethFRT_136() {
        return hFRT_136;
    }

    /**
     * @return the lVRTC_137
     */
    public  int getlVRTC_137() {
        return lVRTC_137;
    }

    /**
     * @return the hVRTC_138
     */
    public  int gethVRTC_138() {
        return hVRTC_138;
    }

    /**
     * @return the lVRTX_139
     */
    public  int getlVRTX_139() {
        return lVRTX_139;
    }

    /**
     * @return the hVRTX_140
     */
    public  int gethVRTX_140() {
        return hVRTX_140;
    }

    /**
     * @return the lFRTC_141
     */
    public  int getlFRTC_141() {
        return lFRTC_141;
    }

    /**
     * @return the hFRTC_142
     */
    public  int gethFRTC_142() {
        return hFRTC_142;
    }

    /**
     * @return the lFRTX_143
     */
    public  int getlFRTX_143() {
        return lFRTX_143;
    }

    /**
     * @return the lFRTX_144
     */
    public  int getlFRTX_144() {
        return lFRTX_144;
    }

    public  int getOutBackFMChargeController_64112() {
        return outBackFMChargeController_64112;
    }
    /**
     * @return the extendedSettings_145
     */
    public  int getExtendedSettings_145() {
        return extendedSettings_145;
    }

    /**
     * @return the multipleMPPTInverterExtensionModel_160
     */
    public  int getMultipleMPPTInverterExtensionModel_160() {
        return multipleMPPTInverterExtensionModel_160;
    }

    /**
     * @return the meterSinglePhasesinglephaseANorABmeter_201
     */
    public  int getMeterSinglePhasesinglephaseANorABmeter_201() {
        return meterSinglePhasesinglephaseANorABmeter_201;
    }

    /**
     * @return the splitsinglephaseABNmeter_202
     */
    public  int getSplitsinglephaseABNmeter_202() {
        return splitsinglephaseABNmeter_202;
    }

    /**
     * @return the wyeConnectthreephaseabcnmeter_203
     */
    public  int getWyeConnectthreephaseabcnmeter_203() {
        return wyeConnectthreephaseabcnmeter_203;
    }

    /**
     * @return the deltaConnectthreephaseabcmeter_204
     */
    public  int getDeltaConnectthreephaseabcmeter_204() {
        return deltaConnectthreephaseabcmeter_204;
    }

    /**
     * @return the singlephaseANorABmeter_211
     */
    public  int getSinglephaseANorABmeter_211() {
        return singlephaseANorABmeter_211;
    }

    /**
     * @return the splitsinglephaseABNmeter_212
     */
    public  int getSplitsinglephaseABNmeter_212() {
        return splitsinglephaseABNmeter_212;
    }

    /**
     * @return the wyeConnectthreephaseabcnmeter_213
     */
    public  int getWyeConnectthreephaseabcnmeter_213() {
        return wyeConnectthreephaseabcnmeter_213;
    }

    /**
     * @return the deltaConnectthreephaseabcmeter_214
     */
    public  int getDeltaConnectthreephaseabcmeter_214() {
        return deltaConnectthreephaseabcmeter_214;
    }

    /**
     * @return the secureACMeterSelectedReadings_220
     */
    public  int getSecureACMeterSelectedReadings_220() {
        return secureACMeterSelectedReadings_220;
    }

    /**
     * @return the irradianceModel_302
     */
    public  int getIrradianceModel_302() {
        return irradianceModel_302;
    }

    /**
     * @return the backofModuleTemperatureModel_303
     */
    public  int getBackofModuleTemperatureModel_303() {
        return backofModuleTemperatureModel_303;
    }

    /**
     * @return the inclinometerModel_304
     */
    public  int getInclinometerModel_304() {
        return inclinometerModel_304;
    }

    /**
     * @return the gPS_305
     */
    public  int getgPS_305() {
        return gPS_305;
    }

    /**
     * @return the referencePointModel_306
     */
    public  int getReferencePointModel_306() {
        return referencePointModel_306;
    }

    /**
     * @return the baseMet_307
     */
    public  int getBaseMet_307() {
        return baseMet_307;
    }

    /**
     * @return the miniMetModel_308
     */
    public  int getMiniMetModel_308() {
        return miniMetModel_308;
    }

    /**
     * @return the stringCombinerCurrent_401
     */
    public  int getStringCombinerCurrent_401() {
        return stringCombinerCurrent_401;
    }

    /**
     * @return the stringCombinerAdvanced_402
     */
    public  int getStringCombinerAdvanced_402() {
        return stringCombinerAdvanced_402;
    }

    /**
     * @return the stringCombinerCurrent_403
     */
    public  int getStringCombinerCurrent_403() {
        return stringCombinerCurrent_403;
    }

    /**
     * @return the stringCombinerAdvanced_404
     */
    public  int getStringCombinerAdvanced_404() {
        return stringCombinerAdvanced_404;
    }

    /**
     * @return the solarModule_501
     */
    public  int getSolarModule_501() {
        return solarModule_501;
    }

    /**
     * @return the solarModule_502
     */
    public  int getSolarModule_502() {
        return solarModule_502;
    }

    /**
     * @return the trackerControllerDRAFT2_601
     */
    public  int getTrackerControllerDRAFT2_601() {
        return trackerControllerDRAFT2_601;
    }

    /**
     * @return the energyStorageBaseModelDEPRECATED_801
     */
    public  int getEnergyStorageBaseModelDEPRECATED_801() {
        return energyStorageBaseModelDEPRECATED_801;
    }

    /**
     * @return the batteryBaseModel_802
     */
    public  int getBatteryBaseModel_802() {
        return batteryBaseModel_802;
    }

    /**
     * @return the lithiumIonBatteryBankModel_803
     */
    public  int getLithiumIonBatteryBankModel_803() {
        return lithiumIonBatteryBankModel_803;
    }

    /**
     * @return the lithiumIonStringModel_804
     */
    public  int getLithiumIonStringModel_804() {
        return lithiumIonStringModel_804;
    }

    /**
     * @return the lithiumIonModuleModel_805
     */
    public  int getLithiumIonModuleModel_805() {
        return lithiumIonModuleModel_805;
    }

    /**
     * @return the flowBatteryModel_806
     */
    public  int getFlowBatteryModel_806() {
        return flowBatteryModel_806;
    }

    /**
     * @return the flowBatteryStringModel_807
     */
    public  int getFlowBatteryStringModel_807() {
        return flowBatteryStringModel_807;
    }

    /**
     * @return the flowBatteryModuleModel_808
     */
    public  int getFlowBatteryModuleModel_808() {
        return flowBatteryModuleModel_808;
    }

    /**
     * @return the flowBatteryStackModel_809
     */
    public  int getFlowBatteryStackModel_809() {
        return flowBatteryStackModel_809;
    }

    /**
     * @return the sunSpecTestModel1_63001
     */
    public  int getSunSpecTestModel1_63001() {
        return sunSpecTestModel1_63001;
    }

    /**
     * @return the sunSpecTestModel2_63002
     */
    public  int getSunSpecTestModel2_63002() {
        return sunSpecTestModel2_63002;
    }

    /**
     * @return the verisStatusandConfiguration_64001
     */
    public  int getVerisStatusandConfiguration_64001() {
        return verisStatusandConfiguration_64001;
    }

    /**
     * @return the mersenGreenString_64020
     */
    public  int getMersenGreenString_64020() {
        return mersenGreenString_64020;
    }

    /**
     * @return the eltekInverterExtension_64101
     */
    public  int getEltekInverterExtension_64101() {
        return eltekInverterExtension_64101;
    }

    /**
     * @return the outBackAXSdevice_64110
     */
    public  int getOutBackAXSdevice_64110() {
        return outBackAXSdevice_64110;
    }

    /**
     * @return the basicChargeController_64111
     */
    public  int getBasicChargeController_64111() {
        return basicChargeController_64111;
    }


}
