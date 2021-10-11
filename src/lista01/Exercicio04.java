package lista01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double distancia;
		
		System.out.println("Informe a distância do inimigo em cm:");
		distancia = teclado.nextDouble();
		
		if (distancia < 70) {
			System.out.println("\nATIVADO");
		} else {
			System.out.println("\nDESATIVADO");
		}
		
		
		teclado.close();
	}

}
