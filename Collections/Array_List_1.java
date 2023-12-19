package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Array_List_1 {
    public void raj(){
        ArrayList<String> a1=new ArrayList<>();
        a1.add("josh");
        a1.add("anna");
        a1.add("seth");
        a1.add("DEV");
        a1.add("lilly");
        for (String s1:a1) {
            System.out.println(s1);
        }
        System.out.println("we are into list iterator");
        ListIterator l1=a1.listIterator();
        while(l1.hasNext()){
            System.out.println(l1.next());
        }

    }

    public static void main(String[] args) {
        Array_List_1 a2=new Array_List_1();
        a2.raj();
    }
}

