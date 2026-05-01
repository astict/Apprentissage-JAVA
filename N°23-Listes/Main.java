/*
    --> Ces classes appartiennent à "List".
    --> Ces classes permettent de travailler avec des informations ordonnées, elle acceptent également les doublons et les valeurs nulles.

    ArrayList : mono-thread, accès direct, optimisée pour la lecture
    LinkedList : insertion rapides
    Vector : multi-thread, accès direct, optimisée pour la lecture
    Stack : LIFO


    ArrayList & Vector -->  add(), addAll(), remove(), clear(), size(), get() [...]
    LinkedList -->  addFirst(), addLast(), addAll(), removeFirst(), clear(), size(), getFirst() [...]
*/

import jc.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main
{
    public static void main(String[] args)
    {
        //ArrayList<Cat> group = new ArrayList<Cat>();
        LinkedList<Cat> group = new LinkedList<Cat>();

        Cat c1 = new Cat("Roberto");
        Cat c2 = new Cat("Poppy");
        Cat c3 = new Cat("Grisouille");

        //group.add(c1);
        //group.add(c2);
        //group.add(c3);
        //group.remove(1);

        group.addFirst(c1);
        group.addFirst(c2);
        group.addFirst(c3);

        ListIterator<Cat> lit = group.listIterator();

        while(lit.hasNext())
            lit.next().meow();

        //for(Cat c : group)
        //    c.meow();

        //group.clear();
        //System.out.println(group.get(0)); //accès direct
        //System.out.println(group.size());
    }
}