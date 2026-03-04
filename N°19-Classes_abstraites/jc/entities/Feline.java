package jc.entities;

abstract public class Feline
{
    protected String mName;

    abstract public void sleep();

    public void speak() { System.out.println("Roaaarr !!"); }
}