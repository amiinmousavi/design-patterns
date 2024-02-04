package oefeningfactorymethodv2;

/**
 * Een concrete drankfactory voor een student van het type ClubLid.
 * 
 * @author Pieter.Lust
 */
public class BierFactory extends DrankFactory {

	public BierFactory() {
	}

	@Override
	public Drank maakDrank(String moment) {
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
