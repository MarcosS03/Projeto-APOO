package br.com.ifpe.apoo.estacionamento.repository;

import br.com.ifpe.apoo.estacionamento.apresentação.DadosVeiculo;

public interface IGenericDAO <T> {
	
	public void add(T t);
	public void remove(String t);
	public void update(String placa, DadosVeiculo t);
	public T consult(String t);

}
