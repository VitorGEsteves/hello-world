package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program3 {

	private static final String TRUE = "y";

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println();
		System.out.println("Is there an initial deposity (y/n)? ");
		String deposity = sc.nextLine();
		System.out.println("Enter initial deposit value: ");
		double bankValue = sc.nextDouble();
		System.out.printf("Account data: %n");
		System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f%n", number, name, bankValue);
		
		if (TRUE.equals(deposity)) {
			System.out.println("Enter a deposit value: ");
			double deposityAdd = sc.nextDouble();
			Bank bank = new Bank(number, name, bankValue, deposityAdd);
//			double newStatement = bank.addNewStatement(bankValue, deposityAdd);
			System.out.printf("Account data: %n");
			System.out.println(bank);
		} else {
			Bank bank = new Bank(number, deposity, bankValue);
//			double newStatement = bank.addNewStatement(bankValue, deposityAdd);
			System.out.printf("Account data: %n");
			System.out.println(bank);
		}
		sc.close();

	}

}
