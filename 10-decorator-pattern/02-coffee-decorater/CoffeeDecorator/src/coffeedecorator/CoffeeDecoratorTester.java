/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeedecorator;

/**
 * Mainmethode
 * 
 * @author Pieter.Lust
 */
public class CoffeeDecoratorTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Het Decorator Pattern toepassen met constructors.
        Koffie koffie = new KoffieZwart();
        koffie = new Suiker(koffie);
        koffie = new Suiker(koffie);
        koffie = new Cognac(koffie);
        
        System.out.println(koffie.GetBeschrijving());
        System.out.println("De prijs is " + koffie.prijs());
        
        // Het Decorator Pattern toepassen samen met Builder.
        // Merk dat de klassen KoffieZwart, Suiker en Cognac
        // nu niet meer concreet voorkomen.
        KoffieBuilder koffieMaker = new KoffieMaker();
        koffieMaker.MaakKoffie();
        koffieMaker.VoegSuikerToe();
        koffieMaker.VoegSuikerToe();
        koffieMaker.VoegCognacToe();
        Koffie koffie2 = koffieMaker.GetAfgewerkteKoffie();
        
        System.out.println("Koffie met koffiemaker:");
        System.out.println(koffie2.GetBeschrijving());
        System.out.println("De prijs is " + koffie2.prijs());
    }
}
