package acoes.carro;

import java.util.Scanner;


public class FuncionaCarro {
	
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		novoCarro(c1);
		
		
		System.out.println(c1.getCor());
		System.out.println(c1.getModelo());
		System.out.println(c1.getPotencia());
		System.out.println(c1.getPreco());
		System.out.println(c1.getRodas());
		
		
	}
	
	public static void novoCarro(Carro c1) {
		
		
		c1.setCor("vermelho");
		c1.setModelo("celta");
		c1.setPotencia(200);
		c1.setPreco(9000);
		c1.setRodas(4);
		
	}
	
		
}
	

