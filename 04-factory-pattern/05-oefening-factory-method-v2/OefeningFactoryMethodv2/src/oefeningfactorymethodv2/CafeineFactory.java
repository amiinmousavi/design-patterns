package oefeningfactorymethodv2;

/**
 * Een concrete drankfactory voor een student van het type Gamer.
 * 
 * @author Pieter.Lust
 */
public class CafeineFactory extends DrankFactory {

	public CafeineFactory() {
	}

	@Override
	public Drank maakDrank(String moment) {
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
