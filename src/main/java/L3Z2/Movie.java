package L3Z2;

public class Movie {
    final String title;
    final String directorName;
    final int durationInMinutes;
    final int prodYear;

    public Movie(String title, String directorName, int durationInMinutes, int prodYear) {
        this.title = title;
        this.directorName = directorName;
        this.durationInMinutes = durationInMinutes;
        this.prodYear = prodYear;
    }
}
