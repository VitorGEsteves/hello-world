package util;

public class Calculator {

	public static final double PI = 3.14159; //objeto que independe de qualquer entrada
	
	public static final double IOF = 0.06;

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return (4.0 * PI * Math.pow(radius, 3)) / 3.0;
	}
	
	public static double dolar(double dolar, double units) {
		return ((dolar * units) * IOF) + (dolar * units)  ;
	}

}
