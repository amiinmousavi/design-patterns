package oefeningfactorymethod;

/**
 * Factory method pattern, waarbij de factory-verantwoordelijkheid in de 
 * clients (de studenten) gestopt is. Dat is omdat er per soort student een
 * andere factory is.
 * 
 * @author Pieter.Lust
 */
public class OefeningFactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		// creatie van de studenten
        Student donkergroen = new BoomKnuffelaar("Dirk Donkergroen");
        Student iovivat = new ClubLid("Johanna Vat");
        Student wiebelaar = new Gamer("Henk Headshot");
        
		// drinken overdag
        donkergroen.DrinkOverdag();
        iovivat.DrinkOverdag();
        wiebelaar.DrinkOverdag();

		// drinken 's avonds
		donkergroen.DrinkAvond();
        iovivat.DrinkAvond();
        wiebelaar.DrinkAvond();
    }
}
