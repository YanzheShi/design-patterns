package com.github.yanzheshi.create.abstractfactory;

/**
 * 工厂实现1
 * 只生产编号为1的产品
 * @author shiyanzhe
 */
public class Creator1 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
