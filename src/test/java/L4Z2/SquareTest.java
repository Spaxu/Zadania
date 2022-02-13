package L4Z2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {
    @Test
    void shouldGetSquareArea(){
        //given
        Square square = new Square(5);
        //when
        double area = square.getArea();
        //then
        Assertions.assertEquals(25, area);
    }
    @Test
    void shouldGetSquarePerimeter(){
        //given
        Square square = new Square(5);
        //when
        double perimeter = square.getPerimeter();
        //then
        Assertions.assertEquals(20, perimeter);
    }
}
