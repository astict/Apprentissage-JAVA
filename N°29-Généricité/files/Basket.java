package files;

public class Basket<E> // ou par exemple plus spécifique encore <? extends Vegetable>
{
    private E item;
    
    public Basket(E theItem)
    {
        this.item = theItem;
    }

    public E getItem()
    {return this.item;}
}