package matriz;


import java.util.Scanner;

public class Main {
	
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("A matriz sera invertida:");
		
		int matriz[][] = new int[3][3];
		
		int i,j;
		
		System.out.println("Digite valores para a matriz: ");
		
		for(i = 0; i < matriz.length; i++) {
			for(j = 0; j < matriz[i].length; j++) {
				
				matriz[i][j] = ler.nextInt();
				
			}
		}
		
		System.out.println("Sua matriz inicial: ");
		
		for(i = 0; i < matriz.length; i++) {
			for(j = 0; j < matriz[i].length; j++) {
				
				System.out.print(matriz[i][j] + " ");
				
			}
			System.out.println();
		}
		
		System.out.println("ela 90 graus a direita: ");
		

		
		for(i = 0; i < matriz.length; i++) {
			for(j = 0; j < matriz[i].length; j++) {
				
				
				System.out.print(matriz[3 - j - 1][i] + " ");
				
			}
			System.out.println();
		}
		
	}

	
}
