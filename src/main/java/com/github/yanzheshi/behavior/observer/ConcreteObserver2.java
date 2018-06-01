package com.github.yanzheshi.behavior.observer;

/**
 * @author shiyanzhe
 */
public class ConcreteObserver2 implements Observer {
    @Override
    public void update() {
        System.out.println("观察者2 收到消息");
    }
}
