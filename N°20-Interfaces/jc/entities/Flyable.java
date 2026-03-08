package jc.entities;


interface Flyable 
{
    public void fly(String energy);
    public void boost(int n);

    default public void test()
    {
        System.out.println("test");
    }
}