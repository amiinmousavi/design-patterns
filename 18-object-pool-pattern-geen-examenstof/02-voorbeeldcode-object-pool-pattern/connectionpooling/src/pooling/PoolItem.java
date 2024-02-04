/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooling;

/**
 * Concrete klasse voor poolitems.
 * 
 * @author kaspercools
 */
public class PoolItem implements PoolItemInterface{
    private String cmd = "Poolitem is executing task.";

    /**
     * Methode die nuttig werk voor de client doet.
     */
    @Override
    public void doStuff() {
        System.out.println(cmd);
    }

    /**
     * In deze methode kan het poolobject "gereset" worden, zodat de volgende
     * gebruiker het item in een propere toestand krijgt.
     */
    @Override
    public void close() {
    }
    
}
