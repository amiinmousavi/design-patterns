/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeedecorator;

/**
 * Concrete decorator
 * 
 * @author Pieter.Lust
 */
public class Cognac extends KoffieToevoeging {
    Koffie koffie;
    
    public Cognac(Koffie koffie) {
        this.koffie = koffie;
    }
    
    @Override
    public String GetBeschrijving() {
        return koffie.GetBeschrijving() + ", met alcoholvrije cognac";
    }
    
    @Override
    public double prijs() {
        return koffie.prijs() + 2.50;
    }
}
