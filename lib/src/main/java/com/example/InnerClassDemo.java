package com.example;

/**
 * Created by Jess on 2017/2/18.
 */

class Outer{
    private static String info = "I love you xiaojunli";
    static   class Inner{
            public void print(){
                System.out.print("property is "+info);
            }
        }
    }

//class Inner{
//    private Outer out = null;
//    public Inner(Outer out){
//        this.out = out;
//    }
//    public void print(){
//        System.out.print(this.out.getinfo());
//    }
//
//}


public class InnerClassDemo {
    public static void main(String args[]){
       new Outer.Inner().print();
    }
}
