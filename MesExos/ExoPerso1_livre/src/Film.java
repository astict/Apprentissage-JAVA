public class Film
{
    private String mNomFilm;
    private int mDateFilm;
    private String mNomReal;

    public Film(String NomFilm , int DateFilm , String NomReal)
    {
        this.mNomFilm = NomFilm;
        this.mDateFilm = DateFilm;
        this.mNomReal = NomReal;
    }

    public void afficher() 
    {
        System.out.println("Nom du film : " + mNomFilm);
        System.out.println("Année : " + mDateFilm);
        System.out.println("Réalisateur : " + mNomReal);
    }

}