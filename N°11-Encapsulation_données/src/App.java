public class App
{
    public static void main(String[] args)
    {
        SoftwareRegistration SR1 = new SoftwareRegistration(2020);
        System.out.println("");
        SoftwareRegistration SR2 = new SoftwareRegistration(2024);
        System.out.println("");
        SoftwareRegistration SR3 = new SoftwareRegistration(2025);

        //SR1.mExpirationYear = 2050; --> possible si j'ai mis la variable en public, mais pas en cas d'encapsulation ...

        //SR1.setExpirationYear(2050); //setter pour modifier donc --> ici 2050

        /*
        System.out.println(SR1.getExpirationYear());
        System.out.println(SR2.getExpirationYear());
        */

        //SR1.Affichage();
    }
}     