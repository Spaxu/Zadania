package L4Z3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcCircleTest {
    @Test
    void shouldCalculateAreaAndPerimeterForCircle() {
        //given
        double r = 5;

        //when
        CalcCircle calcCirc = new CalcCircle(r);


        //then
        Assertions.assertEquals(78.5, calcCirc.area());
        Assertions.assertEquals(31.400000000000002, calcCirc.perimeter());
    }
}
