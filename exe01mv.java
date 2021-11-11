package matrizevetor1111;

import java.util.Scanner;

public class exe01mv {

	public static void main(String[] args) {
	// Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade/e o escreva em seguida.
	//Encontre após a maior pontuação e a apresente. 
		
		//Aqui é onde ele vai ler o meu codigo 
		Scanner leia = new Scanner(System.in); 
		 
		//aqui são as minhas variaveis
		double pts[] = new double[5];  
		double maior = 0.0;  
		int i;
		
		//aqui esta o laço comdicional (for=para)
		for(i = 0; i < pts.length; i++) {
			System.out.println("Digite a pontuação: "); 
			pts[i] = leia.nextDouble(); 
		
        //outro laço o (if=se)		
		if(maior < pts[i]) { 
		   maior = pts[i];			   
		}	
		}

	   System.out.println("\n" + "A maior pontuação é: " + maior + "!");	
	   leia.close(); 	 
}
}

