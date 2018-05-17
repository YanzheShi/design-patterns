package com.github.yanzheshi.behavior.command;

/**
 * @author shiyanzhe
 */
public class Command1 extends AbstractCommand {

    private AbstractReceiver receiver;

    public Command1(AbstractReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        //业务处理， 发送命令
        receiver.doSomething();
    }

    public AbstractReceiver getReceiver() {
        return receiver;
    }

    public void setReceiver(AbstractReceiver receiver) {
        this.receiver = receiver;
    }
}
