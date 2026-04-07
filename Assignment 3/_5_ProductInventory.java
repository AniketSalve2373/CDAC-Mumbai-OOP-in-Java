import java.util.*;

class Product {
    int id;
    String name;
    double price;
    int qty;

    Product(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    void updatePrice(double price) {
        this.price = price;
    }

    void updatePrice(double price, double discount) {
        this.price = price - (price * discount / 100);
    }

    double value() {
        return price * qty;
    }
}

public class _5_ProductInventory {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product(1, "Laptop", 50000, 2));
        list.add(new Product(2, "Phone", 20000, 5));

        double total = 0;
        for (Product p : list) {
            total += p.value();
            System.out.println(p.name + " Value: " + p.value());
        }

        System.out.println("Total Inventory Value: " + total);
    }
}