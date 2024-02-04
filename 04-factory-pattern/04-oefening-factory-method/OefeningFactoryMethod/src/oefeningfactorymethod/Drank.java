package oefeningfactorymethod;

/**
 * Basisklasse voor dranken.
 * De verantwoordelijkheid van een drank is het hebben van een naam.
 * Hier zit het gedrag dat alle dranken gemeenschappelijk hebben: getNaam().
 * 
 * @author Pieter.Lust
 */
public abstract class Drank {
	private String naam;
	
	public String getNaam() {
		return this.naam;
	}

	public Drank(String naam) {
		this.naam = naam;
	}
}
