package classComponents.constructors;

public class ParamConstructorDemo {
    public static void main(String[] args) {
//        Movie movie = new Movie(1,"Java","2 hours");
        Movie movie = new Movie();
        System.out.println(movie.movieId);
        System.out.println(movie.movieName);
        System.out.println(movie.movieDuration);
    }
}
