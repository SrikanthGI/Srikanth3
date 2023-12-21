package Collections;

import java.util.HashMap;

public class HashMap1 {
    public  void hmMethod(){
        HashMap<Integer,String> h1=new HashMap<>();
        h1.put(10,"ghajd");
        h1.put(45,"sdfg");
        h1.put(432,"wrewe");
        System.out.println(h1);
        System.out.println(h1.keySet());
        System.out.println(h1.values());
    }

    public static void main(String[] args) {
        HashMap1 h2=new HashMap1();
        h2.hmMethod();
    }
}
