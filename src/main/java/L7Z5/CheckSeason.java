package L7Z5;

import java.time.Month;

public class CheckSeason {
    public static Seasons checkSeason(Month month) {
        return switch (month) {
            case DECEMBER, JANUARY, FEBRUARY -> Seasons.Winter;
            case MARCH, APRIL, MAY -> Seasons.Spring;
            case JUNE, JULY, AUGUST -> Seasons.Summer;
            case SEPTEMBER, OCTOBER, NOVEMBER -> Seasons.Autumn;
        };
    }
}

