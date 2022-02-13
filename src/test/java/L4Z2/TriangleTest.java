package L4Z2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {
    @Test
    void shouldGetTriangleArea(){
        //given
        Triangle triangle = new Triangle(3,4);
        //when
        double area = triangle.getArea();
        //then
        Assertions.assertEquals(6, area);
    }
    @Test
    void shouldGetTrianglePerimeter(){
        //given
        Triangle triangle = new Triangle(3, 4, 5);
        //when
        double perimeter = triangle.getPerimeter();
        //then
        Assertions.assertEquals(12, perimeter);
    }

}
