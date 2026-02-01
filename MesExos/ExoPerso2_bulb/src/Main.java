public class Main 
{
    public static void main(String[] args)
    {
        Bulb ampoule1 = new Bulb(0);

        ampoule1.set_power(400);

        System.out.println(ampoule1.get_power());
    }
}