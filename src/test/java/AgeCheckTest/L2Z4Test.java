package AgeCheckTest;

import L2Z4.AgeCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class L2Z4Test {
    @Test
    void shouldTrueIfAdult() {

        //given
        int age = 18;

        //when
        boolean adult = AgeCheck.ageChecker(age);

        //then
        Assertions.assertTrue(adult);
    }
}
