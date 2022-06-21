package oops.polymorphism;

import com.sun.org.apache.bcel.internal.generic.INEG;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add(100);
        hashSet.add(101);
        hashSet.add(102);
        hashSet.add(103);

        HashMap<Object, Object> hm = new HashMap<>();
        Object PRESENT = new Object();
        hm.put(100, PRESENT);
        hm.put(101, PRESENT);
        hm.put(102, PRESENT);
        hm.put(103, PRESENT);
    }
}
