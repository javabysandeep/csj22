package array.multiDimensionalArrays;

import java.util.Scanner;

public class MatrixDemo {
    public static void main(String[] args) {
        int[][] matrix1 = acceptMatrix();
        int[][] matrix2 = acceptMatrix();
        int[][] addition = addMatrices(matrix1,matrix2);
       /* int[][] matrix = {
                {4,5},
                {1},
                {5,6,7,9},
                {5,6,7,9,11,12,3},

        };*/
        printMatrix(addition);
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];

        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
             result[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] acceptMatrix(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dimensions rows and columns");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][]  matrix = new int[rows][columns];
        System.out.println("Enter the matrix");
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                transpose[row][column] = matrix[column][row];
            }
        }
        return transpose;
    }
}
