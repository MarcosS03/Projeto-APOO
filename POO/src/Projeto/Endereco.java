package Projeto;

public class Endereco {
	private String rua;
	private String cep;
	private int numero;
	private String cidade;

	void endereco() {
		System.out.println("Rua: "+ this.rua + ","+ "Nº: "+ this.numero);
		System.out.println("CEP: "+ this.cep);
		System.out.println("Cidade: "+ this.cidade);
	}


	public Endereco(String rua, String cep, int numero, String cidade) {
		super();
		this.rua = rua;
		this.cep = cep;
		this.numero = numero;
		this.cidade = cidade;
	}


	public Endereco() {
		// TODO Auto-generated constructor stub
	}
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
