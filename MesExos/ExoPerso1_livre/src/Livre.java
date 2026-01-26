public class Livre
{
    private String mTitre;
    private String mAuteur;
    private int mDate;


    public Livre(String titre , String auteur , int date_publication)
    {
        this.mTitre = titre;
        this.mAuteur = auteur;
        this.mDate = date_publication;
    }

    public void afficher_Livre()
    {
        System.out.println(mTitre + " - " + mAuteur + " - " + mDate);
    }

}