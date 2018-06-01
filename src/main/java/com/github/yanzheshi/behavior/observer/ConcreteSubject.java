package com.github.yanzheshi.behavior.observer;

/**
 * 具体被观察者
 * @author shiyanzhe
 */
public class ConcreteSubject extends Subject {

    //具体的业务
    public void doSomething() {
        //具体业务

        //通知观察者
        super.notifyObserver();
    }
}
