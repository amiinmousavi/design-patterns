/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefeningobserverpattern.Observer;

/**
 *
 * @author Marjolein.D
 */
public class Display implements Observer{

    @Override
    public void update(double temp) {
        System.out.println("Nieuwe temperatuur: " + temp);
    }    
}
