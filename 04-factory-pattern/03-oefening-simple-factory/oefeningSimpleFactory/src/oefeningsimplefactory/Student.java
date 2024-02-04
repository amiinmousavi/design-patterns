/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefeningsimplefactory;

/**
 *
 * @author Pieter.Lust
 */
public class Student {

    private String naam;
    private DrankFactory drankfactory;

    Student(String naam, DrankFactory drankfactory) {
        this.naam = naam;
        this.drankfactory = drankfactory;
    }

    public String getNaam() {
        return naam;
    }

    public void DrinkCafeine() {
        Drank drank = drankfactory.getDrank("Caffeinehoudend");
        System.out.println("Student " + naam + " drinkt overdag een " + drank.getNaam());
    }

    public void DrinkAlcohol() {
        Drank drank = drankfactory.getDrank("Alcoholhoudend");
        System.out.println("Student " + naam + " drinkt 's avonds een " + drank.getNaam());
    }

}
