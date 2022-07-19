package collectionFramework.queueDemo;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListWay {
    public static void main(String[] args) {
        Queue queue = new LinkedList();

        //add to the queue
        System.out.println(queue.add(10));// if the queue is full it returns null
        System.out.println(queue.offer(20));// if the queue is full it returns exception
        System.out.println(queue.offer(30));// if the queue is full it returns exception

        // remove from the queue
        System.out.println(queue.poll());// if the queue is empty it returns null
        System.out.println(queue.remove());// if the queue is empty it returns exception
        System.out.println(queue.remove());// if the queue is empty it returns exception

        // inspect: who is next
        System.out.println(queue.peek());// if the queue is empty it returns null
        System.out.println(queue.element());// if the queue is empty it returns exception
    }
}
