package challenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileRTeader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the file");
        String filename = sc.next();
        try (FileReader  reader = new FileReader(filename)){
            int read;
            while((read = reader.read()) !=-1){
                System.out.println((char)read);
            }
        }
        catch(FileNotFoundException  exception){
            System.out.printf("%s file not file exception");

        }catch(IOException exception){
            System.out.printf("exception occuerd %s", exception);
        }
    }
}
