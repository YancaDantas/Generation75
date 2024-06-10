package ExercicioAula8;

import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1, n2, n3, n4, diferenca;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite o primeiro número:");
		n1 = leia.nextFloat();
		System.out.println("\nDigite o segundo número:");
		n2 = leia.nextFloat();
		System.out.println("\nDigite o terceiro número:");
		n3 = leia.nextFloat();
		System.out.println("\nDigite o quarto número:");
		n4 = leia.nextFloat();
		
		diferenca = ((n1 * n2)-(n3 * n4));
		
		System.out.println("\nA diferença do produto é:" +diferenca);
		

		

	}

}
