package lista3;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número entre 1 e 7.");

		int numero = sc.nextInt();

		if (numero == 1) {
			System.out.println("Domingo.");
		} else if (numero == 2) {
			System.out.println("Segunda.");
		} else if (numero == 3) {
			System.out.println("Terça.");
		} else if (numero == 4) {
			System.out.println("Quarta.");
		} else if (numero == 5) {
			System.out.println("Quinta.");
		} else if (numero == 6) {
			System.out.println("Sexta.");
		} else if (numero == 7) {
			System.out.println("Sábado.");
		} else {
			System.out.println("O número digitado não corresponde a um dia da semana.");
		}
		sc.close();
	}

}
