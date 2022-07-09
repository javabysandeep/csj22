package exceptionHandling;

public class Demo8MultiCatch {
    public static void main(String[] args) {
        try {
//            System.out.println(10/0);
            String str = "Abc";
            System.out.println(str.charAt(10));

            String str1 = null;
            System.out.println(str1.length());
            System.out.println("Rest of the try");
        } catch (NullPointerException nullPointerException) {
            System.out.println("Nullpointer");
        } catch (ArithmeticException throwable) {
            System.out.println("arithmetic exception");

        } catch (Throwable throwable) {
            System.out.println("Universal exception handler");

        } finally {
            System.out.println("Finally");
        }
        System.out.println("Rest of the code");

    }
}
