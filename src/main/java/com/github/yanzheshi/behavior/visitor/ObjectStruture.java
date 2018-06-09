package com.github.yanzheshi.behavior.visitor;

import java.util.Random;

/**
 * 结构对象
 * @author shiyanzhe
 */
public class ObjectStruture {

    public static Element createElement() {
        Random random = new Random();

        if (random.nextInt(100) < 50) {
            return new ConcreteElement1();
        } else {
            return new ConcreteElement2();
        }
    }
}
