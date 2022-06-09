package classComponents.constructors;

public class Movie {
    int movieId;
    String movieName;
    String movieDuration;

    /*Movie(int movieId1, String movieName1, String movieDuration1){
        // assigning local variables to the instance variables.
        // Local var and instance variables have the diff names so there is no confusion
        movieId = movieId1;
        movieName = movieName1;
        movieDuration = movieDuration1;
    }*/

    public Movie(int movieId, String movieName, String movieDuration) {
       // this();// this is call to the zero param
        // call to the constructor must be the first line otherwise we get CTE
        //this.printMovieDetails();
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDuration = movieDuration;
    }
    void printMovieDetails(){
        System.out.println("Printing movie details method");
    }
    Movie(){
        // call param con from zero param
        this(100,"COre Java","100 hours");
        System.out.println("Zero param con");
    }
}
