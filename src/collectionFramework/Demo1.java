package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List list = new ArrayList();
//       final  Object[] objects = {"string",'a',10,30.5, true};
//        objects = new Object[10];
        list.add("string data");
        list.add("string data");
        list.add(null);
        list.add(null);
        list.add(10);
        list.add('A');
        list.add(true);

        System.out.println(list);
        System.out.println("Size of list "+list.size());
        System.out.println("List is empty"+list.isEmpty());
        System.out.println("Element is present 10 "+list.contains(10));
        System.out.println("Remove single element "+list.remove(0)+":  "+list);
        System.out.println("Remove single element "+list.remove("string data")+":  "+list);
        System.out.println(list.set(4,"true changed."));
        System.out.println(list);
        System.out.println("Get element "+list.get(3));

        List list2 = new ArrayList(100);
        System.out.println(list2.get(95));
    }
}
