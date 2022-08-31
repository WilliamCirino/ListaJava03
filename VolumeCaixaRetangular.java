package lista3;

import java.util.Scanner;

public class VolumeCaixaRetangular {

	public static void main(String[] args) {
		
//2) Elaborar um programa que calcule e apresente o volume 
//de uma caixa retangular, por meio da fórmula VOLUME=COMPRIMENTO * LARGURA * ALTURA.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o comprimento da caixa retangular.");
		
		float comprimento = sc.nextFloat();
		
		System.out.println("Digite a largura da caixa retangular.");
		
		float largura = sc.nextFloat();
		
		System.out.println("Digite a altura da caixa retangular");
		
		float altura = sc.nextFloat();
		
		float volume = comprimento * largura * altura;
		
		System.out.println("O volume da caixa retangular é: " + volume);
		
		sc.close();
		
		
		
	}

}
