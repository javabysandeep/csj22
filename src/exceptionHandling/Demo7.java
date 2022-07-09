package exceptionHandling;

public class Demo7 {
    public static void main(String[] args) {
        try {
//            System.out.println(10/0);
            String str = null;
            System.out.println(str.length());
            System.out.println("Rest of the try");
        }catch (Throwable throwable){
            System.out.println("Universal exception handler");
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
