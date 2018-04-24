package com.github.yanzheshi.singleton;

/**
 * 懒汉式
 * 延迟加载
 * double-checked Locking using Volatile
 * 双重检验锁加volatile关键字
 * @author shiyanzhe
 */
public class Singleton3 {
    //声明为volatile避免指令重排序
    private volatile static Singleton3 instance;
    private Singleton3() {

    }

    private static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
