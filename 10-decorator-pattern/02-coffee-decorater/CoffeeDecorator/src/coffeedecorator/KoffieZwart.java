/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeedecorator;

/**
 * Een concrete component.
 * 
 * @author Pieter.Lust
 */
public class KoffieZwart extends Koffie {
    public KoffieZwart() {
        beschrijving = "Koffie";
    }
    
    public double prijs() {
        return 2.0;
    }
}
