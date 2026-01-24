public class MainApp
{
    public static void main(String[] args)
    {
        int value = 45;

        if(value == 24 || value == 18)
        {
            System.out.println("oui !");
        }
        else if(value > 24)
        {
            System.out.println("plus grand !");
        }
        else
        {
            System.out.println("non !");
        }


        System.out.println("---------------");
        /*--------------------------------------------------------*/

        int choice = 1;
        //String choice = "q";

        System.out.println("Entrer le numéro de l'option choisi :\n");

        System.out.println("Option 1 : Afficher le prénom");
        System.out.println("Option 2 : Afficher l'age");
        System.out.println("Option 3 : Afficher la ville");

        //System.out.println("\n(q) pour quitter !");

        switch(choice)
        {
            case 1:
                System.out.println("\nAlbert");
                break;

            case 2:
                System.out.println("\n45 ans");
                break;

            case 3:
                System.out.println("\nCheminas");
                break;

            /* Possible si 'option' est un string

            case "q":
                System.out.println("\nAucune option choisit ...");
                break;

            */
            
            default:
                break;
        }


        System.out.println("---------------");
        /*--------------------------------------------------------*/

    }
}