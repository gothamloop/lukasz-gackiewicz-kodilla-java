package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class KursantTaskQueue implements Observable {
    private final List<Observer> observers;
    private final List<String> tasks;
    private final String kursantName;

    public KursantTaskQueue(String kursantName) {
        this.kursantName = kursantName;
        this.observers = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getKursantName() {
        return kursantName;
    }

    public List<String> getTasks() {
        return tasks;
    }
}