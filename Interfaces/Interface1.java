package Interfaces;

interface A{
    void sum();
int a=10;
int b=20;
}
interface B extends A{
    void diff();

}
class MyClass implements A,B{
    @Override
    public void sum() {
       int sum=a+b;
      System.out.println("SUM is : "+sum);
    }
    @Override
    public void diff() {
        int diff=a-b;
        System.out.println("DIFF is : "+diff);
    }
}

public class Interface1 {

    public static void main(String[] args) {
        MyClass mc=new MyClass();
        mc.sum();
        mc.diff();
    }
}
