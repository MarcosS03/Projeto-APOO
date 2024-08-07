package br.com.ifpe.apoo.estacionamento.controller;


import br.com.ifpe.apoo.estacionamento.model.Carro;
import br.com.ifpe.apoo.estacionamento.model.Moto;
import br.com.ifpe.apoo.estacionamento.model.Veiculo;


public class Controller extends ControllerGeneric<Veiculo>{




	public boolean validarAnoVeiculo(Veiculo veiculo) {
		if (veiculo instanceof Moto) {
			ControllerMoto moto  = new ControllerMoto();
			return moto.validarAnoVeiculo(veiculo);	

		}else if (veiculo instanceof Carro) {
			ControllerCarro carro  = new ControllerCarro();
			return carro.validarAnoVeiculo(veiculo);

		}else {
			return false;
		}

	}

}

