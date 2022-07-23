package collectionFramework.revision;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<>();
        integers.add(10);
        integers.add(3);
        integers.add(5);
        integers.add(9);
        integers.forEach(System.out::println);

//        Set<Movie> movies = new TreeSet<>(new MovieComparator());
        /*Set<Movie> movies = new TreeSet<>(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getMovieId()-o2.getMovieId();
            }
        });*/
        //Set<Movie> movies = new TreeSet<>((o1, o2) -> o1.getMovieId()-o2.getMovieId());
        Set<Movie> movies = new TreeSet<>(Comparator.comparingInt(Movie::getMovieId));
        movies.add(new Movie(99, "Python", 100));
        movies.add(new Movie(1, "GoLang", 100));
        movies.add(new Movie(10, "Java", 100));
        movies.forEach(System.out::println);
    }
}



/*
* 1. Using Comparable
* 2. Using Traditional Comparator. Create separate class that implements Comparator
* 3. Use ANnonymoys class
* 4. Use lambda expression
* 5. use Java 8 static method from Comparator. comparing
*
*
*
* // We dont need hashcode and equals method for TreeSet.
* We need comparable or comparator for TreeSet
* */