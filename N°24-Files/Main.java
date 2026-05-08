import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Iterator;

/*
        PriorityQueue : ordonnée, accepte les doublons, refuse valeurs nulles, PAS thread-safe 
        ArrayDeque    : ordonnée, accepte les doublons, refuse valeurs nulles, PAS thread-safe
*/

public class Main
{
    public static void main(String[] args)
    {
        /*

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(2);
        pq.add(155);
        pq.add(0);
        pq.add(8);
        //pq.add(null); --> pas de valeur null 
        pq.add(-5);

        while(!(pq.isEmpty()))
            System.out.println(pq.poll());  --> retire les valeurs de la liste dans l'ordre

        
            Iterator<Integer> it = pq.iterator();

            while (it.hasNext()) 
                System.out.println(it.next());
        
            for(Integer e : pq)
                System.out.println(e);
        */

        ArrayDeque<Integer> adq = new ArrayDeque<Integer>();

        // peekFirst(), peekLast(), removeLastOccurrence()

        adq.addFirst(1);
        adq.addFirst(-3);
        adq.addLast(-4);

        Iterator<Integer> it = adq.iterator();

        while (it.hasNext()) 
            System.out.println(it.next());

        System.out.println(adq.getFirst());
    }
}

