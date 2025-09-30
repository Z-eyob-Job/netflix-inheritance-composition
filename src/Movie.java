public class Movie extends Media {
    private int lengthMinutes;
    private String description;
    private double boxOffice;

    public Movie(String title, String rating, Director director, int lengthMinutes, String description, double boxOffice) {
        super(title, rating, director);
        this.lengthMinutes = lengthMinutes;
        this.description = description;
        this.boxOffice = boxOffice;
    }

    public int getLengthMinutes() {
        return lengthMinutes;
    }

    public void setLengthMinutes(int lengthMinutes) {
        this.lengthMinutes = lengthMinutes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(double boxOffice) {
        this.boxOffice = boxOffice;
    }

    @Override
    public String toString() {
        String leadActor = getCast().isEmpty() ? "No cast available" : getCast().get(0).getName();
        return "\n[ MOVIE ]" +
                "\nTitle       : " + getTitle() +
                "\nRating      : " + getRating() +
                "\nDirector    : " + getDirector().getName() +
                "\nLead Actor  : " + leadActor +
                "\nLength      : " + lengthMinutes + " minutes" +
                "\nBox Office  : $" + boxOffice +
                "\nSummary     : " + description +
                "\n-----------------------------";
    }
}
