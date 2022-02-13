package L11Z5;

import java.util.Arrays;
import java.util.List;

public class Letters {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Kubek","Dżdżownica","Źdźbło");

        words.stream().map(String::toUpperCase).map(String::chars).flatMap(s -> s.mapToObj(n ->  (char)n)).distinct().forEach(System.out::println);
    }
}
