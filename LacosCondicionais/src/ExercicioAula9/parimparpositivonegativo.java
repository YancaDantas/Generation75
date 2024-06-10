package ExercicioAula9;

import java.util.Scanner;

public class parimparpositivonegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		n = leia.nextInt();
		
		if (n > 0 && n % 2 == 0) {
			System.out.println("O Número "+n+" é par e positivo!");
			
		}else if (n > 0 && n % 2 == 1) {
			System.out.println("O Número "+n+" é ímpar e positivo!");
			
		}else if (n < 0 && n % 2 == 0) {
			System.out.println("O Número "+n+" é par e negativo!");

		} else {
			System.out.println("O Número "+n+" é ímpar e negativo!");

		}
		

	}

}
