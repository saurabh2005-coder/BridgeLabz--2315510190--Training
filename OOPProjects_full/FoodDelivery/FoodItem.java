package FoodDelivery;

public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int q) { this.quantity = q; }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return itemName + " x" + quantity + " = " + calculateTotalPrice();
    }
}
