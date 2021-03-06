public class TestReservation {
    public static void main(String[] args) {
        Reservation r1 = new Reservation("SA114", 0);
        Reservation r2 = new Reservation("RF212", 4);

        r1.show();
        r2.show();
        Reservation.showNReservations();
    }
}
