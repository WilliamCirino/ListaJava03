package lista3;

import java.util.Scanner;

public class PropriedadeDistributiva {

	public static void main(String[] args) {

//	1) Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, baseando-se na utilização do 
//conceito da propriedade distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D, devem ser somadas e multiplicadas 
//A com B, A com C e A com D. Depois B com C, B com D e por fim C com D. 
//Perceba que será necessário efetuar seis operações de adição e seis operações de multiplicação e apresentar doze resultados de saída.

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de A.");

		int valorA = sc.nextInt();

		System.out.println("Digite o valor de B.");

		int valorB = sc.nextInt();

		System.out.println("Digite o valor de C.");

		int valorC = sc.nextInt();

		System.out.println("Digite o valor de D.");

		int valorD = sc.nextInt();

		int soma1 = valorA + valorB, soma2 = valorA + valorC, soma3 = valorA + valorD, soma4 = valorB + valorC, soma5 = valorB + valorD, soma6 = valorC + valorD;		

// Separação entre as operações 

		int multiplicacao1 = valorA * valorB, multiplicacao2 = valorA * valorC, multiplicacao3 = valorA * valorD, multiplicacao4 = valorB * valorC, multiplicacao5 = valorB * valorD, multiplicacao6 = valorC * valorD;



		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Operação somatória entre A+B é: "
						+ soma1);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Operação somatória entre A+C é: "
						+ soma2);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Operação somatória entre A+D é: "
						+ soma3);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Operação somatória entre B+C é: "
						+ soma4);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Operação somatória entre B+D é: "
						+ soma5);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Operação somatória entre C+D é: "
						+ soma6);

// Separando a impressão de Somatória e Multiplicação.
		System.out.println("");

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Operação multiplicatória entre A+B é: "
						+ multiplicacao1);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Operação multiplicatória entre A+C é: "
						+ multiplicacao2);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Operação multiplicatória entre A+D é: "
						+ multiplicacao3);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Operação multiplicatória entre B+C é: "
						+ multiplicacao4);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Operação multiplicatória entre B+D é: "
						+ multiplicacao5);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Operação multiplicatória entre C+D é: "
						+ multiplicacao6);

		sc.close();

	}

}
