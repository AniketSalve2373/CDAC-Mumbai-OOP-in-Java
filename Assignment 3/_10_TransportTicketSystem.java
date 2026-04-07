import java.util.*;

class Ticket {
    int id;
    String passenger;
    String source, destination;
    double fare;

    Ticket(int id, String passenger, String source, String destination, double fare) {
        this.id = id;
        this.passenger = passenger;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
    }

    void display() {
        System.out.println(id + " " + passenger + " " + source + " -> " + destination + " Fare: " + fare);
    }
}

public class _10_TransportTicketSystem {
    public static void main(String[] args) {
        List<Ticket> list = new ArrayList<>();

        list.add(new Ticket(1, "Aniket", "Pune", "Mumbai", 500));
        list.add(new Ticket(2, "Rahul", "Nashik", "Pune", 300));

        double total = 0;
        for (Ticket t : list) {
            total += t.fare;
            t.display();
        }

        System.out.println("Total Fare: " + total);
    }
}