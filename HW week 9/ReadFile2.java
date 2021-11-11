import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile2 {                    //task2
    public static void main(String[] args){
        boolean t = true, t1 = true;
        try{
            File file = new File("input1.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
            }
            scan.close();
            t1 = false;
        } catch(FileNotFoundException exception){
            t = false;
            try{
                File file2 = new File("input2.txt");
                Scanner scan2 = new Scanner(file2);
                while(scan2.hasNextLine()){
                    String line = scan2.nextLine();
                    System.out.println(line);

                }
                scan2.close();
                t1 = true;
            } catch(FileNotFoundException exception2){
                t1 = false;
            }

        } finally {
            if(t){
                System.out.println("First file was found");
            } else if(t1){
                System.out.println("Second file was found");
            } else{
                System.out.println("Files were not found");
            }
        }
    }
}
