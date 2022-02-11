package L4Z2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {
    @Test
    void shouldGetRectangleArea(){
        //given
        Rectangle rectangle = new Rectangle(5,10);
        //when
        double area = rectangle.getArea();
        //then
        Assertions.assertEquals(50, area);
    }
    @Test
    void shouldGetRectanglePerimeter(){
        //given
        Rectangle rectangle = new Rectangle(5,10);
        //when
        double perimeter = rectangle.getPerimeter();
        //then
        Assertions.assertEquals(30, perimeter);
    }

}
