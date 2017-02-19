package com.example;

/**
 * Created by Jess on 2017/2/16.
 */
class mthread implements Runnable {
    private String name;

    public mthread(String name) {
        this.name = name;
    }
@Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "          ,i=" + i);
        }
    }
}

public class duoxiancheng {

    public static void main(String args[]) {
        mthread aa = new mthread("w");
        mthread bb = new mthread("wa");
        mthread cc = new mthread("wan");
        mthread dd = new mthread("wang");
        mthread ee = new mthread("wangs");
        Thread a = new Thread(aa);
        Thread b = new Thread(bb);
        Thread c = new Thread(cc);
        Thread d = new Thread(dd);
        Thread e = new Thread(ee);
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
