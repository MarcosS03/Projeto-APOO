package br.com.ifpe.apoo.estacionamento.controller;

import br.com.ifpe.apoo.estacionamento.apresentação.DadosVeiculo;
import br.com.ifpe.apoo.estacionamento.apresentação.ValoresAdicional;
import br.com.ifpe.apoo.estacionamento.model.Veiculo;

public interface IController <T> {
	
	
	
	
	public void estacionar(Veiculo veiculo);
	
	public Veiculo Consultar(String placa);
	
	public void Atualizar(String placa, DadosVeiculo veiculo);
	
	public double ValorAPagar(String placa, double valorHora);

}
