package array;

public class Demo4 {
    public static void main(String[] args) {
        // How to access array elements
        int[] array = {20, 88, 56, 43};

        // what is array index and why it starts from 0?
        // index is unit or measure of how far the array element is from the base address.
        // array's first element is stored at base address.

        // Array element address = Base Address + Index* Size of data type
        System.out.println(array);//  base address hashcode
        System.out.println("First element stored at index 0 : " + array[0]);
        System.out.println("Second element stored at index 1 : " + array[1]);
        System.out.println("Third element stored at index 2 : " + array[2]);
        System.out.println("Fourth element stored at index 3 : " + array[3]);

        // ArrayIndexOutOfBoundsException
        System.out.println("Fifth element stored at index 4 : " + array[array.length]);

    }
}
