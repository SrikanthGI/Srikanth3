package Inheritance;
class Student{
    void name(){
        System.out.println("name : Ajay");
    }
}
class Study extends Student{
    void education(){
        System.out.println("Education : Btech");
    }
}
public class Hierarical_2 extends Student{
    void roll_no(){
        System.out.println("Roll no : 402");

    }

    public static void main(String[] args) {
        Hierarical_2 h2=new Hierarical_2();
        h2.name();
        h2.roll_no();

    }
}
