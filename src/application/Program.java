package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	
	public static final double PI = 3.14159; //final - dps que declarada nao pode mais ser alterada, constante e não variável

	public static void main(String[] args) {//método main por padrão é static
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
//		Calculator calc = new Calculator(); //como eu transformei os objetos da classe "static", nao preciso mais instanciar
		
//		double c = calc.circumference(radius);
//		double v = calc.volume(radius);
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
				
//		double c = circumference(radius);
//		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", Calculator.PI);
		
		System.out.printf("What is the dollar price? ");
		double dolar = sc.nextDouble();
		System.out.printf("How many dollars will be bought? ");
		double dolarUnits = sc.nextDouble();
		double finalCalc = Calculator.dolar(dolar, dolarUnits);
		System.out.printf("Amount to be paid in reais: %.2f%n", finalCalc);
		
		sc.close();

	}
	
//	public static double circumference(double radius) {
//		//pq ao apagar o static nao funciona? nao posso chamar um método static dentro de outro static.
//		return 2.0 * PI * radius;
//	}
//	
//	public static double volume(double radius) { 
//		return (4.0 * PI * Math.pow(radius, 3))/3.0;
//	}

}
