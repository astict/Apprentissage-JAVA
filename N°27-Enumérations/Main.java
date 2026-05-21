public class Main
{
    public static void main(String[] args) 
    {
        Color c = Color.BLUE;
        Color c2 = Color.BLUE;

        if(c.equals(c2))
            System.out.println("Same");

        System.out.println(Color.valueOf("BLUE"));
        System.out.println(Color.RED.ordinal());
        System.out.println(Color.RED.name());

        for(Color e : Color.values())
            System.out.println(e);
    }
}