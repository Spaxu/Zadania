package L2Z6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DayCheckerTest {
    @Test
    void shouldPrintMonday() {
        //given
        int day = 1;

        //when
        String x = DayChecker.dayOfTheWeek(day);

        //then
        Assertions.assertEquals("Monday", x);
    }
    @Test
    void shouldPrintTuesday() {
        //given
        int day = 2;

        //when
        String x = DayChecker.dayOfTheWeek(day);

        //then
        Assertions.assertEquals("Tuesday", x);
    }
    @Test
    void shouldPrintWednesday() {
        //given
        int day = 3;

        //when
        String x = DayChecker.dayOfTheWeek(day);

        //then
        Assertions.assertEquals("Wednesday", x);
    }
    @Test
    void shouldPrintThursday() {
        //given
        int day = 4;

        //when
        String x = DayChecker.dayOfTheWeek(day);

        //then
        Assertions.assertEquals("Thursday", x);
    }
    @Test
    void shouldPrintFriday() {
        //given
        int day = 5;

        //when
        String x = DayChecker.dayOfTheWeek(day);

        //then
        Assertions.assertEquals("Friday", x);
    }
    @Test
    void shouldPrintWeekend() {
        //given
        int day = 6;

        //when
        String x = DayChecker.dayOfTheWeek(day);

        //then
        Assertions.assertEquals("Weekend", x);
    }
    @Test
    void shouldPrintWeekend2() {
        //given
        int day = 7;

        //when
        String x = DayChecker.dayOfTheWeek(day);

        //then
        Assertions.assertEquals("Weekend", x);
    }
    @Test
    void shouldPrintThereIsNoSuchADay() {
        //given
        int day = 8;

        //when
        String x = DayChecker.dayOfTheWeek(day);

        //then
        Assertions.assertEquals("There is no such a day!", x);
    }
}
