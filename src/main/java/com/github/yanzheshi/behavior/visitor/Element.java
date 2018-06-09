package com.github.yanzheshi.behavior.visitor;

/**
 * 抽象元素
 * @author shiyanzhe
 */
public abstract class Element {

    /**
     * 业务逻辑
     */
    public abstract void doSomething();

    /**
     * 允许谁来访问
     */
    public abstract void accept(IVisitor visitor);
}
