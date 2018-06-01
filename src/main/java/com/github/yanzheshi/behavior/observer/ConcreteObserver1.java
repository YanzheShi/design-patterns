package com.github.yanzheshi.behavior.observer;

/**
 * @author shiyanzhe
 */
public class ConcreteObserver1 implements Observer {

    @Override
    public void update() {
        System.out.println("观察者1 收到消息");
    }
}
