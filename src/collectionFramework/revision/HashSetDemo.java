package collectionFramework.revision;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Movie> movies = new HashSet();
        movies.add(new Movie(99, "Python", 100));
        movies.add(new Movie(1, "GoLang", 100));
        movies.add(new Movie(10, "Java", 100));
        movies.add(new Movie(10, "Java", 100));
        movies.add(new Movie(10, "Java", 100));
        movies.add(new Movie(10, "Java", 100));
        movies.forEach(System.out::println);
    }
}
