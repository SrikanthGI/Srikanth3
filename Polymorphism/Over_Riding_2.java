package Polymorphism;
class Duke{
    void speed(){
        System.out.println("faster then pulser");
    }
}
public class Over_Riding_2 {
    void speed(){
        System.out.println("pulser is slower then Duke");
    }

    public static void main(String[] args) {
        Over_Riding_2 or2=new Over_Riding_2();
        or2.speed();
    }
}
