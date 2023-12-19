package ExceptionHandling;

import java.io.FileNotFoundException;

public class Try_Catch_Catch_Finally {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        try {
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Exception handled");
        }

        catch (Exception p){    //exception class is parent of checked and unchecked exception

            System.out.println(p.getMessage());
        }
       /* catch (ArithmeticException e){ //it shows error because of after parent class exception we can't use child class exception.
            e.printStackTrace();
            System.out.println("Exception handled");
        }

        */
        finally {
            System.out.println("Srikanth");
        }
        System.out.println("4");
        System.out.println("5");
    }
}
