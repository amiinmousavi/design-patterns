/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefeningsimplefactory;

/**
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
