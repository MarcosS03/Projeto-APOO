package br.com.ifpe.apoo.estacionamento.controller;

import java.time.LocalDateTime;

import br.com.ifpe.apoo.estacionamento.apresentação.DadosVeiculo;
import br.com.ifpe.apoo.estacionamento.model.Carro;
import br.com.ifpe.apoo.estacionamento.model.Veiculo;


public class ControllerCarro extends Controller{

	DadosVeiculo dadosV = new DadosVeiculo();

	private LocalDateTime ano =  LocalDateTime.now();





	public boolean validarAnoVeiculo() {
		int anoAtual = ano.getYear();

		if (dadosV.getAnoFabricacao() >= anoAtual - 10 ) {
			return true;

		}else {
			return false;
		}


	}

}
