package collectionFramework.revision;

import java.util.Comparator;

class MovieComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getMovieId() - movie2.getMovieId();
    }
}