import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class task1{
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("input.txt");
        Scanner scan = new Scanner(file);
        HashMap<String, Integer> hs = new HashMap<>();
        PrintWriter writer = new PrintWriter("output.txt");
        while(scan.hasNextLine()){
            Scanner scan1 = new Scanner(scan.nextLine());
                while(scan1.hasNext()) {
                    String s = scan1.next();
                    if(hs.containsKey(s)) {
                        hs.put(s, hs.get(s) + 1);
                    } else {
                        hs.put(s, 1);
                    }
                }
            }
            scan.close();
            for(Map.Entry entry: hs.entrySet()) {
                System.out.println(entry);
            }
            writer.close();
        } 
    }   

      