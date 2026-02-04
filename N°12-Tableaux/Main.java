import java.util.Arrays;

public class Main
{
    public static void printTab(int[][] tab)
    {
        for(int i = 0; i < tab.length; i++)
        {
            for(int j = 0; j < tab[i].length; j++)
            {
                System.out.print(tab[i][j] + " ");
            }
        System.out.println();
        }
    }

    public static void main(String[] args)
    {


        /*------------------------- TABLEAUX 1D -------------------------*/

        int tab[] = new int[]{1,2,3}; //Déclaration d'un tableau d'entier qui contient 3 "int" 

        //int[] tab = new int[]{1,2,3,4};
        //int[] tab = {1,2,3,4};

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


        /*------------------------- TABLEAUX 2D -------------------------*/ System.out.println("---------");

        int[][] tableau = 
        {
            {1,2,3},
            {4,5,6}
        };

        //int[][] tableau = new int[2][3];

        System.out.println(tableau[1][1]);

        System.out.println("---------");

        /*

        for (int i = 0; i < tableau.length; i++) 
        {
            for (int j = 0; j < tableau[i].length; j++) 
            {
                System.out.print(tableau[i][j] + " ");
            }

        System.out.println();

        }

        */


        /*
        for(int[] i : tableau)
        {
            for(int number : i)
            {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        */

        printTab(tableau);

        /*------------------------- BONUS -------------------------*/ System.out.println("---------");

        System.out.println(tableau.toString());     //méthode d'affichage 

        int[] tablo = new int[5];

        Arrays.fill(tablo,15);

        for(int i : tablo)
            System.out.println(i);
    }
}