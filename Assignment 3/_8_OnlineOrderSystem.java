import java.util.*;

class Order {
    int orderId;
    String customerName;
    List<Double> items;

    Order(int orderId, String customerName, Double... prices) { // varargs
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = Arrays.asList(prices);
    }

    double calculateTotal() {
        double sum = 0;
        for (double p : items)
            sum += p;
        return sum;
    }

    double applyGST() {
        return calculateTotal() * 1.18; // 18% GST
    }

    void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Final Bill: " + applyGST());
    }
}

public class _8_OnlineOrderSystem {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>();

        list.add(new Order(1, "Aniket", 100.0, 200.0, 50.0));
        list.add(new Order(2, "Rahul", 500.0, 300.0));

        for (Order o : list) {
            o.display();
        }
    }
}