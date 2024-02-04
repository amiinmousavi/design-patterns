/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefeningobserverpattern.Observable;

import oefeningobserverpattern.Observer.Observer;
import java.util.ArrayList;

/**
 *
 * @author Marjolein.D
 */
public class WeatherStation implements Observable{ 
    private ArrayList<Observer> lstObs = new ArrayList<>();
    
    @Override
    public void addObserver(Observer obs) {
        lstObs.add(obs);
    }

    @Override
    public void deleteObserver(Observer obs) {
        lstObs.remove(obs);
    }

    @Override
    public void notifyObservers() {
        double temp = Math.random();
        for(Observer obs : lstObs){ // foreach
            obs.update(temp);
        }
    }
    
}
