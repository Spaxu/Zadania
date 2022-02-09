package L3Z1;

public class CinemaSeats {
    final int seatNumber;
    final int seatRow;
    boolean isFree = true;

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
