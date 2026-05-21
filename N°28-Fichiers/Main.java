import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.io.IOException;     


public class Main
{
    public static void main(String[] args) 
    {

        Path f = Paths.get("infos.txt");

        try
        {
            BufferedReader bfr = Files.newBufferedReader(f);

            bfr.skip(5);

            System.out.println(bfr.readLine()); //read pour juste un caractère

            bfr.close();
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