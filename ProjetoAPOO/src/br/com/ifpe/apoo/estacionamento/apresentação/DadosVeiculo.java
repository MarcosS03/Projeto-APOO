package br.com.ifpe.apoo.estacionamento.apresentação;


import java.util.Scanner;
import br.com.ifpe.apoo.estacionamento.model.Veiculo;

public class DadosVeiculo {
	
	
	String proprietario;
	String marca;
	String modelo;
	String placa;
	int anoFabricacao;
	
	int tipoVeiculo;


	Scanner sc = new Scanner(System.in);

	
	
	
	public void cadastrarVeiculo() {


		System.out.println("""

				Por favor, escolha o numero de acordo com o tipo do seu veiculo!

				1 - Moto
				2 - Carro
				""");
		this.tipoVeiculo = Integer.parseInt( sc.nextLine());



			this.dadosVeiculo();


	
	}
	
	
	public void dadosVeiculo(){



		System.out.println("Informe o seu nome: ");
		this.proprietario = sc.nextLine();		

		System.out.println("Informe a marca do veiculo: ");
		this.marca = sc.nextLine();

		System.out.println("Informe o modelo do veiculo: ");
		this.modelo = sc.nextLine();

		System.out.println("Informe o ano do veiculo: ");
		var anoString = sc.nextLine();
		this.anoFabricacao = Integer.parseInt(anoString);

		System.out.println("Informe a placa do veiculo: ");
		this.placa = sc.nextLine();
	
	}
	
	
	
	

	
	public int getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(int tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}


	public String getProprietario() {
		return proprietario;
	}


	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getAnoFabricacao() {
		return anoFabricacao;
	}


	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	
	

}
