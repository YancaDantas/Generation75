package Aula12Exercicios;

import java.util.Scanner;
import java.util.Stack;

public class PilhaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    	Stack<String> pilha = new Stack<String>();
		        Scanner leia = new Scanner(System.in);
		        
		        int op;
		        do {
		            System.out.println("\n\tMENU");
		            System.out.println("(1) - Adicionar Livro na pilha.");
		            System.out.println("(2) - Listar todos os Livros.");
		            System.out.println("(3) - Retirar Livro da pilha.");
		            System.out.println("(0) - Sair.");
		            System.out.println("Entre com a opção desejada:");
		            op = leia.nextInt();
		            
		            switch(op) {
		                case 1:
		                    leia.nextLine();
		                    System.out.println("\nDigite do Livro a ser adicionado na pilha: ");
		                    String nome = leia.nextLine();
		                    pilha.push(nome);
		                    System.out.println(pilha);
		                    System.out.println("O livro foi adicionado!");
		                    break;
		                    
		                case 2:
		                    leia.nextLine();
		                    System.out.println(pilha);
		                    break;
		                    
		                case 3:
		                    leia.nextLine();
		                    if (!pilha.isEmpty()) {
		                        String remove = pilha.pop();
		                        System.out.println("O Livro " + remove + " foi retirado da pilha!"); 
		                    } else {
		                        System.out.println("A pilha está vazia.");
		                    }
		                    System.out.println(pilha);
		                    break;
		                    
		                case 0:
		                    System.out.println("PROGRAMA FINALIZADO!"); 
		                    break;
		                    
		                default:
		                    System.out.println("\nOpção Inválida!");
		            }
		        } while (op != 0);
		    }


	}
