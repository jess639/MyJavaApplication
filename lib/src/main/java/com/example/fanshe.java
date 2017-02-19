package com.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * Created by Jess on 2017/2/18.
 */

class Person {
    private String name;
    public Person(){}
    public Person(String name){
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name is:"+this.name;
    }
}
public class fanshe {
    public static void main(String args[]){
        Class<?> c1 = null;

        try {
            c1 = Class.forName("com.example.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Constructor<?> cons[] = null;
        cons =c1.getConstructors();
        System.out.print(Arrays.toString(cons));
        Person person2 = null;

        Class<?> c[]=c1.getInterfaces();
        Constructor<?> sss[]=c1.getConstructors();

        for(int j=0;j<sss.length;j++){
            Class<?> p[]=sss[j].getParameterTypes();
        }

        for(int i=0;i<c.length;i++){
            System.out.print(c[i].getName());
        }

        try {
            person2 = (Person)cons[1].newInstance("lierpeng");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


//        person2.setName("wangjunli");
        System.out.print(person2);
        Person person3 = null;

        try {
            person3 = (Person)c1.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        System.out.println(c1.getName());
//        System.out.println(c2.getName());
//        System.out.println(c3.getName());



    }
}
