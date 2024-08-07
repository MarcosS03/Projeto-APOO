package br.com.ifpe.apoo.estacionamento.controller;

import java.time.LocalDateTime;

import br.com.ifpe.apoo.estacionamento.apresentação.DadosVeiculo;
import br.com.ifpe.apoo.estacionamento.model.Carro;
import br.com.ifpe.apoo.estacionamento.model.Veiculo;


public class ControllerCarro extends Controller{

	

	private LocalDateTime ano =  LocalDateTime.now();





	public boolean validarAnoVeiculo(Veiculo veiculo) {
		int anoAtual = ano.getYear();

		if (veiculo.getAnoFabricacao() >= anoAtual - 20 ) {
			return true;

		}else {
			return false;
		}


	}

}
