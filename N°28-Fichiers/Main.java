import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException; 
import java.nio.file.StandardOpenOption;
import java.nio.charset.Charset;

import java.io.BufferedReader;
import java.io.BufferedWriter;

    
/*
    StandardOpenOption --> TRUNCATE_EXISTING , CREATE , CREATE_NEW , APPEND , DELETE_ON_CLOSE
*/

public class Main
{
    public static void main(String[] args) 
    {

        Path f = Paths.get("infos.txt");
        System.out.println(Files.exists(f));

        //Path fbis = Paths.get("infoBIS.txt"); --> Création d'un fichier
        //Path dir = Paths.get("Machin");  --> Création d'un répertoire

        /*
        System.out.println(Files.isDirectory(f));
        System.out.println(Files.isRegularFile(f));
        
        Charset c = Charset.forName("UTF-8");
        StandardOpenOption mode = StandardOpenOption.APPEND;
        */

        Path dir = Paths.get("Machin");
        Path fileDestination = dir.resolve("newFile.newTruc");

        try
        {
            Files.deleteIfExists(f);

            //Files.move(f, fileDestination); --> Déplace le fichier infos.txt dans le dossier "Machin" tout en le renommant
            //Files.createFile(fbis);
            //Files.createDirectory(dir);

            /*
            BufferedReader bfr = Files.newBufferedReader(f);

            bfr.skip(5);  --> skip les 5 premiers caractères de la ligne 
            System.out.println(bfr.read());
            System.out.println(bfr.readLine());
            */



            /*
            BufferedWriter bfw = Files.newBufferedWriter(f,c,mode);
            String s = "Bonjour!";

            bfw.write('.');
            bfw.newLine();
            bfw.write("Bonjour!");
            bfw.newLine();
            bfw.write(s,2,5);
            
            bfw.close();
            */
        }

        catch(IOException e) 
        { 
            System.out.println("IOException : " + e.getMessage()); 
        }
        catch(Exception e) 
        { 
            System.out.println("Exception : " + e.getMessage()); 
        }

    }
}