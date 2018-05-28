package com.github.yanzheshi.behavior.strategy;

/**
 * 封装角色
 * @author shiyanzhe
 */
public class Context {
    /**
     * 抽象策略
     */
    private Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething() {
        strategy.doSomething();
    }

    /**
     * 可以设置不同策略
     * @param strategy
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
