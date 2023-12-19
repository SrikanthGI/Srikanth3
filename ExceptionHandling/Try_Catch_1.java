package ExceptionHandling;
//try catch
public class Try_Catch_1 {
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
            e.printStackTrace();
            System.out.println("try catch been used to handle exception");
        }
        System.out.println("5");
        System.out.println("6");
    }
}
