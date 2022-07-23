package collectionFramework.revision;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Person> personQueue = new PriorityQueue<>(Comparator.comparingInt(Person::getPersonaBankBalance));
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
