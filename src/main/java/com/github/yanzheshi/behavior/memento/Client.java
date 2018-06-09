package com.github.yanzheshi.behavior.memento;

/**
 * @author shiyanzhe
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();

        Caretaker caretaker = new Caretaker();

        //创建一个备忘录
        caretaker.setMemento(originator.createMemento());

        //恢复一个备忘录
        originator.restoreMemento(caretaker.getMemento());
    }
}
