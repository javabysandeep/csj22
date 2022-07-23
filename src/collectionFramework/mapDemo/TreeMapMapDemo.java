package collectionFramework.mapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapMapDemo {
    public static void main(String[] args) {
        Map map = new TreeMap();
        map.put(11,null);
       // map.put("two","Sachin");
        map.put(3,"Sachin");
        map.put(4,"Sachin");
        System.out.println(map);
    }
}
