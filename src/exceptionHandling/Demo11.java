package exceptionHandling;

public class Demo11 {
    public static void main(String[] args) {
        System.out.println(10/0);
       // throw  new NullPointerException("NPE");
        throw new ArrayIndexOutOfBoundsException("AIOIBE");
    }
}
