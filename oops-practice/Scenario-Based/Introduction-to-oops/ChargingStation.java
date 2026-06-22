public class ChargingStation {

    private static int totalStations = 0;
    private static double electricityRate = 8.5;

    private String stationId;
    private double unitsConsumed;

    public ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    public double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    public void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Electricity Rate: " + electricityRate);
        System.out.println("Bill Amount: " + calculateBill());
        System.out.println("-------------------------");
    }

    public static void setElectricityRate(double newRate) {
        electricityRate = newRate;
    }

    public static int getTotalStations() {
        return totalStations;
    }

    public static void main(String[] args) {

        ChargingStation s1 = new ChargingStation("CS101", 120);
        ChargingStation s2 = new ChargingStation("CS102", 95);
        ChargingStation s3 = new ChargingStation("CS103", 150);
        ChargingStation s4 = new ChargingStation("CS104", 80);
        ChargingStation s5 = new ChargingStation("CS105", 110);

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations: " + getTotalStations());

        setElectricityRate(10.0);

        System.out.println("\nAfter Rate Change:");
        s1.displayStationDetails();
    }
}
