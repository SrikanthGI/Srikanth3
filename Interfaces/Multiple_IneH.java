package Interfaces;
interface X{
    void a();
}
interface Y{
    void b();
}
class Main implements X,Y{
    @Override
    public void a() {
        System.out.println("method a is executed");
    }

    @Override
    public void b() {
        System.out.println("method b is executed");
    }
}
public class Multiple_IneH {
    public static void main(String[] args) {
        Main m=new Main();
        m.a();
        m.b();
    }
}
