package collectionFramework.setDemo;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // unique, homogeneous, sorted, no null
        Set<Integer> set = new TreeSet<>();
        System.out.println(set.add(10));
        System.out.println(set.add(20));
        System.out.println(set.add(5));
        System.out.println(set.add(7));
        System.out.println(set.add(10));

        System.out.println(set);
    }
}
