package com.github.yanzheshi.structure.decorator;

/**
 * 装饰者2
 * @author shiyanzhe
 */
public class Decorator2 extends AbstractDecorator{
    public Decorator2(AbstractComponent abstractComponent) {
        super(abstractComponent);
    }


    /**
     * 定义自己的装饰方法
     */
    private void method2() {
        System.out.println("method2装饰");
    }

    /**
     * 重写
     * 加入自己的方法进行装饰
     */
    @Override
    public void operate() {
        super.operate();
        method2();
    }
}
