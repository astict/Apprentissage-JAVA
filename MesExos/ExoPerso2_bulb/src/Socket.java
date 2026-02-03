public class Socket
{
    private static final int ERROR = -1;
    private static final int SOCKET_MAX_BULB = 5;

    public int countSockets(Bulb[] bulbs)
    {
        if (bulbs == null)
            return ERROR;

        int bulbCount = 0;

        for (int i = 0; i < bulbs.length; i++)
        {
            if (bulbs[i] != null)
                bulbCount++;
        }

        return (bulbCount + SOCKET_MAX_BULB - 1) / SOCKET_MAX_BULB;
    }
}
