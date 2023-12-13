package Inheritance;
class A{
    void execute(){
        System.out.println("this is parent class");
    }
}
class B extends A{
    void output(){
        System.out.println("this is child class 1");
    }
}
public class Hierarical_Inheritance_1 extends A{
void publish(){
    System.out.println("this is child 2");
}
    public static void main(String[] args) {
Hierarical_Inheritance_1 hi=new Hierarical_Inheritance_1();
hi.execute();
hi.publish();
    }
}
