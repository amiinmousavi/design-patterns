package oefeningfactorymethodv2;

/**
 * De abstracte factoryklasse voor drank.
 * Een drankfactory moet twee types drank kunnen maken: voor overdag en 's avonds.
 * 
 * @author Pieter.Lust
 */
public abstract class DrankFactory {
	public abstract Drank maakDrank(String moment);
}
