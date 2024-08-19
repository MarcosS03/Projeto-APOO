package br.com.ifpe.apoo.estacionamento.controller;

import br.com.caelum.stella.validation.*;
import br.com.ifpe.apoo.estacionamento.model.Veiculo;


public class ValidateCPF implements IValidateCPF {


	private final CPFValidator cpfValidator = new CPFValidator();

	@Override
	public boolean validateCpf(Veiculo cpf) {
		try {
			cpfValidator.assertValid(cpf.getCpf());
			return  true;
		} catch (Exception e) {
			return  false;
		}
	}

}
