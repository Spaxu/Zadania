package L2Z5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenOrOddTest {
    @Test
    void shouldTrueIfNumberIsEven() {
        //given
        int number = 4;

        //when
        boolean x = EvenOrOdd.checkIfEven(number);

        //then
        Assertions.assertTrue(x);
    }

    @Test
    void shouldTrueIfNumberIsOdd() {
        //given
        int number = 3;

        //when
        boolean x = EvenOrOdd.checkIfEven(number);

        //then
        Assertions.assertFalse(x);
    }
}
