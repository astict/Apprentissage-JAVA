public class Main
{
    public static void main(String[] args)
    {
        Bulb ampoule1 = new Bulb(200);

        ampoule1.set_BulbPower(400);
        System.out.println("L'ampoule a pour puissance : " + ampoule1.get_BulbPower() + "W");

    }

}