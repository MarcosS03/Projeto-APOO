package Projeto;

import java.util.List;

public class Pessoa {
	protected String nome;
	protected String cpf;
	protected String cnpj;
	protected List<Endereco>enderecos;
	protected List<Contato>contatos;


	void dadosPessoa() {
		System.out.println("Nome: "+ this.getNome());
		if(this.getCpf().length()>=1) {
			System.out.println("CPF: "+ this.getCpf());
		}else {
			System.out.println("CNPJ: "+ this.getCnpj());
		}
		System.out.println("**************ENDERECO*************");
		System.out.println(enderecos);
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}	

	public List<Endereco> getEnderecos() {
		return enderecos;
	}


	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}


	public Pessoa(String nome, String cpf, String cnpj, List<Endereco> enderecos, List<Contato>contatos) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.enderecos = enderecos;
		this.contatos = contatos;
	}

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
