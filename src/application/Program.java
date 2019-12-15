package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dollar price in Reais: ");
		CurrencyConverter.dollarPrice = sc.nextDouble();
		System.out.println("Dollars bought: ");
		CurrencyConverter.dollarsBought = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = R$ %.2f%n", CurrencyConverter.finalPrice());
		
		sc.close();
	}
}
