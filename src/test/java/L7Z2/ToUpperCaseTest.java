package L7Z2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;


public class ToUpperCaseTest {
    @ParameterizedTest
    @ValueSource(strings = {"Test", "test"})
    void shouldToUpperCase (String text){
        //when
        String upperTest = ToUpperCase.convertToUpperCase(text);
        //then
        Assertions.assertEquals("TEST", upperTest);
    }
    @ParameterizedTest
    @NullAndEmptySource
    void shouldThrowNullPointer (String text){
        assertThrows(NullPointerException.class, () -> ToUpperCase.convertToUpperCase(text));
    }
}

