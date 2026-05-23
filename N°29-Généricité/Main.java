import files.*;
import java.util.ArrayList;
import java.util.List;

/*
    A --> B
    non : List<A> ---> List<B>
*/

public class Main
{

    public static void printList(List<?> list)
    {
        for(Object obj : list)
            System.out.println("> " + obj);
    }
    
    
    public static void main(String[] args) 
    {
        /*
        Fruit cherries = new Fruit("Cherries",15); 
        Basket<Fruit> fruitB = new Basket(cherries); 
        System.out.println(fruitB.getItem().getName());

        Vegetable endives = new Vegetable("Endives",Color.WHITE);
        Basket<Vegetable> vegeB = new Basket(endives); 
        System.out.println(vegeB.getItem().getName());
        */


        /*
        Drink dr = new Drink("Eau gazeuse");

        Basket<Drink> bdr = new Basket(dr);
        System.out.println(bdr.getItem().getName());
        */

        Fruit cherries = new Fruit("Cerises",15);   
        Fruit bananas = new Fruit("Bananes",43);
        Fruit blueberries = new Fruit("Myrtilles",50); 

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(cherries);
        fruits.add(bananas);
        fruits.add(blueberries);

        //---------------------------------------------------------------------

        Vegetable endives = new Vegetable("Endives",Color.WHITE);
        Vegetable onions = new Vegetable("Oignons",Color.WHITE);
        Vegetable leeks = new Vegetable("Poireaux",Color.GREEN);

        List<Vegetable> vegetables = new ArrayList<>();
        vegetables.add(endives);
        vegetables.add(onions);
        vegetables.add(leeks);

        printList(fruits);
        printList(vegetables);
        
    }
}