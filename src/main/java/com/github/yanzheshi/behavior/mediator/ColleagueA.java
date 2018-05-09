package com.github.yanzheshi.behavior.mediator;

/**
 * 具体同事类1
 * @author shiyanzhe
 */
public class ColleagueA extends AbstractColleague {
    //通过构造函数传递中介者
    public ColleagueA(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 自有方法
     */
    public void selfMethod1() {
        //处理自己的业务逻辑
    }

    public void depMethod1() {
        //处理自己的业务逻辑
        //自己不能处理的业务逻辑，委托给中介者处理
        mediator.doSomething1();
    }

}
