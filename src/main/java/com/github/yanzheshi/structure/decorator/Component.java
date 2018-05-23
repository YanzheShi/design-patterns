package com.github.yanzheshi.structure.decorator;

/**
 * 组件实现类
 * @author shiyanzhe
 */
public class Component extends AbstractComponent {
    @Override
    public void operate() {
        System.out.println("component");
    }
}
