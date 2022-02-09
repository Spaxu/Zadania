package L4Z4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextToLowerCaseTest {
    @Test
    void shouldTextToLowerCase() {
        //given
        String text = "Test";

        //when
        TextToLowerCase toLowerCase = new TextToLowerCase();

        //then
        Assertions.assertEquals("test", toLowerCase.formatText(text));
    }
}
