package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHasSet1 {
    public void linkedHSet(){
        LinkedHashSet<Object> l2=new LinkedHashSet<>();
        l2.add(178951);
        l2.add(9725);
        l2.add(78461);
        l2.add(7423);
        l2.add(789124);
        Iterator i1=l2.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }
    }

    public static void main(String[] args) {
        LinkedHasSet1 l1=new LinkedHasSet1();
        l1.linkedHSet();
    }
}
