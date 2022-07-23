package collectionFramework.mapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        HashMap hashMap = new LinkedHashMap();
        hashMap.put(null,null);
        hashMap.put(null,"null updated");
        hashMap.put(11,null);
        hashMap.put("two","Sachin");
        hashMap.put(3,"Sachin");
        hashMap.put(4,"Sachin");
        System.out.println(hashMap);
    }
}
