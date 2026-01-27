public class Main
{
    public static void main(String[] args)
    {
        Film f1 = new Film("Man of steel",2013,"Zack Snyder");

        f1.afficher();

        System.out.println("------------------------------");

        Film f2 = new Film("Interstellar",2014,"Christopher Nolan");

        f2.afficher();
    }
}