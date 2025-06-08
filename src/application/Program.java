package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

//		double xA, xB, xC, yA, yB , yC;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle(); 
		//variáveis do tipo Stack que contém o endereço 
		//de memória do objeto que está no heap
        //alocação dinâmica de memória;
		y = new Triangle();

		System.out.println("Enter the measures of triangle x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();

//		double p = (x.a + x.b + x.c) / 2.0;
//		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
//		
//		p = (y.a + y.b + y.c) / 2.0;
//		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - x.c));

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}

		sc.close();

	}

}
