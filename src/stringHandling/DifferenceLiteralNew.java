package stringHandling;

public class DifferenceLiteralNew {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = new String("abc");
        String str4 = new String("abc");
        String str5 = "abc";
        // how many objects are created? 5 objects
        // where objects are created?
        // Four in HEAP and One in SCP
    }
}
