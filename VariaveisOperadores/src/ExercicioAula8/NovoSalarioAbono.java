package ExercicioAula8;

import java.util.Scanner;

public class NovoSalarioAbono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float salario, abono, NovoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor do Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("\nDigite o valor do Abono: ");
		abono = leia.nextFloat();
		
		NovoSalario = salario + abono;
		
		System.out.println("\nSeu novo salário é: " +NovoSalario);

	}

}
