package lista3;

import java.util.Scanner;

public class NovoSalario {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Digite o valor do seu salário mensal.");
	float sm = sc.nextFloat();
	
	System.out.println("Digite o valor da porcentagem do reajuste.");
	float pr = sc.nextFloat();
	
	float ns = sm/100*pr + sm;
	
	System.out.println("O novo valor do salário após o reajuste é de: " + ns);
	sc.close();

	}

}
