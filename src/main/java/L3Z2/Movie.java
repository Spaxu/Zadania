package L3Z2;

public class Movie {
    private final String title;
    private final String directorName;
    private final String directorSurname;
    private final int durationInMinutes;
    private final int prodYear;


    public Movie(String title, String directorName, String directorSurname, int durationInMinutes, int prodYear) {
        this.title = title;
        this.directorName = directorName;
        this.directorSurname = directorSurname;
        this.durationInMinutes = durationInMinutes;
        this.prodYear = prodYear;
    }
}
