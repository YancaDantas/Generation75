package ExerciciosAula12;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			
			System.out.println("\n\tMenu de Opções do Estoque");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque?");
			System.out.println("\n(2) Deseja remover produtos do estoque?");
			System.out.println("\n(3) Deseja atualizar produtos do estoque?");
			System.out.println("\n(4) Deseja mostrar produtos do estoque?");
			System.out.println("\n(0) Encerrar o programa do estoque.");
			System.out.println("\nDigite a opção desejada:");
			op = ler.nextInt();
			
			switch(op) {
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = ler.nextLine();
				estoque.add(produto);
				System.out.println(estoque);
				break;
				//consigo colocar outro do while dentro do case 1 para colocar a opção se quer continuar adicionando produto S/N por string.
				
			case 2:
				ler.nextLine();
				System.out.println("\n(1) Digite o produto para remover do estoque");
				String produtor = ler.nextLine();
				
				if(estoque.contains(produtor)) { //verificar se tem o produto dentro do estoque
					estoque.remove(produtor);
				} else {
					System.out.println("\nProduto inexistente no estoque!");	
				}
				System.out.println(estoque);
				break;
			case 3:
				ler.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar:");
				String verifica = ler.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do produto "+verifica+" :");
				String novo = ler.nextLine();
				
				if (estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
			
				}else {
					System.out.println("\nProduto inexistente no estoque!");
				}
				break;
			case 4:
				System.out.println("\nProdutos que estão no estoque: ");
				System.out.println(estoque);
		        break;
			case 0:
				System.out.println("\nObrigado por utilizar nosso sistema. \nVolte sempre!");
			    break;
			    default:
			    	System.out.println("\nOpção Inválida!");
			
			}
			
		} while(op != 0);

	}

}
 