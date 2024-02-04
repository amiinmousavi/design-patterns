package oefeningfactorymethodv2;

/**
 * Basisklasse voor alle studenten.
 * Een student heeft een naam, en een student heeft een drinkgedrag.
 * Voor het drinkgedrag zijn er twee publieke methodes: DrinkOverdag() en 
 * DrinkAvond(). Die twee methodes gebruiken de factory waar de student mee
 * samengesteld is.
 * 
 * @author Pieter.Lust
 */
public abstract class Student {
    private String naam;
	private DrankFactory drankFactory;

	public Student(String naam, DrankFactory drankFactory) {
		this.naam = naam;
		this.drankFactory = drankFactory;
	}
	
    public String getNaam() {
        return naam;
    }

	public void DrinkOverdag() {
		Drank drank = drankFactory.maakDrank("dag");
		System.out.println("Student " + naam + " drinkt overdag een " + drank.getNaam());
	}

	public void DrinkAvond() {
		Drank drank = drankFactory.maakDrank("avond");
		System.out.println("Student " + naam + " drinkt 's avonds een " + drank.getNaam());
	}
    
}
