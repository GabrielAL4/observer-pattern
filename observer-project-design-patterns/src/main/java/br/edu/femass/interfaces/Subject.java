package br.edu.femass.interfaces;

import br.edu.femass.interfaces.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void unregisterObserver(Observer observer);
    public void notifyObserver();
}