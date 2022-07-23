package collectionFramework.mapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();
        students.put(1,"Ganesh");
        students.put(11,"Nikhil");
        students.put(12,"Gaurav");
        students.put(3,"Amol");
        students.put(4,"Deepak");
        System.out.println(students.containsValue("Ganesh"));
        System.out.println(students.containsKey(11));
//        students.clear();
        System.out.println("Size of map "+students.size());
        System.out.println(students.remove(11));
        System.out.println(students.isEmpty());
        System.out.println(students);

    }
}
