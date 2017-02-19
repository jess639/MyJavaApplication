package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * Created by Jess on 2017/2/6.
 */
public class thread implements Runnable{

    private Socket client = null;
    public thread(Socket client){
        this.client = client;
    }

    @Override
    public void run() {

        BufferedReader buf = null;
        PrintStream out = null;

        try {
            out = new PrintStream(client.getOutputStream());
            buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
            boolean flag =true;
            while (flag){
                String str = buf.readLine();
                if(str==null ||"".equals(str)){
                    flag = false;
                }else {
                    if("bye".equals(str)){
                        flag = false;
                    }else {
                        out.println("Sir I LOVE YOU -->"+str);
                    }

                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
