package application;

import java.util.Scanner;

import entities.ContaBancaria;

public class Program_Secao09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		int numConta;
		String nome;
		char confirmacao;
		double deposito, retirada;
		ContaBancaria cb;
		
		System.out.print("Enter account number: ");
		numConta = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		nome = sc.nextLine();
		
		cb = new ContaBancaria(numConta, nome);
		
		System.out.print("Is there na initial deposit (y/n)? ");
		confirmacao = sc.next().charAt(0);
		
		if (confirmacao == 'y') {
			System.out.print("Enter initial deposit value: ");
			deposito = sc.nextDouble();
			cb.adicionarSaldo(deposito);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(cb);
		
		System.out.print("Enter a deposit value: ");
		deposito = sc.nextDouble();
		cb.adicionarSaldo(deposito);
		System.out.println("Updated account data:");
		System.out.println(cb);
		
		System.out.print("Enter a withdraw value: ");
		retirada = sc.nextDouble();
		cb.removerSaldo(retirada);
		System.out.println("Updated account data:");
		System.out.println(cb);
		
		sc.close();
	}
}
