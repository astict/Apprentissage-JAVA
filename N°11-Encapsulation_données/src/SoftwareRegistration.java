public class SoftwareRegistration
{
    public SoftwareRegistration(int expiration)
    {
        if(NumberOfRegistrations > 0)
        {
            this.mExpirationYear = expiration;
            NumberOfRegistrations--;

            System.out.println("Logiciel valide -> (expiration : " + this.mExpirationYear + ")");
            System.out.println("Enregistrements restants : " + NumberOfRegistrations);
        }
        else
        {
            System.out.println("Maximum de validations effectuees !");

        }
    }

    public void Affichage()
    {
        System.out.println("Enregistrement du produit, valide jusqu'en : " + this.mExpirationYear);
    }

    public int getExpirationYear()  //getter
    {
        return this.mExpirationYear;
    }

    public void setExpirationYear(int expiration)    //setter
    {
        this.mExpirationYear = expiration;
    }

    private static int NumberOfRegistrations = 2;
    private int mExpirationYear;
    //int mExpirationYear; --> public

}