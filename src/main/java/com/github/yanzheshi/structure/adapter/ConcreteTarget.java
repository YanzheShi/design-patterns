package com.github.yanzheshi.structure.adapter;

/**
 * 目标角色实现类
 * @author shiyanzhe
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("hello");
    }
}
