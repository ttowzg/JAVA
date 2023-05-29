package salão;

public class Dados {
		
	private String nome;
	private float faturou;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setFaturou(float faturou) {
		float novoSal = faturou / 2;
		this.faturou = novoSal;
	}
	
	public float getFaturou() {
		return faturou;
	}
	
}
