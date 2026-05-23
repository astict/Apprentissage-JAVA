package files;

public class Fruit
{
    private String name;
    private int quantity;

    public Fruit(String theName)
    {
        this.name = theName;
        this.quantity = 1;
    }

    public Fruit(String theName, int theQuantity)
    {
        this.name = theName;
        this.quantity = theQuantity;
    }

    public String getName()
    {return this.name;}

    public int getQuantity()
    {return this.quantity;}

    @Override
    public String toString()
    {
        return this.quantity + " " + this.name; 
    }
    
}