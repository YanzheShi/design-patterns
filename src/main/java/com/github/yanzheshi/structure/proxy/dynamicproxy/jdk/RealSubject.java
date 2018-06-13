package com.github.yanzheshi.structure.proxy.dynamicproxy.jdk;

/**
 * 被代理类
 * @author shiyanzhe
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("do something");
    }
}
