package classComponents.callByValueReference;

public class Demo {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;
        System.out.println(add(number1, number2));
        System.out.println(number1);
        System.out.println(number2);
    }

    private static int add(int number1, int number2) {
        number1= 1000;
        number2 = 2000;
        return number1+number2;
    }
}
