package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Jess on 2017/2/6.
 */
public class HelloClient {
    public static void main(String args[]) throws Exception{
        Socket client = null;
        client = new Socket("localhost",4444);
        BufferedReader buf = null;
        buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String str = buf.readLine();
        System.out.println("the content of server is :"+str);
        buf.close();
        client.close();
    }
}
