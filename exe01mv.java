package matrizevetor1111;

import java.util.Scanner;

public class exe01mv {

	public static void main(String[] args) {
	// Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade/e o escreva em seguida.
	//Encontre ap�s a maior pontua��o e a apresente. 
		
		//Aqui � onde ele vai ler o meu codigo 
		Scanner leia = new Scanner(System.in); 
		 
		//aqui s�o as minhas variaveis
		double pts[] = new double[5];  
		double maior = 0.0;  
		int i;
		
		//aqui esta o la�o comdicional (for=para)
		for(i = 0; i < pts.length; i++) {
			System.out.println("Digite a pontua��o: "); 
			pts[i] = leia.nextDouble(); 
		
        //outro la�o o (if=se)		
		if(maior < pts[i]) { 
		   maior = pts[i];			   
		}	
		}

	   System.out.println("\n" + "A maior pontua��o �: " + maior + "!");	
	   leia.close(); 	 
}
}

