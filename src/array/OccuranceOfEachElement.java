package array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfEachElement {
    public static void main(String[] args) {
        int[] array = {10, 43, 21, 9, 9, 437, 31, 321, 3, 4};
        Map<Integer, Integer> hashMap = new LinkedHashMap<>();
        for (int index = 0; index < array.length; index++) {
            if (hashMap.containsKey(array[index])) {
                hashMap.put(array[index], hashMap.get(array[index]) + 1);
            } else {
                hashMap.put(array[index], 1);
            }
        }
        System.out.println(hashMap);

    }
}
