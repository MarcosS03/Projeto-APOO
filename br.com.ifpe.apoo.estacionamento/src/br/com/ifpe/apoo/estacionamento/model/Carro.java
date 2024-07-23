package br.com.ifpe.apoo.estacionamento.model;

import java.time.LocalDateTime;


public class Carro extends Veiculo{


	private Carro(String marca, String modelo, int anoFabricacao, String placa, String proprietario,
			LocalDateTime horaEntrada, LocalDateTime horaSaida) {
		super(marca, modelo, anoFabricacao, placa, proprietario, horaEntrada, horaSaida);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {

		return "Veiculo: Carro"
				+ "\nMarca: " + this.marca
				+ "\nModelo: " + this.modelo
				+ "\nAno: " + this.anoFabricacao
				+ "\nPlaca: " + this.placa
				+ "\nProprietario: " + this.proprietario;
	}
	
	
	public  static class CarroBuilder implements IBuilder{
		
		private String marca;
		private String modelo;
		private int anoFabricacao;
		private String placa;
		private String proprietario;
		private LocalDateTime horaEntrada;
		private LocalDateTime horaSaida;


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
		public CarroBuilder horaSaida(LocalDateTime horaSaida) {
			this.horaSaida = horaSaida;
			return this;
		}
		
		public CarroBuilder proprietario(String proprietario) {
			this.proprietario = proprietario;
			return this;
		}
		

		public Carro build() {
			return new Carro(marca, modelo, anoFabricacao, placa, proprietario, horaEntrada, horaSaida);

		}
		
		
	}

}
