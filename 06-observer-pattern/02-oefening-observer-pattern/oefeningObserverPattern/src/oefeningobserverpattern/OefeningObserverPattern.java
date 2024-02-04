/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefeningobserverpattern;

import oefeningobserverpattern.Observable.WeatherStation;
import oefeningobserverpattern.Observable.Observable;
import oefeningobserverpattern.Observer.Observer;
import oefeningobserverpattern.Observer.Display;

/**
 *
 * @author Marjolein.D
 */
public class OefeningObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Merk op dat oTemp en oDisplay variabelen zijn van type Observer en
        // Observable, niet van de concrete afgeleide types.
        Observable oTemp = new WeatherStation();
        Observer oDisplay = new Display();
        oTemp.addObserver(oDisplay);
        oTemp.addObserver(new Display());
        oTemp.notifyObservers();
    }
}
