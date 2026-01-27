public class App
{
    public static void main(String[] args)
    {

        Player p1 = new Player();
        Player p2 = new Player("Thomas");
        Player p3 = new Player("Thomas",18);


        say("Hello !",2);

        /*
        String message = "Hello !";
        message = say(message);
        System.out.println(message);
        */

    }

    public static void say(String msg , int nombre)
    {
        nombre = 34;
        System.out.println(msg + " -- " + nombre);

        System.out.println(sumINT(2,5) + " -- " + sumDOUBLE(5.1 , 5.4));

        /*
        msg  = "World !";
        return msg;
        */
    }

    public static int sumINT(int a , int b)     //on utilise 'int' -> vu que l'on fait un return 
    {
        return a + b;
    }

    public static double sumDOUBLE(double a , double b)     //on utilise 'int' -> vu que l'on fait un return 
    {
        return a + b;
    }
}