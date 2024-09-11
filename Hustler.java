package Hustler.com;

import java.io.FileWriter;
import java.io.IOException;

public class Hustler {
    public static void main(String[] args) {
        String filename = "hustler.txt";
        try(FileWriter writer= new FileWriter(filename);){
            writer.write("this is a java code\n");
            for(int i=0; i<=10; i++){
                writer.write("please follow my account\n");
            }
            writer.flush();
            System.out.println("file written successful");
        }catch (IOException exception){
            System.out.printf("Exception occurred %s\n", exception.getMessage());
        }
    }
}
