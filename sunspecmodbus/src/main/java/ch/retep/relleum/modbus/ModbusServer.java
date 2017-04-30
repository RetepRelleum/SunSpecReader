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

package ch.retep.relleum.modbus;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Hashtable;

import ch.retep.relleum.sunspec.TcpModbusHandler;

/**
 * Created by Peter on 05.01.2017.
 */

public class ModbusServer {


    public static void main(String[] args) {
        ModbusServer modbusServer = new ModbusServer();
        try {
            modbusServer.init();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void init() throws IOException {
        ServerSocket serverSocket;
        int port = 502;
        serverSocket = new ServerSocket(port);

        int lauf = 0;
        while (lauf < 10000) {

            Runner runner = new Runner();
            Socket clientSocket = serverSocket.accept();
            System.out.println("Neuer client Connect");

            runner.init(clientSocket);
            runner.start();
            lauf++;


        }
    }

    public class Runner extends Thread {
        private DataOutputStream outFromServer;
        private DataInputStream intoServer;
        private Socket clientSocket;

        public void init(Socket aClientSocket) {
            clientSocket = aClientSocket;
            try {
                outFromServer = new DataOutputStream(clientSocket.getOutputStream());
                intoServer = new DataInputStream(clientSocket.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            TcpModbusHandler tcpModbusHandler = new TcpModbusHandler();
            tcpModbusHandler.setModbusRegisterNr(1, 4000, 70);
            Hashtable<Long, Read0X03> longRead0X03Hashtable;
            //longRead0X03Hashtable = tcpModbusHandler.getAllMessage();
            try {
                while (clientSocket.isConnected()) {
                    if (intoServer.available() > 10) {
                        byte[] bIn = new byte[12];
                        System.out.println("read Fully");
                        intoServer.readFully(bIn);
                        int startingAdress = MBAPHeader.getStartingAddress(bIn);
                        int quantitiOfRegister = MBAPHeader.getQuantityOfRegisters(bIn);

                        byte[] bOut = new byte[9 + quantitiOfRegister * 2];
                        System.arraycopy(bIn, 0, bOut, 0, 10);
                        for (int i = 9; i < bOut.length; i++) {
                            bOut[i] = (byte) 0XFF;
                        }
                        bOut[5] = Integer.valueOf(quantitiOfRegister * 2 + 3).byteValue();
                        bOut[8] = Integer.valueOf(quantitiOfRegister * 2).byteValue();
                        switch (startingAdress) {
                            case 40000:
                                bOut[9] = 0x53 & 0XFF;
                                bOut[10] = (byte) (0x75 & 0XFF);
                                bOut[11] = 0x6e & 0XFF;
                                bOut[12] = 0x53 & 0XFF;
                                if (quantitiOfRegister > 2) {
                                    bOut[13] = 0;
                                    bOut[14] = 0x01 & 0XFF;
                                    bOut[15] = 0;
                                    bOut[16] = 0x42 & 0XFF;
                                }
                                break;
                            case 40002:
                                bOut[9] = 0;
                                bOut[10] = 0x01 & 0XFF;
                                break;
                            case 40003:
                                bOut[9] = 0;
                                bOut[10] = 0x42 & 0XFF;
                                break;
                            case 40071:
                                bOut[9] = 0;
                                bOut[10] = 0;
                                break;

                        }
                        //      Read0X03 read0X03= longRead0X03Hashtable.get(new Long(startingAdress));

                        System.out.println("in : " + Arrays.toString(bIn));
                        System.out.println("in getLenght :" + MBAPHeader.getLenght(bIn));
                        System.out.println("in getStartingAddress : " + startingAdress);
                        System.out.println("in getQuantityOfRegisters : " + quantitiOfRegister);
                        System.out.println();
                        System.out.println("bOut : " + Arrays.toString(bOut));
                    }
                }
                System.out.println("deconnect");
                outFromServer.close();
                intoServer.close();
                clientSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    outFromServer.close();
                    intoServer.close();
                    clientSocket.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

            }
        }

    }
}
