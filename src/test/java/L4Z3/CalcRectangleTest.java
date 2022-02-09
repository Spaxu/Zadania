package L4Z3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcRectangleTest {
    @Test
    void shouldCalculateAreaAndPerimeterForRectangle() {
        //given
        double value1 = 5;
        double value2 = 10;

        //when
        CalcRectangle calcRec = new CalcRectangle(value1, value2);


        //then
        Assertions.assertEquals(50, calcRec.area());
        Assertions.assertEquals(30, calcRec.perimeter());
    }
}
