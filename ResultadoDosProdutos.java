package lista3;

import java.util.Scanner;

public class ResultadoDosProdutos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da variavel A.");

		int valorA = sc.nextInt();

		System.out.println("Digite o valor da variavel B.");

		int valorB = sc.nextInt();

		System.out.println("Digite o valor da variavel C.");

		int valorC = sc.nextInt();

		System.out.println("Digite o valor da variavel D.");

		int valorD = sc.nextInt();

		int resultadoP = valorA * valorC;

		int resultadoS = valorB + valorD;

		System.out.println("O Resultado do produto A x C é de: " + resultadoP);
		System.out.println("O Resultado da soma da variavel B + D é de: " + resultadoS);

		sc.close();

	}

}
