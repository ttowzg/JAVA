package flori.vendas;

import java.util.Scanner;

public class Main {
	
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		
		int i;
		
		Plantas[] cadastro = new Plantas[50]; // alocando memoria
				
			for(i = 0; i < 50; i++) {
				cadastro[i] = new Plantas(); // atribuindo as plantas para os vetores
			}
			
			lerMostrarPlantas(cadastro, ler, cadastro, 50); //aqui, ira ler as entradas e mostrar junto
			System.out.println("A lista final sera:");
			System.out.println("---------------------------------->>>");
			criarListaPlantas(cadastro, ler, cadastro, 50); // ja aqui, ira somente mostrar toda a lista no final, como pede no enunciado
			
		
	}
	
		public static void lerMostrarPlantas(Plantas cadastro[],Scanner ler, Plantas plantas[], int quant){
			int i;
			System.out.println("Digite os dados para o calculo:");
			for(i = 0; i < 50; i++) {
				
				System.out.printf("Planta - %d\n", i + 1);
				
				System.out.println("nome: ");
				cadastro[i].setNome(ler.next());
				System.out.println("ideal: ");
				cadastro[i].setIdeal(ler.nextInt());
				System.out.println("no estoque: ");
				cadastro[i].setQuantidadeAtual(ler.nextInt());
				
				int comprar = plantas[i].getIdeal() - plantas[i].getQuantidadeAtual();
				
				System.out.println("NOME:" + plantas[i].getNome());
				System.out.println("IDEAL:" + plantas[i].getIdeal());
				System.out.println("ESTOQUE:" + plantas[i].getQuantidadeAtual());
				System.out.println("QUANTIDADE PARA COMPRA:" + comprar);
				
				comprar = 0;
				
				System.out.println("----------------------------------");
				
			}
			
			
		}
		
		public static void criarListaPlantas(Plantas cadastro[],Scanner ler, Plantas plantas[], int quant){
			int i;
			
			for(i = 0; i < 50; i++) {
			
			int comprar = plantas[i].getIdeal() - plantas[i].getQuantidadeAtual();
			
			System.out.println("NOME:" + plantas[i].getNome());
			System.out.println("IDEAL:" + plantas[i].getIdeal());
			System.out.println("ESTOQUE:" + plantas[i].getQuantidadeAtual());
			System.out.println("QUANTIDADE PARA COMPRA:" + comprar);
			
			comprar = 0;
			
			System.out.println("----------------------------------");
			
			}
			
		}
	
}
