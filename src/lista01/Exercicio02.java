package lista01;

import java.util.Scanner;
import java.text.DecimalFormat; 

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		int tempoFilmeMin, tempoFilmeSeg;
		double tempoFilmeHora;
		
		System.out.println("Informe o tempo do filme em minutos: ");
		tempoFilmeMin = teclado.nextInt();
		
		tempoFilmeSeg = tempoFilmeMin * 60;
		tempoFilmeHora = tempoFilmeMin / 60.0;
		
		System.out.println("O filme tem " + tempoFilmeSeg + " segundos de duração");
		System.out.println("O filme tem " + df.format(tempoFilmeHora) + " horas de duração");
		
		
		
		teclado.close();
	}

}
