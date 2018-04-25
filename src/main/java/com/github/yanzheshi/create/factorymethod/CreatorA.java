package com.github.yanzheshi.create.factorymethod;

/**
 * 用于生产产品A的工厂
 * @author shiyanzhe
 */
public class CreatorA implements Creator {
    @Override
    public Product getProduct() {
        return new ProductA();
    }
}
