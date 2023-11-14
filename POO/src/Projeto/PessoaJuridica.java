package Projeto;

import java.util.List;

public class Construtora extends Pessoa{
	private String razaoSocial;
	private List<Residencia> residencias;



	public Construtora(String nome, String cpf, String cnpj, List<Endereco> enderecos, List<Contato> contatos,
			String razaoSocial, List<Residencia> residencias) {
		super(nome, cpf, cnpj, enderecos, contatos);
		this.razaoSocial = razaoSocial;
		this.residencias = residencias;
	}

	public Construtora() {
		// TODO Auto-generated constructor stub
	}

	public List<Residencia> getResidencias() {
		return residencias;
	}

	public void setResidencias(List<Residencia> residencias) {
		this.residencias = residencias;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}




}
