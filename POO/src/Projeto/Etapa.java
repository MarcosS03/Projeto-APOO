package Projeto;

public class Etapa {
	private boolean fundacao;
	private boolean alvenaria;
	private boolean cobertura;
	private boolean acabamento;
	
	public Etapa(boolean fundacao, boolean alvenaria, boolean cobertura, boolean acabamento) {
		super();
		this.fundacao = fundacao;
		this.alvenaria = alvenaria;
		this.cobertura = cobertura;
		this.acabamento = acabamento;
	}
	public Etapa() {
		// TODO Auto-generated constructor stub
	}
	public boolean isFundacao() {
		return fundacao;
	}
	public void setFundacao(boolean fundacao) {
		this.fundacao = fundacao;
	}
	public boolean isAlvenaria() {
		return alvenaria;
	}
	public void setAlvenaria(boolean alvenaria) {
		this.alvenaria = alvenaria;
	}
	public boolean isCobertura() {
		return cobertura;
	}
	public void setCobertura(boolean cobertura) {
		this.cobertura = cobertura;
	}
	public boolean isAcabamento() {
		return acabamento;
	}
	public void setAcabamento(boolean acabamento) {
		this.acabamento = acabamento;
	}
	
	

}
