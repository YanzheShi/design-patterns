package com.github.yanzheshi.structure.adapter;

/**
 * @author shiyanzhe
 */
public class Client {

    public static void main(String[] args) {

        //原有的业务逻辑
        Target target1 = new ConcreteTarget();
        target1.request();


        //需要适配的角色
        Adaptee adaptee = new Adaptee();
        //方法为doSomething
        adaptee.doSomething();

        //Adapter对Adaptee进行了适配
        Target target2 = new Adapter();
        //同样调用request方法， 但是做的确是doSomething锁做的事
        target2.request();

    }

}
