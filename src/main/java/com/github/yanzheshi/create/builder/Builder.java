package com.github.yanzheshi.create.builder;

/**
 * 抽象创建者
 * @author shiyanzhe
 */
public abstract class Builder {

    /**
     * 设置产品的不同部分
     */
    public abstract void setPart();

    /**
     * 组建一个产品
     * @return
     */
    public abstract Product buildProduct();

}
