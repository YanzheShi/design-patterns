package com.github.yanzheshi.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 * @author shiyanzhe
 */
public class Subject {

    private List<Observer> observerList = new ArrayList<>();

    /**
     * 增加一个观察者
     * @param observer
     */
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 通知所有观察者
     */
    public void notifyObserver() {
        observerList.forEach(Observer::update);
    }
}
