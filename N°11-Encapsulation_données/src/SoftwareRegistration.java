public class SoftwareRegistration
{
    public SoftwareRegistration(int expiration)
    {
        this.mExpirationYear = expiration;
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

    private int mExpirationYear;
    //int mExpirationYear; --> public

}