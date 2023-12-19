package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finally_2 {
    public static void main(String[] args) throws IOException {
        FileInputStream a=null;
        try {
            a=new FileInputStream("C:\\Users\\hr");

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        finally {
            if (a!=null){
                a.close();
            }
            System.out.println("file is closed");
        }
        String name=null;
        System.out.println(name.length());

    }
}
