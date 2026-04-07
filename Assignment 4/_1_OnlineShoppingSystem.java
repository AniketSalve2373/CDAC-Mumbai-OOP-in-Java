import java.util.*;

// Product class
class Product {
    int productId;
    String productName;
    double price;

    Product(int id, String name, String priceStr) {
        this.productId = id;
        this.productName = name;
        this.price = Double.parseDouble(priceStr); // Wrapper class
    }
}

// Order class
class Order {
    String customerName;
    List<Product> products = new ArrayList<>();

    Order(String name) {
        this.customerName = name;
    }

    void addProduct(Product p) {
        products.add(p);
    }

    double calculateTotal() {
        double total = 0;
        for (Product p : products)
            total += p.price;
        return total;
    }

    double calculateTotal(double discount) { // overloading
        return calculateTotal() - (calculateTotal() * discount / 100);
    }

    String generateBill() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer: ").append(customerName).append("\n");
        for (Product p : products) {
            sb.append(p.productName).append(" - ").append(p.price).append("\n");
        }
        sb.append("Total: ").append(calculateTotal());
        return sb.toString();
    }
}

// Payment interface
interface Payment {
    void pay(double amount);

    void refund(double amount);
}

// UPI Payment
class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }

    public void refund(double amount) {
        System.out.println("Refund via UPI: " + amount);
    }
}

// Card Payment
class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid using Card: " + amount);
    }

    public void refund(double amount) {
        System.out.println("Refund via Card: " + amount);
    }
}

// Main class
public class _1_OnlineShoppingSystem {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();

            Order order = new Order(name);

            // sample products
            order.addProduct(new Product(1, "Laptop", "50000"));
            order.addProduct(new Product(2, "Mouse", "500"));

            double total = order.calculateTotal();
            System.out.println(order.generateBill());

            System.out.println("Choose Payment: 1.UPI 2.Card");
            int choice = sc.nextInt();

            Payment payment;

            if (choice == 1)
                payment = new UPIPayment();
            else if (choice == 2)
                payment = new CardPayment();
            else
                throw new Exception("Invalid payment option");

            payment.pay(total);

            System.out.println("Final Amount: " + total);
            System.out.println("Payment Successful");

        } catch (NumberFormatException e) {
            System.out.println("Invalid price format");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}