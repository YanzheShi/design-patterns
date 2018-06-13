package com.github.yanzheshi.structure.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author shiyanzhe
 */
public class DynamicProxy implements InvocationHandler {

    private Object target;

    public DynamicProxy(Subject target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before proxy");

        Object result = method.invoke(target, args);

        System.out.println("after proxy");

        return result;
    }
}
