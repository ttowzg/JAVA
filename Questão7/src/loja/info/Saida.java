package loja.info;

import java.util.Scanner;

public class Saida {

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
			
			int i;
			double total_tudo = 0;
			
			
			System.out.println("Digite a quantidade de itens: ");
			
			int numeroProdutos = ler.nextInt();
			Invoice produtos[] = new Invoice[numeroProdutos];
			
			for(i = 0; i < produtos.length; i++) {
				produtos[i] = new Invoice();
			}
			
			
			for(i = 0; i < produtos.length; i++) {
				
				produtos[i].setNumero(i + 1);
				System.out.println("Digite uma descricao para o item - " + (i + 1));
				String descricao = ler.next();
	            produtos[i].setDescricao(descricao);
				System.out.println("Digite o preco:");				
				produtos[i].setPreco(ler.nextDouble());
				System.out.println("Digite a quantidade: ");
				produtos[i].setQuantidade(ler.nextInt());
				total_tudo += produtos[i].getInvoiceAmount();
				
				
				 System.out.println("Produto: " + (i + 1));
				 System.out.println("Produto de numero: " + produtos[i].getNumero());
		         System.out.println("Descricao: " + produtos[i].getDescricao());
		         System.out.println("Quantidade: " + produtos[i].getQuantidade());
		         System.out.println("Preco: " + produtos[i].getPreco() + "\n");
				
			}
			
			System.out.println("Total da fatura: " + total_tudo);
			


	}

}
