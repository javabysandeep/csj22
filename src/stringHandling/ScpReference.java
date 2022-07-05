package stringHandling;

public class ScpReference {
    public static void main(String[] args) {
        String str1 = new String("heap as well SCP");// str1 is referring to HEAP
        String str2 = str1.intern();// str2 is referring to SCP
        System.out.println(str1 == str2);
    }
}
