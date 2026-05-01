package jc.entities;


public interface Flyable 
{
    public void fly(String energy);
    public void fly();

    default public void test()
    {
        System.out.println("test");
    }
}