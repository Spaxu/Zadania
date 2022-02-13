package L11Z2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComposePizza {
    public static void main(String[] args) {


        Pizza pizza1 = new Pizza("Pizza1", false, 1700, List.of("salami", "papryka", "cebula"));
        Pizza pizza2 = new Pizza("Pizza2", true, 1600, List.of("ser", "szynka", "pieczarki"));
        Pizza pizza3 = new Pizza("Pizza3", true, 1800, List.of("ser"));
        Pizza pizza4 = new Pizza("Pizza4", true, 1550, List.of("papryka", "pomidor"));
        Pizza pizza5 = new Pizza("Pizza5", false, 2000, List.of("salami", "papryka", "ser", "pomidor", "pieczarki"));
        Pizza pizza6 = new Pizza("Pizza6", true, 1700, List.of("seler", "cebula"));
        Pizza pizza7 = new Pizza("Pizza7", true, 1500, List.of("pomidor", "ser"));
        Pizza pizza8 = new Pizza("Pizza9", false, 1800, List.of("salami", "pomidor", "pieczarki"));
        Pizza pizza9 = new Pizza("Pizza9", false, 2150, List.of("szynka", "ser", "pomidor", "pieczarki"));
        Pizza pizza10 = new Pizza("Pizza10", false, 2200, List.of("salami", "papryka", "ser", "pomidor", "kukurydza"));

        List<Pizza> menu = new ArrayList<>();
        menu.addAll(Arrays.asList(pizza1, pizza2, pizza3, pizza4, pizza5, pizza6, pizza7, pizza8, pizza9, pizza10));

        System.out.println("Dania wege:\n");
        menu.stream().filter(pizza -> pizza.isVege()).map(pizza -> pizza.getName()).forEach(System.out::println);
        System.out.println("\nDania z alergenami:\n");
        menu.stream().filter(pizza -> pizza.getIngredients().contains("seler")).map(pizza -> pizza.getName()).forEach(System.out::println);

        boolean isVegeWithPaprykaAndPomidor = menu.stream().filter(pizza -> pizza.isVege()).anyMatch(pizza -> pizza.getIngredients().contains("pomidor") && pizza.getIngredients().contains("papryka"));
        boolean isCheeseOnPizza = menu.stream().allMatch(pizza -> pizza.getIngredients().contains("ser"));
        Pizza mostCaloriesPizza = menu.stream().max(Comparator.comparing(Pizza::getCalories)).get();
        Pizza lessCaloriesPizza = menu.stream().min(Comparator.comparing(Pizza::getCalories)).get();

    }
}
