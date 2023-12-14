package Encapsulation;
class Demo{
    String s;

    public void setS(String s) {
        this.s = s;
    }
    public String getS(){
        return s;
    }
}
public class Program_3 {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.setS("Innovapath");
        System.out.println(d.getS());
    }
}
