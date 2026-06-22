public class DroneDeliverySystem {

    static class Drone {
        private String droneId;
        private int batteryPercentage;

        private static String companyName = "SkyLogistics";

        public Drone(String droneId, int batteryPercentage) {
            this.droneId = droneId;
            this.batteryPercentage = batteryPercentage;
        }

        public void startDelivery() {
            System.out.println(droneId + " started delivery.");
            batteryPercentage -= 10;
        }

        public void displayStatus() {
            System.out.println("Company: " + companyName);
            System.out.println("Drone ID: " + droneId);
            System.out.println("Battery: " + batteryPercentage + "%");
            System.out.println("---------------------");
        }
    }

    public static void main(String[] args) {

        Drone d1 = new Drone("DR101", 90);
        Drone d2 = new Drone("DR102", 80);
        Drone d3 = new Drone("DR103", 95);

        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
    }
}
