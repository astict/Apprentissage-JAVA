import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

/*
        HashSet : pas de doublons, pas thread-safe, pas d'ordre, accès direct 
        TreeSet : pas de doublons, pas thread-safe, ordonnée, pas d'accès direct


        HashSet()           TreeSet()
        =========           =========
        hashCode()          compare()
        equals()            compareTo()
*/

public class Main
{
    public static void main(String[] args) 
    {
        /*

        HashSet<Integer> hs = new HashSet<Integer>(50, 0.6f); //lorsque la capacité est a 60% de 50 elle évolue ...

        hs.add(4);
        has.add(4); //pas de doublon
        hs.add(-2);
        hs.add(455);

        for(Integer e : hs)
            System.out.println(e);

        hs.remove(-2);

        if(hs.contains(-2))
            System.out.println("yes");
        */

        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(4);
        //ts.add(4); --> pas de doublon
        ts.add(-2);
        ts.add(455);
        ts.add(222);
        ts.add(67);

        for(Integer e : ts)
            System.out.println(e);

        ts.remove(-2);

        if(ts.contains(-2))
                System.out.println("yes");

        /* --- THE TRIES --- */

        System.out.println("First element : " + ts.first() + "   Second element : " + ts.last());
        System.out.println("HEAD -- Set forked : " + ts.headSet(222));
        System.out.println("TAIL -- Set forked : " + ts.tailSet(222));
        System.out.println(ts.subSet(-2,222));
    }
}