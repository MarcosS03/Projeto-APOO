package br.com.ifpe.apoo.estacionamento.model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;




public class Carro extends Veiculo{


	
	public Carro (String marca, String modelo, int anoFabricacao, String placa, String proprietario,
			String cpf, LocalDateTime horaEntrada) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.placa = placa;
		this.proprietario = proprietario;
		this.cpf = cpf;
		this.horaEntrada = horaEntrada.now().truncatedTo(ChronoUnit.MINUTES);
		return; 
		
	}
	
	
	@Override
	public String toString() {

		return "Veiculo: Carro"
				+ "\nMarca: " + this.marca
				+ "\nModelo: " + this.modelo
				+ "\nAno: " + this.anoFabricacao
				+ "\nPlaca: " + this.placa
				+ "\nProprietario: " + this.proprietario
				+ "\nCPF: " + this.cpf
				+ "\nHoraEntrada: "+ this.getHoraEntrada();
	}
	
	
	public  static class CarroBuilder implements IBuilder{
		
		private String marca;
		private String modelo;
		private int anoFabricacao;
		private String placa;
		private String proprietario;
		private String cpf;
		private LocalDateTime horaEntrada;



		@Override
		public void resert() {
			// TODO Auto-generated method stub

		}

		public CarroBuilder marca(String marca) {
			this.marca = marca;
			return this;
		}
		public CarroBuilder modelo(String modelo) {
			this.modelo = modelo;
			return this;
		}
		public CarroBuilder anoFabricacao(int anoFabricacao) {
			this.anoFabricacao = anoFabricacao;
			return this;
		}
		public CarroBuilder placa(String placa) {
			this.placa = placa;
			return this;
		}
		public CarroBuilder horaEntrada(LocalDateTime horaEntrada) {
			this.horaEntrada = horaEntrada;
			return this;
		}

		
		public CarroBuilder proprietario(String proprietario) {
			this.proprietario = proprietario;
			return this;
		}
		
		public CarroBuilder cpf(String cpf) {
			this.cpf = cpf;
			return this;
		}

		public Carro build() {
			return new Carro(marca, modelo, anoFabricacao, placa, proprietario, cpf, horaEntrada);

		}
		
		
	}


}
