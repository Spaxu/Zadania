package L7Z6;


public class CalcCurrency {
    private final CurrentValue currentValue;

    public CalcCurrency(CurrentValue rateGetter) {
        this.currentValue = rateGetter;
    }

    public double calculateBuyValue(double pln, Currency currency){
        if (pln > 0){
            return pln / currentValue.getBuy(currency);
        } throw new IllegalArgumentException();
    }
    public double calculateSellValueInPln(double amount, Currency currency) {
        if (amount > 0) {
            return amount * currentValue.getSell(currency);
        } throw new IllegalArgumentException();
    }
}
