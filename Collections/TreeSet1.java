package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public void treeSET(){
        TreeSet<Object> t2=new TreeSet<>();
        t2.add(45);
        t2.add(12);
        t2.add(100);
        t2.add(34);
        t2.add(22);
        Iterator i1=t2.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }
    }

    public static void main(String[] args) {
        TreeSet1 t1=new TreeSet1();
        t1.treeSET();
    }
}
