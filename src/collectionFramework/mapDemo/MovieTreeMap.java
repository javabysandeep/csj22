package collectionFramework.mapDemo;

import java.util.*;

public class MovieTreeMap {
    public static void main(String[] args) {
        TreeMap<Movie, Integer> movieMap = new TreeMap<>(Comparator.comparingInt(Movie::getMovieId));
        movieMap.put(new Movie(9,"Java",3),430);
        movieMap.put(new Movie(2,"Java",3),430);
        movieMap.put(new Movie(5,"Java",3),430);
        movieMap.put(new Movie(6,"Java",3),430);
        movieMap.put(new Movie(1,"Java",3),430);
        movieMap.put(new Movie(11,"Java",3),430);


        //Keys
        Set<Movie> movieKeys = movieMap.keySet();
        System.out.println(movieKeys);

        //values
        Collection<Integer> values = movieMap.values();
        System.out.println(values);

        //EntrySet
        Set<Map.Entry<Movie, Integer>> entries = movieMap.entrySet();
        for (Map.Entry<Movie,Integer> entry: entries) {
            System.out.println(entry.getValue());
        }
    }
}
