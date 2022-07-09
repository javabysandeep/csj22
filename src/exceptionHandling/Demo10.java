package exceptionHandling;

public class Demo10 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            System.exit(0);
        } catch (Exception exception) {
            System.out.println("catch block");
        } finally {
            System.out.println("finally");
        }
        System.out.println("Rest of the code");
    }
    //output:
}
