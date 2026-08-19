package Restaurant;

public class Order {

    private int orderId;
    private String customerName;
    private String foodName;
    private int quantity;
    private double unitPrice;
    private double totalAmount;

    public Order(int orderId, String customerName, String foodName,
                 int quantity, double unitPrice) {
        setOrderId(orderId);
        setCustomerName(customerName);
        setFoodName(foodName);
        setQuantity(quantity);
        setUnitPrice(unitPrice);
    }

    public void calculateOrderAmount() {
        setTotalAmount(getQuantity() * getUnitPrice());
    }

    public void displayOrderDetails() {
        System.out.println("ORDER DETAILS");
        System.out.println("----------------------------------------");
        System.out.printf("Order ID      : %d%n", getOrderId());
        System.out.printf("Customer Name : %s%n", getCustomerName());
        System.out.printf("Food Name     : %s%n", getFoodName());
        System.out.printf("Quantity      : %d%n", getQuantity());
        System.out.printf("Unit Price    : Rs.%.1f%n", getUnitPrice());
        System.out.printf("Total Amount  : Rs.%.1f%n", getTotalAmount());
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
