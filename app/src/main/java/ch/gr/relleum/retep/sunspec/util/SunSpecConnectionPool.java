package ch.gr.relleum.retep.sunspec.util;

import java.util.HashMap;

import ch.retep.relleum.sunspec.SunSpecAdressItem;
import ch.retep.relleum.sunspec.TcpModbusHandler;

/**
 * Created by Peter on 26.03.2017.
 */

public class SunSpecConnectionPool {
    private static HashMap<String,TcpModbusHandler> tcpModbusHandlerHashMap= new HashMap<>();

    public static TcpModbusHandler getTcpModbusHandler(SunSpecAdressItem sunSpecAdressItem) {
        if (tcpModbusHandlerHashMap.containsKey(sunSpecAdressItem.getSunspecAdressKey())){
            return tcpModbusHandlerHashMap.get(sunSpecAdressItem.getSunspecAdressKey());
        }else {
            TcpModbusHandler tcpModbusHandler= new TcpModbusHandler();
            boolean isConnect=tcpModbusHandler.connect(sunSpecAdressItem);
            if (isConnect) {
                tcpModbusHandlerHashMap.put(sunSpecAdressItem.getSunspecAdressKey(), tcpModbusHandler);
            } else{
                tcpModbusHandler= null;
            }
            return tcpModbusHandler;
        }
    }
}
