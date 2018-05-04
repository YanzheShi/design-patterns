package com.github.yanzheshi.create.builder;

/**
 * 具体建造者
 * 有多少个产品类就有几个具体的建造者
 * @author shiyanzhe
 */
public class ConcreteProduct extends Builder{
    private Product product = new Product();

    @Override
    public void setPart() {

    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
