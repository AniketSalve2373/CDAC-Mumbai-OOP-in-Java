// InventoryDemo.java

// Generic Inventory Class
class Inventory<T> {
    private T product;

    // Add product
    public void addProduct(T product) {
        this.product = product;
    }

    // Retrieve product
    public T getProduct() {
        return product;
    }

    // Display product details
    public void displayProduct() {
        System.out.println(product);
    }
}

// Electronics Class
class Electronics {
    private String name;
    private double price;

    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Electronics [Name: " + name + ", Price: " + price + "]";
    }
}

// Clothing Class
class Clothing {
    private String brand;
    private String size;

    public Clothing(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing [Brand: " + brand + ", Size: " + size + "]";
    }
}

// Main Class
public class InventoryDemo {
    public static void main(String[] args) {

        // Electronics Inventory
        Inventory<Electronics> electronicsInventory = new Inventory<>();
        Electronics phone = new Electronics("Smartphone", 29999.99);
        electronicsInventory.addProduct(phone);

        System.out.println("Electronics Product:");
        electronicsInventory.displayProduct();

        // Clothing Inventory
        Inventory<Clothing> clothingInventory = new Inventory<>();
        Clothing shirt = new Clothing("Nike", "M");
        clothingInventory.addProduct(shirt);

        System.out.println("\nClothing Product:");
        clothingInventory.displayProduct();
    }
}