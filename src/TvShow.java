public class TvShow extends Media {
    private int seasons;
    private int episodes;

    public TvShow(String title, String rating, Director director, int seasons, int episodes) {
        super(title, rating, director);
        this.seasons = seasons;
        this.episodes = episodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        String leadActor = getCast().isEmpty() ? "No cast available" : getCast().get(0).getName();
        return "\n[ TV SHOW ]" +
                "\nTitle       : " + getTitle() +
                "\nRating      : " + getRating() +
                "\nDirector    : " + getDirector().getName() +
                "\nLead Actor  : " + leadActor +
                "\nSeasons     : " + seasons +
                "\nEpisodes    : " + episodes +
                "\n-----------------------------";
    }
}
