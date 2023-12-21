package Collections;

import java.util.LinkedList;

public class Stack_1 {
    public void stackMethod(){
        LinkedList<Integer> l1=new LinkedList<>();
        l1.push(10);
        l1.push(20);
        l1.push(30);
        l1.push(40);
        System.out.println(l1);
        System.out.println("after using pop method");
        System.out.println(l1.pop());
    }

    public static void main(String[] args) {
        Stack_1 s=new Stack_1();
        s.stackMethod();
    }
}
