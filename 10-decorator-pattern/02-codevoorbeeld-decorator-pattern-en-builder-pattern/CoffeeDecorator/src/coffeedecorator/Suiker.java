/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeedecorator;

/**
 * Een concrete decorator.
 * 
 * @author Pieter.Lust
 */
public class Suiker extends KoffieToevoeging {
    Koffie koffie;
    
    public Suiker(Koffie koffie) {
        this.koffie = koffie;
    }
    
    @Override
    public String GetBeschrijving() {
        return koffie.GetBeschrijving() + ", met suiker";
    }
    
    @Override
    public double prijs() {
        return koffie.prijs() + 0.20;
    }
}
