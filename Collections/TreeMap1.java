package Collections;

import java.util.TreeMap;

public class TreeMap1 {
    public void treeM(){
        TreeMap<Object,Object> t1=new TreeMap<>();
        t1.put(75,"fgav");
        t1.put(1,"Adfh");
        t1.put(23,"adsd");
        t1.put(74,"dsfdfv");
        System.out.println(t1);
        System.out.println(t1.keySet());
    }
    public static void main(String[] args) {
        TreeMap1 t1=new TreeMap1();
        t1.treeM();

    }
}
