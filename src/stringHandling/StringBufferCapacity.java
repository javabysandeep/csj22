package stringHandling;

public class StringBufferCapacity {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(100);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());
    }
}
