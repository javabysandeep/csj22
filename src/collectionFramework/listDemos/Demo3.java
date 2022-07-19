package collectionFramework.listDemos;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List original = new ArrayList();
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(4);
        original.add(5);

        List removalList = new ArrayList();
        removalList.add(4);
        removalList.add(5);

        original.removeAll(removalList);
        System.out.println(original);
        System.out.println(removalList);

    }
}
