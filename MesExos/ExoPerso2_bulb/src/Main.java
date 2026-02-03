public class Main 
{
    public static void main(String[] args)
    {
        Bulb b1 = new Bulb(400);
        Bulb b2 = new Bulb(400);
        Bulb b3 = new Bulb(400);
        Bulb b4 = new Bulb(400);
        Bulb b5 = new Bulb(400);
        Bulb b6 = new Bulb(400);
        Bulb b7 = new Bulb(400);
        Bulb b8 = new Bulb(400);
        Bulb b9 = new Bulb(400);

        Bulb[] bulbs = { b1, b2, b3, b4, b5, b6, b7, b8, b9 };

        Socket socket = new Socket();

        System.out.println(
            "Sockets nécessaires : " + socket.countSockets(bulbs)
        );
    }
}
