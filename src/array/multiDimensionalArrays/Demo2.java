package array.multiDimensionalArrays;

public class Demo2 {
    public static void main(String[] args) {
        int[][][] arrayOfArray = new int[2][2][3];

        System.out.println(arrayOfArray.length);
        System.out.println(arrayOfArray[0]);//ref of internal array
        System.out.println(arrayOfArray[1]);//ref of internal array
        System.out.println(arrayOfArray[0][0]);
        System.out.println(arrayOfArray[1][3]);//7
    }
}
