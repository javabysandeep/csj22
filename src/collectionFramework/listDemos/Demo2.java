package collectionFramework.listDemos;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List integers = new ArrayList();
        integers.add(98);
        integers.add(918);
        integers.add(18);
        integers.add(38);
        integers.add(228);

        List list = new ArrayList();
        list.add("new elements appended ");
        list.addAll(0, integers);
        System.out.println(list);

        List removalList = new ArrayList();
        removalList.add(18);
        removalList.add(38);

        System.out.println("Whther 18 and 38 are present "+list.containsAll(removalList));
        System.out.println(list.removeAll(removalList));
        System.out.println("After deletion \n"+list);
    }
}
