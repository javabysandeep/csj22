package array;

public class SumOfArrayElements {
    public static void main(String[] args) {
        //Largest element
        int[] array = {10006, 43, 21, 8000009, 437,31,321,46780000};
        int sum = 0;

        for (int index = 1; index < array.length; index++) {
           sum = sum + array[index];
        }
        System.out.println("Sum  "+sum);
    }
}
