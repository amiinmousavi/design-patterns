package oefeningfactorymethodv2;

/**
 * Een concrete drankfactory voor een student van het type BoomKnuffelaar.
 * 
 * @author Pieter.Lust
 */
public class GroenFactory extends DrankFactory {

	public GroenFactory() {
	}

	@Override
	public Drank maakDrank(String moment) {
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
