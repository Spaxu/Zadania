package L4Z6;

public class BillCalculator {
    private double bill;
    private float service;

    public double calculate(double bill, float service) {
          return bill + service;
    }

    public double calculate(double bill, double discount, float service) {
        return bill * discount + service;
    }

    public double calculate(double bill, float service, short bag) {
          return bill + service + bag;
    }
}
