package Abstraction;
abstract class Bike{
    abstract void run();
    void some(){
        System.out.println("dhji");
    }
}
public class Honda extends Bike{
    void run(){
        System.out.println("run safely");
    }

    public static void main(String[] args) {
        Honda h=new Honda();
        h.run();
    }
}
