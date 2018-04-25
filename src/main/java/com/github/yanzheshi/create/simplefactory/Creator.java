package com.github.yanzheshi.create.simplefactory;

/**
 * 工厂类
 * @author shiyanzhe
 */
public class Creator {
    public static Product getProduct(String type) {
        switch (type) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                throw new IllegalArgumentException("参数错误");
        }
    }
}
