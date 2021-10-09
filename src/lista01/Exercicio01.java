package lista01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int anoNascimento, idadeAtual;
		
		System.out.println("Informe o seu ano de nascimento:");
		anoNascimento = teclado.nextInt();
		
		idadeAtual = 2021 - anoNascimento;
		
		System.out.println("No dia 31 de dezembro de 2021 você terá " + idadeAtual + " anos");
		
		teclado.close();
	}

}
