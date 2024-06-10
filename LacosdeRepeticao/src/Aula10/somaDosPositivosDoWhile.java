package Aula10;

import java.util.Scanner;

public class somaDosPositivosDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int num, soma = 0;
		 
	        Scanner leia = new Scanner(System.in);

	        do {
	            System.out.println("Digite um número:");
	            num = leia.nextInt();

	            if (num > 0) {
	                soma += num; 
	            }

	        } while (num != 0); 
	        
	        System.out.println("A soma dos números positivos é: " + soma);
	    }
	}

