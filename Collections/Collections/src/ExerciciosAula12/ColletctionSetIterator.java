package ExerciciosAula12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ColletctionSetIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> meuSet = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		
		for(int x=0;x<10;x++) {
			System.out.println("Digite o número " + (x + 1) + ":");
			int num = leia.nextInt();
			meuSet.add(num);
			
		}
		 System.out.println("Lista dados do Set:");
	        Iterator<Integer> iterator = meuSet.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());

	}
	}
}
