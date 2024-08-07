package br.com.ifpe.apoo.estacionamento.controller;

import br.com.ifpe.apoo.estacionamento.apresentação.ValoresAdicional;
import br.com.ifpe.apoo.estacionamento.model.Veiculo;

public interface IController <T> {
	
	
	
	
	public void estacionar(Veiculo veiculo);
	
	public Veiculo Consultar(String placa);
	
	public void Atualizar(String placa);
	
	public double ValorAPagar(String placa, double valorHora);

}
