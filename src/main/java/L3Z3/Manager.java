package L3Z3;

public class Manager extends BaseEmployee {

    private int bonus;

    public Manager(String name, String surname, int hireYear) {
        super(name, surname, 5000, hireYear);
        this.bonus = 500;
    }

    @Override
    public int calculateSalary() {
        return basicSalary + bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
