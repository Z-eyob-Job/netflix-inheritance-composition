import java.util.ArrayList;
import java.util.List;

public class Media {
    private String title;
    private String rating;
    private Director director;
    private List<Actor> cast;

    public Media(String title, String rating, Director director) {
        this.title = title;
        this.rating = rating;
        this.director = director;
        this.cast = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getCast() {
        return cast;
    }

    public void addActor(Actor actor) {
        cast.add(actor);
    }

    @Override
    public String toString() {
        String leadActor = cast.isEmpty() ? "No cast available" : cast.get(0).getName();
        return "[ MEDIA ] " + title + " | Rating: " + rating + " | Director: " + director.getName() + " | Lead: " + leadActor;
    }
}
