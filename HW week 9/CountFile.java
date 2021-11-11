import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import java.io.File;

public class CountFile {                           //task 3
    public static void main(String[] args){
        try{
            File file = new File("input3.txt");
            Scanner scan = new Scanner(file);
            int count_lines = 0, count_words = 0;
            PrintWriter writer = new PrintWriter("output.txt");
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                count_lines++;
                String[] splitt = line.split(" ");
                count_words += splitt.length;
            }
            writer.write("Number of lines: " + count_lines + "\nNumber of words: " + count_words);
            scan.close();
            writer.close();
        } catch(FileNotFoundException exception){
            System.out.println("File was not found");
        }
    }
}
