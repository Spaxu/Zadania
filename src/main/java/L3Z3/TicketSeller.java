package L3Z3;

public class TicketSeller extends BaseEmployee {

    public TicketSeller(String name, String surname, int hireYear) {
        super(name, surname, hireYear);
    }

    @Override
    public int calculateSalary() {
        return basicSalary;
    }
}