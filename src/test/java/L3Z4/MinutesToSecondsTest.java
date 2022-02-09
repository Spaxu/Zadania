package L3Z4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinutesToSecondsTest {
    @Test
    void shouldAddTwoValues1and1() {
        //given
        int minutes = 9;

        //when
        int seconds = MinutesToSeconds.convertMinutesToSeconds(minutes);

        //then
        Assertions.assertEquals(540, seconds);
    }
}
