package com.github.yanzheshi.behavior.chainofresponsibility;

/**
 * 客户端
 * @author shiyanzhe
 */
public class Client {
    public static void main(String[] args) {
        Handler1 handler1 = new Handler1();
        Handler2 handler2 = new Handler2();

        handler2.setNext(handler1);

        Request request = new Request();

        //最终会传递到handler1处理
        Response response = handler2.handleMessage(request);

        System.out.println(response);
    }
}
