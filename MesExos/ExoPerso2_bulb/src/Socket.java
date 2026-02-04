public class Socket
{
    private final static int TAILLE_MAX_SOCKET = 5;

    private int nbrSocket;
    private int couting_bulbs = 0;

    public int nbrSocket(Bulb[] bulbs)
    {
        for(int i = 0; i < bulbs.length; i++)
        {
            couting_bulbs++;

            if(couting_bulbs >= TAILLE_MAX_SOCKET)
            {
                nbrSocket++;
            }
        }
        return nbrSocket;
    }
}