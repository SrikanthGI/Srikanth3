package Collections;

import java.util.LinkedList;

public class LinkedList2 {
    public void lList(){
        LinkedList<Object> l1=new LinkedList<>();
        l1.add("sajd");
        l1.add("hjsvdf");
        l1.add(125);
        System.out.println(l1);
        l1.addFirst("hiiiiii");
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);
    }
    public static void main(String[] args) {
        LinkedList2 l2=new LinkedList2();
        l2.lList();
    }
}
