package L10Z3;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidUrl {
    static final Pattern pattern = Pattern.compile("((http|https)://)(www.)?" + "[a-zA-Z0-9@:%._\\+~#?&//=]" + "{2,256}\\.[a-z]" + "{2,6}\\b([-a-zA-Z0-9@:%" + "._\\+~#?&//=]*)");

    public static boolean isValid(String url) {
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String url = "http://www.onet.pl";
        String url1 = "https://mail.google.com";
        String url2 = "http://wiadmosci.onet.pl";
        String url3 = "http://onet.pl";


        System.out.println(ValidUrl.isValid(url));
        System.out.println(ValidUrl.isValid(url1));
        System.out.println(ValidUrl.isValid(url2));
        System.out.println(ValidUrl.isValid(url3));
    }
}
