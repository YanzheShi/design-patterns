package com.github.yanzheshi.behavior.mediator;

/**
 * 抽象中介者
 * 定义统一的接口， 用于各同事角色之间的通信
 * @author shiyanzhe
 */
public abstract class AbstractMediator {

    protected ColleagueA colleagueA;

    protected ColleagueB colleagueB;


    /**
     * 中介者模式的业务逻辑1
     */
    public abstract void doSomething1();

    /**
     * 中介者模式的业务逻辑2
     */
    public abstract void doSomething2();


    //getter and setter

    public ColleagueA getColleagueA() {
        return colleagueA;
    }

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public ColleagueB getColleagueB() {
        return colleagueB;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }
}
