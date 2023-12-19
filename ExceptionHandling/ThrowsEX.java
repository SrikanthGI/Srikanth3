package ExceptionHandling;

public class ThrowsEX {
    public static void main(String[] args) {
        ReadAndWrite raw=new ReadAndWrite();
        try{
            raw.readFile();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Srikanth");
    }
}
