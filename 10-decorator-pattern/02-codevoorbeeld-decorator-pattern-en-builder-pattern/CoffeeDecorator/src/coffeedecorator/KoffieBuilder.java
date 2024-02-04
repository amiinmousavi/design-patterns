/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeedecorator;

/**
 * De interfaceklasse voor het Builder Pattern
 * 
 * @author Pieter.Lust
 */
public abstract class KoffieBuilder {
    public abstract void MaakKoffie();
    public abstract void VoegSuikerToe();
    public abstract void VoegCognacToe();
    public abstract Koffie GetAfgewerkteKoffie();
}
