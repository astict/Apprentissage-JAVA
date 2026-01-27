public class Player
{
    private String mNom;
    private int mLevel;

    public Player()
    {
        this.mNom = "Inconnu(e)";
        this.mLevel = 1;
        System.out.println(this.mNom + " - " + this.mLevel);
    }

    public Player(String nom)
    {
        this.mNom = nom;
        this.mLevel = 1;

        System.out.println(this.mNom + " - " + this.mLevel);
    }
    
    public Player(String nom , int level)
    {
        this.mNom = nom;
        this.mLevel = level;

        System.out.println(this.mNom + " - " + this.mLevel);
    }
}