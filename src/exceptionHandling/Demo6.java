package exceptionHandling;

public class Demo6 {
    public static void main(String[] args) {
        try {
            System.out.println(10/1);
            System.out.println("Rest of the try");
            System.exit(0);
        }finally {
            System.out.println("Finally");
        }
        System.out.println("Rest of the code");
        //output: 10, Rest of the try
        handle(new Throwable());
        handle(new Exception());
        handle(new RuntimeException());
        handle(new Error());
        handle(new ArithmeticException());

    }
    public static void handle(Throwable throwable){

    }
}
