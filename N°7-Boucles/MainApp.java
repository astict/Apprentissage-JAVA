public class MainApp
{
    public static void main(String[] args)
    {
        final int MAX = 4;

        for(int i = 0; i < MAX; i++)
        {
            System.out.println(i);

            if(i >= 1)
                break;
        }
    }
}