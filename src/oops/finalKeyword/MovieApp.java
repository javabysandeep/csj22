package oops.finalKeyword;

public class MovieApp {
    public static void main(String[] args) {
        final Movie movie1 = new Movie(101,"Pushpa",3);//o null o
        System.out.println(movie1);
        /*movie1.movieId=101;
        movie1.movieName = "Pushpa";
        movie1.duration = 3;*/
        System.out.println("Movie object content changed "+movie1);
        Movie movie2 = new Movie(102,"Netflix",6);
//        movie2.movieId= 103;
//        movie1 = movie2;
//        movie2 = movie1;
    }
}
