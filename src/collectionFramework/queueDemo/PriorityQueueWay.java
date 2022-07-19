package collectionFramework.queueDemo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueWay {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();

        System.out.println(queue.add(10));// if the queue is full it returns null
        System.out.println(queue.offer(20));// if the queue is full it returns exception
        System.out.println(queue.offer(30));// if the queue is full it returns exception
        System.out.println(queue.offer(9));// if the queue is full it returns exception

        // remove from the queue
        System.out.println(queue.poll());// if the queue is empty it returns null
        System.out.println(queue.poll());// if the queue is empty it returns null
        System.out.println(queue.poll());// if the queue is empty it returns null
        System.out.println(queue.poll());// if the queue is empty it returns null

    /*    // inspect: who is next
        System.out.println(queue.peek());// if the queue is empty it returns null
        System.out.println(queue.element());//
    */}
}
