package com.github.yanzheshi.create.factorymethod;

/**
 * 客户端
 * @author shiyanzhe
 */
public class Client {
    public static void main(String[] args) {
        //生产产品A
        Creator creator = new CreatorA();
        Product productA = creator.getProduct();
        System.out.println(productA.method());

        //生产产品B
        Creator creator1 = new CreatorB();
        Product productB = creator1.getProduct();
        System.out.println(productB.method());
    }
}
