package collectionFramework.iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {

        // it returns an unmodifable list
        List<Integer> integers = Arrays.asList(10, 203, 40, 50, 56);
        System.out.println(integers.remove(0));


        /*for (Integer i : integers) {
            System.out.println(i);
            if (i == 50) {
                integers.remove(i);
            }
        }*/
    }
}
