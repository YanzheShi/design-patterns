package com.github.yanzheshi.structure.decorator;

/**
 * 客户端
 * @author shiyanzhe
 */
public class Client {
    public static void main(String[] args) {
        AbstractComponent component = new Component();

        //第一次装饰
        component = new Decorator1(component);

        //第二次装饰
        component = new Decorator2(component);

        component.operate();
    }
}
