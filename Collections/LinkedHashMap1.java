package Collections;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {
public void hashMap(){
    LinkedHashMap<Object,Object> lh=new LinkedHashMap<>();
    lh.put(123,"dfsgfg");
    lh.put(143,"ssvzfsfs");
    lh.put(54,"hjfgag");
    System.out.println(lh.values());
    System.out.println(lh);
    System.out.println(lh.keySet());
    lh.put(1,"java");
    lh.put(1,"java");
    lh.put(1,"java");
    System.out.println(lh);
    System.out.println(lh.values());
    System.out.println(lh.keySet());
}

    public static void main(String[] args) {
        LinkedHashMap1 lh1=new LinkedHashMap1();
        lh1.hashMap();
    }
}
