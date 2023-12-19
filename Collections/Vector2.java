package Collections;

import java.util.Vector;

public class Vector2 {
    public void vMethod(){
        Vector<Integer> v1=new Vector<Integer>();
        v1.add(2245);
        v1.add(32656);
        v1.add(45234);
        v1.addElement(236235);

        System.out.println(v1);
        System.out.println("Capacity is : "+v1.capacity());
        System.out.println("size is : "+v1.size());
    }

    public static void main(String[] args) {
        Vector2 v2=new Vector2();
        v2.vMethod();
    }
}
