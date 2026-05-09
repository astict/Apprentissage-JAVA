public class App
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat("Kito",19);
        Cat cat2 = new Cat("Felix",4);

        //System.out.println(cat2.mName); <-- FAUX car attribut privée, on ne peut donc pas y accéder !!
    }
}