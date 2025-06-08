package entities;

import java.io.PrintStream;

public class Bank {

	public Bank(int number, String holder, double bankValue, double deposityAdd) {
		super();
		this.number = number;
		this.deposityAdd = deposityAdd;
		this.holder = holder;
		addNewStatement(bankValue, deposityAdd);
	}

	public Bank(int number, String holder, double bankValue) {
		super();
		this.number = number;
		this.holder = holder;
		this.bankValue = bankValue;
	}

	private int number;
	private double bankValue;
	private String holder;
	private double deposityAdd;

	public double getBankValue() {
		return bankValue;
	}

	public void setBankValue(double bankValue) {
		this.bankValue = bankValue;
	}

	public double getDeposityAdd() {
		return deposityAdd;
	}

	public void setDeposityAdd(double deposityAdd) {
		this.deposityAdd = deposityAdd;
	}

	public double addNewStatement(double statement, double newDeposit) {
		return this.bankValue = statement + newDeposit;
	}

	public String toString() {
		return "Account: " 
				+ number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", bankValue);
	}

}
