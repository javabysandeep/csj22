package exceptionHandling;

public class Demo5 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
            System.out.println("Rest of the try");
        }finally {
            System.out.println("Finally");
        }
        System.out.println("Rest of the code");
    }
}
