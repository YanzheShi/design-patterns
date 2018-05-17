package com.github.yanzheshi.behavior.command;

/**
 * @author shiyanzhe
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        //定义接收者
        AbstractReceiver receiver = new Receiver1();

        //定义一个发送给接收着的命令
        AbstractCommand command = new Command1(receiver);

        //把命令交给调用者去执行
        invoker.setCommand(command);

        invoker.action();
    }
}
