package org.example;

public class Main {
    public static void main(String[] args) {
        double x1 = 2.0;
        double y1 = 2.0;
        double x2 = 8.0;
        double y2 = 10.0;
        double distance = DistanceCalculator.calculateDistance(x1, y1, x2, y2);
        System.out.println("Distance between the two points: " + distance);
    }
}
