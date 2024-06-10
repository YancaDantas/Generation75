package ExerciciosAula12;

import java.util.ArrayList;
import java.util.Scanner;

public class WrapperIntegerArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> minhaLista = new ArrayList<Integer>();
		
		Scanner leia = new Scanner (System.in);
		
		minhaLista.add(2);
		minhaLista.add(5);
		minhaLista.add(1);
		minhaLista.add(3);
		minhaLista.add(4);
		minhaLista.add(9);
		minhaLista.add(7);
		minhaLista.add(8);
		minhaLista.add(10);
		minhaLista.add(6);
		
		  
		System.out.println("Qual número inteiro deseja encontrar?");
		  int numero = leia.nextInt();
		
		  if(minhaLista.contains(numero)) {
			  int posicao = minhaLista.indexOf(numero);
	            System.out.println("O número " + numero + " foi encontrado na posição " + posicao + " da lista.");
	        } else {
	            System.out.println("O número " + numero + " não foi encontrado na lista.");

		  }
		  
	}

}
