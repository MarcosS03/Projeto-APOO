package br.com.ifpe.apoo.estacionamento.controller;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

import br.com.ifpe.apoo.estacionamento.apresentação.DadosVeiculo;
import br.com.ifpe.apoo.estacionamento.model.Base;
import br.com.ifpe.apoo.estacionamento.model.Moto;
import br.com.ifpe.apoo.estacionamento.model.Veiculo;
import br.com.ifpe.apoo.estacionamento.repository.GenericDAO;

public class Controller extends ControllerGeneric<Veiculo>{

	GenericDAO<Veiculo> repository = GenericDAO.singleton();

	GenericDAO<Veiculo> dados;

	int opcaoVeiculo;

	/*	public Long ValorAPagar(String placa) {

			var veiculo = repository.consult(placa);
			LocalDateTime horaEnt = veiculo.getHoraEntrada();
			LocalDateTime horaSai = LocalDateTime.now();


			Duration tempo =  Duration.between(horaEnt, horaSai);

			long tempoEstacionado = tempo.toHours();
			long minutosRestantes = tempo.toMinutesPart();

			return tempoEstacionado + minutosRestantes;		

		}*/


	public Veiculo cadastrarVeiculo() {

		DadosVeiculo dadosV = new DadosVeiculo();
		dadosV.cadastrarVeiculo();

		this.opcaoVeiculo =  dadosV.getTipoVeiculo();


		switch (opcaoVeiculo) {

		case 1: {

			ControllerMoto moto  = new ControllerMoto();
			return moto.cadastrarVeiculo();
		
		}
		case 2: {

			ControllerCarro carro  = new ControllerCarro();
			return carro.cadastrarVeiculo();
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + opcaoVeiculo);
		}

	}


	public boolean validarAnoVeiculo(Veiculo veiculo) {


		switch (opcaoVeiculo) {

		case 1: {
			ControllerMoto moto  = new ControllerMoto();
			return moto.validarAnoVeiculo(veiculo);
		}
		case 2: {

			ControllerCarro carro  = new ControllerCarro();
			return carro.validarAnoVeiculo(veiculo);
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + opcaoVeiculo);
		}

	}

}

