import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

public class Searchfile {
    public static void main(String[] args){
        File directoryPath = new File("../");
        File[] files = directoryPath.listFiles();
        Scanner s= new Scanner(System.in);
        String str;
        do{
            System.out.println("Enter your regex");
            str= s.nextLine();
            for(File file : files) {
                if(Pattern.compile(str).matcher(file.getName()).find())
                    System.out.println(file.getAbsolutePath());
            }
        }while(!str.equals("end"));
    }
}

