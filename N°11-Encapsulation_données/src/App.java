public class App
{
    public static void main(String[] args)
    {
        SoftwareRegistration SR1 = new SoftwareRegistration(2020);

        //SR1.mExpirationYear = 2050; --> possible si j'ai mis la variable en public, mais pas d'encapsulation ...

        SR1.setExpirationYear(2050); //setter pour modifier donc --> ici 2050
        System.out.println(SR1.getExpirationYear());

        //SR1.Affichage();
    }
}