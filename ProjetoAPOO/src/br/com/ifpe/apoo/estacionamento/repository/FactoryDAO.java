package br.com.ifpe.apoo.estacionamento.repository;

import br.com.ifpe.apoo.estacionamento.model.Veiculo;

public abstract class FactoryDAO {
	
	public static GenericDAO getDAO() {
		return GenericDAO.singleton();
	}
}
