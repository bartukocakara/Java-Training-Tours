public class Reservation
{
    String room;
    int day;
    static int nReservations = 0;
    static String[] dayName = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday",
    };

    Reservation(String newRoom, int newDay)
    {
        room = newRoom;
        day = newDay;
        nReservations++;
    }

    void show(){
        System.out.printf("Room %s reserved on %s .\n", room, dayName[day]);
    }

    static void showNReservations(){
        System.out.printf("Number of reservations created is: %d.\n", nReservations);
    }

}
