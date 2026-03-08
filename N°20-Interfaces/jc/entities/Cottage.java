package jc.entities;

public class Cottage extends Building
{
    public Cottage()
    {
        System.out.println("Parcelle en place...");
    }

    public void build(String material)
    {
        System.out.println("Construction du batiment en " + material);
    }
}