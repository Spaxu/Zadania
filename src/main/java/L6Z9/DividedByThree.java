package L6Z9;

public class DividedByThree {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 2, 9};

        for (int i = 0; i < numbers.length; i++) {
            try {
                if (numbers[i] % 3 == 0) {
                    System.out.println(numbers[i] + " podzielne");

                } else {
                    throw new IllegalArgumentException();

                }
            } catch (IllegalArgumentException e) {
                System.out.println("Nope");
            }
        }

    }
}
