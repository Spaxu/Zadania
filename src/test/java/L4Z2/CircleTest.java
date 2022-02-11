package L4Z2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {
    @Test
    void shouldGetCircleArea(){
        //given
        Circle circle = new Circle(5);
        //when
        double area = circle.getArea();
        //then
        Assertions.assertEquals(78.5, area);
    }
    @Test
    void shouldGetCircleAPerimeter(){
        //given
        Circle circle = new Circle(5);
        //when
        double perimeter = circle.getPerimeter();
        //then
        Assertions.assertEquals(30.9, perimeter);
    }

}
