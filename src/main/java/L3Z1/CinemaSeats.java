package L3Z1;

public class CinemaSeats {
    private final int seatNumber;
    private final int seatRow;
    boolean isFree;

    public CinemaSeats(int seatNumber, int seatRow, boolean isFree) {
        this.seatNumber = seatNumber;
        this.seatRow = seatRow;
        this.isFree = isFree;
    }

    public void print() {
        System.out.println("Numer siedzenia " + seatNumber);
        System.out.println("Numer rzędu " + seatRow);
        System.out.println("Wolne? " + isFree);
    }

}
