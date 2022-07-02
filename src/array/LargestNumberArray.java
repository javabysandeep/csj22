package array;

public class LargestNumberArray {
    public static void main(String[] args) {
        //Largest element
        int[] array = {10006, 43, 21, 8000009, 437,31,321,46780000};
        int max = array[0];

        for (int index = 1; index < array.length; index++) {
            if (max < array[index]) {
               max = array[index];
            }
        }
        System.out.println("Max "+max);
    }
}
