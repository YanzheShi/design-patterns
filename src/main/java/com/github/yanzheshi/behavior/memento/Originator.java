package com.github.yanzheshi.behavior.memento;

/**
 * 发起人角色
 * @author shiyanzhe
 */
public class Originator {

    /**
     * 内部状态
     */
    private String state = "";

    /**
     * 创建一个备忘
     * @return
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 从备忘中恢复
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
