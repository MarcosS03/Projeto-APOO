package br.com.ifpe.apoo.estacionamento.controller.exception;

public class CaracterException extends Exception {

	public String getMenssage(String e) {
		return "Caracter invalido!";
	}
	
}
