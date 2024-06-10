package ExercicioAula11;

import java.util.Scanner;

public class NumerosDiagonaisMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] valores = new int[3][3];
		int linha, coluna, somaDiagonal1=0, somaDiagonal2=0;
	
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\nEntre com o valor da linha "+linha+" e coluna "+coluna+"");
			    valores[linha][coluna] = leia.nextInt();
			   
			    
	    }

       }
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {	
			
			}
			
			
	   }
		System.out.println("Elementos da diagonal principal: "+valores[0][0]+", "+valores[1][1]+", "+valores[2][2]+"");
		System.out.println("Elementos da diagonal secundária: "+valores[0][2]+", "+valores[1][1]+", "+valores[2][0]+"");	
		
		 somaDiagonal1 = valores[0][0] + valores [1][1] + valores[2][2];
		 somaDiagonal2 = valores[0][2] + valores [1][1] + valores[2][0];
		System.out.println("A soma dos valores da Diagonal Principal é: "+somaDiagonal1);
		System.out.println("A soma dos valores da Diagonal Secundária é: "+somaDiagonal2);
	}
}
