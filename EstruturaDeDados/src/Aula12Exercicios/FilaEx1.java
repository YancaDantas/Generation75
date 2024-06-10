package Aula12Exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Queue<String> fila = new LinkedList<String>();
		        Scanner leia = new Scanner(System.in);
		        
		        int op;
		        do {
		            System.out.println("\n\tMENU");
		            System.out.println("(1) - Adicionar Cliente na fila.");
		            System.out.println("(2) - Listar todos os Clientes.");
		            System.out.println("(3) - Retirar Cliente da fila.");
		            System.out.println("(0) - Sair.");
		            System.out.println("Entre com a opção desejada:");
		            op = leia.nextInt();
		            
		            switch(op) {
		                case 1:
		                    leia.nextLine();
		                    System.out.println("\nDigite o nome do cliente a ser adicionado na fila: ");
		                    String nome = leia.nextLine();
		                    fila.add(nome);
		                    System.out.println(fila);
		                    break;
		                    
		                case 2:
		                    leia.nextLine();
		                    System.out.println(fila);
		                    break;
		                    
		                case 3:
		                    leia.nextLine();
		                    if (!fila.isEmpty()) {
		                        String remove = fila.remove();
		                        System.out.println("O Cliente " + remove + " foi chamado!"); 
		                    } else {
		                        System.out.println("A fila está vazia.");
		                    }
		                    System.out.println(fila);
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
