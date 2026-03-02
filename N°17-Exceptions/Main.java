import java.util.*;
// import java.util.Scanner;
// import java.util.InputMismatchException;

public class Main
{
    public static void main (String[] main)
    {
        Scanner sc = new Scanner(System.in); 

        try
        {
            System.out.print("Annee de naissance : ");
            int yearOfBirth = sc.nextInt();
            System.out.println(yearOfBirth);
        }

        catch(InputMismatchException e)
        { System.out.println("La date de naissance est incorrecte."); }
        catch(Exception e)
        { System.out.println("La date de naissance est incorrecte."); }

        /* --- AFFICHER LA PILE D'ERREUR --- */
        /*
        catch(InputMismatchException e) 
        { e.printStackTrace(); }
        
        /* --- AFFICHER ERREUR + null --- */
        /*
        catch(InputMismatchException e) 
        { System.out.println("ERREUR : " + e.getMessage()); }
        */

        finally  
        {
            System.out.println("ok");
        }
    }
}