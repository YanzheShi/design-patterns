package com.github.yanzheshi.behavior.visitor;

/**
 * 访问者
 * 对多个对象进行访问
 * @author shiyanzhe
 */
public class Visitor implements IVisitor {

    @Override
    public void visit(ConcreteElement1 element) {
        element.doSomething();
    }

    @Override
    public void visit(ConcreteElement2 element) {
        element.doSomething();
    }
}
