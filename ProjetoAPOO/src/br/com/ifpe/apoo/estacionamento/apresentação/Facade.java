package br.com.ifpe.apoo.estacionamento.apresentação;

import br.com.ifpe.apoo.estacionamento.controller.Controller;
import br.com.ifpe.apoo.estacionamento.model.Veiculo;

public class Facade {


	Controller controller = new Controller();
	DadosVeiculo dadosVeiculo = new DadosVeiculo();


	public void estacionar(Veiculo veiculo) {
		controller.estacionar(veiculo);
	}


	public Veiculo consultar(String placa) {
		return controller.Consultar(placa);
	}


	public void Atualizar(String placa, DadosVeiculo dadosVeiculoAtualizado) {

		controller.Atualizar(placa, dadosVeiculoAtualizado);

	}

	public double ValorAPagar(String placa, double valorHora) {
		return controller.ValorAPagar(placa, valorHora);

	}


	public boolean vagaDisponivel() {
		return controller.vagaDisponivel();
	}

	public boolean validarCPF(Veiculo cpf) {
		return controller.validarCPF(cpf);

	}

	public boolean validarAnoVeiculo(Veiculo veiculo) {
		return controller.validarAnoVeiculo(veiculo);

	}

	public void cadastrarVeiculo() {
		dadosVeiculo.cadastrarVeiculo();
	}

	public DadosVeiculo dadosVeiculo() {

		return this.dadosVeiculo;


	}

}
