package exceptionHandling;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(10/0);
//        throw new ArithmeticException("divide by zero zero");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
       // m1();
    }
    static void m1(){
        m2();
    }
    static void m2(){
        m1();
    }
}
