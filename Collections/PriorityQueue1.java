package Collections;

import java.util.PriorityQueue;

public class PriorityQueue1 {
    public void prqeMethod(){
        PriorityQueue<Integer> p1=new PriorityQueue<>();
        p1.add(3);
        p1.add(4);
        p1.add(1);
        p1.add(2);
        System.out.println(p1.peek());
        System.out.println("after using pool");
        System.out.println(p1.poll());
        System.out.println("after deleting");
        System.out.println(p1.peek());
    }
    public static void main(String[] args) {
        PriorityQueue1 p2=new PriorityQueue1();
        p2.prqeMethod();
    }
}


