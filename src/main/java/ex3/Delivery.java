package ex3;

public class Delivery {
    public static double calculateCost(int distance, double weight) {
        double cost = 0;

        if (distance <= 50) {
            cost = 10;
        } else {
            cost = 10 + 0.5 * (distance - 50);
        }

        if (weight >= 10 && weight <= 25) {
            cost += 2;
        } else {
            cost += 5;
        }

        return cost;
    }
}