import java.util.Locale;
import java.util.Scanner;

public class Exercicios_01_Estrutura_Sequencial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
				
		double pi = 3.14159;
		double area;
		double raio;
		
		System.out.println("Digite o raio: ");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("Area do circulo = %.4f%n", area);

		sc.close();
		
		
	}

}
