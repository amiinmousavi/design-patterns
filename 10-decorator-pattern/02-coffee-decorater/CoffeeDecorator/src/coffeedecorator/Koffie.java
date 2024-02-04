/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeedecorator;

/**
 * De gemeenschappelijke ouderklasse van concrete koffies
 * en decorators.
 * @author Pieter.Lust
 */
public abstract class Koffie {
    String beschrijving = "Abstracte koffie";
    
    public String GetBeschrijving() {
        return beschrijving;
    }
    
    public abstract double prijs();
}
