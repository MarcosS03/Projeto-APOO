package br.com.ifpe.apoo.estacionamento.model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import br.com.ifpe.apoo.estacionamento.model.financeiro.PagamentoDecorator;



public abstract class Veiculo extends Base{
	
	protected String marca;
	protected String modelo;
	protected int anoFabricacao;
	protected String placa;
	protected String proprietario;
	protected String cpf;
	protected LocalDateTime horaEntrada;
	
	
	


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


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public LocalDateTime getHoraEntrada() {
		return horaEntrada;
	}



	public void setHoraEntrada(LocalDateTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	

}
