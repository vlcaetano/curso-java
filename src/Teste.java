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

		System.out.println("Favor informar o c�digo da primeira pe�a:");

		codigo1 = sc.nextInt();

		System.out.println("Favor informar a quantidade de pe�as:");

		qtdcodigo1 = sc.nextInt();

		System.out.println("Favor informar o valor da pe�a:");

		valor1 = sc.nextDouble();

		System.out.println("Favor informar o c�digo da segunda pe�a:");

		codigo2 = sc.nextInt();

		System.out.println("Favor informar a quantidade de pe�as:");

		qtdcodigo2 = sc.nextInt();

		System.out.println("Favor informar o valor da pe�a:");

		valor2 = sc.nextDouble();

		double valortotal = (qtdcodigo1*valor1)+(qtdcodigo2*valor2);

		System.out.printf("Valor total a pagar: R$%.2f",valortotal);

		sc.close();
	}
}
