package Projeto;

import java.util.List;

public class Funcionario extends Pessoa{
	private String funcao;
	private Etapa etapa;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	public Funcionario(String nome, String cpf, String cnpj, List<Endereco> enderecos, List<Contato> contatos,
			String funcao, Etapa etapa) {
		super(nome, cpf, cnpj, enderecos, contatos);
		this.funcao = funcao;
		this.etapa = etapa;
	}

	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public Etapa getEtapa() {
		return etapa;
	}
	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}
	
	
	

}
