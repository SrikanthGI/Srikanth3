package Inheritance;
class S1{
    void name(){
     System.out.println("name of the student : RAJ");
    }
}
class S2 extends S1{
    void study(){
        System.out.println("Btech");
    }
}
public class Multi_Level_2 extends S2{
    void roll_no(){
        System.out.println("Roll no : 31");
    }

    public static void main(String[] args) {
        Multi_Level_2 m1=new Multi_Level_2();
        m1.name();
        m1.study();
        m1.roll_no();
    }
}
