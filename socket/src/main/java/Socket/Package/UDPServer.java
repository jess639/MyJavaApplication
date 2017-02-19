package Socket.Package;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by Jess on 2017/2/15.
 */
public class UDPServer {
    public static void main(String args[]) throws Exception{
        DatagramSocket datagramSocket = null;
        DatagramPacket datagramPacket = null;
        datagramSocket = new DatagramSocket(3000);
        String str = "hello changsha";
        datagramPacket = new DatagramPacket(str.getBytes(),str.length(), InetAddress.getByName("localhost"),1234);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();



    }
}
