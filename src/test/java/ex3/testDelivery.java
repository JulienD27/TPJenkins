package ex3;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class testDelivery {
    @Test
    public void testCalculateCostForShortDistanceAndLightWeight () {
        double cost = Delivery.calculateCost(30, 5);
        assertEquals(10, cost, 5.0);
    }

    @Test
    public void testCalculateCostForShortDistanceAndHeavyWeight () {
        double cost = Delivery.calculateCost(30, 20);
        assertEquals(15, cost, 3.0);
    }

    @Test
    public void testCalculateCostForLongDistanceAndLightWeight () {
        double cost = Delivery.calculateCost(100, 5);
        assertEquals(35, cost, 5.0);
    }

    @Test
    public void testCalculateCostForLongDistanceAndHeavyWeight () {
        double cost = Delivery.calculateCost(100, 20);
        assertEquals(40, cost, 3.0);
    }
}