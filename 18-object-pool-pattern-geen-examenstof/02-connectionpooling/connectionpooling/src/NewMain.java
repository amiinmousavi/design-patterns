
import pooling.Pool;
import pooling.PoolItemInterface;

/**
 *
 * @author kaspercools
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Pool pool = new Pool();
        
        // item 1 opvragen
        PoolItemInterface item = pool.getFreePoolItem();
        item.doStuff();
        
        // item 2 opvragen
        PoolItemInterface nextItem = pool.getFreePoolItem();
        nextItem.doStuff();
        
        // item 3 opvragen 
        PoolItemInterface nextnextItem = pool.getFreePoolItem();
        nextnextItem.doStuff();
        
        // item 4 opvragen
        // er zou een exception moeten zijn
        try {
            PoolItemInterface failedItem = pool.getFreePoolItem();
            nextnextItem.doStuff();
            System.out.println("Item 4 werkt toch: dit mag niet");
        }
        catch (Exception ex) {
            System.out.println("Exception na getFreePoolItem: " + ex.getMessage());
        }
        
        // item 2 vrijgeven
        nextItem.close();
        
        // item 2 proberen te gebruiken: zou een exception moeten geven
        try {
            nextItem.doStuff();
            System.out.println("Vrijgegeven item werkt toch nog: dit mag niet");
        }
        catch( Exception ex) {
            System.out.println("Exception na doStuff: " + ex.getMessage());
        }
        
        // Opnieuw proberen een item opvragen. Dit zou nu moeten lukken.
        PoolItemInterface newItem = pool.getFreePoolItem();
        newItem.doStuff();
        
        // Alles vrijgeven
        item.close();
        nextnextItem.close();
        newItem.close();
        // Vrijgegeven object nog eens proberen vrij te geven zal mislukken
        try {
            nextItem.close();
        }
        catch(Exception ex) {
            System.out.println("Exception na close: " + ex.getMessage());
        }
    }
    
}
