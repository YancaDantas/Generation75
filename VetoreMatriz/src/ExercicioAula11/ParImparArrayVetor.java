package ExercicioAula11;

import java.util.Scanner;

public class ParImparArrayVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       int[] num = new int[10];
	        int soma = 0, parCount = 0, imparCount = 0;

	        Scanner leia = new Scanner(System.in);

	        for (int x = 0; x < 10; x++) {
	            System.out.println("\nEntre com " + (x + 1) + " número inteiro: ");
	            num[x] = leia.nextInt();
	            soma += num[x];
	            if (num[x] % 2 == 0) {
	                parCount++;
	            } else {
	                imparCount++;
	            }
	        }

	        System.out.println("Números pares:");
	        for (int x = 0; x < 10; x++) {
	            if (num[x] % 2 == 0) {
	                System.out.print(num[x] + " ");
	            }
	        }
	        
	        System.out.println("\nNúmeros ímpares:");
	        for (int x = 0; x < 10; x++) {
	            if (num[x] % 2 != 0) {
	                System.out.print(num[x] + " ");
	            }
	        }

	        float media = (float) soma / 10;
	        System.out.println("\nA soma de todos os números é: " + soma);
	        System.out.printf("\nA média dos números é: %.2f ", media);

	  }
	}