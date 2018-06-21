package com.github.yanzheshi.structure.proxy.dynamicproxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @author shiyanzhe
 */
public class Client {
    public static void main(String[] args) {
        Subject target = new RealSubject();


        //获取代理实例
        Subject proxy = (Subject) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new DynamicProxy(target));

        //调用方法
        proxy.doSomething();

    }
}
