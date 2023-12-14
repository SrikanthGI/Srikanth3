package Interfaces;
interface animal{
    void dog();
    String s="DOG";
}
interface breed extends animal{
    void name();
    String n="LABRADOR";
}
interface age extends breed{
    void years();
    int a=12;
}
class mine implements animal,breed,age{
    @Override
    public void dog() {
        System.out.println("Animal is : "+s);

    }

    @Override
    public void name() {
        System.out.println("Breed is : "+n);
    }

    @Override
    public void years() {
        System.out.println("Age is : "+a+" years");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        mine m=new mine();
        m.dog();
        m.name();
        m.years();
    }
}
