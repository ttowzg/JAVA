package decompor.numeros;

import java.util.*;

public class Fatorar {
	
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n;
		int i;
		int vetor[] = new int[99];
		
		
		System.out.println("Digite um numero para conferir:");
		n = ler.nextInt();
		
		while (n % 2 == 0) {
			System.out.println(2 + " ");
			n /= 2;
		
		        }
		  
		    
		for ( i = 3; i <= n; i += 2) {
			
			while (n % i == 0) {
			
				vetor[i] = i;
		                n /= i;
		                System.out.println(vetor[i] + " ");
		            }
		        }
		  
		    
		        if (n > 2)
		            System.out.print(n);
		    
		 
		  
	
		
	}}
