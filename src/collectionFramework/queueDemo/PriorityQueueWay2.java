package collectionFramework.queueDemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueWay2 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue();
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
