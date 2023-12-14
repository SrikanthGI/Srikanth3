package Encapsulation;
class Test{
    float F;

    public void setF(float f) {
        this.F = f;
    }

    public float getF() {
        return F;
    }
}
public class Program_4 {
    public static void main(String[] args) {
        Test t=new Test();
        t.setF(1234.54f);
        System.out.println(t.getF());
    }
}
