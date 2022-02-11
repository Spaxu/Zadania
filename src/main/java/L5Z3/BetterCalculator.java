package L5Z3;

public class BetterCalculator implements MathOperations {

    @Override
    public int sumOfTwoNumbers(int value1, int value2) {
        return value1 + value2;
    }

    @Override
    public int subtractionOfTwoNumbers(int value1, int value2) {
        return value1 - value2;
    }

    @Override
    public int multiplicationOfTwoNumbers(int value1, int value2) {
        return value1 * value2;
    }

    @Override
    public int dividingOfTwoNumbers(int value1, int value2) {
        return value1 / value2;
    }
}
