package com.github.yanzheshi.behavior.chainofresponsibility;

/**
 * 处理类实现1
 * @author shiyanzhe
 */
public class Handler1 extends AbstractHandler {
    @Override
    protected Level getHandleLevel() {
        return Level.HIGHEST;
    }

    @Override
    protected Response echo(Request request) {
        return new Response("handler1");
    }
}
