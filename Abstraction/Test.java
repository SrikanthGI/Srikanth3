package Abstraction;
abstract class A{
    abstract void abmethod();
    void test(){
        System.out.println("normal method in abstract class");
    }
}

public class Test extends A{
    @Override
    void abmethod() {
        System.out.println("implementation of abstract method");
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.test();
        t.abmethod();
    }
}
