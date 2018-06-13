package com.github.yanzheshi.behavior.visitor;

/**
 * 访问者接口
 * 对多个对象进行访问
 * @author shiyanzhe
 */
public interface IVisitor {

    /**
     * 访问方法
     * @param element 访问的对象
     */
    void visit(ConcreteElement1 element);


    /**
     * 访问方法
     * @param element  访问的对象
     */
    void visit(ConcreteElement2 element);


}
