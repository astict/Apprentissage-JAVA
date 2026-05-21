public enum Color
{
    RED("Rouge","FF0000"), 
    GREEN("Vert","00FF00"),
    BLUE("Bleu","0000FF");

    private String name;
    private String hexValue;
    
    private Color(String theName, String theHexValue)
    {
        this.name = theName;
        this.hexValue = theHexValue;
    }

    public String toString()
    {
        return this.name;
    }
}