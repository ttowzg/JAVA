package recurs;

import java.util.Scanner;

public class Sequenc {
	
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Digite um numero: ");
		int a = ler.nextInt();
		int resul = sequencia(a);
		System.out.println(resul);
		
		
	}
	
	public static int sequencia(int num) {
		
		if(num == 1) 
			return 1;
		 else if(num == 2)
			 return 2;
		 else if(num > 2) 
			 return 2 * sequencia(num - 1) + 3 * sequencia(num - 2);		
			return num;
		 
		
	}
}
