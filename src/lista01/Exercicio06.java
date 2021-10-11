package lista01;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cupom;
		double valorCompra, valorFinal;
		
		System.out.print("Informe o valor da compra:\nR$");
		valorCompra = teclado.nextDouble();
		System.out.println("Informe o cupom:");
		cupom = teclado.next();
		System.out.println();
		
		if (cupom.equalsIgnoreCase("DIADEFESTA")) {
			valorFinal = valorCompra - (valorCompra * 0.03);
			System.out.println("Valor final:\nR$" + valorFinal);
		} else {
			System.out.println("Valor final:\nR$" + valorCompra);
		}
		
		teclado.close();
	}
}
