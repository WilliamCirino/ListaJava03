package lista3;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu peso em Kg.");

		float peso = sc.nextFloat();

		System.out.println("Digite o sua altura em metros.");

		float altura = sc.nextFloat();

		double imc = peso / Math.pow(altura, 2);

		if (imc < 18.5) {
			System.out.println("Magreza.IMC é de: " + imc);
		} else if (imc < 24.9) {
			System.out.println("Saudável.IMC é de: " + imc);
		} else if (imc < 29.9) {
			System.out.println("Sobrepeso. IMC é de: " + imc);
		} else if (imc < 30.0) {
			System.out.println("Obesidade Grau I. IMC é de: " + imc); 		
		} else if (imc < 39.9) {
			System.out.println("Obesidade Severa. IMC é de: " + imc);		
		} else if (imc > 40.0) {
			System.out.println("Obesidade Grave. IMC é de: " + imc);
		} else {
			System.out.println("Nenhum valor correspondente. IMC é de:" + imc);
		}
		
		
		/*	if (imc > 40.0) {
			System.out.println("Obesidade Grave. IMC é de: " + imc);
		} else if (imc < 39.9) {
			System.out.println("Obesidade Severa. IMC é de: " + imc);
		} else if (imc < 30.0) {
			System.out.println("Obesidade Grau I. IMC é de: " + imc);
		} else if (imc < 29.9) {
			System.out.println("Sobrepeso. IMC é de: " + imc);
		} else if (imc < 24.9) {
			System.out.println("Saudável.IMC é de: " + imc);
		} else if (imc < 18.5) {
			System.out.println("Magreza.IMC é de: " + imc);
		} else {
			System.out.println("Nenhum valor correspondente. IMC é de:" + imc);
		} */
		
		
		sc.close();
	}

}
