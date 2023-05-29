package salão;

import java.util.Scanner;
public class Main {

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int i;
		
		Dados[] pessoas = new Dados[5];
		for(i = 0; i < 5; i++) {
			pessoas[i] = new Dados();
			
		}
		
		lerDados(pessoas, ler, 5);
		mostrarDados(pessoas);
		
		
	}
	
	public static void lerDados(Dados pessoas[], Scanner ler, int quant) {
		int i;
		for(i = 0; i < quant; i++) {
			
			System.out.printf("Digite o nome e a fatura da manicure %d\n", i + 1);
			
			pessoas[i].setNome(ler.next());
			pessoas[i].setFaturou(ler.nextFloat());
			
		}	
	}
		public static void mostrarDados(Dados dados[]) {
			int i;
			for(i = 0; i < 5; i++) {
				
				System.out.printf("NOME: %s\n", dados[i].getNome());
				System.out.printf("SALARIO FINAL: %f\n", dados[i].getFaturou());
				
			}
			
	}
}
