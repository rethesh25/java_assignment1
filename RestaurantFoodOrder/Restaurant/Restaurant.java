package Restaurant;

public class Restaurant {

    private int restId;
    private String name;
    private String address;
    private final String[] foodItems = new String[3];
    private final double[] foodPrices = new double[3];

    public Restaurant(int restId, String name, String address,
                       String food1, double price1,
                       String food2, double price2,
                       String food3, double price3) {
        setRestId(restId);
        setName(name);
        setAddress(address);
        setFood1(food1);
        setPrice1(price1);
        setFood2(food2);
        setPrice2(price2);
        setFood3(food3);
        setPrice3(price3);
    }

    public void displayRestaurantDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("RESTAURANT DETAILS\n");
        sb.append("----------------------------------------\n");
        sb.append(String.format("Restaurant ID   : %d%n", restId));
        sb.append(String.format("Restaurant Name : %s%n", name));
        sb.append(String.format("Address         : %s%n", address));
        sb.append("\nFOOD MENU\n");
        sb.append("----------------------------------------\n");
        for (int i = 0; i < foodItems.length; i++) {
            sb.append(String.format("%d. %s - Rs.%.1f%n", i + 1, foodItems[i], foodPrices[i]));
        }
        System.out.print(sb);
    }

    public int getRestId() {
        return restId;
    }

    public void setRestId(int restId) {
        this.restId = restId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFood1() {
        return foodItems[0];
    }

    public void setFood1(String food1) {
        foodItems[0] = food1;
    }

    public String getFood2() {
        return foodItems[1];
    }

    public void setFood2(String food2) {
        foodItems[1] = food2;
    }

    public String getFood3() {
        return foodItems[2];
    }

    public void setFood3(String food3) {
        foodItems[2] = food3;
    }

    public double getPrice1() {
        return foodPrices[0];
    }

    public void setPrice1(double price1) {
        foodPrices[0] = price1;
    }

    public double getPrice2() {
        return foodPrices[1];
    }

    public void setPrice2(double price2) {
        foodPrices[1] = price2;
    }

    public double getPrice3() {
        return foodPrices[2];
    }

    public void setPrice3(double price3) {
        foodPrices[2] = price3;
    }
}
