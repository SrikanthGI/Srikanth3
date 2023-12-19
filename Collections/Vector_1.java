package Collections;

import java.util.Vector;

public class Vector_1 {
    public void vecMethod(){
        Vector<Object> v1=new Vector<>();
        v1.add("tiger");
        v1.add(2);
        v1.add("lion");

        System.out.println(v1);
        System.out.println("the capacity is : "+v1.capacity());
        System.out.println("the size is : "+v1.size());

    }

    public static void main(String[] args) {
        Vector_1 v2=new Vector_1();
        v2.vecMethod();
    }
}
