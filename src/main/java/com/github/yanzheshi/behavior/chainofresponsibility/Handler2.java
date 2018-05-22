package com.github.yanzheshi.behavior.chainofresponsibility;

/**
 * 处理类实现2
 * @author shiyanzhe
 */
public class Handler2 extends AbstractHandler{
    @Override
    protected Level getHandleLevel() {
        return Level.LOWEST;
    }

    @Override
    protected Response echo(Request request) {
        return new Response("handler2");
    }
}
