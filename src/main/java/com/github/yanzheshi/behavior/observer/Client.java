package com.github.yanzheshi.behavior.observer;

/**
 * @author shiyanzhe
 */
public class Client {

    public static void main(String[] args) {
        //被观察者
        ConcreteSubject subject = new ConcreteSubject();

        //观察者
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();


        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.doSomething();

    }
}
