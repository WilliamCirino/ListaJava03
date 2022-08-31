package lista3;

import java.util.Scanner;

public class PropriedadeDistributiva {

	public static void main(String[] args) {

//	1) Ler quatro n�meros inteiros e apresentar o resultado da adi��o e multiplica��o, baseando-se na utiliza��o do 
//conceito da propriedade distributiva. Ou seja, se forem lidas as vari�veis A, B, C, e D, devem ser somadas e multiplicadas 
//A com B, A com C e A com D. Depois B com C, B com D e por fim C com D. 
//Perceba que ser� necess�rio efetuar seis opera��es de adi��o e seis opera��es de multiplica��o e apresentar doze resultados de sa�da.

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

// Separa��o entre as opera��es 

		int multiplicacao1 = valorA * valorB, multiplicacao2 = valorA * valorC, multiplicacao3 = valorA * valorD, multiplicacao4 = valorB * valorC, multiplicacao5 = valorB * valorD, multiplicacao6 = valorC * valorD;



		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Opera��o somat�ria entre A+B �: "
						+ soma1);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Opera��o somat�ria entre A+C �: "
						+ soma2);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Opera��o somat�ria entre A+D �: "
						+ soma3);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Opera��o somat�ria entre B+C �: "
						+ soma4);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Opera��o somat�ria entre B+D �: "
						+ soma5);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Opera��o somat�ria entre C+D �: "
						+ soma6);

// Separando a impress�o de Somat�ria e Multiplica��o.
		System.out.println("");

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Opera��o multiplicat�ria entre A+B �: "
						+ multiplicacao1);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Opera��o multiplicat�ria entre A+C �: "
						+ multiplicacao2);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Opera��o multiplicat�ria entre A+D �: "
						+ multiplicacao3);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Opera��o multiplicat�ria entre B+C �: "
						+ multiplicacao4);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Opera��o multiplicat�ria entre B+D �: "
						+ multiplicacao5);

		System.out.println(
				"Utilizando o conceito de Propriedade Distributiva, o resultado da Opera��o multiplicat�ria entre C+D �: "
						+ multiplicacao6);

		sc.close();

	}

}
