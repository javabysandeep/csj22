package exceptionHandling;

public class Demo4 {
    public static void main(String[] args) {
        int b = Integer.MAX_VALUE;
        System.out.println("Integer" +b);
        long longValue = (long)b+100;
        System.out.println("Long "+longValue);
        int c = (int)longValue;
        System.out.println("Int value "+c);

        short short1 = 128;
        byte byteValue = (byte) short1;
        System.out.println("Byte value "+byteValue);
    }
}
