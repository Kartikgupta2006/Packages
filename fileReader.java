package Hustler.com;

import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) {
        String filename = "hustler.txt";


        try(FileReader reader = new FileReader(filename)){
            int read =0;
            do{
                read = reader.read();
                System.out.print((char)read);
            }while(read !=-1);


        }catch (IOException exception){
            System.out.printf("Exception %s", exception.getMessage());
       }

    }
}
