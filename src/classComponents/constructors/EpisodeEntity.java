package classComponents.constructors;

public class EpisodeEntity {
    int episodeId;
    String episodeTitle;
    String episodeDuration;
// what is constructor? It is having same name as of class name and no return type

    // why to use? to initialize the instance variables.
    // To initialize the state of an object
    // to put some initial value for instance variables
    // to construct the object

    // How to create?
   /* Episode() {
        // this is a zero param con and not a default constructor
        // Zero param con is provided by developer not by compiler
        // it is optional to have body for zero param
        // We can use zero param con for initializing the instance variables with custom default values apart from 0, null
        episodeId = 101;
        episodeTitle = "abc";
        episodeDuration = " 30 min";
    }*/

    @Override
    public String toString() {
        return "Episode{" +
                "episodeId=" + episodeId +
                ", episodeTitle='" + episodeTitle + '\'' +
                ", episodeDuration='" + episodeDuration + '\'' +
                '}';
    }
}
