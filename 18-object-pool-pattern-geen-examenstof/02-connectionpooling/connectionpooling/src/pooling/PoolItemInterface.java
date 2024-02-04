/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooling;

/**
 * Interface voor Poolitems.
 * 
 * @author kaspercools
 */
public interface PoolItemInterface {
    /**
     * Methode waarmee het poolitem nuttig werk doet voor de client.
     */
    public void doStuff();
    
    /**
     * Methode waarmee de client het poolitem vrijgeeft. 
     * Na een aanroep van deze methode is het poolitem niet meer bruikbaar
     * voor de client.
     */
    public void close();
}

