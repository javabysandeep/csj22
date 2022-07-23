package collectionFramework.revision;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDemo {
    public static void main(String[] args) {
        Queue<Person> personQueue = new LinkedList<>();
        personQueue.add(new Person(1,"Ganesh",3590000));
        personQueue.add(new Person(19,"Suraj",43500));
        personQueue.add(new Person(3,"Rahul",1234));
        personQueue.add(new Person(11,"Saurabh",879));
        personQueue.add(new Person(56,"Pooja",12302));

        System.out.println(personQueue.poll());
        System.out.println(personQueue.poll());
        System.out.println(personQueue.poll());
        System.out.println(personQueue.poll());
        System.out.println(personQueue.poll());
    }
}
