package Projeto;

import java.util.List;

public class Residencia {
	private int quantidadeDormitorio;
	private int quantidadeSala;
	private boolean garagem;
	private boolean areaServico;
	private String rua;
	private int numero;
	private List<Etapa>etapas;


	void tipoResidensia() {
		if (this.getQuantidadeDormitorio() <=2 && this.getQuantidadeSala() <=1 && this.isGaragem() == false) {
			System.out.println("Residencia Padrão baixo");
		}else if (this.getQuantidadeDormitorio() <=3 && this.getQuantidadeSala() <=1 && this.isGaragem() == true){
			System.out.println("Residencia Padrão medio");
		}else if (this.getQuantidadeDormitorio() >3 || this.getQuantidadeDormitorio()<=3 && this.getQuantidadeSala() >1 && this.isGaragem() == true) {
			System.out.println("Residencia Padrão alto");
		}
	}


	public Residencia(int quantidadeDormitorio, int quantidadeSala, boolean garagem, boolean areaServico, String rua,
			int numero, List<Etapa> etapas) {
		super();
		this.quantidadeDormitorio = quantidadeDormitorio;
		this.quantidadeSala = quantidadeSala;
		this.garagem = garagem;
		this.areaServico = areaServico;
		this.rua = rua;
		this.numero = numero;
		this.etapas = etapas;
	}


	public Residencia() {
		// TODO Auto-generated constructor stub
	}
	public List<Etapa> getEtapas() {
		return etapas;
	}

	public void setEtapas(List<Etapa> etapas) {
		this.etapas = etapas;
	}

	public int getQuantidadeDormitorio() {
		return quantidadeDormitorio;
	}


	public void setQuantidadeDormitorio(int quantidadeDormitorio) {
		this.quantidadeDormitorio = quantidadeDormitorio;
	}


	public int getQuantidadeSala() {
		return quantidadeSala;
	}


	public void setQuantidadeSala(int quantidadeSala) {
		this.quantidadeSala = quantidadeSala;
	}


	public boolean isGaragem() {
		return garagem;
	}


	public void setGaragem(boolean garagem) {
		this.garagem = garagem;
	}


	public boolean isAreaServico() {
		return areaServico;
	}


	public void setAreaServico(boolean areaServico) {
		this.areaServico = areaServico;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}

}
