package oefeningfactorymethodv2;

/**
 * Factory method pattern, waarbij de factory-verantwoordelijkheid in aparte 
 * factoryklassen zit.
 * In deze versie moet een student een factory hebben. Een mogelijkheid om dat 
 * te doen is door de factory in de constructor als parameter mee te geven. Een
 * andere mogelijkheid is om de factory hardcoded in de student-klassen te 
 * instantiëren. Als je die tweede mogelijkheid zou kiezen, dan heb je de factory-
 * klassen eigenlijk niet meer nodig, en dan kom je uit bij de eerste versie 
 * van de oplossing (project OefeningFactoryMethod). Omdat studenten nu 
 * constructors met twee parameters hebben, moet de code van de main-methode
 * wat aangepast worden ten opzichte van de opgave.
 * 
 * @author Pieter.Lust
 */
public class OefeningFactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creatie van de factoryklassen
        DrankFactory groenFactory = new GroenFactory();
        DrankFactory bierFactory = new BierFactory();
        DrankFactory cafeineFactory = new CafeineFactory();

        // creatie van de studenten
        Student donkergroen = new BoomKnuffelaar("Dirk Donkergroen", groenFactory);
        Student iovivat = new ClubLid("Johanna Vat", bierFactory);
        Student wiebelaar = new Gamer("Henk Headshot", cafeineFactory);
        
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
