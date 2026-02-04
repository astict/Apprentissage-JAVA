public class Main
{
    public static void main(String[] args)
    {
        Bulb bulb1 = new Bulb(400);
        Bulb bulb2 = new Bulb(500);
        Bulb bulb3 = new Bulb(400);
        Bulb bulb4 = new Bulb(400);
        Bulb bulb5 = new Bulb(500);
        Bulb bulb6 = new Bulb(600);

        bulb1.turnOn();
        bulb3.turnOn();
        bulb6.turnOn();

        bulb1.setPowerBulb(780);
        bulb4.setPowerBulb(882);
        bulb5.setPowerBulb(342);

        Bulb[] bulbs = {bulb1,bulb2,bulb3,bulb4,bulb5,bulb6};

        for(int i = 0; i < bulbs.length; i++)
        {
            System.out.println("Apoule N°"+(i+1)+ "\t" + bulbs[i].getPowerBulb() + "W\t" + bulbs[i].getState());
        }
        
        Socket socket = new Socket();

        System.out.println("-------------");

        System.out.println("Il faut " + socket.nbrSocket(bulbs) + " sockets pour y mettre toutes les lampes !");

    }
}