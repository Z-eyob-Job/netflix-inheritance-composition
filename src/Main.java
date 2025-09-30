import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Director directorOne = new Director("Christopher Nolan", 7);
        Director directorTwo = new Director("Vince Gilligan", 5);
        Director directorThree = new Director("David Benioff", 4);

        Actor actorOne = new Actor("Leonardo DiCaprio", 48);
        Actor actorTwo = new Actor("Joseph Gordon-Levitt", 43);
        Actor actorThree = new Actor("Bryan Cranston", 68);
        Actor actorFour = new Actor("Aaron Paul", 44);
        Actor actorFive = new Actor("Emilia Clarke", 37);
        Actor actorSix = new Actor("Kit Harington", 39);

        Movie inception = new Movie("Inception", "PG-13", directorOne, 152, "A dream-within-a-dream sci-fi thriller", 890_500_000);
        inception.addActor(actorOne);
        inception.addActor(actorTwo);

        TvShow breakingBad = new TvShow("Breaking Bad", "MA", directorTwo, 6, 64);
        breakingBad.addActor(actorThree);
        breakingBad.addActor(actorFour);

        TvShow gameOfThrones = new TvShow("Game of Thrones", "MA", directorThree, 9, 79);
        gameOfThrones.addActor(actorFive);
        gameOfThrones.addActor(actorSix);

        System.out.println(inception);
        System.out.println(breakingBad);
        System.out.println(gameOfThrones);

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(inception);

        System.out.println("\n[ FAMILY-FRIENDLY MOVIES ]");
        printFamilyFriendlyMovies(movies);
    }

    public static void printFamilyFriendlyMovies(ArrayList<Movie> movies) {
        for (Movie movie : movies) {
            if (movie.getRating().equals("PG") || movie.getRating().equals("PG-13")) {
                System.out.println("- " + movie.getTitle() + " [" + movie.getRating() + "]");
            }
        }
    }
}
