package br.com.ifpe.apoo.estacionamento.controller;

import java.time.LocalDateTime;

import br.com.ifpe.apoo.estacionamento.apresentação.DadosVeiculo;
import br.com.ifpe.apoo.estacionamento.model.Moto;
import br.com.ifpe.apoo.estacionamento.model.Veiculo;


public class ControllerMoto {


	DadosVeiculo dadosV = new DadosVeiculo();

	private LocalDateTime ano = LocalDateTime.now();





	public boolean validarAnoVeiculo() {
		int anoAtual = ano.getYear();

		if (dadosV.getAnoFabricacao() >= anoAtual - 20 ) {
			return true;

		}else {
			return false;
		}


	}



	int opcaoVeiculo =  dadosV.getTipoVeiculo();

	public Veiculo cadastrarVeiculo() {
		Veiculo veiculo;
					
			Moto moto = new Moto.MotoBuilder()
					.marca(dadosV.getMarca())
					.modelo(dadosV.getModelo())
					.anoFabricacao(dadosV.getAnoFabricacao())
					.proprietario(dadosV.getProprietario())
					.placa(dadosV.getPlaca())
					.build();

		
		return veiculo = moto;
	}

}
