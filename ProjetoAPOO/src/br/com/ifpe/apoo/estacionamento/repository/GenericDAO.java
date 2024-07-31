package br.com.ifpe.apoo.estacionamento.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.ifpe.apoo.estacionamento.controller.CadastrarVeiculo;
import br.com.ifpe.apoo.estacionamento.model.Veiculo;




public class GenericDAO <T extends Veiculo> implements IGenericDAO<T> {
	

	List<T>dados = new ArrayList<T>();
	

	int vagasDisponivel = 10;


	private static GenericDAO singleton = null;


	private GenericDAO() {

	}

	public static GenericDAO<Veiculo> singleton()  {
		if (singleton == null) {
			return singleton = new GenericDAO();
		}
		return singleton;
	}

	public boolean vagaDisponivel() {

		if (this.dados == null || this.dados.size() < vagasDisponivel) {
			return true;
		}
		return false;
	}

	@Override
	public void add(T dados) {
		if (vagaDisponivel() == true) {
			this.dados.add(dados);
		}
//		System.out.println("Estacionamento sem vagas!!");		
	}

	@Override
	public void remove(String placa) {
		List<T> atual = dados.stream()
				.filter(v -> !v.getPlaca().equals(placa))
				.collect(Collectors.toList());

		//problema é se a lista for muito grande
		dados = atual;

	}

	@Override
	public void update(T veiculo) {
		
		CadastrarVeiculo cadastro = new CadastrarVeiculo();
		
		var veiculoAtual = cadastro.cadastrarVeiculo();
		
		
		for (T v : dados) {
			if (v.getPlaca().equals(veiculo.getPlaca())) {				
				v.setMarca(veiculoAtual.getMarca());
				v.setModelo(veiculoAtual.getModelo());
				v.setAnoFabricacao(veiculoAtual.getAnoFabricacao());
				v.setPlaca(veiculoAtual.getPlaca());
				
				
			}
		}

	}

	@Override
	public T consult(String placa) {
		
		return dados.stream()
		.filter(p -> p.getPlaca().equals(placa))
		.findFirst().orElse(null);
	

	}



}
