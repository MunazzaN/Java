package customexceptions;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadAndPrint {
    public static void main(String[] args){
        String fileName = "C:\\Users\\Munazza\\Documents\\Git\\JavaCore\\src\\main\\java\\example.txt";
        try (Scanner br = new Scanner(new FileReader(fileName))) {
            String line;
            while ((line = br.nextLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }


///failed scenario
        String fileName1 = "example.txt";
        try (Scanner br1 = new Scanner(new FileReader(fileName1))) {
            String line;
            while ((line = br1.nextLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File not found : "+e.getMessage() );
        }
    }

}