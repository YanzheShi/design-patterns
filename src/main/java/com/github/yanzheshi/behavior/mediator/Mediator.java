package com.github.yanzheshi.behavior.mediator;

/**
 * 具体中介者角色
 * 具体中介者角色通过协调各同事角色实现协作行为
 * @author shiyanzhe
 */
public class Mediator extends AbstractMediator {
    @Override
    public void doSomething1() {
        //调用同事类的方法
        colleagueA.selfMethod1();
        colleagueB.selfMethod2();
    }

    @Override
    public void doSomething2() {
        //调用同事类的方法
        colleagueA.selfMethod1();
        colleagueB.selfMethod2();
    }
}
