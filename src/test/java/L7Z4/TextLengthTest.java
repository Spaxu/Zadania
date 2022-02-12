package L7Z4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;


class TextLengthTest {
    @ParameterizedTest
    @MethodSource("testWords")
    void shouldCheckTextLength(String text, int expected){
        int length = TextLength.textLength(text);
        Assertions.assertEquals(expected, length);
    }

    private static Stream<Arguments> testWords() {
        return Stream.of (
                Arguments.of("Test123", 7),
                Arguments.of("TestoweSlowo", 12)
        );
    }
}
