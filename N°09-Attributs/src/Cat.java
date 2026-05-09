public class Cat
{
    public Cat(String name, int age)
    {
        this.mName = name;       // -> mName = name;
        this.mAge = age;         // -> mAge = age;

        System.out.println(this.mName + " - " + this.mAge);
    }

    /*  Comme les attributs sont en private, il n'y a que la class Cat qui y a accès !!!    */

    private String mName;
    private int mAge;
}