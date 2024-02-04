/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeedecorator;

/**
 * De concrete Builderklasse
 * 
 * @author Pieter.Lust
 */
public class KoffieMaker extends KoffieBuilder {
    Koffie koffie;
    
    @Override
    public void MaakKoffie() {
        koffie = new KoffieZwart();
    }

    @Override
    public void VoegSuikerToe() {
        if (koffie != null)
            koffie = new Suiker(koffie);
        else
            throw new UnsupportedOperationException("Suiker zonder koffie");
    }

    @Override
    public void VoegCognacToe() {
        if (koffie != null)
            koffie = new Cognac(koffie);
        else
            throw new UnsupportedOperationException("Cognac zonder koffie");
    }

    @Override
    public Koffie GetAfgewerkteKoffie() {
        if (koffie != null)
            return koffie;
        else
            throw new UnsupportedOperationException("Nog geen koffie");
    }
    
}
