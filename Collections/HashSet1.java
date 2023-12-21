package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public void hMethod(){
        HashSet<Object> h2=new HashSet<>();
        h2.add("java");
        h2.add(401);
        h2.add("python");
        h2.add(420);
        h2.add("C");
        Iterator i1=h2.iterator();
        while (i1.hasNext()){ //hasnext() checks for next element present or not , if there is no next element it doesn't enter into the loop
            System.out.println(i1.next());
        }
    }

    public static void main(String[] args) {
        HashSet1 h1=new HashSet1();
        h1.hMethod();
    }
}
