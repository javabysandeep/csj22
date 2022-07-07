package arrayPractice;

public class Largest {
    public static void main(String[] args) {
        //Largest element
        int[] array = {10, 2, 3, 4, 1, 2, 3, 4};
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > max) {
                second = max;
                max = array[index];
            } else if (array[index] > second && max != array[index])
                second = array[index];
        }
        System.out.println("Max " + max);
        System.out.println("Second Max " + second);
    }
}

