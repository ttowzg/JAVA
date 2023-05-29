package loja.info;

public class Invoice {

	private int numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
	
//	public Invoice (int numero, int quantidade, String descricao, double preco){
//		this.numero = numero;
//		this.descricao = descricao;
//		this.quantidade = quantidade;
//		this.preco = preco;
//	}

	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getInvoiceAmount(){
		
		double amount = preco*quantidade;
		
		if (quantidade < 0) {
			this.quantidade = 0;
		} if (preco < 0) {
			this.preco = 0.0;
		}
		return amount;
			
		
	}
	
}
