import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

/*
        HashMap : pas de doublons (sauf valeur), pas thread-safe, accès direct, pas ordonnée, valeurs nulles /!\
        TreeMap : pas de doublons, pas thread-safe, accès direct, ordonnée
*/

public class Main
{
    public static void main(String[] args) 
    {
        /*
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1,"Marc");
        hm.put(2,"Luc");
        hm.put(15,"Marie");
        hm.put(3,"Julie");
        
        System.out.println(hm.get(15));

        if(hm.containsValue("Marie"))
            System.out.println("Trouvee");

        if(hm.containsKey(1))
            System.out.println(hm.get(1));

        for(Integer e : hm.keySet())
            System.out.println(e);
        */

        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        tm.put(1,"Marc");
        tm.put(2, null); 
        tm.put(15,"Marie"); 
        tm.put(3,"Julie"); 

        //System.out.println(tm.get(15));

        for(Map.Entry<Integer,String> ent : tm.entrySet())
            System.out.println("Cle : " + ent.getKey() + "  |  Valeur : " + ent.getValue());

    }
}