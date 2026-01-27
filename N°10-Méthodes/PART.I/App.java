public class App
{
    public static void main(String[] args)
    {
        //prog();
        //prog();

        //System.out.println(getNumberTwo());
        int number = getNumberTwo();
        System.out.println(number);

        String nbr = getNumber();
        System.out.println(nbr);
    }

    public static void prog()
    {
        System.out.println("Bonjour !");
        System.out.println("Comment ca va ?");
        System.out.println("Moi bien");
    }

    public static int getNumberTwo()
    {
        return 2;
    }

    public static String getNumber()
    {
        boolean info = true;

        if(info)
            return "hello";
        else 
            return "bye";
    }

}