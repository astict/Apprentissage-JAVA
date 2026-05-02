/*
    --> Ces classes appartiennent à "List".
    --> Ces classes permettent de travailler avec des informations ordonnées, elle acceptent également les doublons et les valeurs nulles.

    ArrayList : mono-thread, accès direct, optimisée pour la lecture
    LinkedList : insertion rapides
    Vector : multi-thread, accès direct, optimisée pour la lecture
    Stack : LIFO, multi-thread


    ArrayList -->  add(), get(), set(), remove(), size(), contains(), clear(), isEmpty() [...] 
    Vector -->  add(), get(), remove(), size(), capacity(), set(), contains(), clear() [...] 
    LinkedList -->  addFirst(), addLast(), removeFirst(), getFirst(), hasNext(), next() [...]
    Stack --> push(), pop(), peek()
    (Voir JAVADOC pour +)
*/

import jc.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        //ArrayList<Cat> group = new ArrayList<Cat>();
        //LinkedList<Cat> group = new LinkedList<Cat>();
        Stack<Cat> group = new Stack<Cat>();

        Cat c1 = new Cat("Roberto");
        Cat c2 = new Cat("Poppy");
        Cat c3 = new Cat("Grisouille");

        group.push(c1);
        group.push(c2);
        group.push(c3);

        //--- ArrayList & Vector ---
        //group.add(c1);
        //group.add(c2);
        //group.add(c3);
        //group.remove(1);

        //--- LinkedList ---
        //group.addFirst(c1);
        //group.addFirst(c2);
        //group.addFirst(c3);

        ListIterator<Cat> lit = group.listIterator();

        while(lit.hasNext())
            lit.next().meow();

        //--- ArrayList & Vector ---
        //for(Cat c : group)
        //    c.meow();
        //group.clear();
        //System.out.println(group.get(0)); //accès direct
        //System.out.println(group.size());

        group.peek().meow();
    }
}