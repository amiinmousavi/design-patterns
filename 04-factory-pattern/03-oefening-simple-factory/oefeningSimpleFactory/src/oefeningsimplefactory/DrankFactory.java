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
public class DrankFactory {

    public Drank getDrank(String soort) {
        switch (soort) {
            case "Caffeinehoudend":
                return new Cola();
            case "Alcoholhoudend":
                return new Bier();
            default:
                throw new IllegalArgumentException("Onbekende dranksoort");
        }
    }

}
