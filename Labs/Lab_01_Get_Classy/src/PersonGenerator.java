
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;
public class PersonGenerator {



        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            ArrayList<Person> data = new ArrayList<>();

            boolean done = false;
            do{
//              String ID = SafeInput.getNonZeroLenString(in,"What is your ID [6 digits]") ;
                String firstName = SafeInput.getNonZeroLenString(in,"What is your first name") ;
                String lastName = SafeInput.getNonZeroLenString(in,"What is your last name") ;
                String title = SafeInput.getNonZeroLenString(in,"What is your Title?");
                int YOB = SafeInput.getRangedInt(in,"What is the date of your birth ",1000,3000) ;

                Person person = new Person(firstName, lastName, title, YOB);

                data.add(person);
                done = SafeInput.getYNConfirm(in,"Are you done adding data?");
                System.out.println();

            }while (!done);

            for (Person names:data){
                System.out.println(names.toCSVDataRecord());
            }



            File workingDirectory = new File(System.getProperty("user.dir"));
            Path file = Paths.get(workingDirectory.getPath() + "\\Labs\\Lab_01_Get_Classy\\PersonTestData.txt");

            try
            {
                // Typical java pattern of inherited classes
                // we wrap a BufferedWriter around a lower level BufferedOutputStream
                OutputStream out = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));

                // Finally can write the file LOL!

                for(Person text : data)
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

