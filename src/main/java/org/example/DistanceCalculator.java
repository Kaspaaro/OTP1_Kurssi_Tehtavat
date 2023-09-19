package org.example;

public class DistanceCalculator {
	
	public static double calculateDistance(double x1, double y1, double x2, double y2) {
      double distance = (y2-y1) * (y2-y1) + (x2-x1)*(x2-x1);
      return Math.sqrt(distance);
	}
}
