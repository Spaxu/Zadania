package L7Z2;

import java.util.Objects;

public class ToUpperCase {
    public static String convertToUpperCase(String text) {
        if (Objects.isNull(text) || text.equals("")) {
            throw new NullPointerException();
        }
        return text.toUpperCase();
    }
}
