package ExercicioAula9;

import java.util.Scanner;

public class CondicionalIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de A: ");
		a = leia.nextInt();
		System.out.println("\nDigite o valor de B: ");
		b = leia.nextInt();
		System.out.println("\nDigite o valor de C: ");
		c = leia.nextInt();
		
		soma = a + b;
		
		if (a + b > c) {
			System.out.println(" "+a+" + "+b+" = "+soma+" > "+c+". \n A soma de A + B é maior que C.");
		
		}else if (a + b < c) {
			System.out.println(" "+a+" + "+b+" = "+soma+" < "+c+". \n A soma de A + B é menor que C.");
	
		}else {
			System.out.println(" "+a+" + "+b+" = "+c+". \n A soma de A + B é igual a C.");
		}
		
		
		

	}

}
