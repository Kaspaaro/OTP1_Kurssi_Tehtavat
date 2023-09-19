package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DistanceCalculatorTest {
    @Test
    public void calculateDistance() {
        double result = DistanceCalculator.calculateDistance(2.0,2.0,8.0,10.0);
        double DELTA = 0;
        assertEquals(10.0, result,DELTA, "Distance Between Two Points is 10");
    }
}