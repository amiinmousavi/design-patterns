package oefeningfactorymethod;

/**
 * Een concrete student-klasse, voor een student die overdag wortelsap drinkt, 
 * en 's avonds lindethee drinkt.
 * 
 * @author Pieter.Lust
 */

public class BoomKnuffelaar extends Student {
	public BoomKnuffelaar(String naam) {
		super(naam);
	}
	
    @Override
    protected Drank getDrank(String moment) {
		switch (moment) {
			case "dag":
				return new Wortelsap();
			case "avond":
				return new Lindethee();
			default:
				throw new IllegalArgumentException("Onbekend moment");
		}
    }
}    
