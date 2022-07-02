package array;

public class SecondTopper {
    public static void main(String[] args) {
        //Largest element
        int[] array = {10, 43, 21, 1, 32};
        int max = array[0];
        int secondMax = array[0];

        for (int index = 1; index < array.length; index++) {
            if (max < array[index]) {
                max = array[index];
            }
            if (max > array[index] && secondMax < array[index]) {
                secondMax = array[index];
            }
        }
        System.out.println("Max " + max);
        System.out.println("Second max  " + secondMax);
    }
}
