package L3Z3;

public abstract class BaseEmployee {
    private final String name;
    private final String surname;
    protected final int basicSalary;
    private final int hireYear;

    protected BaseEmployee(String name, String surname, int basicSalary, int hireYear) {
        this.name = name;
        this.surname = surname;
        this.basicSalary = basicSalary;
        this.hireYear = hireYear;
    }

    public BaseEmployee(String name, String surname, int hireYear) {
        this.name = name;
        this.surname = surname;
        this.basicSalary = 3000;
        this.hireYear = hireYear;
    }

    public abstract int calculateSalary();

    public int getHireYear() {
        return 2022 - hireYear;
    }

    public int getBasicSalary() {
        return basicSalary;
    }
}
