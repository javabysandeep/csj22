package oops.finalKeyword;

public class Movie {
    final int movieId;
    final String movieName;
    final int duration;

    Movie(int movieId, String movieName, int duration){
        this.movieId = movieId;
        this.movieName = movieName;
        this.duration = duration;
    }
    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", duration=" + duration +
                '}';
    }
}
