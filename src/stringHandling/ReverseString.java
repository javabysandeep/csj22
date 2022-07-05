package stringHandling;

public class ReverseString {
    public static void main(String[] args) {
        String string = "reverse me";
        // without using any predefined method.
        char[] chars = string.toCharArray();
        for (int left = 0, right = chars.length - 1; left < right; left++, right--) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
        }
        for (char ch:chars) {
            System.out.print(ch);
        }

    }
}
