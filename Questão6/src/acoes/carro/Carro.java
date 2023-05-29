package acoes.carro;

//Automovel é algo criado pelo homem para servir como meio de transporte; ele possui portas, rodas, potencia
//cor, modelo, preço, etc.
//Você o liga, aumenta e diminui marchas para caso necessario. Freia se necessario, acende farois e apaga caso necessario.


public class Carro {
	
	private String modelo;
	private int rodas;
	private int potencia;
	private String cor;
	private float preco;
	private boolean liga;
	
	//O preço do carro geralemnte esta ligado a sua potencia.
	//existem carros que possuem cores somente para tal modelo.
	//Modelos mais recentes tendem a ser mais caros.
	

	
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		
		this.modelo = modelo;
	}
	public int getRodas() {
		
		return rodas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}


	public boolean isLiga() {
		if (this.rodas == 4) {
			return true;
			
		}
		return false;
			
	}


	public void setLiga(boolean liga) {
		this.liga = liga;
	}
	
	

	

}
