public class Main
{
    public static void main(String[] args)
    {


        /*------------------------- TABLEAUX 1D -------------------------*/

        int tab[] = new int[]{1,2,3}; //Déclaration d'un tableau d'entier qui contient 3 "int" 

        

        //int[] tableau_test = new int[]{1,2,3,4};
        //int[] tableau_test_test = {1,2,3,4};

        //System.out.println(tab);    //Référence vers le tableau 




        /*
        for(int i = 0; i < tab.length; i++)
        {
            System.out.println(tab[i]);
        }
        */

        for(int number : tab)
        {
            System.out.println(number);
        }


        /*------------------------- TABLEAUX 2D -------------------------*/System.out.println("---------");

        int[][] tableau = 
        {
            {1,2,3},
            {4,5,6}
        };

        //int[][] tableau = new int[2][3];

        System.out.println(tableau[1][1]);




    }
}