package Inheritance;
class X{
    void parent(){
        System.out.println("Parent class");
    }
}


public class Single_Inheritance_1 extends X{

    void child_2(){
        System.out.println("Child 2");
    }
    public static void main(String[] args) {
    Single_Inheritance_1 si=new Single_Inheritance_1();
    si.parent();
    si.child_2();

    }
}
