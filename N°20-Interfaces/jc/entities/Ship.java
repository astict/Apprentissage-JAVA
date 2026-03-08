package jc.entities;

public class Ship extends Vehicle 
{
    public Ship()
    {
        this.mMovementSpeed = 16;
    }

    public void moveXY(int x, int y)
    {
        System.out.println("Le navire brasse les flots et se déplace en (" + x + ", " + y +")");
    }
}