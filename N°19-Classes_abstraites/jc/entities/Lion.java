package jc.entities;

public class Tiger extends LivingSpecies
{
    public Tiger()
    {
        mName = "Tigre";
    }

    public void eat()
    {
        System.out.println("Je mange de la viande...");
    }

    public void speak()
    {
        System.out.println("Je rugis...");
    }
}