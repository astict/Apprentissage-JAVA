public class Bulb
{
    private int bulb_power;
    private boolean isOn;

    public Bulb(int power)
    {
        this.bulb_power = power;
        this.isOn = false;
    }

    public void setPowerBulb(int power)
    {
        this.bulb_power = power;
    }

    public int getPowerBulb()
    {
        return this.bulb_power;
    }

    public void turnOn()
    {
        this.isOn = true;
    }

    public void turnOff()
    {
        this.isOn = false;
    }

    public boolean isOn()
    {
        return this.isOn;
    }

    public String getState()
{
    if(isOn == true)
        return "ON";
        
    else
        return "OFF";
}
    
}