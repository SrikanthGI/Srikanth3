package Abstraction;
abstract class Dog{
    abstract void breed();
    void animal(){
        System.out.println("name of the animal : Dog");
    }
}
public class Animal extends Dog{
    void breed(){
        System.out.println("Breed : Lab");
    }

    public static void main(String[] args) {
        Animal a=new Animal();
        a.animal();
        a.breed();
    }
}
