package com.github.yanzheshi.behavior.templatemethod;

/**
 * 实现类2
 * @author shiyanzhe
 */
public class ConcreteClass2 extends AbstractCalss {
    @Override
    protected void method1() {
        System.out.println("类2的实现方法1");
    }

    @Override
    protected void method2() {
        System.out.println("类2的实现方法2");
    }
}
