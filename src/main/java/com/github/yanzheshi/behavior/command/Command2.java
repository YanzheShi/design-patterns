package com.github.yanzheshi.behavior.command;

/**
 * @author shiyanzhe
 */
public class Command2 extends AbstractCommand {

    private AbstractReceiver receiver;

    public Command2(AbstractReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        receiver.doSomething();
    }

    public AbstractReceiver getReceiver() {
        return receiver;
    }

    public void setReceiver(AbstractReceiver receiver) {
        this.receiver = receiver;
    }
}
