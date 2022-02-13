package L6Z8;

public class PeselCheck {
    public static void peselCheck(int pesel) {
        String s = Integer.toString(pesel);

        if (!s.matches("[0-9]")) throw new WrongTypeOfDataException("Only numbers please");
        if (s.length() != 11) throw new IllegalLengthException("11 numbers. No less, no more");

        System.out.println("PESEL: " + pesel);
    }

}

