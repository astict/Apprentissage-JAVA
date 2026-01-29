public class Bulb
{
    private int mPower;

    public Bulb(int power)
    {
        this.mPower = power;
    }

    public int get_BulbPower()
    {
        return this.mPower;
    }
    
    public void set_BulbPower(int power)
    {
        this.mPower = power;
    }
}