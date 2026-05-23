package files;

public class Vegetable
{
    private String name;
    private Color color;

    public Vegetable(String theName, Color theColor)
    {
        this.name = theName;
        this.color = theColor;
    }

    public String getName()
    {return this.name;}

    public Color getColor()
    {return this.color;}

    @Override
    public String toString()
    {
        return this.name + " - " + this.getColor();
    }
}