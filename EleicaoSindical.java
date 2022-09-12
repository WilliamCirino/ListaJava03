package lista3;

import java.util.Scanner;

public class EleicaoSindical {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	//CANDIDATO A
	System.out.println("Digite a quantidade de votos válidos para o candidato A.");
	int validoA = sc.nextInt();
	
	//CANDIDATO B
	System.out.println("Digite a quantidade de votos válidos para o candidato B.");
	int validoB = sc.nextInt();
	
	//CANDIDATO C
	System.out.println("Digite a quantidade de votos válidos para o candidato C.");
	int validoC = sc.nextInt();
	
	System.out.println("Digite a quantidade total de votos nulos.");
	int totalnulos = sc.nextInt();
	
	System.out.println("Digite a quantidade total de votos brancos.");
	int totalBrancos = sc.nextInt();
	
	int totalEleitores = validoA+validoB+validoC;
	int totalvalidosEleitores = validoA+validoB+validoC;
	
	
	//porcentagem de validos sobre o total de eleitores
	int validosEleitores = totalEleitores/totalvalidosEleitores*100;
	
	//porcentagem de validos para cada candidato
	int percentualValidosA = totalEleitores/validoA*100;
	int percentualValidosB = totalEleitores/validoB*100;
	int percentualValidosC = totalEleitores/validoC*100;
	
	//porcentagem de nulos sobre o total de eleitores
	int percentualNulos = totalEleitores/100*totalnulos;
	//porcentagem de brancos sobre o total de eleitores
	int percentualBrancos = totalEleitores/100*totalBrancos;
	
	System.out.println("A quantidade de votos válidos para o candidato A é de: " + validoA + " E sua porcentagem sobre o total Votos é de: " +percentualValidosA);
	
	System.out.println("A quantidade de votos válidos para o candidato B é de: " + validoB + " E sua porcentagem sobre o total Votos é de: " +percentualValidosB);
	
	System.out.println("A quantidade de votos válidos para o candidato C é de: " + validoC + " E sua porcentagem sobre o total Votos é de: " +percentualValidosC);
	
	
	System.out.println("A quantidade total de votos Nulos é de: "+totalnulos + " E sua porcentagem sobre o total de Eleitores é de: "+percentualNulos);
	System.out.println("A quantidade total de votos Brancos é de: "+totalBrancos + " E sua porcentagem sobre o total de Eleitores é de: "+percentualBrancos);
	sc.close();
	}

}
