import jc.entities.*;

public class Main
{

    public static void main(String[] args)
    {
        /* --- CHALET --- */
        Cottage c = new Cottage();
        c.build("bois");

        /* --- BATEAU --- */
        Ship s = new Ship();
        s.moveXY(146, 97);

        /* --- PLANEUR --- */
        Glider g = new Glider();
        g.moveXY(80, 23);
        g.fly("Carbone");
        g.test();
    }
}