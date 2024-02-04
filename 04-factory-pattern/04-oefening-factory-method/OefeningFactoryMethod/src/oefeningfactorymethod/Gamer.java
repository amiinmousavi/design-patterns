package oefeningfactorymethod;

/**
 * Een concrete student-klasse, voor een student die overdag cola drinkt, 
 * en 's avonds Redbull drinkt.
 *
 * @author Pieter.Lust
 */

public class Gamer extends Student {
	public Gamer(String naam) {
		super(naam);
	}
	
    @Override
    protected Drank getDrank(String moment) {
		switch (moment) {
			case "dag":
				return new Cola();
			case "avond":
				return new RedBull();
			default:
				throw new IllegalArgumentException("Onbekend moment");
		}
    }
}    
