package L11Z2;

import java.util.List;

public class Pizza {
    private String name;
    private boolean isVege;
    private int calories;
    private List<String> ingredients;

    public Pizza(String name, boolean isVege, int calories, List<String> ingredients) {
        this.name = name;
        this.isVege = isVege;
        this.calories = calories;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public boolean isVege() {
        return isVege;
    }

    public int getCalories() {
        return calories;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
