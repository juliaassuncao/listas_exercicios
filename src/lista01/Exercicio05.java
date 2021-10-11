package lista01;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double peso1, peso2, peso3;
		
		System.out.println("Informe o peso do primeiro lixo:");
		peso1 = teclado.nextDouble();
		System.out.println("Informe o peso do segundo lixo:");
		peso2 = teclado.nextDouble();
		System.out.println("Informe o peso do terceiro lixo:");
		peso3 = teclado.nextDouble();
		System.out.println();
		
		if (peso1 < peso2 && peso1 < peso3) {
			System.out.println("Recolha o lixo 1");
		} else if (peso2 < peso1 && peso2 < peso3) {
			System.out.println("Recolha o lixo 2");
		} else {
			System.out.println("Recolha o lixo 3");
		}
		
		teclado.close();
	}
}
