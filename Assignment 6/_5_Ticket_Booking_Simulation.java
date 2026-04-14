class TicketBookingSystem {
    int tickets = 10;

    public synchronized void bookTicket(String name) {
        if (tickets > 0) {
            System.out.println(name + " booked ticket");
            tickets--;
        } else {
            System.out.println(name + " failed (no tickets)");
        }
    }
}

class UserThread extends Thread {
    TicketBookingSystem system;
    String name;

    UserThread(TicketBookingSystem system, String name) {
        this.system = system;
        this.name = name;
    }

    public void run() {
        system.bookTicket(name);
    }
}

public class _5_Ticket_Booking_Simulation {
    public static void main(String[] args) {
        TicketBookingSystem system = new TicketBookingSystem();

        for (int i = 1; i <= 15; i++) {
            new UserThread(system, "User" + i).start();
        }
    }
}