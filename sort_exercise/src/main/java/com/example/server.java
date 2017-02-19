package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.BlockingDeque;

public class server {
    public static void main(String args[]) throws Exception {

//        InetAddress locAll = null;
//        InetAddress remAdd = null;
//        try {
//            remAdd = InetAddress.getByName("www.baidu.com");
//            locAll = InetAddress.getLocalHost();
//        } catch (UnknownHostException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(locAll);
//        System.out.println(remAdd);
//
//        try {
////            URL url = new URL("http","www.baidu.com",80,"/curriculum.htm");
////            InputStream input = url.openStream();
////            Scanner scanner = new Scanner(input);
////            scanner.useDelimiter("/n");
////            while (scanner.hasNext()){
////                System.out.println(scanner.next());
////            }
//
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        Map<String,String> map = null;
//        map = new HashMap<String,String>();
//        map.put("lee", "1");
//        map.put("wang", "2");
//        String value1 = map.get("lee");
//        String value2 = map.get("wang");
//        Map<Double,Double> map1= null;
//        map1 = new HashMap<Double,Double>();
//        map1.put(1.1, 1126.2);
//        map1.put(2.2, 1010.2);
//        int aa = map1.hashCode();
//        Double v1= map1.get(1.1);
//        Double v2= map1.get(2.2);
//
//        Boolean h = map1.containsKey(1.1);
//        Boolean hh = map.containsKey("leee");
//        Boolean hhh = map1.containsValue(1126.2);
//        Set<String> keys = map.keySet();
//        Set<Double> vals = map1.keySet();
//        Iterator<String> iter = keys.iterator();
//        while (iter.hasNext()){
//            String str = iter.next();
//            System.out.println("Str="+""+map.get(str));
//        }
//        System.out.println("value1=" + keys);
//        System.out.println("value2=" + aa);
//
//        List<String> all = null;
//        all = new ArrayList<>();
//        all.add("bb");
//        all.add("bbb");
//        all.add("bbbb");
//        all.add("bbbbb");
//
//       String cat[] = new String[]{"a","d","b"}
//               ;
////        Double cat[] = new Double[ ]{11.1,2.2,33.3};
//
//        Arrays.sort(cat);
//        System.out.println(cat[2]);
//
//        Stack<String> s = new Stack<String>();
//        s.push("aa");
//        s.push("bb");
//        s.push("cc");
//        s.push("bb");
//        s.push("bb");
//        s.push("bb");
//        s.push("bb");
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//
//        Map<String,String> map2 = null;
//        map2 = new HashMap<String,String>();
//        map2.put("lee","book1");
//        map2.put("wang","book2");
//
//        Set<Map.Entry<String,String>> allSet = null;
//        allSet = map2.entrySet();
//
//        Iterator<Map.Entry<String,String>> iter1 = null;
//
//        iter1 = allSet.iterator();
//
//        while (iter1.hasNext()){
//            Map.Entry<String,String> me = iter1.next();
//            System.out.println(me.getKey()+"-->"+me.getValue());
//
//        }
//
//        for(Map.Entry<String,String> me:map2.entrySet() ){
//            System.out.println(me.getKey()+"-->"+me.getValue());
//        }

//       URL url = new URL("http://www.mldnjava.cn");
//        URLConnection urlConnection = url.openConnection();
//        System.out.println(urlConnection.getContentType());
//        System.out.println(urlConnection.getContent());
//        System.out.println(urlConnection.getContentLength());
//        ServerSocket server = null;
//        Socket client = null;
//        PrintStream out = null;
//        server = new ServerSocket(4444);
//        System.out.println("server is running,waiting for clients");
//
//        client = server.accept();
//        String str = "hello jess" ;
//        out = new PrintStream(client.getOutputStream());
//        out.println(str);
//        client.close();
//        server.close();


        ServerSocket server = null;
        Socket client = null;
        BufferedReader buf = null;
        PrintStream out = null;
        server = new ServerSocket(1111);
        boolean f = true;
        while (f){
            System.out.println("server is running,please wait!!!!!!!!!!!!!!!");
            client = server.accept();

            new Thread(new thread(client)).start();


        }
        server.close();
    }
}
