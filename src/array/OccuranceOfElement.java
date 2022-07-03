package array;

public class OccuranceOfElement {
    public static void main(String[] args) {
        int[] array = {10, 43, 21, 9, 9,437,31,321,3,4};
        int number  = 9;
        int count = 0;
        for (int index = 0; index < array.length; index++) {
            if (number == array[index]){
                count++;
            }
        }
        System.out.println("Element "+number+" has occureed "+count+" times.");

    }
}
