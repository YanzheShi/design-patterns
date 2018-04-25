package com.github.yanzheshi.create.singleton;

/**
 * 静态内部类实现
 * 延迟加载
 * @author shiyanzhe
 */
public class Singleton4 {
    private static class SingletonHolder{
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.INSTANCE;
    }


}
