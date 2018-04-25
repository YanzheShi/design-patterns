package com.github.yanzheshi.create.factorymethod;

/**
 * 用于生产产品B的工厂
 * @author shiyanzhe
 */
public class CreatorB implements Creator {
    @Override
    public Product getProduct() {
        return new ProductB();
    }
}
