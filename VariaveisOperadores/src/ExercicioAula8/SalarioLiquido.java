package ExercicioAula8;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salariobruto, adicionalnoturno, horasExtras, descontos, salarioliquido; 
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nDigite o Salário Bruto: ");
		salariobruto = leia.nextFloat();
		System.out.println("\nDigite o Adicional Noturno: ");
		adicionalnoturno = leia.nextFloat();
		System.out.println("\nDigite o valor de Horas Extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("\nDigite os Descontos: ");
		descontos = leia.nextFloat();
		
		salarioliquido = (salariobruto + adicionalnoturno + (horasExtras * 5) - descontos);

		
		System.out.printf("\nSeu Salário Líquido é: %.2f",salarioliquido); 
		

	}

}
