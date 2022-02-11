package L8Z1;


import java.util.*;

public class Names {
    public static void main(String[] args) {
        List<String> listWithNames = Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr");
        //1
        Set<String> s = new LinkedHashSet<>(listWithNames);
        System.out.println(s);
        //2
        Collections.reverse(listWithNames);
        System.out.println(listWithNames);
        Iterator<String> iterator = s.iterator();
        //3
        Collections.replaceAll(listWithNames,"Anna","Joanna");

        System.out.println(listWithNames);



    }


}
