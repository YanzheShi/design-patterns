package com.github.yanzheshi.singleton;

/**
 * 单例模式
 * 饿汉式
 * 使用静态常量
 * @author shiyanzhe
 */
public class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }

}
