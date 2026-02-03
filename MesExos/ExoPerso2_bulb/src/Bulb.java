public class Bulb
{
    private int power;
    private boolean isOn;

    public Bulb(int power)
    {
        this.power = power;
        this.isOn = false;
    }

    public int getPower()
    {
        return power;
    }

    public void setPower(int power)
    {
        this.power = power;
    }

    public void turnOn()
    {
        isOn = true;
    }

    public void turnOff()
    {
        isOn = false;
    }
}
