package com.github.yanzheshi.create.abstractfactory;

/**
 * 工厂实现2
 * 只生产编号为2的产品
 * @author shiyanzhe
 */
public class Creator2 extends AbstractCreator{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
