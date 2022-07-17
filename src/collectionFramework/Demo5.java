package collectionFramework;

import java.util.*;

public class Demo5 {
    public static void main(String[] args) {
        List<Integer> list = new Stack<>();
        list.add(10);
        list.add(2);
        list.add(30);
        list.add(4);
       // list.add("string can also added");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
