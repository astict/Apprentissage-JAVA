/*
    BufferedReader              -> synchrone 
                                   thread-safe
                                   lecture de chaîne de caractère (String)
                                   tampon de 8192 caractères

            - read() : lire un caractère
            - readLine() : lire une chaîne 
            - skip(N) : ignore N caractères


--------------------------------------------------------------------------------------------------------------------------

    
    Scanner                     -> asynchrone
                                   not thread-safe
                                   lecture de donnée + parsing 
                                   tampon de 1024 caractères
            
            - nextLine()
            - nextChar()
            - nextByte()
            - nextFloat()
            - nextDouble()
            - nextInt()
            - nextBoolean()
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception 
    {
        /*--- BufferedReader ---*/

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.print("Comment t'appelles-tu ? ");
        String name = br.readLine();

        System.out.println(name);

        

        /*--- Scanner ---*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Acceder a quel niveau ? ");
        int game_level = sc.nextInt();

        System.out.println(game_level);


    }
}