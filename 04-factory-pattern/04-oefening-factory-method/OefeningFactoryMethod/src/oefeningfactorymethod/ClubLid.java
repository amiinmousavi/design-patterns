package oefeningfactorymethod;

/**
 * Een concrete student-klasse, voor een student die overdag bier drinkt, 
 * en 's avonds bier drinkt.
 *
 * @author Pieter.Lust
 */

public class ClubLid extends Student {
	public ClubLid(String naam) {
		super(naam);
	}
	
    @Override
    protected Drank getDrank(String moment) {
		switch (moment) {
			case "dag":
				return new Bier();
			case "avond":
				return new Bier();
			default:
				throw new IllegalArgumentException("Onbekend moment");
		}
    }
}    
