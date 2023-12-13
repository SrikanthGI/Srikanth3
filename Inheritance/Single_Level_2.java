package Inheritance;
class Animal{
    void dog(){
        System.out.println("Animal : Dog");
    }
}

public class Single_Level_2 extends Animal{
    void lab(){
        System.out.println("Breed is : lab");
    }

    public static void main(String[] args) {
        Single_Level_2 sl=new Single_Level_2();
        sl.dog();
        sl.lab();
    }
}
