package L4Z4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextToUpperCaseTest {
    @Test
    void shouldTextToUpperCase() {
        //given
        String text = "Test";

        //when
        TextToUpperCase toUpperCase = new TextToUpperCase();

        //then
        Assertions.assertEquals("TEST", toUpperCase.formatText(text));
    }
}
