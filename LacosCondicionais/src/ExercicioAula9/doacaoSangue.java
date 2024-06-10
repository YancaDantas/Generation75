package ExercicioAula9;

import java.util.Scanner;

public class doacaoSangue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int idade;
		boolean doacao;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite seu nome:");
		nome = leia.nextLine();
		System.out.println("Digite sua idade:");
		idade = leia.nextInt();
		System.out.println("Primeira doação de sangue? True or False");
		doacao = leia.nextBoolean();
		
		if (idade > 18 && idade < 59) {
			System.out.println(""+nome+" está apto para doar sangue!");
		
		} else if (idade >= 60 && idade <= 69 && (doacao == false)) {
			System.out.println(""+nome+" está apto para doar sangue!");
			
		} else if (idade < 18) {
				System.out.println(""+nome+" não está apto para doar sangue!");
				
		}
	}

}
