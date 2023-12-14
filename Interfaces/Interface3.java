package Interfaces;
interface vehicle{
    void bike();
    String name="Duke";
}interface cost extends vehicle{
    void prize();
    int i=200000;
}
interface model extends cost{
    void year();
    int y=2023;
}
class Love implements model{
    @Override
    public void bike() {
      System.out.println("vehicle : "+name);
    }

    @Override
    public void prize() {
        System.out.println("Cost is : "+i);
    }

    @Override
    public void year() {
        System.out.println("year is : "+y);
    }
}
public class Interface3 {
    public static void main(String[] args) {
        Love l=new Love();
        l.bike();
        l.prize();
        l.year();
    }
}
