package com.github.yanzheshi.behavior.visitor;

/**
 * @author shiyanzhe
 */
public class ConcreteElement1 extends Element {
    @Override
    public void doSomething() {
        System.out.println("do something 1");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
