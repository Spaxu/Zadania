import L2Z3.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void shouldAddTwoValues() {
        //given
        int value1 = 3;
        int value2 = 1;

        //when
        int result = Calculator.sum(value1, value2);

        //then
        Assertions.assertEquals(4, result);
    }

    @Test
    void shouldSubtractTwoValues() {
        //given
        int value1 = 5;
        int value2 = 2;

        //when
        int result = Calculator.sub(value1, value2);

        //then
        Assertions.assertEquals(3, result);
    }

    @Test
    void shouldMultipleTwoValues() {
        //given
        int value1 = 2;
        int value2 = 5;

        //when
        int result = Calculator.multiple(value1, value2);

        //then
        Assertions.assertEquals(10, result);
    }

    @Test
    void shouldDevideTwoValues() {
        //given
        int value1 = 10;
        int value2 = 2;

        //when
        int result = Calculator.devide(value1, value2);

        //then
        Assertions.assertEquals(5, result);
    }
}
