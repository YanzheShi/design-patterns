package com.github.yanzheshi.create.templatemethod;

/**
 * 抽象模板类
 * 规定了方法的处理流程
 * @author shiyanzhe
 */
public abstract class AbstractCalss {

    /**
     * 基本方法
     */
    protected abstract void method1();

    /**
     * 基本方法
     */
    protected abstract void method2();

    /**
     * 模板方法
     * 封装相应的流程
     */
    public void templateMethod() {
        method1();
        method2();
    }
}
