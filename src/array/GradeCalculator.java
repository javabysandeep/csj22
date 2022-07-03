package array;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total subjects");
        int subjectCount = scanner.nextInt();
        System.out.println("Enter the marks for each subject ");
        int totalMarks = 0;
        int[] marksArray = new int[subjectCount];
        for (int index = 0; index < marksArray.length; index++) {
            marksArray[index] = scanner.nextInt();
            totalMarks += marksArray[index];
        }
        System.out.println("Total marks "+totalMarks);
        System.out.println("Percentage "+ (float)(totalMarks/subjectCount));
    }
}
