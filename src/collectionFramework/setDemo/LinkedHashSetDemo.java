package collectionFramework.setDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        System.out.println(set.add(10));
        System.out.println(set.add(20));
        System.out.println(set.add(null));
        System.out.println(set.add(null));
        System.out.println(set.add(10));

        System.out.println(set);
    }
}
