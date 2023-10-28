package Projeto;

public class Setor {
	private String rh;
	private String producao;
	private String infraEstrutura;
	private String posVenda;
	
	public Setor(String rh, String producao, String infraEstrutura, String posVenda) {
		super();
		this.rh = rh;
		this.producao = producao;
		this.infraEstrutura = infraEstrutura;
		this.posVenda = posVenda;
	}
	public Setor() {
		// TODO Auto-generated constructor stub
	}
	public String getRh() {
		return rh;
	}
	public void setRh(String rh) {
		this.rh = rh;
	}
	public String getProducao() {
		return producao;
	}
	public void setProducao(String producao) {
		this.producao = producao;
	}
	public String getInfraEstrutura() {
		return infraEstrutura;
	}
	public void setInfraEstrutura(String infraEstrutura) {
		this.infraEstrutura = infraEstrutura;
	}
	public String getPosVenda() {
		return posVenda;
	}
	public void setPosVenda(String posVenda) {
		this.posVenda = posVenda;
	}
	
	

}
