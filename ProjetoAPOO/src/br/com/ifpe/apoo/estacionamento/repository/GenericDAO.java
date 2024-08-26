package br.com.ifpe.apoo.estacionamento.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.ifpe.apoo.estacionamento.apresentação.DadosVeiculo;
import br.com.ifpe.apoo.estacionamento.model.Veiculo;




public class GenericDAO <T extends Veiculo> implements IGenericDAO<T> {
	

	List<T> dados = new ArrayList<T>();
	
	private static GenericDAO singleton = null;


	private GenericDAO() {

	}

	public static GenericDAO<Veiculo> singleton()  {
		if (singleton == null) {
			return singleton = new GenericDAO();
		}
		return singleton;
	}


	@Override
	public void add(T dados) {		
			this.dados.add(dados);	
		
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
	public void update(String placa, DadosVeiculo dadosVeiculoAtualizado ) {
		var veiculoAntigo = this.consult(placa);
		
		veiculoAntigo.setProprietario(dadosVeiculoAtualizado.getProprietario());
		veiculoAntigo.setMarca(dadosVeiculoAtualizado.getMarca());
		veiculoAntigo.setModelo(dadosVeiculoAtualizado.getModelo());
		veiculoAntigo.setAnoFabricacao(dadosVeiculoAtualizado.getAnoFabricacao());
		veiculoAntigo.setPlaca(dadosVeiculoAtualizado.getPlaca());
		veiculoAntigo.setPlaca(dadosVeiculoAtualizado.getPlaca());

	}

	@Override
	public T consult(String placa) {
		
		return dados.stream()
		.filter(p -> p.getPlaca().equals(placa))
		.findFirst().orElse(null);
	

	}

	public List<T> getDados() {
		return dados;
	}
	
	



}
