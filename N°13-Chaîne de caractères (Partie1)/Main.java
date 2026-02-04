public class Main
{
    /*
        String : immuable (contenu non modifiable)
            > concat() -> plus rapide que "+"
            > length()
            > toUpperCase(), toLowerCase(), trim(), replace(<old>, <new)
            > charAt(<index>)
            > substring(<index>, <nbr>)
            > equals(<str>)
            > compareTo(<str>) //comparaison en code ASCII (différence)
    */

    public static void main(String[] args)
    {
        String s1 = new String("Hello !");       // -> String s1 = "Hello !";
        String s2 = "tout le monde !";
        String s3 = "     space     ";

        System.out.println(s1);
        s1 = "Bonjour";
        System.out.println(s1);

        System.out.println("----------------");

        System.out.println(s1 + " " + s2);
        System.out.println(s1.concat(" ").concat(s2));      // -> une variante de l'affichage précédente

        System.out.println("----------------");

        System.out.println(s1.length() + s2.length());     

        System.out.println("----------------");

        System.out.println(s1.toUpperCase() + " " + s1.toLowerCase());      

        System.out.println(s3.trim());  

        System.out.println("----------------");    

        System.out.println(s1.replace("o","z") + " " + s1.replace("Bonjour","Bye"));  

        System.out.println(s1.charAt(2));  

        System.out.println(s1.substring(3, 4));    

        System.out.println("----------------");

        System.out.println(s1.equals(s2));

        
    }
}