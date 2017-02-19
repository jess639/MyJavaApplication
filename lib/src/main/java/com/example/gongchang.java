package com.example;

/**
 * Created by Jess on 2017/2/18.
 *
 *
 */

interface Fruit{
    public void eat();
}

class apple implements Fruit{
    public void eat(){
    System.out.print("you ate an apple");
}
}

class pear implements Fruit{
    public void eat(){
        System.out.print("you ate a pear");
    }
}

class Factory{
    public static Fruit getInstance(String clsname){
        Fruit fruit = null;
        try {
            fruit = (Fruit)Class.forName(clsname).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return fruit;
    }
}

public class gongchang {
    public static void main(String args[]){
        Fruit ff = Factory.getInstance("com.example.pear");
        ff.eat();
    }
}
