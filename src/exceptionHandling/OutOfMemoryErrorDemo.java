package exceptionHandling;

public class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        String str = "hello";
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            str = str +"hello";
        }
        System.out.println(str);

    }
}
