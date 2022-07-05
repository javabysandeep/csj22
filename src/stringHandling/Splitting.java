package stringHandling;

public class Splitting {
    public static void main(String[] args) {
        String str = "string handling is easy to learn";
        String[] strings = str.split(" ");

        for (String temp : strings) {
            System.out.println(temp);
        }

        for (int index = 0; index < strings.length; index++) {
            System.out.println(strings[index]);
        }

        int[] intArray = {10, 20, 30, 40};
        for (int value : intArray) {

        }

    }
}
