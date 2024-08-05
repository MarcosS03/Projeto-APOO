package br.com.ifpe.apoo.estacionamento.controller;

import br.com.ifpe.apoo.estacionamento.model.Veiculo;

public interface IController <T> {
	
	
	
	
	public void estacionar();
	
	public Veiculo Consultar(String placa);
	
	public void Atualizar(String placa);
	
	public Long ValorAPagar(String placa);

}
