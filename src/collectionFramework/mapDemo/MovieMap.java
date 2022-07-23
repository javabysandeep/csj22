package collectionFramework.mapDemo;

import java.util.HashMap;

public class MovieMap {
    public static void main(String[] args) {
        HashMap<Movie, Integer> movieMap = new HashMap<>();
        movieMap.put(new Movie(10,"Java",3),430);
        movieMap.put(new Movie(10,"Java",3),430);
        movieMap.put(new Movie(10,"Java",3),430);
        movieMap.put(new Movie(10,"Java",3),430);
        movieMap.put(new Movie(10,"Java",3),430);
        movieMap.put(new Movie(10,"Java",3),430);

        System.out.println(movieMap);
    }
}
