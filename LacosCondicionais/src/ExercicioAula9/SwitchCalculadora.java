package ExercicioAula9;

import java.util.Scanner;

public class SwitchCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		float n1, n2, a, b, c, d;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o número 1: ");
		n1 = leia.nextFloat();
		System.out.println("Digite o número 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("\n\t\tTabela de Operações");
		System.out.println("\n1 - SOMA");
		System.out.println("\n2 - SUBTRAÇÃO");
		System.out.println("\n3 - MULTIPLICAÇÃO");
		System.out.println("\n4 - DIVISÃO");
		System.out.println("Qual operação: ");
		op = leia.nextInt();
		
		a = n1 + n2;
		b = n1 - n2;
		c = n1 * n2;
		d = n1 / n2;
		
		switch(op){
	    case 1:
	    	System.out.println("\n1 - SOMA");
	    	System.out.println("\n "+n1+" + "+n2+" = "+a+" ");
	        break;
	    case 2:
	    	System.out.println("\n2 - SUBTRAÇÃO");
	    	System.out.println("\n "+n1+" - "+n2+" = "+b+" ");
	        break;
	    case 3:
	    	System.out.println("\n3 - MULTIPLICAÇÃO");
	    	System.out.println("\n "+n1+" * "+n2+" = "+c+" ");
	        break;
	    case 4:
	    	System.out.println("\n4 - DIVISÃO");
	    	System.out.println("\n "+n1+" / "+n2+" = "+d+" ");
	        break;
	    default:
	    	System.out.println("\nOperação Inválida!");
	}
	}

}
