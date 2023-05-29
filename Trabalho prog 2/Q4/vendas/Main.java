package matriz.vendas;

import java.util.*;

public class Main {
	
	static Random aleatorios = new Random();

	public static void main(String[] args) {
		
		int i,j;
		int soma = 0;
		
		int matriz_vendas[][] = new int[12][4];
	
		for(i = 0; i < matriz_vendas.length; i++) {
			
			for(j = 0; j < matriz_vendas[i].length; j++) {
				
				matriz_vendas[i][j] = aleatorios.nextInt(1000);
				
			}
		}
		
		for(i = 0; i < matriz_vendas.length; i++) {
			
			int soma_mes = 0;
			System.out.println("O mes - " + (i+1));
			
			for(j = 0; j < matriz_vendas[i].length; j++) {
				
				soma += matriz_vendas[i][j];
				soma_mes += matriz_vendas[i][j];
				
				System.out.println("A semana - " + (j + 1) + " vendeu: " + matriz_vendas[i][j]+ " " );
				
			}
			System.out.println("O total desse mes - " + soma_mes);
			System.out.println();
		}
		
		System.out.println("O total vendido no ano foi: R$" + soma);
		
		
		
		
		
		
	}
	
}