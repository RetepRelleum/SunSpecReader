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

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Peter on 05.02.2017.
 */

public class SunSpecAdressItem {
    private int key=0;
    private int id=0;
    private String name="";
    private String hostName = "";
    private String ip = "";
    private int port = 502;
    private int unitId = 126;
    private boolean selected=false;
    private int startingAdress = 40000;
    private String hostAddress;


    public String getSunspecAdressKey(){
        return getIp()+getPort()+getUnitId()+getStartingAdress();
    }



    public SunSpecAdressItem(String aHostName, String aHostAddress, int aPortNr, int aUnitID, int aStartingAdress) {
        hostName=aHostName;
        hostAddress =aHostAddress;
        port=aPortNr;
        unitId=aUnitID;
        startingAdress=aStartingAdress;
    }

    public SunSpecAdressItem() {
    }

    public String getHostName() {
        return hostName;
    }

    protected void setHostNamei(String hostName) {
        this.hostName = hostName;
    }

    public String getIp() {
        if(ip.length()==0){
            return hostName;
        }
        return ip;
    }

    protected void setIpi(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    protected void setPorti(int port) {
        this.port = port;
    }

    public int getUnitId() {
        return unitId;
    }

    protected void setUnitIdi(int unitId) {
        this.unitId = unitId;
    }

    public int getStartingAdress() {
        return startingAdress;
    }

    protected void setStartingAdressi(int startingAdress) {
        this.startingAdress = startingAdress;
    }

    public int getId() {
        return id;
    }

    protected void setIdi(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    protected void setNamei(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return selected;
    }

    protected void setSelectedi(boolean selected) {
        this.selected = selected;
    }

    public int getKey() {
        return key;
    }

    protected void setKeyi(int key) {
        this.key = key;
    }

    public InetAddress getInetAdress() {
        if (ip.length()==0){
            ip=getHostName();
        }
        String[] ipA=ip.split("\\.");
        byte[] b={(byte)(Integer.parseInt(ipA[0])&0xFF),(byte)(Integer.parseInt(ipA[1])&0xFF),(byte)(Integer.parseInt(ipA[2])&0xFF),(byte)(Integer.parseInt(ipA[3])&0xFF)};
        InetAddress inetAddress= null;
        try {
            inetAddress = InetAddress.getByAddress(b);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return inetAddress;
    }
}