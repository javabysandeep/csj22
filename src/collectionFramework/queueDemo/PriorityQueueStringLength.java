package collectionFramework.queueDemo;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueStringLength {
    public static void main(String[] args) {
//        Queue<String> queue = new PriorityQueue<String>((s1,s2)->s1.length()-s2.length());
        Queue<String> queue = new PriorityQueue<String>(Comparator.comparingInt(String::length));
        System.out.println(queue.add("Pune"));
        System.out.println(queue.add("Mumbai"));
        System.out.println(queue.add("Banglore"));
        System.out.println(queue.add("Hyderabad"));
        System.out.println(queue.add("Chennai"));

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }
}
