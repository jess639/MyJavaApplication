package com.example;
import java.util.*;

class House extends Observable{
    private float price;
    public House(float price){
        this.price = price;
    }
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        super.setChanged();
        super.notifyObservers(price);
        this.price = price;
    }

    public String toString() {
        return "this price of house is:" + this.price;
    }
};

  class HousePriceObserver implements Observer{
    private String name;
    public HousePriceObserver(String name){
        this.name = name;
    }
    public void update(Observable o,Object arg){
        if(arg instanceof Float){
            System.out.print(this.name+"the latest price is :");
            System.out.print(((Float)arg).floatValue());
        }

    }
};

public class ObserDemo01 {
    public static void main(String args[]){
        House h= new House(10000);
        HousePriceObserver aa = new HousePriceObserver("wang");
        HousePriceObserver bb = new HousePriceObserver("zhang");
        HousePriceObserver cc = new HousePriceObserver("lee");
        h.addObserver(aa);
        h.addObserver(bb);
        h.addObserver(cc);
        System.out.println(h);

        h.setPrice(333);
        System.out.println(h);
    }

}
