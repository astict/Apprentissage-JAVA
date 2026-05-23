package files;

public enum Color
{
    GREEN("Vert"),
    RED("Rouge"),
    WHITE("Blanc");

    private String name;

    private Color(String theName)
    {
        this.name = theName;
    }

    public String toString()
    {
        return this.name;
    }
}