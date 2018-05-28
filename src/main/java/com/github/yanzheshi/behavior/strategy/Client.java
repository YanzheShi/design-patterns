package com.github.yanzheshi.behavior.strategy;

/**
 * 客户端
 * @author shiyanzhe
 */
public class Client {

    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy1();

        Context context = new Context(strategy);

        context.doSomething();
    }
}
