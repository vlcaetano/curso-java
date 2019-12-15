package application;

import java.util.Scanner;

public class Program_Secao10_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero de linhas e colunas da matriz: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int i = 0; i < mat.length; i++) {
			System.out.println("Linha " + (i+1) + " da matriz: ");
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Numero para ser encontrado na matriz: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == num) {
					System.out.println("Position " + i + ", " + j);
					
					if (m > 1 && i < (mat.length - 1)) { // abaixo
						System.out.println("Down: " + mat[i + 1][j]);
					}
					
					if (m > 1 && i > 0) { // acima
						System.out.println("Up: " + mat[i - 1][j]);
					}
					
					if (n > 1 && j < (mat[i].length - 1)) { // a direita
						System.out.println("Right: " + mat[i][j + 1]);
					}
					
					if (n > 1 && j > 0) { // a esquerda
						System.out.println("Left: " + mat[i][j - 1]);
					}
					
					System.out.println();
				}
			}
		}
		
		
		sc.close();

	}

}
