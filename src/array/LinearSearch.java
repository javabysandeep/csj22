package array;

public class LinearSearch {
    public static void main(String[] args) {
        //Linear search
        int[] array = {16, 43, 21, 89, 437};
        int element = 89;

        for (int index = 0; index < array.length; index++) {
            if (element == array[index]) {
                System.out.println("Element found at index " + index);
                break;
            }
        }

    }
}
