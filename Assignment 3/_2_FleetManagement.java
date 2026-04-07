class Vehicle {
    String brand;
    int speed;

    static {
        System.out.println("Fleet System Initialized");
    }

    {
        System.out.println("Vehicle Object Created");
    }

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void updateSpeed(int speed) {
        this.speed = speed;
    }

    void display() {
        System.out.println(brand + " Speed: " + speed);
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }
}

class Bike extends Vehicle {
    int mileage;

    Bike(String brand, int speed, int mileage) {
        super(brand, speed);
        this.mileage = mileage;
    }
}

public class _2_FleetManagement {
    public static void main(String[] args) {
        Car c = new Car("Toyota", 120, "Petrol");
        Bike b = new Bike("Honda", 80, 40);

        c.display();
        b.display();
    }
}