package homework;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private static final double SMALL_PIZZA = 5.0;
    private static final double MEDIUM_PIZZA = 10.0;
    private static final double LARGE_PIZZA = 15.0;

    private static List<Double> dailySales = new ArrayList<>();

    public double calculatePizzaPrice(String size) {
        double totalPrice = 0;
        switch (size.toLowerCase()) {
            case "small":
                totalPrice += SMALL_PIZZA;
                break;
            case "medium":
                totalPrice += MEDIUM_PIZZA;
                break;
            case "large":
                totalPrice += LARGE_PIZZA;
                break;
            default:
                System.out.println("Please choose from small, medium or large.");
                return 0;
        }
        dailySales.add(totalPrice);
        return totalPrice;
    }

        public void printTotalRevenue() {
            double totalRevenue = 0.0;
            for (Double sale : dailySales) {
                totalRevenue += sale;
            }
            System.out.println("Total revenue for the day: $" + totalRevenue);
        }
    }
