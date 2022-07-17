package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        List list = new ArrayList();
        //Elipsis operator
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5,6,7,8);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }

}
