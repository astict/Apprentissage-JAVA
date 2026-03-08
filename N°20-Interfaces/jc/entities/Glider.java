package jc.entities;

public class Glider extends Vehicle implements Flyable
{
    public Glider()
    {
        this.mMovementSpeed = 28;
    }

    public void moveXY(int x, int y)
    {
        System.out.println("Le planeur fend l'air vers (" + x + ", " + y +")");
    }

    public void fly(String energy)
    {
        System.out.println("Je me propulse dans les airs avec du " + energy);
    }

    public void boost(int n)
    {
        System.out.println("Je me propulse en x" + n);
    }
}