package lista01;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Informe um n�mero inteiro:");
		A = teclado.nextInt();
		System.out.println("Informe outro n�mero inteiro:");
		B = teclado.nextInt();
		
		A = A + B;
		B = A - B;
		A = A - B;
		
		System.out.println("\nN�mero 1: " + A + "\nN�mero 2: " + B);
		
		teclado.close();
	}
}
