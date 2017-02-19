package Socket.Package;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by Jess on 2017/2/15.
 */
public class UDPClient {
    public static void main(String args[]) throws Exception{
        DatagramSocket datagramSocket = null;
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = null;
        datagramSocket = new DatagramSocket(1234);
        datagramPacket = new DatagramPacket(buf,1024);
        datagramSocket.receive(datagramPacket);
        String str = new String(datagramPacket.getData(),0,datagramPacket.getLength())+" from" +datagramPacket.getAddress().getHostName()+":"+datagramPacket.getPort();
        System.out.print(str);
    }
}
