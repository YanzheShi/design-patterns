package com.github.yanzheshi.behavior.command;

/**
 * @author shiyanzhe
 */
public class Invoker {
    private AbstractCommand command;


    public void action() {
        command.excute();
    }

    public AbstractCommand getCommand() {
        return command;
    }

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }
}
