import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		

		int codigo1;

		int codigo2;

		int qtdcodigo1;

		int qtdcodigo2;

		double valor1;

		double valor2;

		System.out.println("Favor informar o código da primeira peça:");

		codigo1 = sc.nextInt();

		System.out.println("Favor informar a quantidade de peças:");

		qtdcodigo1 = sc.nextInt();

		System.out.println("Favor informar o valor da peça:");

		valor1 = sc.nextDouble();

		System.out.println("Favor informar o código da segunda peça:");

		codigo2 = sc.nextInt();

		System.out.println("Favor informar a quantidade de peças:");

		qtdcodigo2 = sc.nextInt();

		System.out.println("Favor informar o valor da peça:");

		valor2 = sc.nextDouble();

		double valortotal = (qtdcodigo1*valor1)+(qtdcodigo2*valor2);

		System.out.printf("Valor total a pagar: R$%.2f",valortotal);

		sc.close();
	}
}
