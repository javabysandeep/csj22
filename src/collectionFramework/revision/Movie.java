package collectionFramework.revision;

public class Movie /*implements Comparable<Movie>*/{
    private Integer movieId;
    private String movieName;
    private Integer movieDuration;

    public Movie(Integer movieId, String movieName, Integer movieDuration) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDuration = movieDuration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieDuration=" + movieDuration +
                '}';
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(Integer movieDuration) {
        this.movieDuration = movieDuration;
    }

    /*@Override
    public int compareTo(Movie movie) {
        return this.movieId - movie.movieId;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        return movieId.equals(movie.movieId);
    }

    @Override
    public int hashCode() {
        return movieId.hashCode();
    }
}
