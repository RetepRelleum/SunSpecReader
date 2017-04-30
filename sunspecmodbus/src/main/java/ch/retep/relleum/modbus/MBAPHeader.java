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

/**
 * Created by Peter on 30.12.2016.
 */

public class MBAPHeader {

    public static int getTransactionIdentifier(byte[] b) {
        return ((b[0] & 0xFF) << 8) | (b[1] & 0xFF);
    }

    public static int getProtocolIdentifier(byte[] b) {
        return ((b[2] & 0xFF) << 8) | (b[3] & 0xFF);
    }

    public static int getLenght(byte[] b) {
        return ((b[4] & 0xFF) << 8) | (b[5] & 0xFF);
    }

    public static int getUnitIdentifier(byte[] b) {
        return (b[6] & 0xFF);
    }
    public static int getStartingAddress(byte[] b){
        return ((b[8] & 0xFF) << 8) | (b[9] & 0xFF);
    }
    public static int getQuantityOfRegisters(byte[] b){
        return ((b[10] & 0xFF) << 8) | (b[11] & 0xFF);
    }
}
