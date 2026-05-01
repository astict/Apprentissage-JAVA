package jc.entities;

public class Moto extends Vehicle implements Flyable
{
    public Moto()
    {
        this.mMovementSpeed = 160;
    }

    public void fly(String energy)
    {
        System.out.println("Je me propulse dans les airs avec du " + energy);
    }

    public void fly()
    {
        System.out.println("Je vole !");
    }

    public void moveXY(int x, int y)
    {
        System.out.println("Je vais super vite !(" + x + ", " + y +")");
    }
}