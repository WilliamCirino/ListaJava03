package lista3;

import java.util.Scanner;

public class ResultadoDoQuadrado {

	public static void main(String[] args) {
//3) Ler dois inteiros (variáveis A e B) e imprimir o resultado 
//do quadrado da diferença do primeiro valor pelo segundo.

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor.");

		double valor1 = sc.nextFloat();

		System.out.println("Digite o segundo valor.");

		double valor2 = sc.nextFloat();

		double resultado = Math.pow(valor1, 2) - Math.pow(valor2, 2);

		System.out.println("O resultado do quadrado da diferença do primeiro valor pelo segundo é: " + resultado);
		sc.close();

	}

}
