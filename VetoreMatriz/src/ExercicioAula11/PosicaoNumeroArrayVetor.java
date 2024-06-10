package ExercicioAula11;

import java.util.Scanner;

public class PosicaoNumeroArrayVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[10];
        int numeroBuscado; 
        
		Scanner leia = new Scanner(System.in);

		 for (int x = 0; x < 10; x++) {
	            boolean repetido;
	            do {
	                repetido = false; 
	                System.out.println("\nEntre com o " + (x + 1) + "º número inteiro: ");
	                num[x] = leia.nextInt();

	                for (int i = 0; i < x; i++) {
	                    if (num[x] == num[i]) {
	                        repetido = true;
	                        System.out.println("Número repetido, por favor digite outro número.");
	                        break; 
	                    }
	                }
	            } while (repetido);
		 }
		 
		  System.out.println("\nQual número deseja saber a posição?");
	       numeroBuscado = leia.nextInt();

	    
	        boolean encontrado = false;
	        for (int i = 0; i < num.length; i++) {
	            if (num[i] == numeroBuscado) {
	                System.out.println("O número " + numeroBuscado + " foi encontrado na posição " + (i + 1) + " do vetor.");
	                encontrado = true;
	                break; 
	            }
	        }

	        
	        if (!encontrado) {
	            System.out.println("Não foi encontrado!");
	}
	}
	
}