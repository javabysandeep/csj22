package exceptionHandling;

import java.util.Scanner;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers for division. nr dr");
        int nr = scanner.nextInt();
        int dr = scanner.nextInt();
        if (dr == 0) {
            throw new InvalidNumberException("Denominator cant be zero");
        }
        System.out.println("Division "+(nr/dr));
    }
}
