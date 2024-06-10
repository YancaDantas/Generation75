package ExercicioAula9;

import java.util.Scanner;

public class diagramaAnimaisIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palavra1, palavra2, palavra3;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com a primeira palavra: ");
		palavra1 = leia.nextLine();
		System.out.println("Entre com a segunda palavra: ");
		palavra2 = leia.nextLine();
		System.out.println("Entre com a terceira palavra: ");
		palavra3 = leia.nextLine();
		
		if (palavra1.equalsIgnoreCase("vertebrado")) {
			if (palavra2.equalsIgnoreCase("ave")) {
				if(palavra3.equalsIgnoreCase("carnívoro")) {
					System.out.println("\nÉ uma Águia!");
				
				}else {
					System.out.println("\nÉ uma Pomba!");
				}
			}else {
				if(palavra3.equalsIgnoreCase("onívoro")) {
					System.out.println("\nÉ um Humano!");
					
				}else {
					System.out.println("\nÉ uma Vaca!");
				}
			}
		}else {
			if (palavra2.equalsIgnoreCase("\ninseto")) {
				if(palavra3.equalsIgnoreCase("\nhematofago")) {
					System.out.println("\nÉ uma Pulga!");
				}else {
					System.out.println("\nÉ uma Lagarta!");
				}
			}else {
				if(palavra3.equalsIgnoreCase("\nhematofago")) {
					System.out.println("\nSanguessuga");
				} else {
					System.out.println("\nÉ uma Minhoca!");
				}
			}
		}
		
		
	}

}
