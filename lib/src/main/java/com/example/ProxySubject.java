package com.example;

/**
 * Created by Jess on 2017/2/18.
 */
interface Subject{
    public String say(String name,int age);
}

class RealSubject implements Subject{
    public String say(String name,int age){
        return "my name is:"+name+",and my age is :"+age;
    }
}
class ProxySubject1 implements Subject{
    private Subject sub = null;
    public ProxySubject1(Subject sub){
        this.sub =sub;
    }
    public String say(String name,int age){
        return this.sub.say(name,age);
    }
}

public class ProxySubject{
    public static void main(String args[]){
        Subject sub = new ProxySubject1(new RealSubject());
        String str = sub.say("wangjunli",25);
        System.out.print(str);
    }
}
