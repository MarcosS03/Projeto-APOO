package br.com.ifpe.apoo.estacionamento.controller;


import java.time.Duration;
import java.time.LocalDateTime;

import br.com.ifpe.apoo.estacionamento.apresentação.ValoresAdicional;
import br.com.ifpe.apoo.estacionamento.model.Veiculo;
import br.com.ifpe.apoo.estacionamento.repository.GenericDAO;

public abstract class ControllerGeneric<T extends Veiculo> implements IController<T> {

	GenericDAO<Veiculo> repository = GenericDAO.singleton();

	GenericDAO<Veiculo> dados;


	int vagasDisponiveis = 10;



	@Override
	public final void estacionar(Veiculo veiculo) {


		this.validarAnoVeiculo(veiculo);


		if (vagaDisponivel() == true && this.validarAnoVeiculo(veiculo) == true) {
			repository.add(veiculo);


		}
	}

	@Override
	public final Veiculo Consultar(String placa) {

		var veiculo = repository.consult(placa);
		return veiculo;
	}

	@Override
	public final void Atualizar(String placa) {
		var veiculo = repository.consult(placa);

		repository.update(veiculo);

	}

	@Override
	public final double ValorAPagar(String placa, double valorHora) {

		var veiculo = repository.consult(placa);
		LocalDateTime horaEnt = veiculo.getHoraEntrada();
		LocalDateTime horaSai = LocalDateTime.now();


//		Duration tempo =  Duration.between(horaEnt, horaSai);
//
//		double valorTotal = tempo.toHours() * valorHora;
		
		double tempo = 10;
		double valorTotal =  tempo * valorHora;
		
		repository.remove(placa);

		return valorTotal;


	}


	public final boolean vagaDisponivel() {

		if (this.dados == null || this.dados.getDados().size() <= vagasDisponiveis) {
			return true;
		}
		return false;
	}


	public abstract boolean validarAnoVeiculo(Veiculo veiculo);



}
