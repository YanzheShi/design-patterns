package com.github.yanzheshi.create.abstractfactory;

/**
 * 客户端
 * @author shiyanzhe
 */
public class Client {
    public static void main(String[] args) {
        //定义两个工厂
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        //产生A1实例
        AbstractProductA a1 = creator1.createProductA();
        //产生A2实例
        AbstractProductA a2 = creator2.createProductA();

        //产生B1实例
        AbstractProductB b1 = creator1.createProductB();
        //产生B2实例
        AbstractProductB b2 = creator2.createProductB();
    }
}
