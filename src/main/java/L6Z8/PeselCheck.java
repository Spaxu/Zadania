package L6Z8;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PeselCheck {
        public static boolean peselCheck (String pesel){

            Pattern pattern = Pattern.compile("\\d{11}");
            Matcher matcher = pattern.matcher(pesel);

            return matcher.matches();
        }
    }

