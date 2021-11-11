import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {     //task 1
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
            }
            scan.close();
        } catch(FileNotFoundException ex) {
            System.out.println("File not found.");
        }
    }
}

    

