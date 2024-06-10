package Aula10;

import java.util.Scanner;

public class multiplode3e5For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2, x;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o primeiro número:");
		n1 = leia.nextInt();
		System.out.println("\nEntre com o segundo número:");
		n2 = leia.nextInt();
		
		if (n1 > n2);
			System.out.println("Intervalo Invalido!");
			
		for(x=n1; x<=n2;x++) {
			
				if (x % 3 == 0 && x % 5 == 0) {
				System.out.println(" No intervalo entre "+n1+" e "+n2+": \n "+x+" é múltiplo de 3 e 5.");
			 
		 } 
			
		}
	
	}

}
