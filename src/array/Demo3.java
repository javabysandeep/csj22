package array;

public class Demo3 {
    public static void main(String[] temp) {
        //different ways to create array

        int[] array1 = new int[10];//recommended one
        int[] array2 = new int[10];
        int[] array3 = new int[10];
        int array4[] = new int[10];
        int array5[] = new int[10];

        int a, b, c, d [] ;// only d is array type rest are normal int variables

        int[] directValues = {1,2,3,4,5};
        System.out.println(directValues);

        //for every array, there is length variable created which denotes size of an array
        System.out.println(directValues.length);
        add(directValues);


    }

    private static int add(int[] directValues) {
        String[] stringArray = new String[5];
        main(stringArray);
        return 0;
    }
}
