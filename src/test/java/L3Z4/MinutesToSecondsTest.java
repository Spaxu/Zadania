package L3Z4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinutesToSecondsTest {
    @Test
    void shouldAddTwoValues1and1() {
        //given
        int minutes = 10;

        //when
        int seconds = MinutesToSeconds.convertMinutesToSeconds(minutes);

        //then
        Assertions.assertEquals(600, seconds);
    }
}
