package L10Z5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValid {
    public static boolean isValid(String password) {
        Pattern pattern = Pattern.compile("^(?=.*?[A-Z])(?=.*?[0-9])(?!.*?(?:2022|22)).*[A-Za-z0-9]{7,}$");
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
}
