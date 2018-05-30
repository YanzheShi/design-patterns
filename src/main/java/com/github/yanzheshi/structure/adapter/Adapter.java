package com.github.yanzheshi.structure.adapter;

/**
 * 适配器
 * @author shiyanzhe
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
