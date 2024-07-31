package br.com.ifpe.apoo.estacionamento.controller;

import java.time.LocalDateTime;
import br.com.ifpe.apoo.estacionamento.model.Base;
import br.com.ifpe.apoo.estacionamento.model.Moto;
import br.com.ifpe.apoo.estacionamento.model.Veiculo;
import br.com.ifpe.apoo.estacionamento.repository.GenericDAO;

public class Controller {

	GenericDAO<Veiculo> repository = GenericDAO.singleton();


	public void estacionar() {
		CadastrarVeiculo cadastro = new CadastrarVeiculo();
		
		Veiculo veiculo = cadastro.cadastrarVeiculo();
		
		if (repository.vagaDisponivel() == true) {
			repository.add(veiculo);


		}

		//verificar alguma forma dessa informação ser encaixada na tela de interação com usuario
		System.out.println("Estacionamento com todas as vagas ocupadas!!");
	}


	public Veiculo Consultar(String placa) {
		
		var veiculo = repository.consult(placa);
		return veiculo;
		
	}
	
	
	public void atualizar(String placa) {
		var veiculo = repository.consult(placa);
		
		repository.update(veiculo);
		
	}
}
