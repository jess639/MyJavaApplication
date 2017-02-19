package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class MyClass {
    public static void main(String args[]){
        LinkedList<String> link = new LinkedList<String>();
        link.add("A");
        link.add("B");
        link.add("C");
        System.out.println("link1 = " + link);

        link.add("X");
        link.add("Y");
        System.out.println("link2 =" + link);

        link.addFirst("L");
        link.addLast("E");
        System.out.println("link3 =" + link.element());
        System.out.println("link2 =" + link);
        System.out.println("link4 =" + link.peek());
        System.out.println("link2 =" + link);
        System.out.println("link5 =" + link.poll());
        System.out.println("link2 =" + link);

        for(String b :link){
            System.out.println(b+"1");
        }

        Stack<String> stack = new Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");

System.out.println(stack.indexOf("a"));
System.out.println(stack.indexOf("b"));
System.out.println(stack.indexOf("c"));
System.out.println(stack.lastIndexOf("1"));

        List<String> queue = new LinkedList<String>();
        String object1 = "1";
        String object2 = "2";
        String object3 = "3";
        String object4 = "4";
        String object5 = "5";
        queue.add(object1);
        queue.add(object2);
        queue.add(object3);
        queue.add(object4);
        queue.add(object5);
//        Object o = queue.removeFirst();
//        System.out.println(o);
        List<String> list = new ArrayList<String>(queue);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        String[] bba =  queue.toArray(new String[queue.size()]);
        System.out.println(bba[3]);
        list.clear();
        for(String ss :list){
            System.out.println(ss+"empty");
        }

        Queue<String> qq =new LinkedList<String>();
        qq.add("1");
        qq.add("3");
        qq.add("5");
        qq.add("7");
        for(String a :qq){
            System.out.println(a);
        }

        qq.poll();

        for(String a :qq){
            System.out.println(a);
        }






    }

}
