public class MyFileProcessor{
    static String text = "";
    public MyFileProcessor(){}
    public static void main(String[] args){
        ReadProcessor read = new ReadProcessor();
        WriteProcessor write = new WriteProcessor();
        read.execute();
        try{
            write.execute();

        } catch(MyIllegalStateException execute){
            System.out.println("Some exception:");
        }
    } public void execute() throws MyIllegalStateException{
        throw new MyIllegalStateException("illegal exception");
    }
}