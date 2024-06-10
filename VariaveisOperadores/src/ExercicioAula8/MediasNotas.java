package ExercicioAula8;

import java.util.Scanner;

public class MediasNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1, nota2, nota3, nota4, media; 
			Scanner leia = new Scanner(System.in);
			
			
			System.out.println("\nEntre com a primeira nota: ");
			nota1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			nota2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			nota3 = leia.nextFloat();
			System.out.println("\nEntre com a quarta nota: ");
			nota4 = leia.nextFloat();
			
			media = (nota1+nota2+nota3+nota4) / 4;
			
			System.out.printf("\nSua média foi de: %.2f",media); 
			

	}

}
