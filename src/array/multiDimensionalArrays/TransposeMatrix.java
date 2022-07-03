package array.multiDimensionalArrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = MatrixDemo.acceptMatrix();
        int[][] transpose = MatrixDemo.transpose(matrix);
        MatrixDemo.printMatrix(transpose);
    }
}
