package com.example;

/**
 * Created by Jess on 2017/2/16.
 */
@Deprecated
 class Demo<T>{
    private T var;
    public T getVar(){
        return this.var;
    }
    public void setVar(T var){
        this.var = var;
    }
}
public class deprecatedDemo{
    public static void main(String args[]){
        @SuppressWarnings(value={"unchecked","deprecation"})
        Demo  demo;
        demo = new Demo();
        demo.setVar("¿Ó∂˛≈Ù");
        System.out.print(demo.getVar());

    }
}
