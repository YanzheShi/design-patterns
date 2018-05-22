package com.github.yanzheshi.behavior.chainofresponsibility;

/**
 * 请求处理等级
 * 也可以使用int类型代替
 * @author shiyanzhe
 */
public enum Level {
    HIGHEST(1),
    MIDDLE(2),
    LOWEST(3);

    int value;

    Level(int i) {
        value = i;
    }
}
