package interviwQuestions;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(love6(6, 4));//true
        System.out.println(love6(4, 4));//false
        System.out.println(love6(3, 3));//true
    }

    public static boolean love6(int a, int b) {
        return isNumber6(a, b) || isSum6(a, b) || isSub6(a, b);
      //  return (a == 6 || b == 6) || ((a + b) == 6) || (Math.abs(a - b) == 6);
    }

    private static boolean isNumber6(int a, int b) {
        return a == 6 || b == 6;
    }

    private static boolean isSum6(int a, int b) {
        return (a + b) == 6;
    }

    private static boolean isSub6(int a, int b) {
        return Math.abs(a - b) == 6;
    }

}
