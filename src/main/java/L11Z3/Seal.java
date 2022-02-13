package L11Z3;

public class Seal {
    private final String name;
    private final Type type;


    public Seal(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type.value;
    }
}
