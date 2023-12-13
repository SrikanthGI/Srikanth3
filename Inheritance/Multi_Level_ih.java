package Inheritance;
class S{
    void java(){
        System.out.println("Parent");
    }
}
class R extends S{
    void selinium(){
        System.out.println("child 1");
    }
}
public class Multi_Level_ih extends R{
void automation(){
    System.out.println("Child 2");
}

    public static void main(String[] args) {
        Multi_Level_ih ml=new Multi_Level_ih();
        ml.java();
        ml.selinium();
        ml.automation();
    }
}
