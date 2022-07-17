package collectionFramework;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> books = new Stack();
        books.push("Shyamachi Aai");
        books.push("Birbal and Akbar");
        books.push("Chankya");
        books.push("Champak");
        books.push("Vetal");
        books.push("Chintu");
        System.out.println("Book on the top "+books.pop());
        System.out.println("Book on the top "+books.peek());
        System.out.println("Do we have Vetal "+books.search("Vetal"));
        System.out.println("Is stack empty "+books.isEmpty());
    }
}
