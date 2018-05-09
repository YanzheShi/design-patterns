package com.github.yanzheshi.behavior.mediator;

/**
 * 抽象同事类
 * 每一个同事角色都知道中介者角色，而且与其他角色相互通信的时候
 * 一定要通过中介者角色协作。
 * 每个同事的行为分为两种：
 * 一种是同事本身的行为，比如改变对象本身的
 * 状态，处理自己的行为等，这种方法叫做自发行为，与其他的同事类或者中
 * 介者没有任何依赖；
 * 第二种必须依赖中介者才能完成的行为，叫做依赖方法
 * @author shiyanzhe
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
