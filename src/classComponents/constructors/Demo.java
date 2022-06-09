package classComponents.constructors;

public class Demo {
    public static void main(String[] args) {
        // Default constructor has the same name  of class name, no return type, no param, no body/implementation
        // This is provided by java compiler
        // it is provided when there no other constructor


        EpisodeEntity episodeEntity = new EpisodeEntity();
        EpisodeEntity episodeEntity1 = new EpisodeEntity();
        EpisodeEntity episodeEntity2 = new EpisodeEntity();
        EpisodeEntity episodeEntity3 = new EpisodeEntity();
        EpisodeEntity episodeEntity4 = new EpisodeEntity();
        /*System.out.println("Id "+episode.episodeId);
        System.out.println("Title "+episode.episodeTitle);
        System.out.println("Duration "+episode.episodeDuration);*/

        System.out.println(episodeEntity);
        System.out.println(episodeEntity1);
        System.out.println(episodeEntity2);
        System.out.println(episodeEntity3);
        System.out.println(episodeEntity4);
    }
}
