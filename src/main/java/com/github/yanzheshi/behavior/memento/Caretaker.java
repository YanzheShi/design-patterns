package com.github.yanzheshi.behavior.memento;

/**
 * 备忘录管理员角色
 * 封装一个备忘实例
 * @author shiyanzhe
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
