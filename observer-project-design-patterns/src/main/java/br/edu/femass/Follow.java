package br.edu.femass;

import br.edu.femass.concrete.Account;
import br.edu.femass.interfaces.Observer;
import br.edu.femass.interfaces.Subject;

import java.util.List;

public abstract class Follow extends Account {
    private List<Observer> observers;


}
