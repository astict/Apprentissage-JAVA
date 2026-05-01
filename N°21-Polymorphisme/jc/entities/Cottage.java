package jc.entities;

public class Cottage extends Building implements Flyable
{
    public Cottage()
    {
        System.out.println("Parcelle en place...");
    }

    public void fly(String energy)
    {
        System.out.println("Je me propulse dans les airs avec du " + energy);
    }

    public void fly()
    {
        System.out.println("Je vole !");
    }

    public void build(String material)
    {
        System.out.println("Construction du batiment en " + material);
    }
}