package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List_1 {
    public void listMethod() {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(500);
        System.out.println(l1);
        l1.addFirst(1);
        System.out.println("after adding");
        System.out.println(l1);
        l1.removeLast();
        System.out.println("after removing last element");
        System.out.println(l1);
        System.out.println("we are using iterator");
        ListIterator li = l1.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
    }

    public static void main(String[] args) {
        Linked_List_1 l2=new Linked_List_1();
        l2.listMethod();
    }
}
