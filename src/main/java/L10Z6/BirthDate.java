package L10Z6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class BirthDate {
    private final String birthDay = "1996-07-26";
    private final LocalDate parsedDate = LocalDate.parse(birthDay);

    public int getAge() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(parsedDate, now);
        return period.getYears();
    }

    public DayOfWeek getBirthDate() {
        return parsedDate.getDayOfWeek();
    }

    public int getWeek() {
        TemporalField weekOfYear = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();
        return parsedDate.get(weekOfYear);
    }
}
