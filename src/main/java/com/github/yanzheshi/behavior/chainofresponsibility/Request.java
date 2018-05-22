package com.github.yanzheshi.behavior.chainofresponsibility;

/**
 * 请求类
 * 设置处理级别为最高
 * @author shiyanzhe
 */
public class Request {
    public Level getRequestLevel() {
        return Level.HIGHEST;
    }
}
