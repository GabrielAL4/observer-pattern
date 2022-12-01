package br.edu.femass;

import java.util.Observer;

public interface Subject {
    public void registerObserver(Subscriber observer);
    public void unregisterObserver(Subscriber subscriber);
    public void notifyAllObserver(String notify);
}