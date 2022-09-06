package lista3;

import java.util.Scanner;

public class ConversaoRealEmDolar {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a cotação do Dolar na data de hoje.");
		
		float cotacaoDolar = sc.nextFloat();
		
		System.out.println("Digite o valor disponível para ser convertido para R$.");
		
		float valorConversao = sc.nextFloat();
		
		float valorReal = valorConversao/cotacaoDolar;
		
		System.out.println("O valor final convertido em Reais é de: " + valorReal + " Reais");
		
		sc.close();
		
	

	}

}
