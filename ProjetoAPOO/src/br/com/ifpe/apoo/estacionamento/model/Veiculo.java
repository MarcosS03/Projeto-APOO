package br.com.ifpe.apoo.estacionamento.model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import br.com.ifpe.apoo.estacionamento.model.financeiro.PagamentoDecorator;



public class Veiculo extends Base{
	
	protected String marca;
	protected String modelo;
	protected int anoFabricacao;
	protected String placa;
	protected String proprietario;
	private LocalDateTime horaEntrada;
	private LocalDateTime horaSaida;
	
	
	


	
	public Veiculo(String marca, String modelo, int anoFabricacao, String placa, String proprietario,
			LocalDateTime horaEntrada, LocalDateTime horaSaida) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.placa = placa;
		this.proprietario = proprietario;
		this.horaEntrada = horaEntrada.now().truncatedTo(ChronoUnit.MINUTES);
		this.horaSaida = horaSaida.now().truncatedTo(ChronoUnit.MINUTES);
		
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



	public int getAnoFabricacao() {
		return anoFabricacao;
	}



	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}



	public String getPlaca() {
		return placa;
	}



	public void setPlaca(String placa) {
		this.placa = placa;
	}



	public String getProprietario() {
		return proprietario;
	}



	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}



	public LocalDateTime getHoraEntrada() {
		return horaEntrada;
	}



	public void setHoraEntrada(LocalDateTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}



	public LocalDateTime getHoraSaida() {
		return horaSaida;
	}



	public void setHoraSaida(LocalDateTime horaSaida) {
		this.horaSaida = horaSaida;
	}
	

}
