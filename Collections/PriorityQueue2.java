package Collections;

import java.util.PriorityQueue;

public class PriorityQueue2 {
    public void prMethod(){
        PriorityQueue<String> p1=new PriorityQueue<>();
        p1.add("hifuad");
        p1.add("adshgf");
        p1.add("Hi");
        p1.add("habasdu");
        System.out.println(p1.peek());
        System.out.println("after using pool");
        System.out.println(p1.poll());
        System.out.println("after deleting");
        System.out.println(p1.peek());
    }
    public static void main(String[] args) {
        PriorityQueue2 p2=new PriorityQueue2();
        p2.prMethod();
    }
}
