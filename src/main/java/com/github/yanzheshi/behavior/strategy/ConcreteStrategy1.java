package com.github.yanzheshi.behavior.strategy;

/**
 * 策略1
 * @author shiyanzhe
 */
public class ConcreteStrategy1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("strategy 1");
    }
}
