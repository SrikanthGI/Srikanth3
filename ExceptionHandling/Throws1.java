package ExceptionHandling;

public class Throws1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("sleep");
        Thread.sleep(1000);
        System.out.println("Awake");
    }
}
