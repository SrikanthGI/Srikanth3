package Collections;

import java.util.ArrayList;

public class ArrayList2 {
    public void aMethod(){
        ArrayList<Object> a1=new ArrayList<>();
        a1.add(274356);
        a1.add("khdfsjg");
        a1.add(5423);
        for (Object s1:a1) {
            System.out.println(s1);
        }
    }
    public static void main(String[] args) {
        ArrayList2 a2=new ArrayList2();
        a2.aMethod();
    }
}
