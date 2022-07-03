package array.multiDimensionalArrays;

public class ArrayReferenceCheck {
    public static void main(String[] args) {
        int[] array = {10,20,30,40};
        incrementMe(array);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    private static void incrementMe(int[] array) {
        for (int index = 0; index < array.length; index++) {
            array[index]++;
        }
    }
}
