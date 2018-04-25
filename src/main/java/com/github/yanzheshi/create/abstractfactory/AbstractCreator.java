package com.github.yanzheshi.create.abstractfactory;

/**
 * 抽象工厂
 * @author shiyanzhe
 */
public abstract class AbstractCreator {
    //创建A产品家族
    public abstract AbstractProductA createProductA();
    //创建B产品家族
    public abstract AbstractProductB createProductB();
}
