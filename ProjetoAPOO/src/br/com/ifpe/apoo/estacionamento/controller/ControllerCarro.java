package br.com.ifpe.apoo.estacionamento.controller;

import java.time.LocalDateTime;

import br.com.ifpe.apoo.estacionamento.apresentação.DadosVeiculo;
import br.com.ifpe.apoo.estacionamento.model.Carro;


public class ControllerCarro {

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



	int opcaoVeiculo =  dadosV.getTipoVeiculo();

	
	
	public void cadastrarVeiculo() {
		if (opcaoVeiculo == 1) {
			
			Carro Carro = new Carro.CarroBuilder()
					.marca(dadosV.getMarca())
					.modelo(dadosV.getModelo())
					.anoFabricacao(dadosV.getAnoFabricacao())
					.proprietario(dadosV.getProprietario())
					.placa(dadosV.getPlaca())
					.build();

		}
	}
}
