package ExceptionHandling;

public class Finally_1 {
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


        finally {
            System.out.println("Srikanth");
        }
        System.out.println("4");
        System.out.println("5");
    }
}
