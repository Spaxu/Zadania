package L11Z4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Doctor {
    public static void main(String[] args) {
        List<String> doctors = Arrays.asList("Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra", "Przychodnia:Pediatra", "Przychodnia:Internista:Laryngolog:Pediatra");

        List<String> specials = doctors.stream().map(special -> special.split(":")).flatMap(Arrays::stream).distinct().filter(special -> !special.equals("Przychodnia") && !special.equals("Szpital")).collect(Collectors.toList());

        System.out.println(specials);

    }
}
