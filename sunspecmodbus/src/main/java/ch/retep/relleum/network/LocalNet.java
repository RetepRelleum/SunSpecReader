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

package ch.retep.relleum.network;


import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import ch.retep.relleum.modbus.Read0X03;
import ch.retep.relleum.sunspec.SunSpecAdressItem;
import ch.retep.relleum.sunspec.TcpModbusHandler;
import ch.retep.relleum.sunspec.read.table.TableSunspec;

public class LocalNet {

    private static boolean ret = false;
    private static boolean res = false;

    private static boolean isSunspec(SunSpecAdressItem sunSpecAdressItem) {

        try {
            TcpModbusHandler tcpModbusHandler = new TcpModbusHandler();
            tcpModbusHandler.connect(sunSpecAdressItem);
            tcpModbusHandler.setStartingAdress(sunSpecAdressItem.getStartingAdress());
            TableSunspec sunspecID = new TableSunspec(tcpModbusHandler) {
                @Override
                public void doOnResponse() {
                    ret = getSunSpecID().toLong() == 0x53756e53;
                    res = true;
                }
            };
            sunspecID.init(sunSpecAdressItem.getStartingAdress() + 1, 0, 2, "init", "", "init sunspec", Read0X03.Rw.R, Read0X03.Mandatory.M);

            tcpModbusHandler.sendRequest(sunspecID);
            tcpModbusHandler.close();
            int tout = 0;
            while (tout < 100 && !res) {
                Thread.sleep(100);
                tout++;
            }

            return ret;
        } catch (InterruptedException ex) {
            Logger.getLogger(LocalNet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }


    public static Iterator<InetAddress> getAllSunSpecInLocalNetwork(SunSpecAdressItem sunSpecAdressItem) {
        Vector<InetAddress> vector = new Vector<>();
        for (Iterator<InetAddress> iterator = getAllModbusInLocalNetwork(); iterator != null && iterator.hasNext(); ) {
            InetAddress address = iterator.next();
            if (isSunspec(sunSpecAdressItem)) {
                vector.add(address);
            }
        }
        return vector.iterator();
    }

    public static Iterator<InetAddress> scanNetoworkAtPort(InetAddress inetAddress,int port){
        Vector<InetAddress> inetAddresses = new Vector<>();
        InetAddress localhost;
        localhost = inetAddress;
        byte[] ip = localhost != null ? localhost.getAddress() : new byte[0];

        for (int i = 0; i <= 255; i++) {
            ip[3] = (byte) i;
            InetAddress address;
            try {
                address = InetAddress.getByAddress(ip);
            } catch (UnknownHostException ex) {
                System.out.println(ex.toString());
                return null;
            }
            if (isReachable(address.getHostAddress(), port, 50)) {
                inetAddresses.add(address);
            }
        }
        return inetAddresses.iterator();
    }

    public static Iterator<InetAddress> getAllModbusInLocalNetwork() {
        Vector<InetAddress> inetAddresses = new Vector<>();
        InetAddress localhost;
        localhost = getLocalIpAddress();
        byte[] ip = localhost != null ? localhost.getAddress() : new byte[0];

        for (int i = 0; i <= 254; i++) {
            ip[3] = (byte) i;
            InetAddress address;
            try {
                address = InetAddress.getByAddress(ip);
            } catch (UnknownHostException ex) {
                System.out.println(ex.toString());
                return null;
            }
            if (isReachable(address.getHostAddress(), 502, 50)) {
                inetAddresses.add(address);
            }
        }
        return inetAddresses.iterator();
    }

    private static boolean isReachable(String addr, int openPort, int timeOutMillis) {
        try {
            Socket soc = new Socket();
            soc.connect(new InetSocketAddress(addr, openPort), timeOutMillis);
            soc.close();
            return true;
        } catch (IOException ex) {
            //    System.out.println(ex.getMessage());
            return false;
        }
    }

    public static InetAddress getLocalIpAddress() {
        try {
            for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces();
                 en.hasMoreElements(); ) {
                NetworkInterface intf = en.nextElement();
                List<InterfaceAddress> interfaceAddresses = intf.getInterfaceAddresses();
                for (InterfaceAddress interfaceAddress : interfaceAddresses) {
                    if (interfaceAddress.getBroadcast() != null) {
                        return interfaceAddress.getBroadcast();
                    }
                }

            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
        return null;
    }
}
