package com.github.yanzheshi.structure.proxy;

/**
 * 代理类
 * @author shiyanzhe
 */
public class Proxy implements Subject {

    private Subject subject = null;


    public Proxy() {
        subject = new Proxy();
    }

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        //在调用方法前可能的操作
        before();
        //调用被代理的方法
        subject.request();
        //在调用方法后可能的操作
        after();
    }

    private void before() {

    }

    private void after() {

    }
}
