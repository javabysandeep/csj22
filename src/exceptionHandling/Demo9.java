package exceptionHandling;

public class Demo9 {
    public static void main(String[] args) {
        System.out.println(m1());
    }

    private static int m1() {
        try {
            return 1;
        } catch (Exception exception) {
            return 2;
        } finally {
            return 3;
        }
        //output : 3
    }

}
