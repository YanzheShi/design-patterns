package com.github.yanzheshi.behavior.chainofresponsibility;

/**
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
