package ExceptionHandling;

public class Try_Catch_3 {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        try{
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){

            System.out.println(e.toString());
        }
        System.out.println("5");
        System.out.println("6");
    }
}
