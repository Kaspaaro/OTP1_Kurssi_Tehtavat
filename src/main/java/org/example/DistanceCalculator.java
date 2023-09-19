package org.example;

public class DistanceCalculator {
	
	public static double calculateDistance(double x1, double y1, double x2, double y2) {
      double distance = (y2-y1) * (y2-y1) + (x2-x1)*(x2-x1);
      return Math.sqrt(distance);
	}
	 public static void main(String[] args) {
		 
	        double x1 = 1.0;
	        double y1 = 2.0;
	        double x2 = 4.0;
	        double y2 = 9.0;
	        
	        double distance = calculateDistance(x1, y1, x2, y2);
	        System.out.println("Distance between the two points: " + distance);
	    }
}
