import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class ProductWriter {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean done = false;

//        variables
        String person = "";
        String ID = "";
        String Name ="";
        String Description = "";
        double Cost = 0;
        do{
            ID = SafeInput.getNonZeroLenString(in,"What is your ID [6 digits]") ;
            Name = SafeInput.getNonZeroLenString(in,"What is your first name") ;
            Description = SafeInput.getNonZeroLenString(in,"Give a description of the item") ;
            Cost = SafeInput.getDouble(in,"What is the the price of the object ") ;

            person = ID + ", " + Name + ", " +Description +", " + Cost;

            data.add(person);

            done = SafeInput.getYNConfirm(in,"Are you done adding data?");
        }while (!done);

//        for(String people:data){
//            System.out.println(people);
//
//        }

        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\Labs\\Lab01_Practicum\\Practicum\\src\\ProductTestData.txt");

        try
        {
            // Typical java pattern of inherited classes
            // we wrap a BufferedWriter around a lower level BufferedOutputStream
            OutputStream out = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));

            // Finally can write the file LOL!

            for(String text : data)
            {
                writer.write(text, 0, text.length());  // stupid syntax for write rec
                // 0 is where to start (1st char) the write
                // rec. length() is how many chars to write (all)
                writer.newLine();  // adds the new line

            }
            writer.close(); // must close the file to seal it and flush buffer
            System.out.println("Data file written!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
