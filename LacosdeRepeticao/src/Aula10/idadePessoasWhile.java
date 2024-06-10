package Aula10;

import java.util.Scanner;

public class idadePessoasWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade, menor21 = 0, maior50 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while(idade >= 0) {
			
			if (idade < 21) {
				menor21++;
				
			} else if (idade > 50) {
				maior50++;
				
			}
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
		}
		System.out.println("Total de pessoas menores de 21: "+menor21+"");
		System.out.println("Total de pessoas maiores de 50: "+maior50+"");
		

	}

}
