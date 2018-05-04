package com.github.yanzheshi.behavior.templatemethod;

/**
 * 实现类1
 * @author shiyanzhe
 */
public class ConcreteClass1 extends AbstractCalss {
    @Override
    protected void method1() {
        System.out.println("类1实现方法1");
    }

    @Override
    protected void method2() {
        System.out.println("类1实现方法2");

    }
}
