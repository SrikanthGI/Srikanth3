package Polymorphism;
class A{
    void run(){
        System.out.println("this is 1st method");
    }
}

public class Ovar_Riding_1 extends A{
    void run()
    {
        System.out.println("this is overrided method");
    }

    public static void main(String[] args) {
        Ovar_Riding_1 or=new Ovar_Riding_1();
        or.run();
    }
}
