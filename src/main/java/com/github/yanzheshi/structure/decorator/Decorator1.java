package com.github.yanzheshi.structure.decorator;

/**
 * 装饰者1
 * 装饰者重写父类方法， 加入自己的实现
 * @author shiyanzhe
 */
public class Decorator1 extends AbstractDecorator {
    public Decorator1(AbstractComponent abstractComponent) {
        super(abstractComponent);
    }


    /**
     * 定义自己的装饰方法
     */
    private void method1() {
        System.out.println("method1装饰");
    }

    /**
     * 重写
     * 加入自己的方法进行装饰
     */
    @Override
    public void operate() {
        method1();
        super.operate();
    }
}
