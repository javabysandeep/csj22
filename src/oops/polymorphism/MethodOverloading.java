package oops.polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20,30));
        System.out.println(add(10, 20,30));
        System.out.println(add(10.35f, 20.3f));
        main("null");
        System.out.println(sub(10,5));
    }

    private static int sub(int num1, int num2) {
        return num1-num2;
    }
   /* private static float sub(int num1, int num2) {
        return (float)(num1-num2);
    }*/

    public static void main(String args) {
        System.out.println("overloaded main method");
    }

    private static int add(int num1, int num2) {
        return num1 + num2;
    }
    private static float add(float num1, float num2) {
        return num1 + num2;
    }
    private static int add(int num1, int num2, int num3) {
        return num1 + num2+num3;
    }
}
