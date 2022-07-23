package collectionFramework.iteration;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
        integers.add(50);

        //way1 : iterate
        for (int index = 0; index < integers.size(); index++) {
            if(integers.get(index)==30){
                integers.remove(index);
            }
            System.out.println(integers.get(index));
        }
        // way 2: for each way
        System.out.println("for each way");
        for (int i:integers) {
            System.out.println(i);
        }

        // way 3: java 8 way foreach
        System.out.println("java 8 way ");
        integers.forEach(System.out::println);

        //way 4: Iterator
        System.out.println("Iterator way");
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("List Iterator way");
        ListIterator<Integer> integerListIterator = integers.listIterator();
        while (integerListIterator.hasNext()){
            System.out.println(integerListIterator.next());
        }
    }
}
