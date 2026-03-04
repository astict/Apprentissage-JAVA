package jc.entities;

public final class Pegasus extends Horse
{
    /* --- Mes attributs ---*/

    private int mPosZ;


    /* --- Constructeur --- */

    public Pegasus(String name)
    {
        super(name);
        this.mPosZ = 100;
    }


    /* --- Méthode MOVE ---*/

    public void move(int x, int y)
    {
        super.move(x,y);
        System.out.println("Le Pegase se deplace (X = " + this.mPosX + ", " + this.mPosY + ")");
    }


    /* --- Méthode FLY ---*/

    public void fly(int z)
    {
        this.mPosZ = z;
        System.out.println("Le Pegase s'eleve dans les airs (Z = " + this.mPosZ + ")");
    }
}