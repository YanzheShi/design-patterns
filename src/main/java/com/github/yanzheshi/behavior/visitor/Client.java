package com.github.yanzheshi.behavior.visitor;

/**
 * @author shiyanzhe
 */
public class Client {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Element element = ObjectStruture.createElement();

            //接受访问
            element.accept(new Visitor());
        }
    }
}
