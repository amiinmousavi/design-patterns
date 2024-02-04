package oefeningfactorymethod;

/**
 * Basisklasse voor alle studenten.
 * Een student heeft een naam, en een student heeft een drinkgedrag.
 * Voor het drinkgedrag zijn er twee publieke methodes: DrinkOverdag() en 
 * DrinkAvond(). Die twee methodes gebruiken de factorymethode getDrank(). 
 * DrinkOverdag() en DrinkAvond() zijn hetzelfde voor alle concrete student-
 * klassen, en zijn daarom hier gedefinieerd. getDrank() bevat het drinkgedrag
 * dat voor elke studenttype specifiek is, en is daarom abstract. getDrank() is
 * protected om te beletten dat andere klassen de factorymethode rechtstreeks
 * zouden aanroepen.
 * 
 * @author Pieter.Lust
 */
public abstract class Student {
    private String naam;

    public Student(String naam) {
            this.naam = naam;
    }
	
    public String getNaam() {
        return naam;
    }

    // De factory methode
    protected abstract Drank getDrank(String moment);

    public void DrinkOverdag() {
        Drank drank = getDrank("dag");
        System.out.println("Student " + naam + " drinkt overdag een " + drank.getNaam());
    }

    public void DrinkAvond() {
        Drank drank = getDrank("avond");
        System.out.println("Student " + naam + " drinkt 's avonds een " + drank.getNaam());
    }
    
}
