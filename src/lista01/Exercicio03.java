package lista01;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Informe um número inteiro:");
		A = teclado.nextInt();
		System.out.println("Informe outro número inteiro:");
		B = teclado.nextInt();
		
		A = A + B;
		B = A - B;
		A = A - B;
		
		System.out.println("\nNúmero 1: " + A + "\nNúmero 2: " + B);
		
		teclado.close();
	}
}
