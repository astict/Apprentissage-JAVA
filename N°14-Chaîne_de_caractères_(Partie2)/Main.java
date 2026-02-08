import java.util.StringTokenizer;        //Pour spliter ma chaîne de caractère

public class Main
{
    public static void main(String[] args)
    {
        String s = "new/titre-de-la-news/14";
        StringTokenizer st = new StringTokenizer(s, "/");
        //StringTokenizer st = new StringTokenizer(s, "/",true);    -->     pour récupérer les " / "

        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }

        System.out.println("----------------------");

        /*
            StringBuilder / StringBuffer : muable (contenu modifiable)
                > length(), capacity()
                > append(<str>), insert(<index>, <str>)
        */

        StringBuilder sBuilder = new StringBuilder();

        System.out.println(sBuilder.length());      
        System.out.println(sBuilder.capacity());    // capacité : 16 par défault

        /*
        sBuilder.append("Bonjour");
        System.out.println(sBuilder);
        sBuilder.append(" tout le monde");
        System.out.println(sBuilder);
        */

        sBuilder.append("tout le monde");
        System.out.println(sBuilder);
        sBuilder.insert(0,"Bonjour ");
        System.out.println(sBuilder);

        System.out.println("----------------------");

        /*
            StringBuilder (asynchrone)
                Monothreadé : 1 seul thread
            
            StringBuffer (synchronisée, thread-safe)
                Multi-threadé : plusieurs threads
        */

        
    }
}