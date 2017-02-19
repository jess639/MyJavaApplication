package com.example;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by Jess on 2017/2/8.
 */
public class UDPServer {
    public static void main(String args[]) throws Exception{
        DatagramSocket ds = null;
        DatagramPacket dp = null;
        ds = new DatagramSocket(3000);
        String str = "Hello boys and girls";
        dp = new DatagramPacket(str.getBytes(),str.length(), InetAddress.getByName("localhost"),9000);
        System.out.println("send message");
        ds.send(dp);
        ds.close();



    }
}
