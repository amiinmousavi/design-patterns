/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefeningobserverpattern.Observable;

import java.util.ArrayList;
import oefeningobserverpattern.Observer.Observer;

/**
 *
 * @author Marjolein.D
 */
public interface Observable {

    public void addObserver(Observer obs);    
    public void deleteObserver(Observer obs);    
    public void notifyObservers();
}
