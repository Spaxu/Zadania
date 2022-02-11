package L11Z1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class DivByThree {
    public static void main(String[] args) {
        List<Integer> numbersDivByThree = IntStream.range(0, 50).filter(num -> num % 3 == 0).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        numbersDivByThree.forEach(System.out::println);
    }
}
