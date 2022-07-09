package exceptionHandling;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            String str = "null";
            System.out.println(str.length());

            int[] array = {};
            System.out.println(array[0]);

        } catch (NullPointerException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("NPE or array index out of bound");
        }
        System.out.println("Rest of the code");
    }
}
