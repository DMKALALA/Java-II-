import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonGenerator {
    public static void main(String[] args) {
        ArrayList <String>data = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean done = false;

//        variables
        String person = "";
        String ID = "";
        String firstName ="";
        String lastName = "";
        String title = "";
        int YOB = 0;
        do{
           ID = SafeInput.getNonZeroLenString(in,"What is your ID [6 digits]") ;
           firstName = SafeInput.getNonZeroLenString(in,"What is your first name") ;
           lastName = SafeInput.getNonZeroLenString(in,"What is your last name") ;
           title = SafeInput.getNonZeroLenString(in,"What is your Title?") ;
           YOB = SafeInput.getRangedInt(in,"What is the date of your birth ",1800,3000) ;

           person = ID + ", " + firstName + ", " +lastName +", " + title +", "+ YOB ;

           data.add(person);

           done = SafeInput.getYNConfirm(in,"Are you done adding data?");
        }while (!done);

        for(String people:data){
            System.out.println(people);

        }
    }

}