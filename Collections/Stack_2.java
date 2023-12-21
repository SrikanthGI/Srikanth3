package Collections;

import java.util.LinkedList;

public class Stack_2 {
    public void sMethod(){
        LinkedList<Object> L1=new LinkedList<>();
        L1.push("hii");
        L1.push(100);
        L1.push("hello");
        L1.push(200);
        L1.push("bye");
        System.out.println(L1);
        System.out.println("After Using Pop method");
        System.out.println(L1.pop());
    }

    public static void main(String[] args) {
        Stack_2 s2=new Stack_2();
        s2.sMethod();
    }
}
