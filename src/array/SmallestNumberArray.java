package array;

public class SmallestNumberArray {
    public static void main(String[] args) {
        //Largest element
        int[] array = {10006, 43, 21, 8000009, 437,31,321,46780000};
        int min = array[0];

        for (int index = 1; index < array.length; index++) {
            if (min > array[index]) {
               min = array[index];
            }
        }
        System.out.println("Smallest "+min);
    }
}
