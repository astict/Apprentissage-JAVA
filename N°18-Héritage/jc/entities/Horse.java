package jc.entities;

public class Horse
{
    /* --- Mes attributs ---*/

    protected String mName;
    protected int mPosX;
    protected int mPosY;


    /* --- Constructeur --- */

    public Horse(String name)
    {
        this.mName = name;
        this.mPosX = 50;
        this.mPosY = 50;
    }


    /* --- Méthode MOVE ---*/

    public void move(int x, int y)
    {
        this.mPosX = x;
        this.mPosY = y;
        //System.out.println("Le Cheval se deplace (X = " + this.mPosX + ", " + this.mPosY + ")");
    }
}