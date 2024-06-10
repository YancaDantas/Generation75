package ExercicioAula9;

import java.util.Scanner;

public class lanchoneteSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cachorroquente = 10, xsalada = 15, xbacon =18, bauru = 12, refrigerante = 8, sucolaranja = 13, opcao, qtd, valortotal;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Código do produto \t\tProduto \t\tPreço Unitário");
		System.out.println("\n1\t\t\t\tCachorro Quente \tR$10,00");
		System.out.println("2\t\t\t\tX-Salada \t\tR$15,00");
		System.out.println("3\t\t\t\tX-Bacon  \t\tR$18,00");
		System.out.println("4\t\t\t\tBauru    \t\tR$12,00");
		System.out.println("5\t\t\t\tRefrigerante\t\tR$8,00");
		System.out.println("6\t\t\t\tSuco de Laranja\t\tR$13,00");
		System.out.println("\nDigite o código de qual produto deseja: ");
		opcao = leia.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Você escolheu o Cachorro Quente!");
			System.out.println("Qual a quantidade deseja?");
			qtd = leia.nextInt();
			valortotal = cachorroquente * qtd;
			System.out.println("Produto: Cachorro Quente \nTotal: "+valortotal+"");
		    break;
	    
	    case 2:
    	    System.out.println("Você escolheu o X-Salada!");
	        System.out.println("Qual a quantidade deseja?");
	        qtd = leia.nextInt();
	        valortotal = xsalada * qtd;
	        System.out.println("Produto: X-Salada \nTotal: "+valortotal+"");
	        
            break;
            
	    case 3:
    	    System.out.println("Você escolheu o X-Bacon!");
	        System.out.println("Qual a quantidade deseja?");
	        qtd = leia.nextInt();
	        valortotal = xbacon * qtd;
	        System.out.println("Produto: X-Bacon \nTotal: "+valortotal+"");
	        
            break;
            
	    case 4:
    	    System.out.println("Você escolheu o Bauru!");
	        System.out.println("Qual a quantidade deseja?");
	        qtd = leia.nextInt();
	        valortotal = bauru * qtd;
	        System.out.println("Produto: Bauru \nTotal: "+valortotal+"");
	        
            break;
            
	    case 5:
    	    System.out.println("Você escolheu o Refrigerante!");
	        System.out.println("Qual a quantidade deseja?");
	        qtd = leia.nextInt();
	        valortotal = refrigerante * qtd;
	        System.out.println("Produto: Refrigerante \nTotal: "+valortotal+"");
	        
            break;
            
	    case 6:
    	    System.out.println("Você escolheu o Suco de Laranja!");
	        System.out.println("Qual a quantidade deseja?");
	        qtd = leia.nextInt();
	        valortotal = sucolaranja * qtd;
	        System.out.println("Produto: Suco de Laranja \nTotal: "+valortotal+"");
	        
            break;
            default:
            	System.out.println("Opção Inválida!");
          
		    
		}   
		
	    }
}
