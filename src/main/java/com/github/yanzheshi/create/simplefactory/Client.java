package com.github.yanzheshi.create.simplefactory;

/**
 * 客户端
 * @author shiyanzhe
 */
public class Client {
    public static void main(String[] args) {

        //生产产品A
        Product a = Creator.getProduct("A");
        System.out.println(a.method());

        //生产产品B
        Product b = Creator.getProduct("B");
        System.out.println(b.method());

    }
}
