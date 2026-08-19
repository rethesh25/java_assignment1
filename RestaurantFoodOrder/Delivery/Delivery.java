package Delivery;

import Restaurant.Restaurant;
import Restaurant.Order;

public class Delivery {

    private static final String LINE = "========================================";

    public static void main(String[] args) {
        printHeader();

        Restaurant restaurant = buildRestaurant();
        restaurant.displayRestaurantDetails();
        System.out.println();

        Order order = buildOrder();
        processOrder(order);
        System.out.println();

        demonstrateEncapsulation(restaurant);
        System.out.println();

        demonstrateSetter(restaurant);

        System.out.println(LINE);
    }

    private static void printHeader() {
        System.out.println(LINE);
        System.out.println(" RESTAURANT FOOD ORDER SYSTEM");
        System.out.println(LINE);
    }

    private static Restaurant buildRestaurant() {
        return new Restaurant(
                101, "RKode Restaurant", "Chennai",
                "Pizza", 250,
                "Burger", 150,
                "Pasta", 200
        );
    }

    private static Order buildOrder() {
        return new Order(5001, "Arun", "Pizza", 2, 250);
    }

    private static void processOrder(Order order) {
        order.calculateOrderAmount();
        order.displayOrderDetails();
    }

    private static void demonstrateEncapsulation(Restaurant restaurant) {
        System.out.println("Accessing private data using getter:");
        System.out.println("Restaurant ID (via getRestId()) : " + restaurant.getRestId());
    }

    private static void demonstrateSetter(Restaurant restaurant) {
        System.out.println("Changing restaurant name using setter...");
        restaurant.setName("RKode Food Corner");
        restaurant.displayRestaurantDetails();
    }
}

