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

package ch.retep.relleum.modbus;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.Vector;

import ch.retep.relleum.sunspec.SunSpecAdressItem;

import static java.lang.System.err;
import static java.lang.System.out;
import static java.lang.Thread.sleep;

/**
 * @author Peter
 */
public class TcpHandler implements Runnable {

    private Vector<Header> vector = new Vector();
    private DataOutputStream outToServer = null;
    private DataInputStream inFromServer = null;
    private Socket clientSocket = null;
    private boolean running = false;
    private InetAddress inetAddress;
    private boolean stop=false;

    /**
     * @param aInetAddress
     * @param port
     * @return
     */
    public boolean connect(InetAddress aInetAddress, int port) {
        running = true;
        try {
            clientSocket = new Socket(aInetAddress, port);
            outToServer = new DataOutputStream(clientSocket.getOutputStream());
            inFromServer = new DataInputStream(clientSocket.getInputStream());
            new Thread(this).start();
            inetAddress = aInetAddress;
            return true;
        } catch (IOException iOException) {
            err.println(iOException.toString());
            return false;
        }
    }
    public boolean connect(SunSpecAdressItem sunSpecAdressItem) {
        running = true;
        try {
            clientSocket = new Socket(sunSpecAdressItem.getInetAdress(), sunSpecAdressItem.getPort());
            outToServer = new DataOutputStream(clientSocket.getOutputStream());
            inFromServer = new DataInputStream(clientSocket.getInputStream());
            new Thread(this).start();
            inetAddress = sunSpecAdressItem.getInetAdress();
            return true;
        } catch (IOException iOException) {
            err.println(iOException.toString());
            return false;
        }
    }

    /**
     * @param request
     */
    public void sendRequest(Header request) {
        vector.add(request);
    }

    /**
     * @return
     */
    public void close() {
        if (running) {
           // sendRequest(new Table0001Common.SunspecID());
            running = false;
            while (!stop) {
                try {
                    sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                outToServer.close();
                inFromServer.close();
                clientSocket.close();
                vector.removeAllElements();
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }

    @Override
    public void run() {

        Read0X03 message = new Read0X03();
        byte[] mBAPHeader = new byte[7];
        byte[] bytes;
        byte[] b;
        long timout =System.currentTimeMillis();

        int i = 101;
        while (running || (System.currentTimeMillis()-timout)<1000) {
            try {
                if (inFromServer.available() > mBAPHeader.length) {
                    inFromServer.readFully(mBAPHeader);
                    System.out.print("In" + Arrays.toString(mBAPHeader) + "  ");
                    bytes = new byte[MBAPHeader.getLenght(mBAPHeader) - 1];
                    inFromServer.readFully(bytes);
                    System.out.println("data " + Arrays.toString(bytes));
                    b = new byte[mBAPHeader.length + bytes.length];
                    for (int lauf = 0; lauf < (mBAPHeader.length + bytes.length); lauf++) {
                        b[lauf] = lauf < mBAPHeader.length ? mBAPHeader[lauf] : bytes[lauf - mBAPHeader.length];
                    }
                    message.setResponse(b);
                    if (message.getFunctionCode() > 50) {
                        Error errorMessage = new Error();
                        errorMessage.setResponse(b);
                        setErrorStatus(errorMessage);
                    }
                    i = 101;
                }
                sleep(10);
                if ((!vector.isEmpty()) && i > 100) {
                    byte[] bytes1 = vector.get(0).getData();
                    System.out.println("out" + Arrays.toString(bytes1));
                    outToServer.write(bytes1);
                    vector.remove(0);
                    timout=System.currentTimeMillis();
                    i = 0;
                }
                i++;
          } catch (InterruptedException | IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
        stop=true;

    }

    private void setErrorStatus(Error errorMessage) {
        out.println("Error Code: " + errorMessage.getErrorCode());
        out.println("Exception Code: " + errorMessage.getExceptionCode());
        out.println("Error Data :" + Arrays.toString(errorMessage.getData()));
    }

    public boolean dataReceived() {
        return vector.isEmpty();
    }

    public InetAddress getInetAddress() {
        return inetAddress;
    }


}
