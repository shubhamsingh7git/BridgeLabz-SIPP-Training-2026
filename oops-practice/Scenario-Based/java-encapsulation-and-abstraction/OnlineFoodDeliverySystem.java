
abstract class FoodItem {

    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void displayItemDetails() {
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
        System.out.println("Quantity  : " + quantity);
    }
}

class VegItem extends FoodItem {

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem {

    private double serviceCharge;

    public NonVegItem(String itemName, double price,
                      int quantity, double serviceCharge) {
        super(itemName, price, quantity);
        this.serviceCharge = serviceCharge;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + serviceCharge;
    }
}

public class OnlineFoodDeliverySystem {

    public static void main(String[] args) {

        FoodItem veg =
                new VegItem("Paneer Tikka", 250, 2);

        FoodItem nonVeg =
                new NonVegItem("Chicken Biryani", 350, 2, 50);

        System.out.println("===== VEG ITEM =====");
        veg.displayItemDetails();
        System.out.println("Total Price : " + veg.calculateTotalPrice());

        System.out.println();

        System.out.println("===== NON VEG ITEM =====");
        nonVeg.displayItemDetails();
        System.out.println("Total Price : " + nonVeg.calculateTotalPrice());
    }
}
