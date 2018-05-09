package com.github.yanzheshi.behavior.mediator;

/**
 * @author shiyanzhe
 */
public class ColleagueB extends AbstractColleague {
    public ColleagueB(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 自有方法
     */
    public void selfMethod2(){
        //处理自己的业务逻辑
    }

    public void depMethod2() {
        //处理自己的业务逻辑
        //自己不能处理的业务逻辑， 委托给中介者初创
        mediator.doSomething2();
    }
}
