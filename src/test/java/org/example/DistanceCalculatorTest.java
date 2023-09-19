package org.example;


import org.junit.jupiter.api.Assertions;

import static junit.framework.TestCase.assertEquals;

class DistanceCalculatorTest {
    @org.junit.jupiter.api.Test
    void calculateDistance() {
        double result = DistanceCalculator.calculateDistance(2.0,2.0,8.0,10.0);
        double DELTA = 0.00001;
        Assertions.assertEquals(10.0, result,DELTA, "Distance Between Two Points is 10");
    }
}