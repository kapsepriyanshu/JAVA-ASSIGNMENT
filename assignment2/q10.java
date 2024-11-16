class Vehicle {
    protected String regnNumber, color, ownerName;
    protected int speed;

    void showData() {
        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle {
    private int routeNumber;

    Bus(String regnNumber, String color, String ownerName, int speed, int routeNumber) {
        this.regnNumber = regnNumber;
        this.color = color;
        this.ownerName = ownerName;
        this.speed = speed;
        this.routeNumber = routeNumber;
    }

    @Override
    void showData() {
        super.showData();
        System.out.println("Registration: " + regnNumber + ", Color: " + color + ", Owner: " + ownerName + 
                           ", Speed: " + speed + ", Route: " + routeNumber);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    Car(String regnNumber, String color, String ownerName, int speed, String manufacturerName) {
        this.regnNumber = regnNumber;
        this.color = color;
        this.ownerName = ownerName;
        this.speed = speed;
        this.manufacturerName = manufacturerName;
    }

    @Override
    void showData() {
        super.showData();
        System.out.println("Registration: " + regnNumber + ", Color: " + color + ", Owner: " + ownerName + 
                           ", Speed: " + speed + ", Manufacturer: " + manufacturerName);
    }
}

class VehicleTest {
    public static void main(String[] args) {
        Bus bus = new Bus("KA01AB1234", "Yellow", "John", 60, 25);
        Car car = new Car("KA02CD5678", "Red", "Alice", 100, "Toyota");
        bus.showData();
        car.showData();
    }
}
