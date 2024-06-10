package ExerciciosAula12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WrapperCollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		Scanner leia = new Scanner (System.in);
		
		meuSet.add(2);
		meuSet.add(5);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(4);
		meuSet.add(9);
		meuSet.add(7);
		meuSet.add(8);
		meuSet.add(10);
		meuSet.add(6);
		
		  
		System.out.println("Qual número inteiro deseja encontrar?");
		  int numero = leia.nextInt();
		
		  if (meuSet.contains(numero)) {
	            System.out.println("Número " + numero + " foi encontrado!");
	        } else {
	            System.out.println("O número " + numero + " não foi encontrado!");
	        }
	    }
	}