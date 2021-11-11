import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class ReadProcessor extends MyFileProcessor{
    public void execute(){
        try{
            File file = new File("input.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                text += scan.nextLine() + "/n";
            }
            scan.close();
        } catch(FileNotFoundException exception){
            System.out.println("File was not found");
        }
    }
}
