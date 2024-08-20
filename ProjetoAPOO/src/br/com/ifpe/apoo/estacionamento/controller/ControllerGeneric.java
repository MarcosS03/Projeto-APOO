package br.com.ifpe.apoo.estacionamento.controller;


import java.time.Duration;
import java.time.LocalDateTime;

import br.com.ifpe.apoo.estacionamento.apresentação.DadosVeiculo;
import br.com.ifpe.apoo.estacionamento.apresentação.ValoresAdicional;
import br.com.ifpe.apoo.estacionamento.controller.exception.CaracterException;
import br.com.ifpe.apoo.estacionamento.model.Veiculo;
import br.com.ifpe.apoo.estacionamento.repository.FactoryDAO;
import br.com.ifpe.apoo.estacionamento.repository.GenericDAO;

public abstract class ControllerGeneric<T extends Veiculo> implements IController<T> {

	GenericDAO<Veiculo> repository = FactoryDAO.getDAO();

	GenericDAO<Veiculo> dados;


	int vagasDisponiveis = 10;

	LogOperacoes log = new LogOperacoes();



	@Override
	public final void estacionar(Veiculo veiculo) {


		this.validarAnoVeiculo(veiculo);

		if (vagaDisponivel() == true) {
			log.log("Estacionamento com vaga para a placa: "+veiculo.getPlaca());
		}else {
			log.logErro("Estacionamento sem vaga para a placa: "+veiculo.getPlaca());
		}

		if (validarAnoVeiculo(veiculo)== true) {
			log.log("Veiculo de placa: "+veiculo.getPlaca() + " com ano ok!");
		}else {
			log.logErro("Veiculo de placa: "+veiculo.getPlaca() + " com ano antigo");
		}

		if (validarCPF(veiculo)== true) {
			log.log("CPF: "+veiculo.getCpf()+" ok!");
		}else {
			log.logErro("CPF: "+veiculo.getCpf()+" incorreto");
		}

		if (this.validarVeiculo(veiculo) == true) {
			repository.add(veiculo);
			log.log("Veiculo placa: " + veiculo.getPlaca() + "cadastrado");
		}


	}

	@Override
	public final Veiculo Consultar(String placa) {

		var veiculo = repository.consult(placa);


		log.log("consulta veiculo");

		return veiculo;
	}

	@Override
	public final void Atualizar(String placa, DadosVeiculo dadosVeiculoAtualizado) {

		repository.update(placa, dadosVeiculoAtualizado);

		log.log("Atualização dos dados veiculo, placa: "+ placa);

	}

	@Override
	public final double ValorAPagar(String placa, double valorHora) {

		var veiculo = repository.consult(placa);
		LocalDateTime horaEnt = veiculo.getHoraEntrada();
		LocalDateTime horaSai = LocalDateTime.now();

		//				Duration tempo =  Duration.between(horaEnt, horaSai);
		//		
		//				double valorTotal = tempo.toHours() * valorHora;


		double tempo = 10;
		double valorTotal =  tempo * valorHora;

		repository.remove(placa);

		log.log("pagamento referete ao veiculo: "+placa);
		log.log("veiculo placa: "+ placa + " removido");


		return valorTotal;


	}


	public final boolean vagaDisponivel() {

		if (this.dados == null || this.dados.getDados().size() <= vagasDisponiveis) {
			return true;
		}
		return false;
	}


	public abstract boolean validarAnoVeiculo(Veiculo veiculo);

	public final boolean validarCPF(Veiculo cpf) {
		ValidateCPF validarCPF = new ValidateCPF();
		return validarCPF.validateCpf(cpf);

	}

	private boolean validarVeiculo(Veiculo veiculo) {
		if (this.vagaDisponivel()==true &&
				this.validarCPF(veiculo) == true &&
				this.validarAnoVeiculo(veiculo) == true &&
				this.Consultar(veiculo.getPlaca())== null) {
			return true;
		}else {
			return false;
		}
	}

}
