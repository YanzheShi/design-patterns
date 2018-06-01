package com.github.yanzheshi.structure.facade;

/**
 * 门面对象
 * @author shiyanzhe
 */
public class Facade {

    //被委托的对象
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();

    //提供给外部访问的方法
    public void methodA() {
        a.doSomethingA();
    }

    public void methodB() {
        b.doSomethingB();
    }

    public void methodC() {
        c.doSomethingC();
    }
}
