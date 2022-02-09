package L3Z5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PitagorasTriangleTest {
    @Test
    void shouldTrueIfPitagoras() {
        //given
        int a = 3;
        int b = 4;
        int c = 5;


        //when
        boolean check = PitagorasTriangle.isTriangle(a,b,c);

        //then
        Assertions.assertTrue(check);
    }
    @Test
    void shouldFalseIfNoPitagoras() {
        //given
        int a = 3;
        int b = 5;
        int c = 4;


        //when
        boolean check = PitagorasTriangle.isTriangle(a,b,c);

        //then
        Assertions.assertFalse(check);
    }
}
