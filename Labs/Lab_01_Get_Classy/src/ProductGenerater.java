import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class ProductGenerater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Product> data = new ArrayList<>();

        boolean done = false;
        do{
//           String ID = SafeInput.getNonZeroLenString(in,"What is your ID [6 digits]") ;
//           String ID = SafeInput.getNonZeroLenString(in,"What is your product ID [6 digits]?") ;
           String Name = SafeInput.getNonZeroLenString(in,"What type of product is this?") ;
           String Description = SafeInput.getNonZeroLenString(in,"Give a description of the item.") ;
           double Cost = SafeInput.getDouble(in,"What is the the price of the product?") ;

            Product items = new Product(Name, Description, Cost);

            data.add(items);
            done = SafeInput.getYNConfirm(in,"Are you done adding data?");
            System.out.println();

        }while (!done);

        for (Product names:data){
            System.out.println(names.toCSVDataRecord());
        }

        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\src\\ProductTestData.txt");

        try
        {
            // Typical java pattern of inherited classes
            // we wrap a BufferedWriter around a lower level BufferedOutputStream
            OutputStream out = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));

            // Finally can write the file LOL!

            for(Product text : data)
            {
                String personData = text.toCSVDataRecord(); // Assuming toCSVDataRecord() returns a CSV string
                writer.write(personData, 0, personData.length());
                writer.newLine();

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
