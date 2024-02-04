package pooling;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

/**
 * Een object pool, met een vast aantal items, en die een exception geeft
 * als er voor een client geen item beschikbaar is.
 * 
 * @author kaspercools
 */
public class Pool {
    private final int POOLSIZE = 3;
    
    // De collectie van poolitems die beschikbaar zijn voor clients.
    Deque<PoolItemInterface> lstAvailablePoolItems= new ArrayDeque<>();
    // De collectie van poolitems die "uitgeleend" zijn.
    Set<PoolItemInterface> lstUsedPoolItems= new HashSet<>();

    public Pool() {
        for (int i = 0; i < POOLSIZE; i++) {
            lstAvailablePoolItems.add(new PoolItem());
        }
    }

    /**
     * Een poolitem uitlenen aan een client.
     * Als er geen item beschikbaar is, dan is er een exception.
     * 
     * @return Returnwaarde is het poolitem.
     * @throws Exception 
     */
    public PoolItemInterface getFreePoolItem() throws Exception{
        PoolItemInterface poolItem = null;
        // als er een beschikbaar item is
        if(!lstAvailablePoolItems.isEmpty()){
            // haal dan dat item uit de collectie van beschikbare items
            poolItem = lstAvailablePoolItems.pop();
            // en voeg het item toe aan de collectie uitgeleende items
            lstUsedPoolItems.add(poolItem);
        }else{
            // geen beschikbaar item: exception
            throw new Exception("No item available");
        }
        
        // Verpak het poolitem in een instantie van een inner class.
        // Daardoor krijgt het poolitem toegang tot de private methodes van 
        // de pool, zonder dat de client daar direct toegang toe heeft.
        return new InnerPoolItem(this, poolItem);
    }

    // Een vrijgegeven poolitem weer beschikbaar maken
    private void releaseResource(PoolItemInterface p) {
        // het item weghalen uit de collectie uitgeleende poolitems
        lstUsedPoolItems.remove(p);
        // en het item weer toevoegen aan de collectie beschikbare items.
        lstAvailablePoolItems.add(p);
    }
    
    
    /**
     * Een private inner class, die er voor zorgt dat poolitems bij 
     * het vrijgeven de methode releaseResource van de pool kunnen 
     * aanroepen.
     */
    private class InnerPoolItem implements PoolItemInterface{
        private PoolItemInterface poolitem;
        private Pool parent = null;

        public InnerPoolItem(Pool pool, PoolItemInterface p) {
            this.parent = pool;
            this.poolitem =  p;
        }

        /**
         * Nuttig werk doen voor de client.
         */
        @Override
        public void doStuff() {
            // Het werk doorgeven naar het poolitem.
            this.poolitem.doStuff();
        }

        /**
         * Het poolitem weer vrijgeven.
         */
        @Override
        public void close() {
            // Het poolitem terugbrengen naar een maagdelijke toestand.
            this.poolitem.close();
            // Het poolitem weer beschikbaar maken.
            this.parent.releaseResource(poolitem);
            // Er voor zorgen dat deze instantie van de inner class geen
            // toegang meer heeft tot het vrijgegeven poolitem.
            this.poolitem = null;
            
        }   
    }
}
