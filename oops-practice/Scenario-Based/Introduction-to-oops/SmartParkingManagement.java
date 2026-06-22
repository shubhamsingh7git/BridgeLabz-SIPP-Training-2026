class Vehicle {
    String vehicleNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void display() {
        System.out.println(vehicleNumber + " | " + ownerName + " | " + vehicleType);
    }
}

public class SmartParkingManagement {

    public static void displayCars(Vehicle[] vehicles) {
        System.out.println("\nCars:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Car")) {
                v.display();
            }
        }
    }

    public static void displayBikes(Vehicle[] vehicles) {
        System.out.println("\nBikes:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Bike")) {
                v.display();
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Vehicle("HP01A101", "Rahul", "Car"),
            new Vehicle("HP01A102", "Aman", "Bike"),
            new Vehicle("HP01A103", "Priya", "Car"),
            new Vehicle("HP01A104", "Neha", "Bike"),
            new Vehicle("HP01A105", "Rohit", "Car"),
            new Vehicle("HP01A106", "Ankit", "Bike"),
            new Vehicle("HP01A107", "Pooja", "Car"),
            new Vehicle("HP01A108", "Karan", "Bike"),
            new Vehicle("HP01A109", "Simran", "Car"),
            new Vehicle("HP01A110", "Vikas", "Bike")
        };

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}
