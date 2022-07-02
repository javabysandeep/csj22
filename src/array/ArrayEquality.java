package array;

public class ArrayEquality {
    public static void main(String[] args) {
        //Largest element
        int[] array1 = {10, 43, 21, 1, 32};
        int[] array2 = {10, 43, 21, 1, 33};
        boolean isEqual = true;
        if (array1.length == array2.length) {

            for (int index = 0; index < array1.length; index++) {
                if (array1[index] != array2[index]) {
                    isEqual = false;
                    break;
                }
            }
        }
        System.out.println("Arrays are equal " + isEqual);

    }
}
