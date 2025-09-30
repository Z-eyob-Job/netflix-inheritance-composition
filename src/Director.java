public class Director {
    private String name;
    private int awards;

    public Director(String name, int awards) {
        this.name = name;
        this.awards = awards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAwards() {
        return awards;
    }

    public void setAwards(int awards) {
        this.awards = awards;
    }

    @Override
    public String toString() {
        return name + " (Awards: " + awards + ")";
    }
}
