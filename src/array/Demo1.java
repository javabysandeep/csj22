package array;

public class Demo1 {
    public static void main(String[] args) {
        int variable = 30;
        // pain points of variable
        // what is an array? collection of homogeneous elements
        // array is fixed in nature
        // why to use array ? to hold multiple values of same type
        // size of an array cannot be kept empty. CTE
        // size of an array can't be negative else we get RTE. NegativeArraySizeException
        // size of an array can be zero. Object will be created but variables wont be there
        // Long can't be used as array size. CTE

        // variables will be initialized with default value inside the object

        // array declaration

        float array[] = new float[100];//NegativeArraySizeException
        System.out.println(array);
    }
}
