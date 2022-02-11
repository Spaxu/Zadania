package L11Z3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Seal seal = new Seal("Seal 1", Type.D2);
        Seal seal2 = new Seal("Seal 2", Type.D3);
        Seal seal3 = new Seal("Seal 3", Type.D3);
        Seal seal4 = new Seal("Seal 4", Type.D4);
        Seal seal5 = new Seal("Seal 5", Type.D4);
        Seal seal6 = new Seal("Seal 6", Type.D3);
        Seal seal7 = new Seal("Seal 7", Type.D2);
        Seal seal8 = new Seal("Seal 8", Type.D2);
        Seal seal9 = new Seal("Seal 9", Type.D2);
        Seal seal10 = new Seal("Seal 10", Type.D3);

        List<Seal> rooms = new ArrayList<>(Arrays.asList(seal, seal2, seal3, seal4, seal5, seal6, seal7, seal8, seal9, seal10));

        System.out.println(rooms.stream().collect(Collectors.groupingBy(Seal::getType, Collectors.counting())));
    }
}

