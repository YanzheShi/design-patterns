package com.github.yanzheshi.create.singleton;

/**
 * 懒汉式
 * 延迟加载
 * double-checked Locking using Volatile
 * 双重检验锁加volatile关键字
 * @author shiyanzhe
 */
public class Singleton3 {
    //声明为volatile避免指令重排序, 否则可能 instance != null, 但得到的是一个未初始化的对象
    private volatile static Singleton3 instance;
    private Singleton3() {

    }

    private static Singleton3 getInstance() {
        if (instance == null) {
            // 锁对象为类对象
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
