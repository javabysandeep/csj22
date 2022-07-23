package collectionFramework.mapDemo;

import java.util.HashMap;

public class Demo1 {
    public static void main(String[] args) {
        String str = "cyber success training institute";
        str = str.trim().replace(" ", "");
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (Character ch : str.toCharArray()) {
            if (charCount.containsKey(ch)) {
                charCount.put(ch, charCount.get(ch) + 1);
            } else {
                charCount.put(ch, 1);
            }
        }
        System.out.println(charCount);

    }
}
