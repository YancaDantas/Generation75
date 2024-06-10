package ExerciciosAula12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> listaCores = new ArrayList<String>();
		
		Scanner leia = new Scanner(System.in);
		
		for(int i=0; i<5;i++) {
			System.out.println("Digite a " + (i + 1) + "ª cor:");
	            String cor = leia.nextLine();
	            listaCores.add(cor);
		}
		
		System.out.println("Lista de cores digitadas:");
		
        for (String cor : listaCores) {
            System.out.println(cor);
	}
        Collections.sort(listaCores);
		System.out.println("\nLista depois de ordenada...");
		System.out.println(listaCores);	
	}

}
