package br.com.ifpe.apoo.estacionamento.model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class Moto extends Veiculo {




	public Moto (String marca, String modelo, int anoFabricacao, String placa, String proprietario,
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

		return "Veiculo: Moto"
				+ "\nMarca: " + this.marca
				+ "\nModelo: " + this.modelo
				+ "\nAno: " + this.anoFabricacao
				+ "\nPlaca: " + this.placa
				+ "\nProprietario: " + this.proprietario
				+"\nCPF: " + this.cpf
				+ "\nHoraEntrada: "+ this.getHoraEntrada();
				
	}



	public  static class MotoBuilder implements IBuilder{
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

		public MotoBuilder marca(String marca) {
			this.marca = marca;
			return this;
		}
		public MotoBuilder modelo(String modelo) {
			this.modelo = modelo;
			return this;
		}
		public MotoBuilder anoFabricacao(int anoFabricacao) {
			this.anoFabricacao = anoFabricacao;
			return this;
		}
		public MotoBuilder placa(String placa) {
			this.placa = placa;
			return this;
		}


		public MotoBuilder proprietario(String proprietario) {
			this.proprietario = proprietario;
			return this;
		}
		
		public MotoBuilder cpf(String cpf) {
			this.cpf = cpf;
			return this;
		}


		public MotoBuilder HoraEntrada(LocalDateTime horaEntrada) {
			this.horaEntrada = horaEntrada;
			return this;
		}
		
		public Moto build() {
			return new Moto(marca, modelo, anoFabricacao, placa, proprietario, cpf, horaEntrada);

		}

	}

}
