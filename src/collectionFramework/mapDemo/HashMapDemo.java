package collectionFramework.mapDemo;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap<>();
        hashMap.put(null,null);
        hashMap.put(null,"null updated");
        hashMap.put(11,null);
        hashMap.put("two","Sachin");
        hashMap.put(3,"Sachin");
        hashMap.put(4,"Sachin");
        System.out.println(hashMap);
    }
}
