package L4Z4;

import java.util.Locale;

public class TextToLowerCase implements TextFormatter{
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
